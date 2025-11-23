// Generated from /Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl3/maven-project/src/main/antlr4/epp/EPPParser.g4 by ANTLR 4.13.1
 package epp; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EPPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASIGNAR=1, MOSTRAR=2, LEER=3, MIENTRAS=4, SI=5, NO=6, TERMINAR=7, FLECHA=8, 
		PARENIZQ=9, PARENDER=10, ASIGNACION=11, CONDICION=12, FINLINEA=13, Y_LOGICO=14, 
		O_LOGICO=15, NO_LOGICO=16, MAS=17, MENOS=18, POR=19, DIV=20, MOD=21, MAYOR=22, 
		MENOR=23, IGUAL=24, DIFERENTE=25, MAYORIGUAL=26, MENORIGUAL=27, NUM=28, 
		STRING=29, VERDADERO=30, FALSO=31, VARIABLE=32, COMENTARIO=33, WS=34;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_asignacion = 2, RULE_mostrar = 3, 
		RULE_leer = 4, RULE_mientras = 5, RULE_condicional = 6, RULE_bloque = 7, 
		RULE_comentario = 8, RULE_expresionBooleana = 9, RULE_expresionComparable = 10, 
		RULE_expresion = 11, RULE_expresionAritmetica = 12, RULE_expresionAritmeticaPrimaria = 13, 
		RULE_expresionPrimaria = 14, RULE_operadorComparacion = 15, RULE_operadorAditivo = 16, 
		RULE_operadorMultiplicativo = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "asignacion", "mostrar", "leer", "mientras", 
			"condicional", "bloque", "comentario", "expresionBooleana", "expresionComparable", 
			"expresion", "expresionAritmetica", "expresionAritmeticaPrimaria", "expresionPrimaria", 
			"operadorComparacion", "operadorAditivo", "operadorMultiplicativo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'asignar'", "'mostrar'", "'leer'", "'mientras'", "'si'", "'no'", 
			"'terminar'", "'->'", "'('", "')'", "'='", "'???'", "';P'", "'y'", "'o'", 
			"'no_es'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", "'=='", "'!='", 
			"'>='", "'<='", null, null, "'verdadero'", "'falso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASIGNAR", "MOSTRAR", "LEER", "MIENTRAS", "SI", "NO", "TERMINAR", 
			"FLECHA", "PARENIZQ", "PARENDER", "ASIGNACION", "CONDICION", "FINLINEA", 
			"Y_LOGICO", "O_LOGICO", "NO_LOGICO", "MAS", "MENOS", "POR", "DIV", "MOD", 
			"MAYOR", "MENOR", "IGUAL", "DIFERENTE", "MAYORIGUAL", "MENORIGUAL", "NUM", 
			"STRING", "VERDADERO", "FALSO", "VARIABLE", "COMENTARIO", "WS"
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
	public String getGrammarFileName() { return "EPPParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EPPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EPPParser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911499806L) != 0)) {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASIGNAR:
				case MOSTRAR:
				case LEER:
				case MIENTRAS:
				case PARENIZQ:
				case NO_LOGICO:
				case NUM:
				case STRING:
				case VERDADERO:
				case FALSO:
				case VARIABLE:
					{
					setState(36);
					instruccion();
					}
					break;
				case COMENTARIO:
					{
					setState(37);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
	public static class InstruccionContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				asignacion();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				mostrar();
				}
				break;
			case PARENIZQ:
			case NO_LOGICO:
			case NUM:
			case STRING:
			case VERDADERO:
			case FALSO:
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				condicional();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				leer();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				mientras();
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ASIGNAR() { return getToken(EPPParser.ASIGNAR, 0); }
		public TerminalNode VARIABLE() { return getToken(EPPParser.VARIABLE, 0); }
		public TerminalNode ASIGNACION() { return getToken(EPPParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode FINLINEA() { return getToken(EPPParser.FINLINEA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ASIGNAR);
			setState(53);
			match(VARIABLE);
			setState(54);
			match(ASIGNACION);
			setState(55);
			expresion(0);
			setState(56);
			match(FINLINEA);
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
	public static class MostrarContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(EPPParser.MOSTRAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode FINLINEA() { return getToken(EPPParser.FINLINEA, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(MOSTRAR);
			setState(59);
			expresion(0);
			setState(60);
			match(FINLINEA);
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
	public static class LeerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(EPPParser.LEER, 0); }
		public TerminalNode VARIABLE() { return getToken(EPPParser.VARIABLE, 0); }
		public TerminalNode FINLINEA() { return getToken(EPPParser.FINLINEA, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LEER);
			setState(63);
			match(VARIABLE);
			setState(64);
			match(FINLINEA);
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
	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(EPPParser.MIENTRAS, 0); }
		public TerminalNode PARENIZQ() { return getToken(EPPParser.PARENIZQ, 0); }
		public ExpresionBooleanaContext expresionBooleana() {
			return getRuleContext(ExpresionBooleanaContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(EPPParser.PARENDER, 0); }
		public TerminalNode FLECHA() { return getToken(EPPParser.FLECHA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode TERMINAR() { return getToken(EPPParser.TERMINAR, 0); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(MIENTRAS);
			setState(67);
			match(PARENIZQ);
			setState(68);
			expresionBooleana(0);
			setState(69);
			match(PARENDER);
			setState(70);
			match(FLECHA);
			setState(71);
			bloque();
			setState(72);
			match(TERMINAR);
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
	public static class CondicionalContext extends ParserRuleContext {
		public ExpresionBooleanaContext expresionBooleana() {
			return getRuleContext(ExpresionBooleanaContext.class,0);
		}
		public TerminalNode CONDICION() { return getToken(EPPParser.CONDICION, 0); }
		public TerminalNode SI() { return getToken(EPPParser.SI, 0); }
		public List<TerminalNode> FLECHA() { return getTokens(EPPParser.FLECHA); }
		public TerminalNode FLECHA(int i) {
			return getToken(EPPParser.FLECHA, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode TERMINAR() { return getToken(EPPParser.TERMINAR, 0); }
		public TerminalNode NO() { return getToken(EPPParser.NO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			expresionBooleana(0);
			setState(75);
			match(CONDICION);
			setState(76);
			match(SI);
			setState(77);
			match(FLECHA);
			setState(78);
			bloque();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO) {
				{
				setState(79);
				match(NO);
				setState(80);
				match(FLECHA);
				setState(81);
				bloque();
				}
			}

			setState(84);
			match(TERMINAR);
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
	public static class BloqueContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911499806L) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASIGNAR:
				case MOSTRAR:
				case LEER:
				case MIENTRAS:
				case PARENIZQ:
				case NO_LOGICO:
				case NUM:
				case STRING:
				case VERDADERO:
				case FALSO:
				case VARIABLE:
					{
					setState(86);
					instruccion();
					}
					break;
				case COMENTARIO:
					{
					setState(87);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
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
	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIO() { return getToken(EPPParser.COMENTARIO, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(COMENTARIO);
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
	public static class ExpresionBooleanaContext extends ParserRuleContext {
		public ExpresionBooleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionBooleana; }
	 
		public ExpresionBooleanaContext() { }
		public void copyFrom(ExpresionBooleanaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanaAndContext extends ExpresionBooleanaContext {
		public List<ExpresionBooleanaContext> expresionBooleana() {
			return getRuleContexts(ExpresionBooleanaContext.class);
		}
		public ExpresionBooleanaContext expresionBooleana(int i) {
			return getRuleContext(ExpresionBooleanaContext.class,i);
		}
		public TerminalNode Y_LOGICO() { return getToken(EPPParser.Y_LOGICO, 0); }
		public ExprBooleanaAndContext(ExpresionBooleanaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanaFalsoContext extends ExpresionBooleanaContext {
		public TerminalNode FALSO() { return getToken(EPPParser.FALSO, 0); }
		public ExprBooleanaFalsoContext(ExpresionBooleanaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanaVerdaderoContext extends ExpresionBooleanaContext {
		public TerminalNode VERDADERO() { return getToken(EPPParser.VERDADERO, 0); }
		public ExprBooleanaVerdaderoContext(ExpresionBooleanaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanaOrContext extends ExpresionBooleanaContext {
		public List<ExpresionBooleanaContext> expresionBooleana() {
			return getRuleContexts(ExpresionBooleanaContext.class);
		}
		public ExpresionBooleanaContext expresionBooleana(int i) {
			return getRuleContext(ExpresionBooleanaContext.class,i);
		}
		public TerminalNode O_LOGICO() { return getToken(EPPParser.O_LOGICO, 0); }
		public ExprBooleanaOrContext(ExpresionBooleanaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanaParentesisContext extends ExpresionBooleanaContext {
		public TerminalNode PARENIZQ() { return getToken(EPPParser.PARENIZQ, 0); }
		public ExpresionBooleanaContext expresionBooleana() {
			return getRuleContext(ExpresionBooleanaContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(EPPParser.PARENDER, 0); }
		public ExprBooleanaParentesisContext(ExpresionBooleanaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanaComparacionContext extends ExpresionBooleanaContext {
		public List<ExpresionComparableContext> expresionComparable() {
			return getRuleContexts(ExpresionComparableContext.class);
		}
		public ExpresionComparableContext expresionComparable(int i) {
			return getRuleContext(ExpresionComparableContext.class,i);
		}
		public OperadorComparacionContext operadorComparacion() {
			return getRuleContext(OperadorComparacionContext.class,0);
		}
		public ExprBooleanaComparacionContext(ExpresionBooleanaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanaNotContext extends ExpresionBooleanaContext {
		public TerminalNode NO_LOGICO() { return getToken(EPPParser.NO_LOGICO, 0); }
		public ExpresionBooleanaContext expresionBooleana() {
			return getRuleContext(ExpresionBooleanaContext.class,0);
		}
		public ExprBooleanaNotContext(ExpresionBooleanaContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionBooleanaContext expresionBooleana() throws RecognitionException {
		return expresionBooleana(0);
	}

	private ExpresionBooleanaContext expresionBooleana(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionBooleanaContext _localctx = new ExpresionBooleanaContext(_ctx, _parentState);
		ExpresionBooleanaContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expresionBooleana, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ExprBooleanaNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				match(NO_LOGICO);
				setState(97);
				expresionBooleana(5);
				}
				break;
			case 2:
				{
				_localctx = new ExprBooleanaComparacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				expresionComparable();
				setState(99);
				operadorComparacion();
				setState(100);
				expresionComparable();
				}
				break;
			case 3:
				{
				_localctx = new ExprBooleanaVerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(VERDADERO);
				}
				break;
			case 4:
				{
				_localctx = new ExprBooleanaFalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(FALSO);
				}
				break;
			case 5:
				{
				_localctx = new ExprBooleanaParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(PARENIZQ);
				setState(105);
				expresionBooleana(0);
				setState(106);
				match(PARENDER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBooleanaOrContext(new ExpresionBooleanaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresionBooleana);
						setState(110);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(111);
						match(O_LOGICO);
						setState(112);
						expresionBooleana(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprBooleanaAndContext(new ExpresionBooleanaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresionBooleana);
						setState(113);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(114);
						match(Y_LOGICO);
						setState(115);
						expresionBooleana(7);
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionComparableContext extends ParserRuleContext {
		public ExpresionComparableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionComparable; }
	 
		public ExpresionComparableContext() { }
		public void copyFrom(ExpresionComparableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCompAritmeticaContext extends ExpresionComparableContext {
		public ExpresionAritmeticaContext expresionAritmetica() {
			return getRuleContext(ExpresionAritmeticaContext.class,0);
		}
		public ExprCompAritmeticaContext(ExpresionComparableContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCompStringContext extends ExpresionComparableContext {
		public TerminalNode STRING() { return getToken(EPPParser.STRING, 0); }
		public ExprCompStringContext(ExpresionComparableContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionComparableContext expresionComparable() throws RecognitionException {
		ExpresionComparableContext _localctx = new ExpresionComparableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresionComparable);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENIZQ:
			case NUM:
			case VARIABLE:
				_localctx = new ExprCompAritmeticaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				expresionAritmetica(0);
				}
				break;
			case STRING:
				_localctx = new ExprCompStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(STRING);
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
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAritmeticaMultDivContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public OperadorMultiplicativoContext operadorMultiplicativo() {
			return getRuleContext(OperadorMultiplicativoContext.class,0);
		}
		public ExprAritmeticaMultDivContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPrimariaContext extends ExpresionContext {
		public ExpresionPrimariaContext expresionPrimaria() {
			return getRuleContext(ExpresionPrimariaContext.class,0);
		}
		public ExprPrimariaContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAritmeticaSumaRestaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public OperadorAditivoContext operadorAditivo() {
			return getRuleContext(OperadorAditivoContext.class,0);
		}
		public ExprAritmeticaSumaRestaContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprComparacionContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public OperadorComparacionContext operadorComparacion() {
			return getRuleContext(OperadorComparacionContext.class,0);
		}
		public ExprComparacionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprPrimariaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(126);
			expresionPrimaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprComparacionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(128);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(129);
						operadorComparacion();
						setState(130);
						expresion(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprAritmeticaSumaRestaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(132);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(133);
						operadorAditivo();
						setState(134);
						expresion(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprAritmeticaMultDivContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(136);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(137);
						operadorMultiplicativo();
						setState(138);
						expresion(3);
						}
						break;
					}
					} 
				}
				setState(144);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionAritmeticaContext extends ParserRuleContext {
		public ExpresionAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionAritmetica; }
	 
		public ExpresionAritmeticaContext() { }
		public void copyFrom(ExpresionAritmeticaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAritMultDivContext extends ExpresionAritmeticaContext {
		public List<ExpresionAritmeticaContext> expresionAritmetica() {
			return getRuleContexts(ExpresionAritmeticaContext.class);
		}
		public ExpresionAritmeticaContext expresionAritmetica(int i) {
			return getRuleContext(ExpresionAritmeticaContext.class,i);
		}
		public OperadorMultiplicativoContext operadorMultiplicativo() {
			return getRuleContext(OperadorMultiplicativoContext.class,0);
		}
		public ExprAritMultDivContext(ExpresionAritmeticaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAritPrimariaContext extends ExpresionAritmeticaContext {
		public ExpresionAritmeticaPrimariaContext expresionAritmeticaPrimaria() {
			return getRuleContext(ExpresionAritmeticaPrimariaContext.class,0);
		}
		public ExprAritPrimariaContext(ExpresionAritmeticaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAritSumaRestaContext extends ExpresionAritmeticaContext {
		public List<ExpresionAritmeticaContext> expresionAritmetica() {
			return getRuleContexts(ExpresionAritmeticaContext.class);
		}
		public ExpresionAritmeticaContext expresionAritmetica(int i) {
			return getRuleContext(ExpresionAritmeticaContext.class,i);
		}
		public OperadorAditivoContext operadorAditivo() {
			return getRuleContext(OperadorAditivoContext.class,0);
		}
		public ExprAritSumaRestaContext(ExpresionAritmeticaContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionAritmeticaContext expresionAritmetica() throws RecognitionException {
		return expresionAritmetica(0);
	}

	private ExpresionAritmeticaContext expresionAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionAritmeticaContext _localctx = new ExpresionAritmeticaContext(_ctx, _parentState);
		ExpresionAritmeticaContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expresionAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprAritPrimariaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(146);
			expresionAritmeticaPrimaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprAritSumaRestaContext(new ExpresionAritmeticaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresionAritmetica);
						setState(148);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(149);
						operadorAditivo();
						setState(150);
						expresionAritmetica(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprAritMultDivContext(new ExpresionAritmeticaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresionAritmetica);
						setState(152);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(153);
						operadorMultiplicativo();
						setState(154);
						expresionAritmetica(3);
						}
						break;
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionAritmeticaPrimariaContext extends ParserRuleContext {
		public ExpresionAritmeticaPrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionAritmeticaPrimaria; }
	 
		public ExpresionAritmeticaPrimariaContext() { }
		public void copyFrom(ExpresionAritmeticaPrimariaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAritNumeroContext extends ExpresionAritmeticaPrimariaContext {
		public TerminalNode NUM() { return getToken(EPPParser.NUM, 0); }
		public ExprAritNumeroContext(ExpresionAritmeticaPrimariaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAritParentesisContext extends ExpresionAritmeticaPrimariaContext {
		public TerminalNode PARENIZQ() { return getToken(EPPParser.PARENIZQ, 0); }
		public ExpresionAritmeticaContext expresionAritmetica() {
			return getRuleContext(ExpresionAritmeticaContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(EPPParser.PARENDER, 0); }
		public ExprAritParentesisContext(ExpresionAritmeticaPrimariaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAritVariableContext extends ExpresionAritmeticaPrimariaContext {
		public TerminalNode VARIABLE() { return getToken(EPPParser.VARIABLE, 0); }
		public ExprAritVariableContext(ExpresionAritmeticaPrimariaContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionAritmeticaPrimariaContext expresionAritmeticaPrimaria() throws RecognitionException {
		ExpresionAritmeticaPrimariaContext _localctx = new ExpresionAritmeticaPrimariaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresionAritmeticaPrimaria);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new ExprAritVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(VARIABLE);
				}
				break;
			case NUM:
				_localctx = new ExprAritNumeroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(NUM);
				}
				break;
			case PARENIZQ:
				_localctx = new ExprAritParentesisContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(PARENIZQ);
				setState(164);
				expresionAritmetica(0);
				setState(165);
				match(PARENDER);
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
	public static class ExpresionPrimariaContext extends ParserRuleContext {
		public ExpresionPrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionPrimaria; }
	 
		public ExpresionPrimariaContext() { }
		public void copyFrom(ExpresionPrimariaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanoFalsoContext extends ExpresionPrimariaContext {
		public TerminalNode FALSO() { return getToken(EPPParser.FALSO, 0); }
		public ExprBooleanoFalsoContext(ExpresionPrimariaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParentesisContext extends ExpresionPrimariaContext {
		public TerminalNode PARENIZQ() { return getToken(EPPParser.PARENIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(EPPParser.PARENDER, 0); }
		public ExprParentesisContext(ExpresionPrimariaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNumeroContext extends ExpresionPrimariaContext {
		public TerminalNode NUM() { return getToken(EPPParser.NUM, 0); }
		public ExprNumeroContext(ExpresionPrimariaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanoVerdaderoContext extends ExpresionPrimariaContext {
		public TerminalNode VERDADERO() { return getToken(EPPParser.VERDADERO, 0); }
		public ExprBooleanoVerdaderoContext(ExpresionPrimariaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTextoContext extends ExpresionPrimariaContext {
		public TerminalNode STRING() { return getToken(EPPParser.STRING, 0); }
		public ExprTextoContext(ExpresionPrimariaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprVariableContext extends ExpresionPrimariaContext {
		public TerminalNode VARIABLE() { return getToken(EPPParser.VARIABLE, 0); }
		public ExprVariableContext(ExpresionPrimariaContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionPrimariaContext expresionPrimaria() throws RecognitionException {
		ExpresionPrimariaContext _localctx = new ExpresionPrimariaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expresionPrimaria);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new ExprVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(VARIABLE);
				}
				break;
			case NUM:
				_localctx = new ExprNumeroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(NUM);
				}
				break;
			case STRING:
				_localctx = new ExprTextoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(STRING);
				}
				break;
			case VERDADERO:
				_localctx = new ExprBooleanoVerdaderoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(VERDADERO);
				}
				break;
			case FALSO:
				_localctx = new ExprBooleanoFalsoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(FALSO);
				}
				break;
			case PARENIZQ:
				_localctx = new ExprParentesisContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				match(PARENIZQ);
				setState(175);
				expresion(0);
				setState(176);
				match(PARENDER);
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
	public static class OperadorComparacionContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(EPPParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(EPPParser.MENOR, 0); }
		public TerminalNode IGUAL() { return getToken(EPPParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(EPPParser.DIFERENTE, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(EPPParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(EPPParser.MENORIGUAL, 0); }
		public OperadorComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorComparacion; }
	}

	public final OperadorComparacionContext operadorComparacion() throws RecognitionException {
		OperadorComparacionContext _localctx = new OperadorComparacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operadorComparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
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
	public static class OperadorAditivoContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(EPPParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(EPPParser.MENOS, 0); }
		public OperadorAditivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAditivo; }
	}

	public final OperadorAditivoContext operadorAditivo() throws RecognitionException {
		OperadorAditivoContext _localctx = new OperadorAditivoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operadorAditivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==MAS || _la==MENOS) ) {
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
	public static class OperadorMultiplicativoContext extends ParserRuleContext {
		public TerminalNode POR() { return getToken(EPPParser.POR, 0); }
		public TerminalNode DIV() { return getToken(EPPParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(EPPParser.MOD, 0); }
		public OperadorMultiplicativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorMultiplicativo; }
	}

	public final OperadorMultiplicativoContext operadorMultiplicativo() throws RecognitionException {
		OperadorMultiplicativoContext _localctx = new OperadorMultiplicativoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operadorMultiplicativo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expresionBooleana_sempred((ExpresionBooleanaContext)_localctx, predIndex);
		case 11:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		case 12:
			return expresionAritmetica_sempred((ExpresionAritmeticaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresionBooleana_sempred(ExpresionBooleanaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expresionAritmetica_sempred(ExpresionAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007Y\b\u0007\n\u0007\f\u0007\\\t\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tm\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\tu\b\t\n\t\f\tx\t\t\u0001\n\u0001\n\u0003"+
		"\n|\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008d\b\u000b\n"+
		"\u000b\f\u000b\u0090\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u009d\b\f\n\f\f\f\u00a0"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a8\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b3\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0000\u0003\u0012\u0016\u0018\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0003\u0001"+
		"\u0000\u0016\u001b\u0001\u0000\u0011\u0012\u0001\u0000\u0013\u0015\u00c4"+
		"\u0000(\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u00044"+
		"\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b>\u0001\u0000"+
		"\u0000\u0000\nB\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000e"+
		"Z\u0001\u0000\u0000\u0000\u0010]\u0001\u0000\u0000\u0000\u0012l\u0001"+
		"\u0000\u0000\u0000\u0014{\u0001\u0000\u0000\u0000\u0016}\u0001\u0000\u0000"+
		"\u0000\u0018\u0091\u0001\u0000\u0000\u0000\u001a\u00a7\u0001\u0000\u0000"+
		"\u0000\u001c\u00b2\u0001\u0000\u0000\u0000\u001e\u00b4\u0001\u0000\u0000"+
		"\u0000 \u00b6\u0001\u0000\u0000\u0000\"\u00b8\u0001\u0000\u0000\u0000"+
		"$\'\u0003\u0002\u0001\u0000%\'\u0003\u0010\b\u0000&$\u0001\u0000\u0000"+
		"\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000"+
		"\u0000-3\u0003\u0004\u0002\u0000.3\u0003\u0006\u0003\u0000/3\u0003\f\u0006"+
		"\u000003\u0003\b\u0004\u000013\u0003\n\u0005\u00002-\u0001\u0000\u0000"+
		"\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000021\u0001\u0000\u0000\u00003\u0003\u0001\u0000\u0000\u0000"+
		"45\u0005\u0001\u0000\u000056\u0005 \u0000\u000067\u0005\u000b\u0000\u0000"+
		"78\u0003\u0016\u000b\u000089\u0005\r\u0000\u00009\u0005\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0002\u0000\u0000;<\u0003\u0016\u000b\u0000<=\u0005\r\u0000"+
		"\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0005"+
		" \u0000\u0000@A\u0005\r\u0000\u0000A\t\u0001\u0000\u0000\u0000BC\u0005"+
		"\u0004\u0000\u0000CD\u0005\t\u0000\u0000DE\u0003\u0012\t\u0000EF\u0005"+
		"\n\u0000\u0000FG\u0005\b\u0000\u0000GH\u0003\u000e\u0007\u0000HI\u0005"+
		"\u0007\u0000\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0003\u0012\t\u0000"+
		"KL\u0005\f\u0000\u0000LM\u0005\u0005\u0000\u0000MN\u0005\b\u0000\u0000"+
		"NR\u0003\u000e\u0007\u0000OP\u0005\u0006\u0000\u0000PQ\u0005\b\u0000\u0000"+
		"QS\u0003\u000e\u0007\u0000RO\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TU\u0005\u0007\u0000\u0000U\r\u0001\u0000"+
		"\u0000\u0000VY\u0003\u0002\u0001\u0000WY\u0003\u0010\b\u0000XV\u0001\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u000f\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005!\u0000\u0000^\u0011\u0001\u0000"+
		"\u0000\u0000_`\u0006\t\uffff\uffff\u0000`a\u0005\u0010\u0000\u0000am\u0003"+
		"\u0012\t\u0005bc\u0003\u0014\n\u0000cd\u0003\u001e\u000f\u0000de\u0003"+
		"\u0014\n\u0000em\u0001\u0000\u0000\u0000fm\u0005\u001e\u0000\u0000gm\u0005"+
		"\u001f\u0000\u0000hi\u0005\t\u0000\u0000ij\u0003\u0012\t\u0000jk\u0005"+
		"\n\u0000\u0000km\u0001\u0000\u0000\u0000l_\u0001\u0000\u0000\u0000lb\u0001"+
		"\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000lg\u0001\u0000\u0000\u0000"+
		"lh\u0001\u0000\u0000\u0000mv\u0001\u0000\u0000\u0000no\n\u0007\u0000\u0000"+
		"op\u0005\u000f\u0000\u0000pu\u0003\u0012\t\bqr\n\u0006\u0000\u0000rs\u0005"+
		"\u000e\u0000\u0000su\u0003\u0012\t\u0007tn\u0001\u0000\u0000\u0000tq\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000w\u0013\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000y|\u0003\u0018\f\u0000z|\u0005\u001d\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|\u0015\u0001\u0000\u0000\u0000"+
		"}~\u0006\u000b\uffff\uffff\u0000~\u007f\u0003\u001c\u000e\u0000\u007f"+
		"\u008e\u0001\u0000\u0000\u0000\u0080\u0081\n\u0004\u0000\u0000\u0081\u0082"+
		"\u0003\u001e\u000f\u0000\u0082\u0083\u0003\u0016\u000b\u0005\u0083\u008d"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\n\u0003\u0000\u0000\u0085\u0086\u0003"+
		" \u0010\u0000\u0086\u0087\u0003\u0016\u000b\u0004\u0087\u008d\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\n\u0002\u0000\u0000\u0089\u008a\u0003\"\u0011"+
		"\u0000\u008a\u008b\u0003\u0016\u000b\u0003\u008b\u008d\u0001\u0000\u0000"+
		"\u0000\u008c\u0080\u0001\u0000\u0000\u0000\u008c\u0084\u0001\u0000\u0000"+
		"\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0006\f\uffff\uffff\u0000\u0092\u0093\u0003\u001a\r"+
		"\u0000\u0093\u009e\u0001\u0000\u0000\u0000\u0094\u0095\n\u0003\u0000\u0000"+
		"\u0095\u0096\u0003 \u0010\u0000\u0096\u0097\u0003\u0018\f\u0004\u0097"+
		"\u009d\u0001\u0000\u0000\u0000\u0098\u0099\n\u0002\u0000\u0000\u0099\u009a"+
		"\u0003\"\u0011\u0000\u009a\u009b\u0003\u0018\f\u0003\u009b\u009d\u0001"+
		"\u0000\u0000\u0000\u009c\u0094\u0001\u0000\u0000\u0000\u009c\u0098\u0001"+
		"\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u0019\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a8\u0005"+
		" \u0000\u0000\u00a2\u00a8\u0005\u001c\u0000\u0000\u00a3\u00a4\u0005\t"+
		"\u0000\u0000\u00a4\u00a5\u0003\u0018\f\u0000\u00a5\u00a6\u0005\n\u0000"+
		"\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a8\u001b\u0001\u0000\u0000\u0000\u00a9\u00b3\u0005 \u0000\u0000"+
		"\u00aa\u00b3\u0005\u001c\u0000\u0000\u00ab\u00b3\u0005\u001d\u0000\u0000"+
		"\u00ac\u00b3\u0005\u001e\u0000\u0000\u00ad\u00b3\u0005\u001f\u0000\u0000"+
		"\u00ae\u00af\u0005\t\u0000\u0000\u00af\u00b0\u0003\u0016\u000b\u0000\u00b0"+
		"\u00b1\u0005\n\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00a9"+
		"\u0001\u0000\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00ab"+
		"\u0001\u0000\u0000\u0000\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b3\u001d"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0007\u0000\u0000\u0000\u00b5\u001f"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0007\u0001\u0000\u0000\u00b7!\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0007\u0002\u0000\u0000\u00b9#\u0001\u0000"+
		"\u0000\u0000\u0010&(2RXZltv{\u008c\u008e\u009c\u009e\u00a7\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}