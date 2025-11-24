// Generated from /Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl3/maven-project/src/main/antlr4/ikea/IKEAParser.g4 by ANTLR 4.13.1
 package ikea; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IKEAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UNIR=1, COLOCAR=2, EN=3, FIJAR=4, ATORNILLAR=5, INSERTAR=6, CLAVAR=7, 
		MARCAR=8, CON=9, DESPLEGAR=10, DESLIZAR=11, SACAR=12, NIVELAR=13, GIRAR=14, 
		VOLTEAR=15, REPETIR=16, PIEZA=17, GUION=18, PUNTO=19, PYCOMA=20, COMA=21, 
		Y=22, PARENIZQ=23, PARENDER=24, PEGATINAS_ANTIDESLIZANTES=25, PLACAS_METAL=26, 
		TORNILLO=27, ESPIGA=28, CLAVO=29, PLACA=30, ARANDELA=31, ESCUADRA=32, 
		SOPORTE=33, TACO=34, PEGATINA=35, EMBELLECEDOR=36, LISTON=37, BALDA=38, 
		TRAVIESA=39, TRAVESANO=40, PANEL=41, DESTORNILLADOR=42, MARTILLO=43, LAPIZ=44, 
		LLAVE_ALLEN=45, ABAJO=46, LATERAL_CORTO=47, ARRIBA=48, LATERAL_LARGO=49, 
		FIN=50, ITEM=51, X=52, CANTIDAD_POSITIVA=53, INT=54, NOMBRE_PIEZA=55, 
		NOMBRE_ITEM=56, WS=57;
	public static final int
		RULE_manual = 0, RULE_itemHeader = 1, RULE_instruction = 2, RULE_stepList = 3, 
		RULE_step = 4, RULE_unir = 5, RULE_listaPiezasUnir = 6, RULE_colocar = 7, 
		RULE_fijar = 8, RULE_atornillar = 9, RULE_listaComponentesAccesorios = 10, 
		RULE_componenteAccesorio = 11, RULE_listaTornillos = 12, RULE_tornillo = 13, 
		RULE_numero = 14, RULE_insertar = 15, RULE_listaEspigas = 16, RULE_espiga = 17, 
		RULE_clavar = 18, RULE_listaClavos = 19, RULE_clavo = 20, RULE_marcar = 21, 
		RULE_desplegar = 22, RULE_deslizar = 23, RULE_sacar = 24, RULE_nivelar = 25, 
		RULE_conHerramientaAtornillar = 26, RULE_conHerramientaClavar = 27, RULE_conHerramienta = 28, 
		RULE_girar = 29, RULE_voltear = 30, RULE_repetir = 31, RULE_componente = 32, 
		RULE_cantidad = 33, RULE_codigo = 34, RULE_tipo = 35, RULE_listaComponentes = 36, 
		RULE_pieza = 37, RULE_nombrePieza = 38, RULE_listaPiezas = 39, RULE_zona = 40, 
		RULE_herramienta = 41, RULE_direccion = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"manual", "itemHeader", "instruction", "stepList", "step", "unir", "listaPiezasUnir", 
			"colocar", "fijar", "atornillar", "listaComponentesAccesorios", "componenteAccesorio", 
			"listaTornillos", "tornillo", "numero", "insertar", "listaEspigas", "espiga", 
			"clavar", "listaClavos", "clavo", "marcar", "desplegar", "deslizar", 
			"sacar", "nivelar", "conHerramientaAtornillar", "conHerramientaClavar", 
			"conHerramienta", "girar", "voltear", "repetir", "componente", "cantidad", 
			"codigo", "tipo", "listaComponentes", "pieza", "nombrePieza", "listaPiezas", 
			"zona", "herramienta", "direccion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Unir'", "'Colocar'", "'en'", "'Fijar'", null, null, null, "'Marcar'", 
			null, "'Desplegar'", "'Deslizar'", "'Sacar'", "'Nivelar'", "'Girar'", 
			"'Voltear'", "'Repetir'", "'pieza'", "'-'", "'.'", "';'", "','", "'y'", 
			"'('", "')'", "'pegatinas_antideslizantes'", "'placas_metal'", "'tornillo'", 
			"'espiga'", "'clavo'", "'placa'", "'arandela'", "'escuadra'", "'soporte'", 
			"'taco'", "'pegatina'", "'embellecedor'", null, "'balda'", "'traviesa'", 
			"'travesa\\u00F1o'", "'panel'", "'destornillador'", "'martillo'", null, 
			"'llave_allen'", "'ABAJO'", "'LATERAL_CORTO'", "'ARRIBA'", "'LATERAL_LARGO'", 
			"'FIN'", "'ITEM:'", "'x'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "UNIR", "COLOCAR", "EN", "FIJAR", "ATORNILLAR", "INSERTAR", "CLAVAR", 
			"MARCAR", "CON", "DESPLEGAR", "DESLIZAR", "SACAR", "NIVELAR", "GIRAR", 
			"VOLTEAR", "REPETIR", "PIEZA", "GUION", "PUNTO", "PYCOMA", "COMA", "Y", 
			"PARENIZQ", "PARENDER", "PEGATINAS_ANTIDESLIZANTES", "PLACAS_METAL", 
			"TORNILLO", "ESPIGA", "CLAVO", "PLACA", "ARANDELA", "ESCUADRA", "SOPORTE", 
			"TACO", "PEGATINA", "EMBELLECEDOR", "LISTON", "BALDA", "TRAVIESA", "TRAVESANO", 
			"PANEL", "DESTORNILLADOR", "MARTILLO", "LAPIZ", "LLAVE_ALLEN", "ABAJO", 
			"LATERAL_CORTO", "ARRIBA", "LATERAL_LARGO", "FIN", "ITEM", "X", "CANTIDAD_POSITIVA", 
			"INT", "NOMBRE_PIEZA", "NOMBRE_ITEM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "IKEAParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IKEAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ManualContext extends ParserRuleContext {
		public ItemHeaderContext itemHeader() {
			return getRuleContext(ItemHeaderContext.class,0);
		}
		public TerminalNode FIN() { return getToken(IKEAParser.FIN, 0); }
		public TerminalNode EOF() { return getToken(IKEAParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ManualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manual; }
	}

	public final ManualContext manual() throws RecognitionException {
		ManualContext _localctx = new ManualContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_manual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			itemHeader();
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				instruction();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CANTIDAD_POSITIVA );
			setState(92);
			match(FIN);
			setState(93);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItemHeaderContext extends ParserRuleContext {
		public TerminalNode ITEM() { return getToken(IKEAParser.ITEM, 0); }
		public TerminalNode NOMBRE_ITEM() { return getToken(IKEAParser.NOMBRE_ITEM, 0); }
		public ItemHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemHeader; }
	}

	public final ItemHeaderContext itemHeader() throws RecognitionException {
		ItemHeaderContext _localctx = new ItemHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_itemHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ITEM);
			setState(96);
			match(NOMBRE_ITEM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode CANTIDAD_POSITIVA() { return getToken(IKEAParser.CANTIDAD_POSITIVA, 0); }
		public TerminalNode GUION() { return getToken(IKEAParser.GUION, 0); }
		public List<StepListContext> stepList() {
			return getRuleContexts(StepListContext.class);
		}
		public StepListContext stepList(int i) {
			return getRuleContext(StepListContext.class,i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(IKEAParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(IKEAParser.PUNTO, i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(CANTIDAD_POSITIVA);
			setState(99);
			match(GUION);
			setState(100);
			stepList();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					match(PUNTO);
					setState(102);
					stepList();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(108);
			match(PUNTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StepListContext extends ParserRuleContext {
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public List<TerminalNode> PYCOMA() { return getTokens(IKEAParser.PYCOMA); }
		public TerminalNode PYCOMA(int i) {
			return getToken(IKEAParser.PYCOMA, i);
		}
		public StepListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepList; }
	}

	public final StepListContext stepList() throws RecognitionException {
		StepListContext _localctx = new StepListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stepList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			step();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PYCOMA) {
				{
				{
				setState(111);
				match(PYCOMA);
				setState(112);
				step();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StepContext extends ParserRuleContext {
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
	 
		public StepContext() { }
		public void copyFrom(StepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionDesplegarContext extends StepContext {
		public DesplegarContext desplegar() {
			return getRuleContext(DesplegarContext.class,0);
		}
		public AccionDesplegarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionUnirContext extends StepContext {
		public UnirContext unir() {
			return getRuleContext(UnirContext.class,0);
		}
		public AccionUnirContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionAtornillarContext extends StepContext {
		public AtornillarContext atornillar() {
			return getRuleContext(AtornillarContext.class,0);
		}
		public AccionAtornillarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionFijarContext extends StepContext {
		public FijarContext fijar() {
			return getRuleContext(FijarContext.class,0);
		}
		public AccionFijarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionRepetirContext extends StepContext {
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public AccionRepetirContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionMarcarContext extends StepContext {
		public MarcarContext marcar() {
			return getRuleContext(MarcarContext.class,0);
		}
		public AccionMarcarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionInsertarContext extends StepContext {
		public InsertarContext insertar() {
			return getRuleContext(InsertarContext.class,0);
		}
		public AccionInsertarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionClavarContext extends StepContext {
		public ClavarContext clavar() {
			return getRuleContext(ClavarContext.class,0);
		}
		public AccionClavarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionVoltearContext extends StepContext {
		public VoltearContext voltear() {
			return getRuleContext(VoltearContext.class,0);
		}
		public AccionVoltearContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionSacarContext extends StepContext {
		public SacarContext sacar() {
			return getRuleContext(SacarContext.class,0);
		}
		public AccionSacarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionDeslizarContext extends StepContext {
		public DeslizarContext deslizar() {
			return getRuleContext(DeslizarContext.class,0);
		}
		public AccionDeslizarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionColocarContext extends StepContext {
		public ColocarContext colocar() {
			return getRuleContext(ColocarContext.class,0);
		}
		public AccionColocarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionConHerramientaAtornillarContext extends StepContext {
		public ConHerramientaAtornillarContext conHerramientaAtornillar() {
			return getRuleContext(ConHerramientaAtornillarContext.class,0);
		}
		public AtornillarContext atornillar() {
			return getRuleContext(AtornillarContext.class,0);
		}
		public AccionConHerramientaAtornillarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionGirarContext extends StepContext {
		public GirarContext girar() {
			return getRuleContext(GirarContext.class,0);
		}
		public AccionGirarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionNivelarContext extends StepContext {
		public NivelarContext nivelar() {
			return getRuleContext(NivelarContext.class,0);
		}
		public AccionNivelarContext(StepContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionConHerramientaClavarContext extends StepContext {
		public ConHerramientaClavarContext conHerramientaClavar() {
			return getRuleContext(ConHerramientaClavarContext.class,0);
		}
		public ClavarContext clavar() {
			return getRuleContext(ClavarContext.class,0);
		}
		public AccionConHerramientaClavarContext(StepContext ctx) { copyFrom(ctx); }
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_step);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AccionUnirContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				unir();
				}
				break;
			case 2:
				_localctx = new AccionColocarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				colocar();
				}
				break;
			case 3:
				_localctx = new AccionAtornillarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				atornillar();
				}
				break;
			case 4:
				_localctx = new AccionInsertarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				insertar();
				}
				break;
			case 5:
				_localctx = new AccionClavarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				clavar();
				}
				break;
			case 6:
				_localctx = new AccionMarcarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				marcar();
				}
				break;
			case 7:
				_localctx = new AccionDesplegarContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				desplegar();
				}
				break;
			case 8:
				_localctx = new AccionDeslizarContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				deslizar();
				}
				break;
			case 9:
				_localctx = new AccionSacarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(126);
				sacar();
				}
				break;
			case 10:
				_localctx = new AccionConHerramientaAtornillarContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(127);
				conHerramientaAtornillar();
				setState(128);
				atornillar();
				}
				break;
			case 11:
				_localctx = new AccionConHerramientaClavarContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(130);
				conHerramientaClavar();
				setState(131);
				clavar();
				}
				break;
			case 12:
				_localctx = new AccionGirarContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(133);
				girar();
				}
				break;
			case 13:
				_localctx = new AccionVoltearContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(134);
				voltear();
				}
				break;
			case 14:
				_localctx = new AccionNivelarContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(135);
				nivelar();
				}
				break;
			case 15:
				_localctx = new AccionRepetirContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(136);
				repetir();
				}
				break;
			case 16:
				_localctx = new AccionFijarContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(137);
				fijar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnirContext extends ParserRuleContext {
		public TerminalNode UNIR() { return getToken(IKEAParser.UNIR, 0); }
		public PiezaContext pieza() {
			return getRuleContext(PiezaContext.class,0);
		}
		public TerminalNode Y() { return getToken(IKEAParser.Y, 0); }
		public ListaPiezasUnirContext listaPiezasUnir() {
			return getRuleContext(ListaPiezasUnirContext.class,0);
		}
		public UnirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unir; }
	}

	public final UnirContext unir() throws RecognitionException {
		UnirContext _localctx = new UnirContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(UNIR);
			setState(141);
			pieza();
			setState(142);
			match(Y);
			setState(143);
			listaPiezasUnir();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaPiezasUnirContext extends ParserRuleContext {
		public List<PiezaContext> pieza() {
			return getRuleContexts(PiezaContext.class);
		}
		public PiezaContext pieza(int i) {
			return getRuleContext(PiezaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(IKEAParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(IKEAParser.COMA, i);
		}
		public List<TerminalNode> Y() { return getTokens(IKEAParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IKEAParser.Y, i);
		}
		public ListaPiezasUnirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaPiezasUnir; }
	}

	public final ListaPiezasUnirContext listaPiezasUnir() throws RecognitionException {
		ListaPiezasUnirContext _localctx = new ListaPiezasUnirContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaPiezasUnir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			pieza();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA || _la==Y) {
				{
				{
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==COMA || _la==Y) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(147);
				pieza();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColocarContext extends ParserRuleContext {
		public TerminalNode COLOCAR() { return getToken(IKEAParser.COLOCAR, 0); }
		public ListaComponentesContext listaComponentes() {
			return getRuleContext(ListaComponentesContext.class,0);
		}
		public TerminalNode EN() { return getToken(IKEAParser.EN, 0); }
		public ListaPiezasContext listaPiezas() {
			return getRuleContext(ListaPiezasContext.class,0);
		}
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public ColocarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colocar; }
	}

	public final ColocarContext colocar() throws RecognitionException {
		ColocarContext _localctx = new ColocarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_colocar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(COLOCAR);
			setState(154);
			listaComponentes();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EN) {
				{
				setState(155);
				match(EN);
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PIEZA:
				case CANTIDAD_POSITIVA:
					{
					setState(156);
					listaPiezas();
					}
					break;
				case NOMBRE_PIEZA:
					{
					setState(157);
					zona();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FijarContext extends ParserRuleContext {
		public TerminalNode FIJAR() { return getToken(IKEAParser.FIJAR, 0); }
		public TerminalNode EN() { return getToken(IKEAParser.EN, 0); }
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public FijarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fijar; }
	}

	public final FijarContext fijar() throws RecognitionException {
		FijarContext _localctx = new FijarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fijar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(FIJAR);
			setState(163);
			match(EN);
			setState(164);
			zona();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtornillarContext extends ParserRuleContext {
		public TerminalNode ATORNILLAR() { return getToken(IKEAParser.ATORNILLAR, 0); }
		public ListaTornillosContext listaTornillos() {
			return getRuleContext(ListaTornillosContext.class,0);
		}
		public TerminalNode Y() { return getToken(IKEAParser.Y, 0); }
		public ListaComponentesAccesoriosContext listaComponentesAccesorios() {
			return getRuleContext(ListaComponentesAccesoriosContext.class,0);
		}
		public TerminalNode EN() { return getToken(IKEAParser.EN, 0); }
		public ListaPiezasContext listaPiezas() {
			return getRuleContext(ListaPiezasContext.class,0);
		}
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public AtornillarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atornillar; }
	}

	public final AtornillarContext atornillar() throws RecognitionException {
		AtornillarContext _localctx = new AtornillarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atornillar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ATORNILLAR);
			setState(167);
			listaTornillos();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Y) {
				{
				setState(168);
				match(Y);
				setState(169);
				listaComponentesAccesorios();
				}
			}

			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EN) {
				{
				setState(172);
				match(EN);
				setState(175);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PIEZA:
				case CANTIDAD_POSITIVA:
					{
					setState(173);
					listaPiezas();
					}
					break;
				case NOMBRE_PIEZA:
					{
					setState(174);
					zona();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaComponentesAccesoriosContext extends ParserRuleContext {
		public List<ComponenteAccesorioContext> componenteAccesorio() {
			return getRuleContexts(ComponenteAccesorioContext.class);
		}
		public ComponenteAccesorioContext componenteAccesorio(int i) {
			return getRuleContext(ComponenteAccesorioContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(IKEAParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(IKEAParser.COMA, i);
		}
		public List<TerminalNode> Y() { return getTokens(IKEAParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IKEAParser.Y, i);
		}
		public ListaComponentesAccesoriosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComponentesAccesorios; }
	}

	public final ListaComponentesAccesoriosContext listaComponentesAccesorios() throws RecognitionException {
		ListaComponentesAccesoriosContext _localctx = new ListaComponentesAccesoriosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listaComponentesAccesorios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			componenteAccesorio();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA || _la==Y) {
				{
				{
				setState(180);
				_la = _input.LA(1);
				if ( !(_la==COMA || _la==Y) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				componenteAccesorio();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponenteAccesorioContext extends ParserRuleContext {
		public TerminalNode CANTIDAD_POSITIVA() { return getToken(IKEAParser.CANTIDAD_POSITIVA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode ESCUADRA() { return getToken(IKEAParser.ESCUADRA, 0); }
		public TerminalNode ARANDELA() { return getToken(IKEAParser.ARANDELA, 0); }
		public TerminalNode PLACA() { return getToken(IKEAParser.PLACA, 0); }
		public ComponenteAccesorioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componenteAccesorio; }
	}

	public final ComponenteAccesorioContext componenteAccesorio() throws RecognitionException {
		ComponenteAccesorioContext _localctx = new ComponenteAccesorioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_componenteAccesorio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(CANTIDAD_POSITIVA);
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(189);
			numero();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaTornillosContext extends ParserRuleContext {
		public List<TornilloContext> tornillo() {
			return getRuleContexts(TornilloContext.class);
		}
		public TornilloContext tornillo(int i) {
			return getRuleContext(TornilloContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(IKEAParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(IKEAParser.COMA, i);
		}
		public List<TerminalNode> Y() { return getTokens(IKEAParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IKEAParser.Y, i);
		}
		public ListaTornillosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaTornillos; }
	}

	public final ListaTornillosContext listaTornillos() throws RecognitionException {
		ListaTornillosContext _localctx = new ListaTornillosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listaTornillos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			tornillo();
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					_la = _input.LA(1);
					if ( !(_la==COMA || _la==Y) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(193);
					tornillo();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TornilloContext extends ParserRuleContext {
		public TerminalNode CANTIDAD_POSITIVA() { return getToken(IKEAParser.CANTIDAD_POSITIVA, 0); }
		public TerminalNode TORNILLO() { return getToken(IKEAParser.TORNILLO, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TornilloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tornillo; }
	}

	public final TornilloContext tornillo() throws RecognitionException {
		TornilloContext _localctx = new TornilloContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tornillo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(CANTIDAD_POSITIVA);
			setState(200);
			match(TORNILLO);
			setState(201);
			numero();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode CANTIDAD_POSITIVA() { return getToken(IKEAParser.CANTIDAD_POSITIVA, 0); }
		public TerminalNode INT() { return getToken(IKEAParser.INT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==CANTIDAD_POSITIVA || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertarContext extends ParserRuleContext {
		public TerminalNode INSERTAR() { return getToken(IKEAParser.INSERTAR, 0); }
		public ListaEspigasContext listaEspigas() {
			return getRuleContext(ListaEspigasContext.class,0);
		}
		public TerminalNode EN() { return getToken(IKEAParser.EN, 0); }
		public ListaPiezasContext listaPiezas() {
			return getRuleContext(ListaPiezasContext.class,0);
		}
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public InsertarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertar; }
	}

	public final InsertarContext insertar() throws RecognitionException {
		InsertarContext _localctx = new InsertarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_insertar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(INSERTAR);
			setState(206);
			listaEspigas();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EN) {
				{
				setState(207);
				match(EN);
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PIEZA:
				case CANTIDAD_POSITIVA:
					{
					setState(208);
					listaPiezas();
					}
					break;
				case NOMBRE_PIEZA:
					{
					setState(209);
					zona();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaEspigasContext extends ParserRuleContext {
		public List<EspigaContext> espiga() {
			return getRuleContexts(EspigaContext.class);
		}
		public EspigaContext espiga(int i) {
			return getRuleContext(EspigaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(IKEAParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(IKEAParser.COMA, i);
		}
		public List<TerminalNode> Y() { return getTokens(IKEAParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IKEAParser.Y, i);
		}
		public ListaEspigasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaEspigas; }
	}

	public final ListaEspigasContext listaEspigas() throws RecognitionException {
		ListaEspigasContext _localctx = new ListaEspigasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listaEspigas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			espiga();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA || _la==Y) {
				{
				{
				setState(215);
				_la = _input.LA(1);
				if ( !(_la==COMA || _la==Y) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(216);
				espiga();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspigaContext extends ParserRuleContext {
		public TerminalNode CANTIDAD_POSITIVA() { return getToken(IKEAParser.CANTIDAD_POSITIVA, 0); }
		public TerminalNode ESPIGA() { return getToken(IKEAParser.ESPIGA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public EspigaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espiga; }
	}

	public final EspigaContext espiga() throws RecognitionException {
		EspigaContext _localctx = new EspigaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_espiga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(CANTIDAD_POSITIVA);
			setState(223);
			match(ESPIGA);
			setState(224);
			numero();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClavarContext extends ParserRuleContext {
		public TerminalNode CLAVAR() { return getToken(IKEAParser.CLAVAR, 0); }
		public ListaClavosContext listaClavos() {
			return getRuleContext(ListaClavosContext.class,0);
		}
		public TerminalNode EN() { return getToken(IKEAParser.EN, 0); }
		public ListaPiezasContext listaPiezas() {
			return getRuleContext(ListaPiezasContext.class,0);
		}
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public ClavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clavar; }
	}

	public final ClavarContext clavar() throws RecognitionException {
		ClavarContext _localctx = new ClavarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_clavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(CLAVAR);
			setState(227);
			listaClavos();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EN) {
				{
				setState(228);
				match(EN);
				setState(231);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PIEZA:
				case CANTIDAD_POSITIVA:
					{
					setState(229);
					listaPiezas();
					}
					break;
				case NOMBRE_PIEZA:
					{
					setState(230);
					zona();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaClavosContext extends ParserRuleContext {
		public List<ClavoContext> clavo() {
			return getRuleContexts(ClavoContext.class);
		}
		public ClavoContext clavo(int i) {
			return getRuleContext(ClavoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(IKEAParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(IKEAParser.COMA, i);
		}
		public List<TerminalNode> Y() { return getTokens(IKEAParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IKEAParser.Y, i);
		}
		public ListaClavosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaClavos; }
	}

	public final ListaClavosContext listaClavos() throws RecognitionException {
		ListaClavosContext _localctx = new ListaClavosContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listaClavos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			clavo();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA || _la==Y) {
				{
				{
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==COMA || _la==Y) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				clavo();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClavoContext extends ParserRuleContext {
		public TerminalNode CANTIDAD_POSITIVA() { return getToken(IKEAParser.CANTIDAD_POSITIVA, 0); }
		public TerminalNode CLAVO() { return getToken(IKEAParser.CLAVO, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public ClavoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clavo; }
	}

	public final ClavoContext clavo() throws RecognitionException {
		ClavoContext _localctx = new ClavoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_clavo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(CANTIDAD_POSITIVA);
			setState(244);
			match(CLAVO);
			setState(245);
			numero();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MarcarContext extends ParserRuleContext {
		public TerminalNode MARCAR() { return getToken(IKEAParser.MARCAR, 0); }
		public TerminalNode CON() { return getToken(IKEAParser.CON, 0); }
		public TerminalNode LAPIZ() { return getToken(IKEAParser.LAPIZ, 0); }
		public TerminalNode EN() { return getToken(IKEAParser.EN, 0); }
		public ListaPiezasContext listaPiezas() {
			return getRuleContext(ListaPiezasContext.class,0);
		}
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public MarcarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marcar; }
	}

	public final MarcarContext marcar() throws RecognitionException {
		MarcarContext _localctx = new MarcarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_marcar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(MARCAR);
			setState(248);
			match(CON);
			setState(249);
			match(LAPIZ);
			setState(250);
			match(EN);
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIEZA:
			case CANTIDAD_POSITIVA:
				{
				setState(251);
				listaPiezas();
				}
				break;
			case NOMBRE_PIEZA:
				{
				setState(252);
				zona();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DesplegarContext extends ParserRuleContext {
		public TerminalNode DESPLEGAR() { return getToken(IKEAParser.DESPLEGAR, 0); }
		public PiezaContext pieza() {
			return getRuleContext(PiezaContext.class,0);
		}
		public DesplegarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desplegar; }
	}

	public final DesplegarContext desplegar() throws RecognitionException {
		DesplegarContext _localctx = new DesplegarContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_desplegar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(DESPLEGAR);
			setState(256);
			pieza();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeslizarContext extends ParserRuleContext {
		public TerminalNode DESLIZAR() { return getToken(IKEAParser.DESLIZAR, 0); }
		public PiezaContext pieza() {
			return getRuleContext(PiezaContext.class,0);
		}
		public TerminalNode EN() { return getToken(IKEAParser.EN, 0); }
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public DeslizarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deslizar; }
	}

	public final DeslizarContext deslizar() throws RecognitionException {
		DeslizarContext _localctx = new DeslizarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_deslizar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(DESLIZAR);
			setState(259);
			pieza();
			setState(260);
			match(EN);
			setState(261);
			zona();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SacarContext extends ParserRuleContext {
		public TerminalNode SACAR() { return getToken(IKEAParser.SACAR, 0); }
		public PiezaContext pieza() {
			return getRuleContext(PiezaContext.class,0);
		}
		public TerminalNode NOMBRE_PIEZA() { return getToken(IKEAParser.NOMBRE_PIEZA, 0); }
		public SacarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sacar; }
	}

	public final SacarContext sacar() throws RecognitionException {
		SacarContext _localctx = new SacarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sacar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(SACAR);
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIEZA:
			case CANTIDAD_POSITIVA:
				{
				setState(264);
				pieza();
				}
				break;
			case NOMBRE_PIEZA:
				{
				setState(265);
				match(NOMBRE_PIEZA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NivelarContext extends ParserRuleContext {
		public TerminalNode NIVELAR() { return getToken(IKEAParser.NIVELAR, 0); }
		public NivelarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nivelar; }
	}

	public final NivelarContext nivelar() throws RecognitionException {
		NivelarContext _localctx = new NivelarContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nivelar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(NIVELAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConHerramientaAtornillarContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(IKEAParser.CON, 0); }
		public TerminalNode COMA() { return getToken(IKEAParser.COMA, 0); }
		public TerminalNode DESTORNILLADOR() { return getToken(IKEAParser.DESTORNILLADOR, 0); }
		public TerminalNode LLAVE_ALLEN() { return getToken(IKEAParser.LLAVE_ALLEN, 0); }
		public ConHerramientaAtornillarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conHerramientaAtornillar; }
	}

	public final ConHerramientaAtornillarContext conHerramientaAtornillar() throws RecognitionException {
		ConHerramientaAtornillarContext _localctx = new ConHerramientaAtornillarContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conHerramientaAtornillar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(CON);
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==DESTORNILLADOR || _la==LLAVE_ALLEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(272);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConHerramientaClavarContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(IKEAParser.CON, 0); }
		public TerminalNode MARTILLO() { return getToken(IKEAParser.MARTILLO, 0); }
		public TerminalNode COMA() { return getToken(IKEAParser.COMA, 0); }
		public ConHerramientaClavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conHerramientaClavar; }
	}

	public final ConHerramientaClavarContext conHerramientaClavar() throws RecognitionException {
		ConHerramientaClavarContext _localctx = new ConHerramientaClavarContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_conHerramientaClavar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(CON);
			setState(275);
			match(MARTILLO);
			setState(276);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConHerramientaContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(IKEAParser.CON, 0); }
		public HerramientaContext herramienta() {
			return getRuleContext(HerramientaContext.class,0);
		}
		public TerminalNode COMA() { return getToken(IKEAParser.COMA, 0); }
		public ConHerramientaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conHerramienta; }
	}

	public final ConHerramientaContext conHerramienta() throws RecognitionException {
		ConHerramientaContext _localctx = new ConHerramientaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_conHerramienta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(CON);
			setState(279);
			herramienta();
			setState(280);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GirarContext extends ParserRuleContext {
		public TerminalNode GIRAR() { return getToken(IKEAParser.GIRAR, 0); }
		public DireccionContext direccion() {
			return getRuleContext(DireccionContext.class,0);
		}
		public GirarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girar; }
	}

	public final GirarContext girar() throws RecognitionException {
		GirarContext _localctx = new GirarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_girar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(GIRAR);
			setState(283);
			direccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VoltearContext extends ParserRuleContext {
		public TerminalNode VOLTEAR() { return getToken(IKEAParser.VOLTEAR, 0); }
		public VoltearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voltear; }
	}

	public final VoltearContext voltear() throws RecognitionException {
		VoltearContext _localctx = new VoltearContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_voltear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(VOLTEAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepetirContext extends ParserRuleContext {
		public Token paso;
		public Token veces;
		public TerminalNode REPETIR() { return getToken(IKEAParser.REPETIR, 0); }
		public TerminalNode PARENIZQ() { return getToken(IKEAParser.PARENIZQ, 0); }
		public TerminalNode PARENDER() { return getToken(IKEAParser.PARENDER, 0); }
		public List<TerminalNode> CANTIDAD_POSITIVA() { return getTokens(IKEAParser.CANTIDAD_POSITIVA); }
		public TerminalNode CANTIDAD_POSITIVA(int i) {
			return getToken(IKEAParser.CANTIDAD_POSITIVA, i);
		}
		public TerminalNode X() { return getToken(IKEAParser.X, 0); }
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(REPETIR);
			setState(288);
			match(PARENIZQ);
			setState(289);
			((RepetirContext)_localctx).paso = match(CANTIDAD_POSITIVA);
			setState(290);
			match(PARENDER);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(291);
				match(X);
				setState(292);
				((RepetirContext)_localctx).veces = match(CANTIDAD_POSITIVA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponenteContext extends ParserRuleContext {
		public TerminalNode CANTIDAD_POSITIVA() { return getToken(IKEAParser.CANTIDAD_POSITIVA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public ComponenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componente; }
	}

	public final ComponenteContext componente() throws RecognitionException {
		ComponenteContext _localctx = new ComponenteContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_componente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(CANTIDAD_POSITIVA);
			setState(296);
			tipo();
			setState(297);
			numero();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CantidadContext extends ParserRuleContext {
		public TerminalNode CANTIDAD_POSITIVA() { return getToken(IKEAParser.CANTIDAD_POSITIVA, 0); }
		public CantidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cantidad; }
	}

	public final CantidadContext cantidad() throws RecognitionException {
		CantidadContext _localctx = new CantidadContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cantidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(CANTIDAD_POSITIVA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodigoContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			numero();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TORNILLO() { return getToken(IKEAParser.TORNILLO, 0); }
		public TerminalNode ESPIGA() { return getToken(IKEAParser.ESPIGA, 0); }
		public TerminalNode CLAVO() { return getToken(IKEAParser.CLAVO, 0); }
		public TerminalNode PLACA() { return getToken(IKEAParser.PLACA, 0); }
		public TerminalNode PLACAS_METAL() { return getToken(IKEAParser.PLACAS_METAL, 0); }
		public TerminalNode ARANDELA() { return getToken(IKEAParser.ARANDELA, 0); }
		public TerminalNode ESCUADRA() { return getToken(IKEAParser.ESCUADRA, 0); }
		public TerminalNode SOPORTE() { return getToken(IKEAParser.SOPORTE, 0); }
		public TerminalNode TACO() { return getToken(IKEAParser.TACO, 0); }
		public TerminalNode PEGATINA() { return getToken(IKEAParser.PEGATINA, 0); }
		public TerminalNode PEGATINAS_ANTIDESLIZANTES() { return getToken(IKEAParser.PEGATINAS_ANTIDESLIZANTES, 0); }
		public TerminalNode EMBELLECEDOR() { return getToken(IKEAParser.EMBELLECEDOR, 0); }
		public TerminalNode LISTON() { return getToken(IKEAParser.LISTON, 0); }
		public TerminalNode BALDA() { return getToken(IKEAParser.BALDA, 0); }
		public TerminalNode TRAVIESA() { return getToken(IKEAParser.TRAVIESA, 0); }
		public TerminalNode TRAVESANO() { return getToken(IKEAParser.TRAVESANO, 0); }
		public TerminalNode PANEL() { return getToken(IKEAParser.PANEL, 0); }
		public TerminalNode NOMBRE_PIEZA() { return getToken(IKEAParser.NOMBRE_PIEZA, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 36033195031920640L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaComponentesContext extends ParserRuleContext {
		public List<ComponenteContext> componente() {
			return getRuleContexts(ComponenteContext.class);
		}
		public ComponenteContext componente(int i) {
			return getRuleContext(ComponenteContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(IKEAParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(IKEAParser.COMA, i);
		}
		public List<TerminalNode> Y() { return getTokens(IKEAParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IKEAParser.Y, i);
		}
		public ListaComponentesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComponentes; }
	}

	public final ListaComponentesContext listaComponentes() throws RecognitionException {
		ListaComponentesContext _localctx = new ListaComponentesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_listaComponentes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			componente();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA || _la==Y) {
				{
				{
				setState(306);
				_la = _input.LA(1);
				if ( !(_la==COMA || _la==Y) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				componente();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PiezaContext extends ParserRuleContext {
		public TerminalNode CANTIDAD_POSITIVA() { return getToken(IKEAParser.CANTIDAD_POSITIVA, 0); }
		public TerminalNode PIEZA() { return getToken(IKEAParser.PIEZA, 0); }
		public NombrePiezaContext nombrePieza() {
			return getRuleContext(NombrePiezaContext.class,0);
		}
		public TerminalNode EN() { return getToken(IKEAParser.EN, 0); }
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public PiezaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieza; }
	}

	public final PiezaContext pieza() throws RecognitionException {
		PiezaContext _localctx = new PiezaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_pieza);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CANTIDAD_POSITIVA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(313);
				match(CANTIDAD_POSITIVA);
				setState(314);
				match(PIEZA);
				setState(315);
				nombrePieza();
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(316);
					match(EN);
					setState(317);
					zona();
					}
					break;
				}
				}
				}
				break;
			case PIEZA:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(320);
				match(PIEZA);
				setState(321);
				nombrePieza();
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(322);
					match(EN);
					setState(323);
					zona();
					}
					break;
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NombrePiezaContext extends ParserRuleContext {
		public TerminalNode NOMBRE_PIEZA() { return getToken(IKEAParser.NOMBRE_PIEZA, 0); }
		public TerminalNode BALDA() { return getToken(IKEAParser.BALDA, 0); }
		public TerminalNode LISTON() { return getToken(IKEAParser.LISTON, 0); }
		public TerminalNode TRAVIESA() { return getToken(IKEAParser.TRAVIESA, 0); }
		public TerminalNode TRAVESANO() { return getToken(IKEAParser.TRAVESANO, 0); }
		public TerminalNode PANEL() { return getToken(IKEAParser.PANEL, 0); }
		public NombrePiezaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrePieza; }
	}

	public final NombrePiezaContext nombrePieza() throws RecognitionException {
		NombrePiezaContext _localctx = new NombrePiezaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_nombrePieza);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 36033057626521600L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaPiezasContext extends ParserRuleContext {
		public List<PiezaContext> pieza() {
			return getRuleContexts(PiezaContext.class);
		}
		public PiezaContext pieza(int i) {
			return getRuleContext(PiezaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(IKEAParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(IKEAParser.COMA, i);
		}
		public List<TerminalNode> Y() { return getTokens(IKEAParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IKEAParser.Y, i);
		}
		public ListaPiezasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaPiezas; }
	}

	public final ListaPiezasContext listaPiezas() throws RecognitionException {
		ListaPiezasContext _localctx = new ListaPiezasContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listaPiezas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			pieza();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA || _la==Y) {
				{
				{
				setState(331);
				_la = _input.LA(1);
				if ( !(_la==COMA || _la==Y) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(332);
				pieza();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ZonaContext extends ParserRuleContext {
		public TerminalNode NOMBRE_PIEZA() { return getToken(IKEAParser.NOMBRE_PIEZA, 0); }
		public ZonaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zona; }
	}

	public final ZonaContext zona() throws RecognitionException {
		ZonaContext _localctx = new ZonaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_zona);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(NOMBRE_PIEZA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HerramientaContext extends ParserRuleContext {
		public TerminalNode DESTORNILLADOR() { return getToken(IKEAParser.DESTORNILLADOR, 0); }
		public TerminalNode MARTILLO() { return getToken(IKEAParser.MARTILLO, 0); }
		public TerminalNode LAPIZ() { return getToken(IKEAParser.LAPIZ, 0); }
		public TerminalNode LLAVE_ALLEN() { return getToken(IKEAParser.LLAVE_ALLEN, 0); }
		public HerramientaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_herramienta; }
	}

	public final HerramientaContext herramienta() throws RecognitionException {
		HerramientaContext _localctx = new HerramientaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_herramienta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970697666560L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DireccionContext extends ParserRuleContext {
		public TerminalNode ABAJO() { return getToken(IKEAParser.ABAJO, 0); }
		public TerminalNode LATERAL_CORTO() { return getToken(IKEAParser.LATERAL_CORTO, 0); }
		public TerminalNode ARRIBA() { return getToken(IKEAParser.ARRIBA, 0); }
		public TerminalNode LATERAL_LARGO() { return getToken(IKEAParser.LATERAL_LARGO, 0); }
		public DireccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direccion; }
	}

	public final DireccionContext direccion() throws RecognitionException {
		DireccionContext _localctx = new DireccionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_direccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u0159\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0004\u0000"+
		"Y\b\u0000\u000b\u0000\f\u0000Z\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002h\b\u0002\n\u0002\f\u0002k\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003r\b"+
		"\u0003\n\u0003\f\u0003u\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008b"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0095\b\u0006\n\u0006\f\u0006"+
		"\u0098\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u009f\b\u0007\u0003\u0007\u00a1\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ab\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00b0\b\t\u0003\t\u00b2\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0005\n\u00b7\b\n\n\n\f\n\u00ba\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00c3\b\f\n\f\f\f\u00c6\t"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d3\b\u000f"+
		"\u0003\u000f\u00d5\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00da\b\u0010\n\u0010\f\u0010\u00dd\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00e8\b\u0012\u0003\u0012\u00ea\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00ef\b\u0013\n\u0013\f\u0013\u00f2"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00fe"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u010b\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0126\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0005$\u0135\b$\n$\f$\u0138\t$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u013f\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u0145\b%\u0003%\u0147"+
		"\b%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0005\'\u014e\b\'\n\'\f\'\u0151"+
		"\t\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001*\u0000\u0000+\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRT\u0000\b\u0001\u0000\u0015\u0016\u0001"+
		"\u0000\u001e \u0001\u000056\u0002\u0000**--\u0002\u0000\u0019)77\u0002"+
		"\u0000%)77\u0001\u0000*-\u0001\u0000.1\u0155\u0000V\u0001\u0000\u0000"+
		"\u0000\u0002_\u0001\u0000\u0000\u0000\u0004b\u0001\u0000\u0000\u0000\u0006"+
		"n\u0001\u0000\u0000\u0000\b\u008a\u0001\u0000\u0000\u0000\n\u008c\u0001"+
		"\u0000\u0000\u0000\f\u0091\u0001\u0000\u0000\u0000\u000e\u0099\u0001\u0000"+
		"\u0000\u0000\u0010\u00a2\u0001\u0000\u0000\u0000\u0012\u00a6\u0001\u0000"+
		"\u0000\u0000\u0014\u00b3\u0001\u0000\u0000\u0000\u0016\u00bb\u0001\u0000"+
		"\u0000\u0000\u0018\u00bf\u0001\u0000\u0000\u0000\u001a\u00c7\u0001\u0000"+
		"\u0000\u0000\u001c\u00cb\u0001\u0000\u0000\u0000\u001e\u00cd\u0001\u0000"+
		"\u0000\u0000 \u00d6\u0001\u0000\u0000\u0000\"\u00de\u0001\u0000\u0000"+
		"\u0000$\u00e2\u0001\u0000\u0000\u0000&\u00eb\u0001\u0000\u0000\u0000("+
		"\u00f3\u0001\u0000\u0000\u0000*\u00f7\u0001\u0000\u0000\u0000,\u00ff\u0001"+
		"\u0000\u0000\u0000.\u0102\u0001\u0000\u0000\u00000\u0107\u0001\u0000\u0000"+
		"\u00002\u010c\u0001\u0000\u0000\u00004\u010e\u0001\u0000\u0000\u00006"+
		"\u0112\u0001\u0000\u0000\u00008\u0116\u0001\u0000\u0000\u0000:\u011a\u0001"+
		"\u0000\u0000\u0000<\u011d\u0001\u0000\u0000\u0000>\u011f\u0001\u0000\u0000"+
		"\u0000@\u0127\u0001\u0000\u0000\u0000B\u012b\u0001\u0000\u0000\u0000D"+
		"\u012d\u0001\u0000\u0000\u0000F\u012f\u0001\u0000\u0000\u0000H\u0131\u0001"+
		"\u0000\u0000\u0000J\u0146\u0001\u0000\u0000\u0000L\u0148\u0001\u0000\u0000"+
		"\u0000N\u014a\u0001\u0000\u0000\u0000P\u0152\u0001\u0000\u0000\u0000R"+
		"\u0154\u0001\u0000\u0000\u0000T\u0156\u0001\u0000\u0000\u0000VX\u0003"+
		"\u0002\u0001\u0000WY\u0003\u0004\u0002\u0000XW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\]\u00052\u0000\u0000]^\u0005\u0000"+
		"\u0000\u0001^\u0001\u0001\u0000\u0000\u0000_`\u00053\u0000\u0000`a\u0005"+
		"8\u0000\u0000a\u0003\u0001\u0000\u0000\u0000bc\u00055\u0000\u0000cd\u0005"+
		"\u0012\u0000\u0000di\u0003\u0006\u0003\u0000ef\u0005\u0013\u0000\u0000"+
		"fh\u0003\u0006\u0003\u0000ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0013\u0000\u0000m\u0005"+
		"\u0001\u0000\u0000\u0000ns\u0003\b\u0004\u0000op\u0005\u0014\u0000\u0000"+
		"pr\u0003\b\u0004\u0000qo\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0007\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000v\u008b\u0003\n\u0005\u0000w\u008b"+
		"\u0003\u000e\u0007\u0000x\u008b\u0003\u0012\t\u0000y\u008b\u0003\u001e"+
		"\u000f\u0000z\u008b\u0003$\u0012\u0000{\u008b\u0003*\u0015\u0000|\u008b"+
		"\u0003,\u0016\u0000}\u008b\u0003.\u0017\u0000~\u008b\u00030\u0018\u0000"+
		"\u007f\u0080\u00034\u001a\u0000\u0080\u0081\u0003\u0012\t\u0000\u0081"+
		"\u008b\u0001\u0000\u0000\u0000\u0082\u0083\u00036\u001b\u0000\u0083\u0084"+
		"\u0003$\u0012\u0000\u0084\u008b\u0001\u0000\u0000\u0000\u0085\u008b\u0003"+
		":\u001d\u0000\u0086\u008b\u0003<\u001e\u0000\u0087\u008b\u00032\u0019"+
		"\u0000\u0088\u008b\u0003>\u001f\u0000\u0089\u008b\u0003\u0010\b\u0000"+
		"\u008av\u0001\u0000\u0000\u0000\u008aw\u0001\u0000\u0000\u0000\u008ax"+
		"\u0001\u0000\u0000\u0000\u008ay\u0001\u0000\u0000\u0000\u008az\u0001\u0000"+
		"\u0000\u0000\u008a{\u0001\u0000\u0000\u0000\u008a|\u0001\u0000\u0000\u0000"+
		"\u008a}\u0001\u0000\u0000\u0000\u008a~\u0001\u0000\u0000\u0000\u008a\u007f"+
		"\u0001\u0000\u0000\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a\u0085"+
		"\u0001\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008a\u0087"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\t\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u0001\u0000\u0000\u008d\u008e\u0003J%\u0000\u008e\u008f\u0005\u0016\u0000"+
		"\u0000\u008f\u0090\u0003\f\u0006\u0000\u0090\u000b\u0001\u0000\u0000\u0000"+
		"\u0091\u0096\u0003J%\u0000\u0092\u0093\u0007\u0000\u0000\u0000\u0093\u0095"+
		"\u0003J%\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\r\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005\u0002\u0000\u0000\u009a\u00a0\u0003H$\u0000\u009b"+
		"\u009e\u0005\u0003\u0000\u0000\u009c\u009f\u0003N\'\u0000\u009d\u009f"+
		"\u0003P(\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009b\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u000f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000\u0000\u00a3\u00a4\u0005\u0003"+
		"\u0000\u0000\u00a4\u00a5\u0003P(\u0000\u00a5\u0011\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005\u0005\u0000\u0000\u00a7\u00aa\u0003\u0018\f\u0000\u00a8"+
		"\u00a9\u0005\u0016\u0000\u0000\u00a9\u00ab\u0003\u0014\n\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00b1"+
		"\u0001\u0000\u0000\u0000\u00ac\u00af\u0005\u0003\u0000\u0000\u00ad\u00b0"+
		"\u0003N\'\u0000\u00ae\u00b0\u0003P(\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3\u00b8\u0003\u0016\u000b"+
		"\u0000\u00b4\u00b5\u0007\u0000\u0000\u0000\u00b5\u00b7\u0003\u0016\u000b"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u0015\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u00055\u0000\u0000\u00bc\u00bd\u0007\u0001\u0000\u0000"+
		"\u00bd\u00be\u0003\u001c\u000e\u0000\u00be\u0017\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c4\u0003\u001a\r\u0000\u00c0\u00c1\u0007\u0000\u0000\u0000\u00c1"+
		"\u00c3\u0003\u001a\r\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u0019\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u00055\u0000\u0000\u00c8\u00c9\u0005"+
		"\u001b\u0000\u0000\u00c9\u00ca\u0003\u001c\u000e\u0000\u00ca\u001b\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0007\u0002\u0000\u0000\u00cc\u001d\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005\u0006\u0000\u0000\u00ce\u00d4\u0003"+
		" \u0010\u0000\u00cf\u00d2\u0005\u0003\u0000\u0000\u00d0\u00d3\u0003N\'"+
		"\u0000\u00d1\u00d3\u0003P(\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"\u001f\u0001\u0000\u0000\u0000\u00d6\u00db\u0003\"\u0011\u0000\u00d7\u00d8"+
		"\u0007\u0000\u0000\u0000\u00d8\u00da\u0003\"\u0011\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc!\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u00055\u0000"+
		"\u0000\u00df\u00e0\u0005\u001c\u0000\u0000\u00e0\u00e1\u0003\u001c\u000e"+
		"\u0000\u00e1#\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0007\u0000\u0000"+
		"\u00e3\u00e9\u0003&\u0013\u0000\u00e4\u00e7\u0005\u0003\u0000\u0000\u00e5"+
		"\u00e8\u0003N\'\u0000\u00e6\u00e8\u0003P(\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e4\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea%\u0001\u0000\u0000\u0000\u00eb\u00f0\u0003(\u0014\u0000"+
		"\u00ec\u00ed\u0007\u0000\u0000\u0000\u00ed\u00ef\u0003(\u0014\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\'\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u00055\u0000\u0000\u00f4\u00f5\u0005\u001d\u0000\u0000\u00f5\u00f6\u0003"+
		"\u001c\u000e\u0000\u00f6)\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\b"+
		"\u0000\u0000\u00f8\u00f9\u0005\t\u0000\u0000\u00f9\u00fa\u0005,\u0000"+
		"\u0000\u00fa\u00fd\u0005\u0003\u0000\u0000\u00fb\u00fe\u0003N\'\u0000"+
		"\u00fc\u00fe\u0003P(\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fe+\u0001\u0000\u0000\u0000\u00ff\u0100\u0005"+
		"\n\u0000\u0000\u0100\u0101\u0003J%\u0000\u0101-\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0005\u000b\u0000\u0000\u0103\u0104\u0003J%\u0000\u0104\u0105"+
		"\u0005\u0003\u0000\u0000\u0105\u0106\u0003P(\u0000\u0106/\u0001\u0000"+
		"\u0000\u0000\u0107\u010a\u0005\f\u0000\u0000\u0108\u010b\u0003J%\u0000"+
		"\u0109\u010b\u00057\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a"+
		"\u0109\u0001\u0000\u0000\u0000\u010b1\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0005\r\u0000\u0000\u010d3\u0001\u0000\u0000\u0000\u010e\u010f\u0005"+
		"\t\u0000\u0000\u010f\u0110\u0007\u0003\u0000\u0000\u0110\u0111\u0005\u0015"+
		"\u0000\u0000\u01115\u0001\u0000\u0000\u0000\u0112\u0113\u0005\t\u0000"+
		"\u0000\u0113\u0114\u0005+\u0000\u0000\u0114\u0115\u0005\u0015\u0000\u0000"+
		"\u01157\u0001\u0000\u0000\u0000\u0116\u0117\u0005\t\u0000\u0000\u0117"+
		"\u0118\u0003R)\u0000\u0118\u0119\u0005\u0015\u0000\u0000\u01199\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0005\u000e\u0000\u0000\u011b\u011c\u0003"+
		"T*\u0000\u011c;\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u000f\u0000"+
		"\u0000\u011e=\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u0010\u0000\u0000"+
		"\u0120\u0121\u0005\u0017\u0000\u0000\u0121\u0122\u00055\u0000\u0000\u0122"+
		"\u0125\u0005\u0018\u0000\u0000\u0123\u0124\u00054\u0000\u0000\u0124\u0126"+
		"\u00055\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126?\u0001\u0000\u0000\u0000\u0127\u0128\u00055\u0000"+
		"\u0000\u0128\u0129\u0003F#\u0000\u0129\u012a\u0003\u001c\u000e\u0000\u012a"+
		"A\u0001\u0000\u0000\u0000\u012b\u012c\u00055\u0000\u0000\u012cC\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0003\u001c\u000e\u0000\u012eE\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0007\u0004\u0000\u0000\u0130G\u0001\u0000\u0000"+
		"\u0000\u0131\u0136\u0003@ \u0000\u0132\u0133\u0007\u0000\u0000\u0000\u0133"+
		"\u0135\u0003@ \u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0138\u0001"+
		"\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001"+
		"\u0000\u0000\u0000\u0137I\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u00055\u0000\u0000\u013a\u013b\u0005\u0011\u0000"+
		"\u0000\u013b\u013e\u0003L&\u0000\u013c\u013d\u0005\u0003\u0000\u0000\u013d"+
		"\u013f\u0003P(\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f\u0147\u0001\u0000\u0000\u0000\u0140\u0141\u0005"+
		"\u0011\u0000\u0000\u0141\u0144\u0003L&\u0000\u0142\u0143\u0005\u0003\u0000"+
		"\u0000\u0143\u0145\u0003P(\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146"+
		"\u0139\u0001\u0000\u0000\u0000\u0146\u0140\u0001\u0000\u0000\u0000\u0147"+
		"K\u0001\u0000\u0000\u0000\u0148\u0149\u0007\u0005\u0000\u0000\u0149M\u0001"+
		"\u0000\u0000\u0000\u014a\u014f\u0003J%\u0000\u014b\u014c\u0007\u0000\u0000"+
		"\u0000\u014c\u014e\u0003J%\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e"+
		"\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0001\u0000\u0000\u0000\u0150O\u0001\u0000\u0000\u0000\u0151\u014f"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u00057\u0000\u0000\u0153Q\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0007\u0006\u0000\u0000\u0155S\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0007\u0007\u0000\u0000\u0157U\u0001\u0000\u0000\u0000"+
		"\u001aZis\u008a\u0096\u009e\u00a0\u00aa\u00af\u00b1\u00b8\u00c4\u00d2"+
		"\u00d4\u00db\u00e7\u00e9\u00f0\u00fd\u010a\u0125\u0136\u013e\u0144\u0146"+
		"\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}