package csv;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Path;

public class GeneradorAST {

    public ParseTree generadorAST(Path inFile) throws IOException {
        CharStream input = CharStreams.fromPath(inFile);
        CSVLexer lexer = new CSVLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSVParser parser = new CSVParser(tokens);

        // Obtiene el árbol sintáctico
        return parser.csv();
    }
}
