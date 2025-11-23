// Generated from /Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl3/maven-project/src/main/antlr4/csv/CSVParser.g4 by ANTLR 4.13.1
 package csv; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVParser}.
 */
public interface CSVParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVParser#csv}.
	 * @param ctx the parse tree
	 */
	void enterCsv(CSVParser.CsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#csv}.
	 * @param ctx the parse tree
	 */
	void exitCsv(CSVParser.CsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#fila}.
	 * @param ctx the parse tree
	 */
	void enterFila(CSVParser.FilaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#fila}.
	 * @param ctx the parse tree
	 */
	void exitFila(CSVParser.FilaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(CSVParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(CSVParser.CampoContext ctx);
}