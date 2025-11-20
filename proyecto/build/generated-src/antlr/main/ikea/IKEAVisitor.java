// Generated from /Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl2/proyecto/src/main/antlr/ikea/IKEA.g4 by ANTLR 4.13.2
 package ikea; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IKEAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IKEAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IKEAParser#manual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManual(IKEAParser.ManualContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#itemHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemHeader(IKEAParser.ItemHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(IKEAParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#stepList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepList(IKEAParser.StepListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionUnir}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionUnir(IKEAParser.AccionUnirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionColocar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionColocar(IKEAParser.AccionColocarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionAtornillar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionAtornillar(IKEAParser.AccionAtornillarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionInsertar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionInsertar(IKEAParser.AccionInsertarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionClavar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionClavar(IKEAParser.AccionClavarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionMarcar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionMarcar(IKEAParser.AccionMarcarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionDesplegar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionDesplegar(IKEAParser.AccionDesplegarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionDeslizar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionDeslizar(IKEAParser.AccionDeslizarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionSacar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionSacar(IKEAParser.AccionSacarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionConHerramienta}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionConHerramienta(IKEAParser.AccionConHerramientaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionGirar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionGirar(IKEAParser.AccionGirarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionVoltear}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionVoltear(IKEAParser.AccionVoltearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionNivelar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionNivelar(IKEAParser.AccionNivelarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionRepetir}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionRepetir(IKEAParser.AccionRepetirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionFijar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionFijar(IKEAParser.AccionFijarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#unir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnir(IKEAParser.UnirContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#colocar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColocar(IKEAParser.ColocarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#fijar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFijar(IKEAParser.FijarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#atornillar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtornillar(IKEAParser.AtornillarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#insertar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertar(IKEAParser.InsertarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#clavar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClavar(IKEAParser.ClavarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#marcar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarcar(IKEAParser.MarcarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#desplegar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesplegar(IKEAParser.DesplegarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#deslizar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeslizar(IKEAParser.DeslizarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#sacar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSacar(IKEAParser.SacarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#nivelar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNivelar(IKEAParser.NivelarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#conHerramienta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConHerramienta(IKEAParser.ConHerramientaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#girar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGirar(IKEAParser.GirarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#voltear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoltear(IKEAParser.VoltearContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#repetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetir(IKEAParser.RepetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#componente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponente(IKEAParser.ComponenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#cantidad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCantidad(IKEAParser.CantidadContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(IKEAParser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(IKEAParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#listaComponentes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaComponentes(IKEAParser.ListaComponentesContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#pieza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieza(IKEAParser.PiezaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#piezaConZona}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiezaConZona(IKEAParser.PiezaConZonaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#listaPiezas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaPiezas(IKEAParser.ListaPiezasContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#zona}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZona(IKEAParser.ZonaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#herramienta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHerramienta(IKEAParser.HerramientaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IKEAParser#direccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDireccion(IKEAParser.DireccionContext ctx);
}