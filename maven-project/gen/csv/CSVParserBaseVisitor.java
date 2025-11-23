// Generated from /Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl3/maven-project/src/main/antlr4/csv/CSVParser.g4 by ANTLR 4.13.2
package csv;
 package csv; 
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link CSVParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class CSVParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CSVParserVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCsv(CSVParser.CsvContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFila(CSVParser.FilaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCampo(CSVParser.CampoContext ctx) { return visitChildren(ctx); }
}