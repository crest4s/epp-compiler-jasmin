package csv;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Programa principal para convertir archivos CSV a formato JSON.
 * Pide la ruta del archivo CSV al usuario y genera el JSON automáticamente
 * con el mismo nombre base + "_salida.json".
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

            // Generar ruta de salida: mismo directorio, nombre_salida.json
            String fileName = inputFile.getFileName().toString();
            String baseName = fileName.contains(".") ? 
                fileName.substring(0, fileName.lastIndexOf('.')) : fileName;
            Path outputFile = inputFile.getParent().resolve(baseName + "_salida.json");

            // Pipeline de análisis
            CSVLexer lexer = new CSVLexer(CharStreams.fromPath(inputFile));
            CSVParser parser = new CSVParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.csv();

            CSVToJsonVisitor visitor = new CSVToJsonVisitor();
            String json = visitor.visit(tree);

            Files.createDirectories(outputFile.getParent());
            Files.writeString(outputFile, json, StandardCharsets.UTF_8);

            System.out.println("\n✓ CSV → JSON completado");
            System.out.println("  Entrada: " + inputPath);
            System.out.println("  Salida: " + outputFile);

        } catch (IOException e) {
            System.err.println("Error de I/O: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}