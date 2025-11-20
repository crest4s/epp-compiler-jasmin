// Generated from /Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl2/proyecto/src/main/antlr/epp/EPP.g4 by ANTLR 4.13.2

package epp;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EPPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EPPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EPPParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(EPPParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EPPParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(EPPParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EPPParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(EPPParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EPPParser#mostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(EPPParser.MostrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EPPParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(EPPParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link EPPParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(EPPParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link EPPParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(EPPParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EPPParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(EPPParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EPPParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(EPPParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParentesis(EPPParser.ExprParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBooleanoFalso}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBooleanoFalso(EPPParser.ExprBooleanoFalsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAritmeticaMultDiv}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAritmeticaMultDiv(EPPParser.ExprAritmeticaMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumero}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumero(EPPParser.ExprNumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBooleanoVerdadero}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBooleanoVerdadero(EPPParser.ExprBooleanoVerdaderoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAritmeticaSumaResta}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAritmeticaSumaResta(EPPParser.ExprAritmeticaSumaRestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTexto}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTexto(EPPParser.ExprTextoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprComparacion}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComparacion(EPPParser.ExprComparacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(EPPParser.ExprVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link EPPParser#operadorComparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorComparacion(EPPParser.OperadorComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EPPParser#operadorAditivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorAditivo(EPPParser.OperadorAditivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EPPParser#operadorMultiplicativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorMultiplicativo(EPPParser.OperadorMultiplicativoContext ctx);
}