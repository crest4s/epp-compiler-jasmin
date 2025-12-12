package epp;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

/**
 * Compilador de E++ a código Jasmin.
 * Recibe un archivo .txt con código E++ y genera un archivo .j con bytecode Jasmin.
 */
public class EPPMain {

    public static void main(String[] args) {
        String inputPath;
        Scanner scanner = new Scanner(System.in);

        // --- SOLICITUD DE RUTA POR CONSOLA ---
        while (true) {
            System.out.print("Introduce la ruta completa del archivo E++ (ej. C:\\ruta\\programa.txt): ");
            inputPath = scanner.nextLine().trim();

            if (!inputPath.isEmpty()) {
                break;
            }
            System.err.println("Error: No se ha introducido ninguna ruta. Por favor, inténtalo de nuevo.");
        }

        // Se cierra el Scanner después de obtener la entrada
        scanner.close();
        // ------------------------------------

        try {
            Path inputFile = Paths.get(inputPath);
            if (!Files.exists(inputFile)) {
                System.err.println("Error: Archivo no encontrado: " + inputPath);
                System.exit(1);
            }

            // Generar nombre de salida
            String baseName = inputFile.getFileName().toString();
            if (baseName.endsWith(".txt")) {
                baseName = baseName.substring(0, baseName.length() - 4);
            } else if (baseName.endsWith(".epp")) {
                // Asumiendo que ahora usas .epp como extensión
                baseName = baseName.substring(0, baseName.length() - 4);
            }
            
            // Sanitizar nombre de clase para Java (reemplazar caracteres no válidos)
            baseName = baseName.replaceAll("[^a-zA-Z0-9_]", "_");
            // Si empieza con número, agregar prefijo
            if (baseName.length() > 0 && Character.isDigit(baseName.charAt(0))) {
                baseName = "Programa_" + baseName;
            }
            // Si está vacío después de sanitizar, usar nombre por defecto
            if (baseName.isEmpty()) {
                baseName = "Programa";
            }

            Path outputFile = inputFile.getParent().resolve(baseName + ".j");

            // Análisis léxico y sintáctico
            EPPLexer lexer = new EPPLexer(CharStreams.fromPath(inputFile));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            EPPParser parser = new EPPParser(tokens);

            // Manejar errores sintácticos
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg,
                                        RecognitionException e) {
                    System.err.println("Error sintáctico en línea " + line + ":" + charPositionInLine + " - " + msg);
                    // No salimos de System.exit(1) aquí, sino que marcamos el error.
                }
            });

            ParseTree tree = parser.programa();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("Compilación fallida: Se encontraron errores sintácticos.");
                System.exit(1);
            }

            // Análisis semántico
            ParseTreeWalker walker = new ParseTreeWalker();
            EPPSemanticListener semanticListener = new EPPSemanticListener();
            walker.walk(semanticListener, tree);

            if (semanticListener.hasErrors()) {
                System.err.println("\nCompilación fallida: Se encontraron errores semánticos.");
                semanticListener.printErrorSummary();
                System.exit(1);
            }

            // Generación de código
            EPPToJasminVisitor visitor = new EPPToJasminVisitor(baseName);
            visitor.visit(tree);
            String jasminCode = visitor.getJasminCode();

            Files.writeString(outputFile, jasminCode);

            System.out.println("Compilación exitosa");
            System.out.println("  Entrada: " + inputPath);
            System.out.println("  Salida: " + outputFile);
            System.out.println("\nPara ejecutar:");
            System.out.println("  1. Compilar Jasmin: java -jar <ruta_a_jasmin.jar> " + outputFile.getFileName());
            System.out.println("  2. Ejecutar: java " + baseName);

        } catch (IOException e) {
            System.err.println("Error de I/O: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}