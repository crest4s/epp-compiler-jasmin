// Generated from /Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl2/proyecto/src/main/antlr/csv/CSV.g4 by ANTLR 4.13.2

package csv;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSVParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSVVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSVParser#csv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsv(CSVParser.CsvContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#fila}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFila(CSVParser.FilaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(CSVParser.CampoContext ctx);
}