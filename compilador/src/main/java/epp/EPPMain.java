package epp;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;

/**
 * Compilador de E++ a código Jasmin.
 * Recibe un archivo .txt con código E++ y genera un archivo .j con bytecode Jasmin.
 */
public class EPPMain {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Uso: java epp.EPPMain <archivo.txt>");
            System.err.println("Ejemplo: java epp.EPPMain programa.txt");
            System.exit(1);
        }

        String inputPath = args[0];

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
            }
            Path outputFile = inputFile.getParent().resolve(baseName + ".j");

            // Análisis léxico y sintáctico
            EPPLexer lexer = new EPPLexer(CharStreams.fromPath(inputFile));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            EPPParser parser = new EPPParser(tokens);

            // Manejar errores
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg,
                                        RecognitionException e) {
                    System.err.println("Error sintáctico en línea " + line + ":" + charPositionInLine + " - " + msg);
                }
            });

            ParseTree tree = parser.programa();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("❌ Compilación fallida: errores sintácticos");
                System.exit(1);
            }

            // Generación de código
            EPPToJasminVisitor visitor = new EPPToJasminVisitor(baseName);
            visitor.visit(tree);
            String jasminCode = visitor.getJasminCode();

            Files.writeString(outputFile, jasminCode);

            System.out.println("✓ Compilación exitosa");
            System.out.println("  Entrada: " + inputPath);
            System.out.println("  Salida: " + outputFile);
            System.out.println("\nPara ejecutar:");
            System.out.println("  1. Compilar Jasmin: java -jar jasmin.jar " + outputFile.getFileName());
            System.out.println("  2. Ejecutar: java " + baseName);

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
