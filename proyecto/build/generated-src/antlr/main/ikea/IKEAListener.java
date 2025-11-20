// Generated from /Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl2/proyecto/src/main/antlr/ikea/IKEA.g4 by ANTLR 4.13.2
 package ikea; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IKEAParser}.
 */
public interface IKEAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IKEAParser#manual}.
	 * @param ctx the parse tree
	 */
	void enterManual(IKEAParser.ManualContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#manual}.
	 * @param ctx the parse tree
	 */
	void exitManual(IKEAParser.ManualContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#itemHeader}.
	 * @param ctx the parse tree
	 */
	void enterItemHeader(IKEAParser.ItemHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#itemHeader}.
	 * @param ctx the parse tree
	 */
	void exitItemHeader(IKEAParser.ItemHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(IKEAParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(IKEAParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#stepList}.
	 * @param ctx the parse tree
	 */
	void enterStepList(IKEAParser.StepListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#stepList}.
	 * @param ctx the parse tree
	 */
	void exitStepList(IKEAParser.StepListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionUnir}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionUnir(IKEAParser.AccionUnirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionUnir}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionUnir(IKEAParser.AccionUnirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionColocar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionColocar(IKEAParser.AccionColocarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionColocar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionColocar(IKEAParser.AccionColocarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionAtornillar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionAtornillar(IKEAParser.AccionAtornillarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionAtornillar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionAtornillar(IKEAParser.AccionAtornillarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionInsertar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionInsertar(IKEAParser.AccionInsertarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionInsertar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionInsertar(IKEAParser.AccionInsertarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionClavar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionClavar(IKEAParser.AccionClavarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionClavar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionClavar(IKEAParser.AccionClavarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionMarcar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionMarcar(IKEAParser.AccionMarcarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionMarcar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionMarcar(IKEAParser.AccionMarcarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionDesplegar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionDesplegar(IKEAParser.AccionDesplegarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionDesplegar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionDesplegar(IKEAParser.AccionDesplegarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionDeslizar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionDeslizar(IKEAParser.AccionDeslizarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionDeslizar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionDeslizar(IKEAParser.AccionDeslizarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionSacar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionSacar(IKEAParser.AccionSacarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionSacar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionSacar(IKEAParser.AccionSacarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionConHerramienta}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionConHerramienta(IKEAParser.AccionConHerramientaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionConHerramienta}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionConHerramienta(IKEAParser.AccionConHerramientaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionGirar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionGirar(IKEAParser.AccionGirarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionGirar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionGirar(IKEAParser.AccionGirarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionVoltear}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionVoltear(IKEAParser.AccionVoltearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionVoltear}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionVoltear(IKEAParser.AccionVoltearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionNivelar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionNivelar(IKEAParser.AccionNivelarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionNivelar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionNivelar(IKEAParser.AccionNivelarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionRepetir}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionRepetir(IKEAParser.AccionRepetirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionRepetir}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionRepetir(IKEAParser.AccionRepetirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionFijar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void enterAccionFijar(IKEAParser.AccionFijarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionFijar}
	 * labeled alternative in {@link IKEAParser#step}.
	 * @param ctx the parse tree
	 */
	void exitAccionFijar(IKEAParser.AccionFijarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#unir}.
	 * @param ctx the parse tree
	 */
	void enterUnir(IKEAParser.UnirContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#unir}.
	 * @param ctx the parse tree
	 */
	void exitUnir(IKEAParser.UnirContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#colocar}.
	 * @param ctx the parse tree
	 */
	void enterColocar(IKEAParser.ColocarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#colocar}.
	 * @param ctx the parse tree
	 */
	void exitColocar(IKEAParser.ColocarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#fijar}.
	 * @param ctx the parse tree
	 */
	void enterFijar(IKEAParser.FijarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#fijar}.
	 * @param ctx the parse tree
	 */
	void exitFijar(IKEAParser.FijarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#atornillar}.
	 * @param ctx the parse tree
	 */
	void enterAtornillar(IKEAParser.AtornillarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#atornillar}.
	 * @param ctx the parse tree
	 */
	void exitAtornillar(IKEAParser.AtornillarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#insertar}.
	 * @param ctx the parse tree
	 */
	void enterInsertar(IKEAParser.InsertarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#insertar}.
	 * @param ctx the parse tree
	 */
	void exitInsertar(IKEAParser.InsertarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#clavar}.
	 * @param ctx the parse tree
	 */
	void enterClavar(IKEAParser.ClavarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#clavar}.
	 * @param ctx the parse tree
	 */
	void exitClavar(IKEAParser.ClavarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#marcar}.
	 * @param ctx the parse tree
	 */
	void enterMarcar(IKEAParser.MarcarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#marcar}.
	 * @param ctx the parse tree
	 */
	void exitMarcar(IKEAParser.MarcarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#desplegar}.
	 * @param ctx the parse tree
	 */
	void enterDesplegar(IKEAParser.DesplegarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#desplegar}.
	 * @param ctx the parse tree
	 */
	void exitDesplegar(IKEAParser.DesplegarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#deslizar}.
	 * @param ctx the parse tree
	 */
	void enterDeslizar(IKEAParser.DeslizarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#deslizar}.
	 * @param ctx the parse tree
	 */
	void exitDeslizar(IKEAParser.DeslizarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#sacar}.
	 * @param ctx the parse tree
	 */
	void enterSacar(IKEAParser.SacarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#sacar}.
	 * @param ctx the parse tree
	 */
	void exitSacar(IKEAParser.SacarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#nivelar}.
	 * @param ctx the parse tree
	 */
	void enterNivelar(IKEAParser.NivelarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#nivelar}.
	 * @param ctx the parse tree
	 */
	void exitNivelar(IKEAParser.NivelarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#conHerramienta}.
	 * @param ctx the parse tree
	 */
	void enterConHerramienta(IKEAParser.ConHerramientaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#conHerramienta}.
	 * @param ctx the parse tree
	 */
	void exitConHerramienta(IKEAParser.ConHerramientaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#girar}.
	 * @param ctx the parse tree
	 */
	void enterGirar(IKEAParser.GirarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#girar}.
	 * @param ctx the parse tree
	 */
	void exitGirar(IKEAParser.GirarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#voltear}.
	 * @param ctx the parse tree
	 */
	void enterVoltear(IKEAParser.VoltearContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#voltear}.
	 * @param ctx the parse tree
	 */
	void exitVoltear(IKEAParser.VoltearContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(IKEAParser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(IKEAParser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#componente}.
	 * @param ctx the parse tree
	 */
	void enterComponente(IKEAParser.ComponenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#componente}.
	 * @param ctx the parse tree
	 */
	void exitComponente(IKEAParser.ComponenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void enterCantidad(IKEAParser.CantidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void exitCantidad(IKEAParser.CantidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(IKEAParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(IKEAParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(IKEAParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(IKEAParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#listaComponentes}.
	 * @param ctx the parse tree
	 */
	void enterListaComponentes(IKEAParser.ListaComponentesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#listaComponentes}.
	 * @param ctx the parse tree
	 */
	void exitListaComponentes(IKEAParser.ListaComponentesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#pieza}.
	 * @param ctx the parse tree
	 */
	void enterPieza(IKEAParser.PiezaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#pieza}.
	 * @param ctx the parse tree
	 */
	void exitPieza(IKEAParser.PiezaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#piezaConZona}.
	 * @param ctx the parse tree
	 */
	void enterPiezaConZona(IKEAParser.PiezaConZonaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#piezaConZona}.
	 * @param ctx the parse tree
	 */
	void exitPiezaConZona(IKEAParser.PiezaConZonaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#listaPiezas}.
	 * @param ctx the parse tree
	 */
	void enterListaPiezas(IKEAParser.ListaPiezasContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#listaPiezas}.
	 * @param ctx the parse tree
	 */
	void exitListaPiezas(IKEAParser.ListaPiezasContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#zona}.
	 * @param ctx the parse tree
	 */
	void enterZona(IKEAParser.ZonaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#zona}.
	 * @param ctx the parse tree
	 */
	void exitZona(IKEAParser.ZonaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#herramienta}.
	 * @param ctx the parse tree
	 */
	void enterHerramienta(IKEAParser.HerramientaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#herramienta}.
	 * @param ctx the parse tree
	 */
	void exitHerramienta(IKEAParser.HerramientaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IKEAParser#direccion}.
	 * @param ctx the parse tree
	 */
	void enterDireccion(IKEAParser.DireccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IKEAParser#direccion}.
	 * @param ctx the parse tree
	 */
	void exitDireccion(IKEAParser.DireccionContext ctx);
}