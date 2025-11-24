package csv;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.Scanner; // Clase necesaria para la entrada por consola

public class CSVMain {

    public static void main(String[] args) {
        String inputPath;
        String outputPath;

        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Solicitar la ruta del archivo de entrada CSV
            System.out.print("Introduce la ruta del archivo de entrada CSV: ");
            inputPath = scanner.nextLine();

            // 2. Solicitar la ruta del archivo de salida JSON/TXT
            System.out.print("Introduce la ruta del archivo de salida (donde se guardará el JSON): ");
            outputPath = scanner.nextLine();
        } catch (Exception e) {
            System.err.println("Error al leer la entrada del usuario: " + e.getMessage());
            return;
        }

        System.out.println("\nIniciando análisis...");
        System.out.println("Fuente CSV: " + inputPath);

        try {
            // 3. Análisis ANTLR (Lexer, Parser, Visitor)

            // Verifica si el archivo de entrada existe antes de intentar leerlo
            Path inFile = Paths.get(inputPath);
            if (!Files.exists(inFile)) {
                System.err.println("\nError: el archivo de entrada no existe en la ruta especificada.");
                return;
            }

            GeneradorAST generador = new GeneradorAST();
            ParseTree tree = generador.generadorAST(inFile);

            // Crea y ejecuta el Visitor para la traducción a JSON
            CSVToJsonVisitor visitor = new CSVToJsonVisitor();
            String jsonResult = (String) visitor.visit(tree);

            // 4. Guardar el resultado en el archivo de salida
            Path outFile = Paths.get(outputPath);

            // Asegura que el directorio de salida exista
            Files.createDirectories(outFile.getParent());

            // Escribe el contenido JSON en el archivo
            Files.write(outFile, jsonResult.getBytes(StandardCharsets.UTF_8));

            System.out.println("\nTraducción finalizada.");
            System.out.println("Resultado JSON guardado en: " + outputPath);

        } catch (IOException e) {
            System.err.println("\nError de E/S (Entrada/Salida): " + e.getMessage());
            System.err.println("Verifique las rutas de archivo.");
        } catch (Exception e) {
            System.err.println("\nError durante el análisis o la generación del JSON.");
            e.printStackTrace();
        }
    }
}