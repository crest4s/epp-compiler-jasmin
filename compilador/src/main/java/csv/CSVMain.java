package csv;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.List;

/**
 * Programa principal para convertir archivos CSV a formato JSON.
 * Reporta todos los errores semánticos encontrados antes de fallar.
 */
public class CSVMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo CSV: ");
        String inputPath = scanner.nextLine().trim();

        scanner.close();

        try {
            Path inputFile = Paths.get(inputPath);
            if (!Files.exists(inputFile)) {
                System.err.println("Error: Archivo no encontrado: " + inputPath);
                System.exit(1);
            }

            // 1. Pipeline de Análisis (Léxico y Sintáctico)
            CSVLexer lexer = new CSVLexer(CharStreams.fromPath(inputFile));
            CSVParser parser = new CSVParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.csv();

            // 2. FASE SEMÁNTICA: Validación (Listener)
            ParseTreeWalker walker = new ParseTreeWalker();
            CSVSemanticListener semanticListener = new CSVSemanticListener();

            System.out.println("\n[INFO] Iniciando análisis semántico...");

            // Recorre el árbol. Los errores se acumulan en el Listener.
            walker.walk(semanticListener, tree);

            // 3. REPORTE DE ERRORES ACUMULADOS
            List<String> errors = semanticListener.getErrorMessages();

            if (!errors.isEmpty()) {
                System.err.println("\n[ERRORES SEMÁNTICOS ENCONTRADOS] La conversión ha fallado.");
                for (String error : errors) {
                    System.err.println("  " + error);
                }
                System.exit(1); // Salir con código de error
            }

            System.out.println("[INFO] Análisis semántico completado sin errores.");

            // 4. FASE DE TRANSFORMACIÓN: Generación de código (Visitor)
            CSVToJsonVisitor visitor = new CSVToJsonVisitor();
            String json = visitor.visit(tree);

            // 5. Generación de Archivo de Salida
            String fileName = inputFile.getFileName().toString();
            String baseName = fileName.contains(".") ?
                    fileName.substring(0, fileName.lastIndexOf('.')) : fileName;
            Path outputFile = inputFile.getParent().resolve(baseName + "_salida.json");

            Files.createDirectories(outputFile.getParent());
            Files.writeString(outputFile, json, StandardCharsets.UTF_8);

            System.out.println("\nCSV → JSON completado con éxito.");
            System.out.println("  Entrada: " + inputPath);
            System.out.println("  Salida: " + outputFile);

        } catch (IOException e) {
            System.err.println("Error de I/O (lectura/escritura): " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Error fatal: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}