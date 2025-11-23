// Generated from /Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl3/maven-project/src/main/antlr4/epp/EPPLexer.g4 by ANTLR 4.13.2
package epp;

package epp;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EPPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONDICION=1, FINLINEA=2, MAS=3, MENOS=4, POR=5, DIV=6, MOD=7, MAYOR=8, 
		MENOR=9, IGUAL=10, DIFERENTE=11, MAYORIGUAL=12, MENORIGUAL=13, NUM=14, 
		STRING=15, ID=16, VERDADERO=17, FALSO=18, COMENTARIO=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONDICION", "FINLINEA", "MAS", "MENOS", "POR", "DIV", "MOD", "MAYOR", 
			"MENOR", "IGUAL", "DIFERENTE", "MAYORIGUAL", "MENORIGUAL", "NUM", "STRING", 
			"ID", "VERDADERO", "FALSO", "COMENTARIO", "WS", "DIGITO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'???'", "';P'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", 
			"'=='", "'!='", "'>='", "'<='", null, null, null, "'verdadero'", "'falso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONDICION", "FINLINEA", "MAS", "MENOS", "POR", "DIV", "MOD", "MAYOR", 
			"MENOR", "IGUAL", "DIFERENTE", "MAYORIGUAL", "MENORIGUAL", "NUM", "STRING", 
			"ID", "VERDADERO", "FALSO", "COMENTARIO", "WS"
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


	public EPPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EPPLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0004\rN\b\r\u000b\r\f\rO\u0001\r\u0001\r\u0004\rT\b\r\u000b\r\f\rU\u0003"+
		"\rX\b\r\u0001\u000e\u0001\u000e\u0005\u000e\\\b\u000e\n\u000e\f\u000e"+
		"_\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f"+
		"e\b\u000f\n\u000f\f\u000fh\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012|\b\u0012\n\u0012\f\u0012"+
		"\u007f\t\u0012\u0001\u0013\u0004\u0013\u0082\b\u0013\u000b\u0013\f\u0013"+
		"\u0083\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0000\u0000\u0015"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0000\u0001\u0000"+
		"\u0006\u0003\u0000\n\n\r\r\"\"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002"+
		"\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u0001\u000009\u008e\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003/\u0001\u0000"+
		"\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000"+
		"\t6\u0001\u0000\u0000\u0000\u000b8\u0001\u0000\u0000\u0000\r:\u0001\u0000"+
		"\u0000\u0000\u000f<\u0001\u0000\u0000\u0000\u0011>\u0001\u0000\u0000\u0000"+
		"\u0013@\u0001\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017F"+
		"\u0001\u0000\u0000\u0000\u0019I\u0001\u0000\u0000\u0000\u001bM\u0001\u0000"+
		"\u0000\u0000\u001dY\u0001\u0000\u0000\u0000\u001fb\u0001\u0000\u0000\u0000"+
		"!i\u0001\u0000\u0000\u0000#s\u0001\u0000\u0000\u0000%y\u0001\u0000\u0000"+
		"\u0000\'\u0081\u0001\u0000\u0000\u0000)\u0087\u0001\u0000\u0000\u0000"+
		"+,\u0005?\u0000\u0000,-\u0005?\u0000\u0000-.\u0005?\u0000\u0000.\u0002"+
		"\u0001\u0000\u0000\u0000/0\u0005;\u0000\u000001\u0005P\u0000\u00001\u0004"+
		"\u0001\u0000\u0000\u000023\u0005+\u0000\u00003\u0006\u0001\u0000\u0000"+
		"\u000045\u0005-\u0000\u00005\b\u0001\u0000\u0000\u000067\u0005*\u0000"+
		"\u00007\n\u0001\u0000\u0000\u000089\u0005/\u0000\u00009\f\u0001\u0000"+
		"\u0000\u0000:;\u0005%\u0000\u0000;\u000e\u0001\u0000\u0000\u0000<=\u0005"+
		">\u0000\u0000=\u0010\u0001\u0000\u0000\u0000>?\u0005<\u0000\u0000?\u0012"+
		"\u0001\u0000\u0000\u0000@A\u0005=\u0000\u0000AB\u0005=\u0000\u0000B\u0014"+
		"\u0001\u0000\u0000\u0000CD\u0005!\u0000\u0000DE\u0005=\u0000\u0000E\u0016"+
		"\u0001\u0000\u0000\u0000FG\u0005>\u0000\u0000GH\u0005=\u0000\u0000H\u0018"+
		"\u0001\u0000\u0000\u0000IJ\u0005<\u0000\u0000JK\u0005=\u0000\u0000K\u001a"+
		"\u0001\u0000\u0000\u0000LN\u0003)\u0014\u0000ML\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PW\u0001\u0000\u0000\u0000QS\u0005.\u0000\u0000RT\u0003)\u0014\u0000"+
		"SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WQ\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000X\u001c\u0001\u0000\u0000\u0000"+
		"Y]\u0005\"\u0000\u0000Z\\\b\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000"+
		"\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\"\u0000"+
		"\u0000a\u001e\u0001\u0000\u0000\u0000bf\u0007\u0001\u0000\u0000ce\u0007"+
		"\u0002\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g \u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000ij\u0005v\u0000\u0000jk\u0005e\u0000\u0000"+
		"kl\u0005r\u0000\u0000lm\u0005d\u0000\u0000mn\u0005a\u0000\u0000no\u0005"+
		"d\u0000\u0000op\u0005e\u0000\u0000pq\u0005r\u0000\u0000qr\u0005o\u0000"+
		"\u0000r\"\u0001\u0000\u0000\u0000st\u0005f\u0000\u0000tu\u0005a\u0000"+
		"\u0000uv\u0005l\u0000\u0000vw\u0005s\u0000\u0000wx\u0005o\u0000\u0000"+
		"x$\u0001\u0000\u0000\u0000y}\u0005#\u0000\u0000z|\b\u0003\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~&\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0082\u0007\u0004\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0006\u0013\u0000\u0000\u0086(\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0007\u0005\u0000\u0000\u0088*\u0001\u0000"+
		"\u0000\u0000\b\u0000OUW]f}\u0083\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}