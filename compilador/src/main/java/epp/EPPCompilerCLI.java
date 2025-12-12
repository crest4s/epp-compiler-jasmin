package epp;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;

/**
 * Compilador de E++ a código Jasmin con argumentos CLI.
 */
public class EPPCompilerCLI {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Uso: EPPCompilerCLI <archivo_entrada.txt>");
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
            } else if (baseName.endsWith(".epp")) {
                baseName = baseName.substring(0, baseName.length() - 4);
            }
            
            // Sanitizar nombre de clase para Java
            baseName = baseName.replaceAll("[^a-zA-Z0-9_]", "_");
            if (baseName.length() > 0 && Character.isDigit(baseName.charAt(0))) {
                baseName = "Programa_" + baseName;
            }
            if (baseName.isEmpty()) {
                baseName = "Programa";
            }

            Path outputFile = inputFile.getParent().resolve(baseName + ".j");

            // Análisis léxico y sintáctico
            EPPLexer lexer = new EPPLexer(CharStreams.fromPath(inputFile));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            EPPParser parser = new EPPParser(tokens);

            parser.removeErrorListeners();
            final boolean[] hasError = {false};
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg,
                                        RecognitionException e) {
                    System.err.println("Error sintáctico en línea " + line + ":" + charPositionInLine + " - " + msg);
                    hasError[0] = true;
                }
            });

            ParseTree tree = parser.programa();

            if (hasError[0]) {
                System.err.println("Compilación abortada debido a errores sintácticos.");
                System.exit(1);
            }

            // Análisis semántico
            ParseTreeWalker walker = new ParseTreeWalker();
            EPPSemanticListener semanticListener = new EPPSemanticListener();
            walker.walk(semanticListener, tree);

            if (semanticListener.hasErrors()) {
                System.err.println("Compilación abortada debido a errores semánticos.");
                semanticListener.getErrorMessages().forEach(System.err::println);
                System.exit(1);
            }

            // Generación de código Jasmin
            EPPToJasminVisitor visitor = new EPPToJasminVisitor(baseName);
            try {
                visitor.visit(tree);
            } catch (RuntimeException e) {
                System.err.println("Compilación abortada debido a errores semánticos.");
                System.err.println(e.getMessage());
                System.exit(1);
            }
            String jasminCode = visitor.getJasminCode();

            // Guardar en archivo
            Files.writeString(outputFile, jasminCode);
            System.out.println("Archivo Jasmin generado: " + outputFile);

        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Error durante la compilación: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
