// Generated from /Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl2/proyecto/src/main/antlr/ikea/IKEA.g4 by ANTLR 4.13.2
 package ikea; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IKEAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, COMPONENTE=30, DESTORNILLADOR=31, 
		MARTILLO=32, LAPIZ=33, LLAVE_ALLEN=34, ABAJO=35, LATERAL_CORTO=36, FIN=37, 
		ITEM=38, X=39, INT=40, ID=41, WS=42;
	public static final int
		RULE_manual = 0, RULE_itemHeader = 1, RULE_instruction = 2, RULE_stepList = 3, 
		RULE_step = 4, RULE_unir = 5, RULE_colocar = 6, RULE_fijar = 7, RULE_atornillar = 8, 
		RULE_insertar = 9, RULE_clavar = 10, RULE_marcar = 11, RULE_desplegar = 12, 
		RULE_deslizar = 13, RULE_sacar = 14, RULE_nivelar = 15, RULE_conHerramienta = 16, 
		RULE_girar = 17, RULE_voltear = 18, RULE_repetir = 19, RULE_componente = 20, 
		RULE_cantidad = 21, RULE_codigo = 22, RULE_tipo = 23, RULE_listaComponentes = 24, 
		RULE_pieza = 25, RULE_piezaConZona = 26, RULE_listaPiezas = 27, RULE_zona = 28, 
		RULE_herramienta = 29, RULE_direccion = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"manual", "itemHeader", "instruction", "stepList", "step", "unir", "colocar", 
			"fijar", "atornillar", "insertar", "clavar", "marcar", "desplegar", "deslizar", 
			"sacar", "nivelar", "conHerramienta", "girar", "voltear", "repetir", 
			"componente", "cantidad", "codigo", "tipo", "listaComponentes", "pieza", 
			"piezaConZona", "listaPiezas", "zona", "herramienta", "direccion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'.'", "';'", "'Unir'", "'Colocar'", "'en'", "'Fijar'", 
			"'Atornillar'", "'atornillar'", "'Insertar'", "'insertar'", "'Clavar'", 
			"'clavar'", "'Marcar'", "'con'", "'Desplegar'", "'Deslizar'", "'Sacar'", 
			"'Nivelar'", "'Con'", "','", "'Girar'", "'Voltear'", "'Repetir'", "'('", 
			"')'", "'y'", "'piezas'", "'pieza'", null, null, null, null, null, "'ABAJO'", 
			"'LATERAL_CORTO'", "'FIN'", "'ITEM:'", "'x'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "COMPONENTE", "DESTORNILLADOR", "MARTILLO", 
			"LAPIZ", "LLAVE_ALLEN", "ABAJO", "LATERAL_CORTO", "FIN", "ITEM", "X", 
			"INT", "ID", "WS"
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
	public String getGrammarFileName() { return "IKEA.g4"; }

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterManual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitManual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitManual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManualContext manual() throws RecognitionException {
		ManualContext _localctx = new ManualContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_manual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			itemHeader();
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				instruction();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(68);
			match(FIN);
			setState(69);
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
		public TerminalNode ID() { return getToken(IKEAParser.ID, 0); }
		public ItemHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterItemHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitItemHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitItemHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemHeaderContext itemHeader() throws RecognitionException {
		ItemHeaderContext _localctx = new ItemHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_itemHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ITEM);
			setState(72);
			match(ID);
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
		public TerminalNode INT() { return getToken(IKEAParser.INT, 0); }
		public List<StepListContext> stepList() {
			return getRuleContexts(StepListContext.class);
		}
		public StepListContext stepList(int i) {
			return getRuleContext(StepListContext.class,i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(INT);
			setState(75);
			match(T__0);
			setState(76);
			stepList();
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					match(T__1);
					setState(78);
					stepList();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(84);
			match(T__1);
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
		public StepListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterStepList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitStepList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitStepList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepListContext stepList() throws RecognitionException {
		StepListContext _localctx = new StepListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stepList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			step();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(87);
				match(T__2);
				setState(88);
				step();
				}
				}
				setState(93);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionDesplegar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionDesplegar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionDesplegar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionUnirContext extends StepContext {
		public UnirContext unir() {
			return getRuleContext(UnirContext.class,0);
		}
		public AccionUnirContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionUnir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionUnir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionUnir(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionAtornillarContext extends StepContext {
		public AtornillarContext atornillar() {
			return getRuleContext(AtornillarContext.class,0);
		}
		public AccionAtornillarContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionAtornillar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionAtornillar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionAtornillar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionFijarContext extends StepContext {
		public FijarContext fijar() {
			return getRuleContext(FijarContext.class,0);
		}
		public AccionFijarContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionFijar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionFijar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionFijar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionRepetirContext extends StepContext {
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public AccionRepetirContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionRepetir(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionMarcarContext extends StepContext {
		public MarcarContext marcar() {
			return getRuleContext(MarcarContext.class,0);
		}
		public AccionMarcarContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionMarcar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionMarcar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionMarcar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionInsertarContext extends StepContext {
		public InsertarContext insertar() {
			return getRuleContext(InsertarContext.class,0);
		}
		public AccionInsertarContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionInsertar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionInsertar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionInsertar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionClavarContext extends StepContext {
		public ClavarContext clavar() {
			return getRuleContext(ClavarContext.class,0);
		}
		public AccionClavarContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionClavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionClavar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionClavar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionVoltearContext extends StepContext {
		public VoltearContext voltear() {
			return getRuleContext(VoltearContext.class,0);
		}
		public AccionVoltearContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionVoltear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionVoltear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionVoltear(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionSacarContext extends StepContext {
		public SacarContext sacar() {
			return getRuleContext(SacarContext.class,0);
		}
		public AccionSacarContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionSacar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionSacar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionSacar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionDeslizarContext extends StepContext {
		public DeslizarContext deslizar() {
			return getRuleContext(DeslizarContext.class,0);
		}
		public AccionDeslizarContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionDeslizar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionDeslizar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionDeslizar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionConHerramientaContext extends StepContext {
		public ConHerramientaContext conHerramienta() {
			return getRuleContext(ConHerramientaContext.class,0);
		}
		public AtornillarContext atornillar() {
			return getRuleContext(AtornillarContext.class,0);
		}
		public ClavarContext clavar() {
			return getRuleContext(ClavarContext.class,0);
		}
		public InsertarContext insertar() {
			return getRuleContext(InsertarContext.class,0);
		}
		public ColocarContext colocar() {
			return getRuleContext(ColocarContext.class,0);
		}
		public AccionConHerramientaContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionConHerramienta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionConHerramienta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionConHerramienta(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionColocarContext extends StepContext {
		public ColocarContext colocar() {
			return getRuleContext(ColocarContext.class,0);
		}
		public AccionColocarContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionColocar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionColocar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionColocar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionGirarContext extends StepContext {
		public GirarContext girar() {
			return getRuleContext(GirarContext.class,0);
		}
		public AccionGirarContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionGirar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionGirar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionGirar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccionNivelarContext extends StepContext {
		public NivelarContext nivelar() {
			return getRuleContext(NivelarContext.class,0);
		}
		public AccionNivelarContext(StepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAccionNivelar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAccionNivelar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAccionNivelar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_step);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new AccionUnirContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				unir();
				}
				break;
			case T__4:
				_localctx = new AccionColocarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				colocar();
				}
				break;
			case T__7:
			case T__8:
				_localctx = new AccionAtornillarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				atornillar();
				}
				break;
			case T__9:
			case T__10:
				_localctx = new AccionInsertarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				insertar();
				}
				break;
			case T__11:
			case T__12:
				_localctx = new AccionClavarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				clavar();
				}
				break;
			case T__13:
				_localctx = new AccionMarcarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				marcar();
				}
				break;
			case T__15:
				_localctx = new AccionDesplegarContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				desplegar();
				}
				break;
			case T__16:
				_localctx = new AccionDeslizarContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(101);
				deslizar();
				}
				break;
			case T__17:
				_localctx = new AccionSacarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				sacar();
				}
				break;
			case T__19:
				_localctx = new AccionConHerramientaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(103);
				conHerramienta();
				setState(108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
				case T__8:
					{
					setState(104);
					atornillar();
					}
					break;
				case T__11:
				case T__12:
					{
					setState(105);
					clavar();
					}
					break;
				case T__9:
				case T__10:
					{
					setState(106);
					insertar();
					}
					break;
				case T__4:
					{
					setState(107);
					colocar();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__21:
				_localctx = new AccionGirarContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(110);
				girar();
				}
				break;
			case T__22:
				_localctx = new AccionVoltearContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(111);
				voltear();
				}
				break;
			case T__18:
				_localctx = new AccionNivelarContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(112);
				nivelar();
				}
				break;
			case T__23:
				_localctx = new AccionRepetirContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(113);
				repetir();
				}
				break;
			case T__6:
				_localctx = new AccionFijarContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(114);
				fijar();
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
	public static class UnirContext extends ParserRuleContext {
		public ListaPiezasContext listaPiezas() {
			return getRuleContext(ListaPiezasContext.class,0);
		}
		public UnirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterUnir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitUnir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitUnir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnirContext unir() throws RecognitionException {
		UnirContext _localctx = new UnirContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__3);
			setState(118);
			listaPiezas();
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
		public ListaComponentesContext listaComponentes() {
			return getRuleContext(ListaComponentesContext.class,0);
		}
		public List<ListaPiezasContext> listaPiezas() {
			return getRuleContexts(ListaPiezasContext.class);
		}
		public ListaPiezasContext listaPiezas(int i) {
			return getRuleContext(ListaPiezasContext.class,i);
		}
		public PiezaConZonaContext piezaConZona() {
			return getRuleContext(PiezaConZonaContext.class,0);
		}
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public ColocarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colocar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterColocar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitColocar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitColocar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColocarContext colocar() throws RecognitionException {
		ColocarContext _localctx = new ColocarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_colocar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__4);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(121);
				listaComponentes();
				}
				break;
			case 2:
				{
				setState(122);
				listaPiezas();
				}
				break;
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(125);
				match(T__5);
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(126);
					piezaConZona();
					}
					break;
				case 2:
					{
					setState(127);
					listaPiezas();
					}
					break;
				case 3:
					{
					setState(128);
					zona();
					}
					break;
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
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public FijarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fijar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterFijar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitFijar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitFijar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FijarContext fijar() throws RecognitionException {
		FijarContext _localctx = new FijarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fijar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__6);
			setState(134);
			match(T__5);
			setState(135);
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
		public ListaComponentesContext listaComponentes() {
			return getRuleContext(ListaComponentesContext.class,0);
		}
		public PiezaConZonaContext piezaConZona() {
			return getRuleContext(PiezaConZonaContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterAtornillar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitAtornillar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitAtornillar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtornillarContext atornillar() throws RecognitionException {
		AtornillarContext _localctx = new AtornillarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atornillar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(138);
			listaComponentes();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(139);
				match(T__5);
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(140);
					piezaConZona();
					}
					break;
				case 2:
					{
					setState(141);
					listaPiezas();
					}
					break;
				case 3:
					{
					setState(142);
					zona();
					}
					break;
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
	public static class InsertarContext extends ParserRuleContext {
		public ListaComponentesContext listaComponentes() {
			return getRuleContext(ListaComponentesContext.class,0);
		}
		public PiezaConZonaContext piezaConZona() {
			return getRuleContext(PiezaConZonaContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterInsertar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitInsertar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitInsertar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertarContext insertar() throws RecognitionException {
		InsertarContext _localctx = new InsertarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_insertar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			listaComponentes();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(149);
				match(T__5);
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(150);
					piezaConZona();
					}
					break;
				case 2:
					{
					setState(151);
					listaPiezas();
					}
					break;
				case 3:
					{
					setState(152);
					zona();
					}
					break;
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
	public static class ClavarContext extends ParserRuleContext {
		public ListaComponentesContext listaComponentes() {
			return getRuleContext(ListaComponentesContext.class,0);
		}
		public PiezaConZonaContext piezaConZona() {
			return getRuleContext(PiezaConZonaContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterClavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitClavar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitClavar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClavarContext clavar() throws RecognitionException {
		ClavarContext _localctx = new ClavarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_clavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(158);
			listaComponentes();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(159);
				match(T__5);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(160);
					piezaConZona();
					}
					break;
				case 2:
					{
					setState(161);
					listaPiezas();
					}
					break;
				case 3:
					{
					setState(162);
					zona();
					}
					break;
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
	public static class MarcarContext extends ParserRuleContext {
		public HerramientaContext herramienta() {
			return getRuleContext(HerramientaContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterMarcar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitMarcar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitMarcar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarcarContext marcar() throws RecognitionException {
		MarcarContext _localctx = new MarcarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_marcar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__13);
			setState(168);
			match(T__14);
			setState(169);
			herramienta();
			setState(170);
			match(T__5);
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case INT:
				{
				setState(171);
				listaPiezas();
				}
				break;
			case COMPONENTE:
			case ID:
				{
				setState(172);
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
		public PiezaContext pieza() {
			return getRuleContext(PiezaContext.class,0);
		}
		public DesplegarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desplegar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterDesplegar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitDesplegar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitDesplegar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesplegarContext desplegar() throws RecognitionException {
		DesplegarContext _localctx = new DesplegarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_desplegar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__15);
			setState(176);
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
		public PiezaContext pieza() {
			return getRuleContext(PiezaContext.class,0);
		}
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public DeslizarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deslizar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterDeslizar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitDeslizar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitDeslizar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeslizarContext deslizar() throws RecognitionException {
		DeslizarContext _localctx = new DeslizarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_deslizar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__16);
			setState(179);
			pieza();
			setState(180);
			match(T__5);
			setState(181);
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
		public PiezaContext pieza() {
			return getRuleContext(PiezaContext.class,0);
		}
		public TerminalNode ID() { return getToken(IKEAParser.ID, 0); }
		public SacarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sacar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterSacar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitSacar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitSacar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SacarContext sacar() throws RecognitionException {
		SacarContext _localctx = new SacarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sacar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__17);
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case INT:
				{
				setState(184);
				pieza();
				}
				break;
			case ID:
				{
				setState(185);
				match(ID);
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
		public NivelarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nivelar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterNivelar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitNivelar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitNivelar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NivelarContext nivelar() throws RecognitionException {
		NivelarContext _localctx = new NivelarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nivelar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__18);
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
		public HerramientaContext herramienta() {
			return getRuleContext(HerramientaContext.class,0);
		}
		public ConHerramientaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conHerramienta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterConHerramienta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitConHerramienta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitConHerramienta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConHerramientaContext conHerramienta() throws RecognitionException {
		ConHerramientaContext _localctx = new ConHerramientaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conHerramienta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__19);
			setState(191);
			herramienta();
			setState(192);
			match(T__20);
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
		public DireccionContext direccion() {
			return getRuleContext(DireccionContext.class,0);
		}
		public GirarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterGirar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitGirar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitGirar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GirarContext girar() throws RecognitionException {
		GirarContext _localctx = new GirarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_girar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__21);
			setState(195);
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
		public VoltearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voltear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterVoltear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitVoltear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitVoltear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoltearContext voltear() throws RecognitionException {
		VoltearContext _localctx = new VoltearContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_voltear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__22);
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
		public List<TerminalNode> INT() { return getTokens(IKEAParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(IKEAParser.INT, i);
		}
		public TerminalNode X() { return getToken(IKEAParser.X, 0); }
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__23);
			setState(200);
			match(T__24);
			setState(201);
			((RepetirContext)_localctx).paso = match(INT);
			setState(202);
			match(T__25);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X) {
				{
				setState(203);
				match(X);
				setState(204);
				((RepetirContext)_localctx).veces = match(INT);
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public CantidadContext cantidad() {
			return getRuleContext(CantidadContext.class,0);
		}
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public ComponenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterComponente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitComponente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitComponente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponenteContext componente() throws RecognitionException {
		ComponenteContext _localctx = new ComponenteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_componente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(207);
				cantidad();
				}
			}

			setState(210);
			tipo();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==ID) {
				{
				setState(211);
				codigo();
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
	public static class CantidadContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(IKEAParser.INT, 0); }
		public CantidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cantidad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterCantidad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitCantidad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitCantidad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CantidadContext cantidad() throws RecognitionException {
		CantidadContext _localctx = new CantidadContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cantidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(INT);
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
		public TerminalNode INT() { return getToken(IKEAParser.INT, 0); }
		public TerminalNode ID() { return getToken(IKEAParser.ID, 0); }
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_codigo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode COMPONENTE() { return getToken(IKEAParser.COMPONENTE, 0); }
		public TerminalNode ID() { return getToken(IKEAParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==COMPONENTE || _la==ID) ) {
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
		public ListaComponentesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComponentes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterListaComponentes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitListaComponentes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitListaComponentes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaComponentesContext listaComponentes() throws RecognitionException {
		ListaComponentesContext _localctx = new ListaComponentesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listaComponentes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			componente();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20 || _la==T__26) {
				{
				{
				setState(221);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(222);
				componente();
				}
				}
				setState(227);
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
		public TerminalNode INT() { return getToken(IKEAParser.INT, 0); }
		public List<TerminalNode> ID() { return getTokens(IKEAParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IKEAParser.ID, i);
		}
		public TerminalNode COMPONENTE() { return getToken(IKEAParser.COMPONENTE, 0); }
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public PiezaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterPieza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitPieza(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitPieza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiezaContext pieza() throws RecognitionException {
		PiezaContext _localctx = new PiezaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pieza);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(228);
				match(INT);
				setState(229);
				match(T__27);
				setState(230);
				_la = _input.LA(1);
				if ( !(_la==COMPONENTE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(231);
					match(ID);
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(237);
					match(T__5);
					setState(238);
					zona();
					}
					break;
				}
				}
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(241);
				match(T__28);
				setState(242);
				_la = _input.LA(1);
				if ( !(_la==COMPONENTE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(243);
					match(ID);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(249);
					match(T__5);
					setState(250);
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
	public static class PiezaConZonaContext extends ParserRuleContext {
		public PiezaContext pieza() {
			return getRuleContext(PiezaContext.class,0);
		}
		public ZonaContext zona() {
			return getRuleContext(ZonaContext.class,0);
		}
		public PiezaConZonaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piezaConZona; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterPiezaConZona(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitPiezaConZona(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitPiezaConZona(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiezaConZonaContext piezaConZona() throws RecognitionException {
		PiezaConZonaContext _localctx = new PiezaConZonaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_piezaConZona);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			pieza();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(256);
				match(T__5);
				setState(257);
				zona();
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
	public static class ListaPiezasContext extends ParserRuleContext {
		public List<PiezaContext> pieza() {
			return getRuleContexts(PiezaContext.class);
		}
		public PiezaContext pieza(int i) {
			return getRuleContext(PiezaContext.class,i);
		}
		public ListaPiezasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaPiezas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterListaPiezas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitListaPiezas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitListaPiezas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaPiezasContext listaPiezas() throws RecognitionException {
		ListaPiezasContext _localctx = new ListaPiezasContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listaPiezas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			pieza();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20 || _la==T__26) {
				{
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				pieza();
				}
				}
				setState(267);
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
		public TerminalNode ID() { return getToken(IKEAParser.ID, 0); }
		public TerminalNode COMPONENTE() { return getToken(IKEAParser.COMPONENTE, 0); }
		public ZonaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zona; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterZona(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitZona(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitZona(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZonaContext zona() throws RecognitionException {
		ZonaContext _localctx = new ZonaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_zona);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==COMPONENTE || _la==ID) ) {
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
	public static class HerramientaContext extends ParserRuleContext {
		public TerminalNode DESTORNILLADOR() { return getToken(IKEAParser.DESTORNILLADOR, 0); }
		public TerminalNode MARTILLO() { return getToken(IKEAParser.MARTILLO, 0); }
		public TerminalNode LAPIZ() { return getToken(IKEAParser.LAPIZ, 0); }
		public TerminalNode LLAVE_ALLEN() { return getToken(IKEAParser.LLAVE_ALLEN, 0); }
		public HerramientaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_herramienta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterHerramienta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitHerramienta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitHerramienta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HerramientaContext herramienta() throws RecognitionException {
		HerramientaContext _localctx = new HerramientaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_herramienta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
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
		public DireccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).enterDireccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IKEAListener ) ((IKEAListener)listener).exitDireccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IKEAVisitor ) return ((IKEAVisitor<? extends T>)visitor).visitDireccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DireccionContext direccion() throws RecognitionException {
		DireccionContext _localctx = new DireccionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_direccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==ABAJO || _la==LATERAL_CORTO) ) {
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
		"\u0004\u0001*\u0113\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0004\u0000A\b\u0000\u000b\u0000\f\u0000B\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002P\b"+
		"\u0002\n\u0002\f\u0002S\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003Z\b\u0003\n\u0003\f\u0003]\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004m\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004t\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006|\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0082"+
		"\b\u0006\u0003\u0006\u0084\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0090"+
		"\b\b\u0003\b\u0092\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0003\t\u009a\b\t\u0003\t\u009c\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00a4\b\n\u0003\n\u00a6\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ae\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bb\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00ce\b\u0013\u0001"+
		"\u0014\u0003\u0014\u00d1\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d5"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00e0\b\u0018\n"+
		"\u0018\f\u0018\u00e3\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u00e9\b\u0019\n\u0019\f\u0019\u00ec\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u00f0\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u00f5\b\u0019\n\u0019\f\u0019\u00f8\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u00fc\b\u0019\u0003\u0019\u00fe\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0103\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u0108\b\u001b\n\u001b\f\u001b\u010b\t\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0000\u0000\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000\b\u0001\u0000"+
		"\b\t\u0001\u0000\n\u000b\u0001\u0000\f\r\u0001\u0000()\u0002\u0000\u001e"+
		"\u001e))\u0002\u0000\u0015\u0015\u001b\u001b\u0001\u0000\u001f\"\u0001"+
		"\u0000#$\u0121\u0000>\u0001\u0000\u0000\u0000\u0002G\u0001\u0000\u0000"+
		"\u0000\u0004J\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\b"+
		"s\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000\fx\u0001\u0000\u0000"+
		"\u0000\u000e\u0085\u0001\u0000\u0000\u0000\u0010\u0089\u0001\u0000\u0000"+
		"\u0000\u0012\u0093\u0001\u0000\u0000\u0000\u0014\u009d\u0001\u0000\u0000"+
		"\u0000\u0016\u00a7\u0001\u0000\u0000\u0000\u0018\u00af\u0001\u0000\u0000"+
		"\u0000\u001a\u00b2\u0001\u0000\u0000\u0000\u001c\u00b7\u0001\u0000\u0000"+
		"\u0000\u001e\u00bc\u0001\u0000\u0000\u0000 \u00be\u0001\u0000\u0000\u0000"+
		"\"\u00c2\u0001\u0000\u0000\u0000$\u00c5\u0001\u0000\u0000\u0000&\u00c7"+
		"\u0001\u0000\u0000\u0000(\u00d0\u0001\u0000\u0000\u0000*\u00d6\u0001\u0000"+
		"\u0000\u0000,\u00d8\u0001\u0000\u0000\u0000.\u00da\u0001\u0000\u0000\u0000"+
		"0\u00dc\u0001\u0000\u0000\u00002\u00fd\u0001\u0000\u0000\u00004\u00ff"+
		"\u0001\u0000\u0000\u00006\u0104\u0001\u0000\u0000\u00008\u010c\u0001\u0000"+
		"\u0000\u0000:\u010e\u0001\u0000\u0000\u0000<\u0110\u0001\u0000\u0000\u0000"+
		">@\u0003\u0002\u0001\u0000?A\u0003\u0004\u0002\u0000@?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005%\u0000\u0000EF\u0005\u0000"+
		"\u0000\u0001F\u0001\u0001\u0000\u0000\u0000GH\u0005&\u0000\u0000HI\u0005"+
		")\u0000\u0000I\u0003\u0001\u0000\u0000\u0000JK\u0005(\u0000\u0000KL\u0005"+
		"\u0001\u0000\u0000LQ\u0003\u0006\u0003\u0000MN\u0005\u0002\u0000\u0000"+
		"NP\u0003\u0006\u0003\u0000OM\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005\u0002\u0000\u0000U\u0005"+
		"\u0001\u0000\u0000\u0000V[\u0003\b\u0004\u0000WX\u0005\u0003\u0000\u0000"+
		"XZ\u0003\b\u0004\u0000YW\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0007\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^t\u0003\n\u0005\u0000_t\u0003\f"+
		"\u0006\u0000`t\u0003\u0010\b\u0000at\u0003\u0012\t\u0000bt\u0003\u0014"+
		"\n\u0000ct\u0003\u0016\u000b\u0000dt\u0003\u0018\f\u0000et\u0003\u001a"+
		"\r\u0000ft\u0003\u001c\u000e\u0000gl\u0003 \u0010\u0000hm\u0003\u0010"+
		"\b\u0000im\u0003\u0014\n\u0000jm\u0003\u0012\t\u0000km\u0003\f\u0006\u0000"+
		"lh\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lk\u0001\u0000\u0000\u0000mt\u0001\u0000\u0000\u0000nt\u0003\"\u0011"+
		"\u0000ot\u0003$\u0012\u0000pt\u0003\u001e\u000f\u0000qt\u0003&\u0013\u0000"+
		"rt\u0003\u000e\u0007\u0000s^\u0001\u0000\u0000\u0000s_\u0001\u0000\u0000"+
		"\u0000s`\u0001\u0000\u0000\u0000sa\u0001\u0000\u0000\u0000sb\u0001\u0000"+
		"\u0000\u0000sc\u0001\u0000\u0000\u0000sd\u0001\u0000\u0000\u0000se\u0001"+
		"\u0000\u0000\u0000sf\u0001\u0000\u0000\u0000sg\u0001\u0000\u0000\u0000"+
		"sn\u0001\u0000\u0000\u0000so\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\t\u0001\u0000"+
		"\u0000\u0000uv\u0005\u0004\u0000\u0000vw\u00036\u001b\u0000w\u000b\u0001"+
		"\u0000\u0000\u0000x{\u0005\u0005\u0000\u0000y|\u00030\u0018\u0000z|\u0003"+
		"6\u001b\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u0083"+
		"\u0001\u0000\u0000\u0000}\u0081\u0005\u0006\u0000\u0000~\u0082\u00034"+
		"\u001a\u0000\u007f\u0082\u00036\u001b\u0000\u0080\u0082\u00038\u001c\u0000"+
		"\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083"+
		"}\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\r"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0007\u0000\u0000\u0086\u0087"+
		"\u0005\u0006\u0000\u0000\u0087\u0088\u00038\u001c\u0000\u0088\u000f\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0007\u0000\u0000\u0000\u008a\u0091\u0003"+
		"0\u0018\u0000\u008b\u008f\u0005\u0006\u0000\u0000\u008c\u0090\u00034\u001a"+
		"\u0000\u008d\u0090\u00036\u001b\u0000\u008e\u0090\u00038\u001c\u0000\u008f"+
		"\u008c\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u008b\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0011\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0001\u0000\u0000\u0094"+
		"\u009b\u00030\u0018\u0000\u0095\u0099\u0005\u0006\u0000\u0000\u0096\u009a"+
		"\u00034\u001a\u0000\u0097\u009a\u00036\u001b\u0000\u0098\u009a\u00038"+
		"\u001c\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000"+
		"\u0000\u0000\u009b\u0095\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u0013\u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0002"+
		"\u0000\u0000\u009e\u00a5\u00030\u0018\u0000\u009f\u00a3\u0005\u0006\u0000"+
		"\u0000\u00a0\u00a4\u00034\u001a\u0000\u00a1\u00a4\u00036\u001b\u0000\u00a2"+
		"\u00a4\u00038\u001c\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u0015\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u000e\u0000\u0000\u00a8\u00a9\u0005\u000f\u0000\u0000\u00a9\u00aa"+
		"\u0003:\u001d\u0000\u00aa\u00ad\u0005\u0006\u0000\u0000\u00ab\u00ae\u0003"+
		"6\u001b\u0000\u00ac\u00ae\u00038\u001c\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u0017\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005\u0010\u0000\u0000\u00b0\u00b1\u00032\u0019\u0000"+
		"\u00b1\u0019\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0011\u0000\u0000"+
		"\u00b3\u00b4\u00032\u0019\u0000\u00b4\u00b5\u0005\u0006\u0000\u0000\u00b5"+
		"\u00b6\u00038\u001c\u0000\u00b6\u001b\u0001\u0000\u0000\u0000\u00b7\u00ba"+
		"\u0005\u0012\u0000\u0000\u00b8\u00bb\u00032\u0019\u0000\u00b9\u00bb\u0005"+
		")\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u001d\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0013"+
		"\u0000\u0000\u00bd\u001f\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0014"+
		"\u0000\u0000\u00bf\u00c0\u0003:\u001d\u0000\u00c0\u00c1\u0005\u0015\u0000"+
		"\u0000\u00c1!\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0016\u0000\u0000"+
		"\u00c3\u00c4\u0003<\u001e\u0000\u00c4#\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0005\u0017\u0000\u0000\u00c6%\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"\u0018\u0000\u0000\u00c8\u00c9\u0005\u0019\u0000\u0000\u00c9\u00ca\u0005"+
		"(\u0000\u0000\u00ca\u00cd\u0005\u001a\u0000\u0000\u00cb\u00cc\u0005\'"+
		"\u0000\u0000\u00cc\u00ce\u0005(\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\'\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0003*\u0015\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d4\u0003.\u0017\u0000\u00d3\u00d5\u0003,\u0016\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5)\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005(\u0000\u0000\u00d7+\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0007\u0003\u0000\u0000\u00d9-\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0007\u0004\u0000\u0000\u00db/\u0001\u0000\u0000\u0000\u00dc\u00e1"+
		"\u0003(\u0014\u0000\u00dd\u00de\u0007\u0005\u0000\u0000\u00de\u00e0\u0003"+
		"(\u0014\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e21\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0005(\u0000\u0000\u00e5\u00e6\u0005\u001c\u0000\u0000"+
		"\u00e6\u00ea\u0007\u0004\u0000\u0000\u00e7\u00e9\u0005)\u0000\u0000\u00e8"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005\u0006\u0000\u0000\u00ee\u00f0\u00038\u001c\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00fe"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u001d\u0000\u0000\u00f2\u00f6"+
		"\u0007\u0004\u0000\u0000\u00f3\u00f5\u0005)\u0000\u0000\u00f4\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		"\u0006\u0000\u0000\u00fa\u00fc\u00038\u001c\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fd\u00e4\u0001\u0000\u0000\u0000\u00fd\u00f1\u0001\u0000"+
		"\u0000\u0000\u00fe3\u0001\u0000\u0000\u0000\u00ff\u0102\u00032\u0019\u0000"+
		"\u0100\u0101\u0005\u0006\u0000\u0000\u0101\u0103\u00038\u001c\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"5\u0001\u0000\u0000\u0000\u0104\u0109\u00032\u0019\u0000\u0105\u0106\u0007"+
		"\u0005\u0000\u0000\u0106\u0108\u00032\u0019\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a7\u0001\u0000\u0000"+
		"\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010d\u0007\u0004\u0000"+
		"\u0000\u010d9\u0001\u0000\u0000\u0000\u010e\u010f\u0007\u0006\u0000\u0000"+
		"\u010f;\u0001\u0000\u0000\u0000\u0110\u0111\u0007\u0007\u0000\u0000\u0111"+
		"=\u0001\u0000\u0000\u0000\u001bBQ[ls{\u0081\u0083\u008f\u0091\u0099\u009b"+
		"\u00a3\u00a5\u00ad\u00ba\u00cd\u00d0\u00d4\u00e1\u00ea\u00ef\u00f6\u00fb"+
		"\u00fd\u0102\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}