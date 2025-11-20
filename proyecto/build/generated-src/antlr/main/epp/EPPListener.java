// Generated from /Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl2/proyecto/src/main/antlr/epp/EPP.g4 by ANTLR 4.13.2

package epp;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EPPParser}.
 */
public interface EPPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EPPParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(EPPParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(EPPParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EPPParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(EPPParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(EPPParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EPPParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(EPPParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(EPPParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EPPParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(EPPParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(EPPParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EPPParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(EPPParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(EPPParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link EPPParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(EPPParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(EPPParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link EPPParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(EPPParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(EPPParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EPPParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(EPPParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(EPPParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EPPParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(EPPParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(EPPParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprParentesis(EPPParser.ExprParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprParentesis(EPPParser.ExprParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBooleanoFalso}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprBooleanoFalso(EPPParser.ExprBooleanoFalsoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBooleanoFalso}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprBooleanoFalso(EPPParser.ExprBooleanoFalsoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAritmeticaMultDiv}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprAritmeticaMultDiv(EPPParser.ExprAritmeticaMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAritmeticaMultDiv}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprAritmeticaMultDiv(EPPParser.ExprAritmeticaMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumero}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprNumero(EPPParser.ExprNumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumero}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprNumero(EPPParser.ExprNumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBooleanoVerdadero}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprBooleanoVerdadero(EPPParser.ExprBooleanoVerdaderoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBooleanoVerdadero}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprBooleanoVerdadero(EPPParser.ExprBooleanoVerdaderoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAritmeticaSumaResta}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprAritmeticaSumaResta(EPPParser.ExprAritmeticaSumaRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAritmeticaSumaResta}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprAritmeticaSumaResta(EPPParser.ExprAritmeticaSumaRestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTexto}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprTexto(EPPParser.ExprTextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTexto}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprTexto(EPPParser.ExprTextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprComparacion}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprComparacion(EPPParser.ExprComparacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprComparacion}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprComparacion(EPPParser.ExprComparacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(EPPParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link EPPParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(EPPParser.ExprVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link EPPParser#operadorComparacion}.
	 * @param ctx the parse tree
	 */
	void enterOperadorComparacion(EPPParser.OperadorComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#operadorComparacion}.
	 * @param ctx the parse tree
	 */
	void exitOperadorComparacion(EPPParser.OperadorComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EPPParser#operadorAditivo}.
	 * @param ctx the parse tree
	 */
	void enterOperadorAditivo(EPPParser.OperadorAditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#operadorAditivo}.
	 * @param ctx the parse tree
	 */
	void exitOperadorAditivo(EPPParser.OperadorAditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EPPParser#operadorMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void enterOperadorMultiplicativo(EPPParser.OperadorMultiplicativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EPPParser#operadorMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void exitOperadorMultiplicativo(EPPParser.OperadorMultiplicativoContext ctx);
}