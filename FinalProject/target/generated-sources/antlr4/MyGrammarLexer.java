// Generated from MyGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, OPS=15, EQUALS=16, IDENTIFIER=17, 
		VALUE_NUM=18, QUOTED_TEXT=19, BOOLEAN=20, IGNORE_SPACES=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "OPS", "EQUALS", "IDENTIFIER", 
		"VALUE_NUM", "QUOTED_TEXT", "BOOLEAN", "IGNORE_SPACES", "SERIES_OF_DIGITS", 
		"D_QUOTE", "S_QUOTE"
	};


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0083\n\20\3\21\3\21\3\22\3\22\7\22\u0089\n\22\f\22\16"+
		"\22\u008c\13\22\3\23\6\23\u008f\n\23\r\23\16\23\u0090\3\23\3\23\6\23\u0095"+
		"\n\23\r\23\16\23\u0096\5\23\u0099\n\23\3\24\3\24\7\24\u009d\n\24\f\24"+
		"\16\24\u00a0\13\24\3\24\3\24\3\24\3\24\7\24\u00a6\n\24\f\24\16\24\u00a9"+
		"\13\24\3\24\3\24\5\24\u00ad\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u00b8\n\25\3\26\6\26\u00bb\n\26\r\26\16\26\u00bc\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\2/\2\61\2\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\5\2\f\f\17"+
		"\17))\5\2\13\f\17\17\"\"\3\2\62;\u00cf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\3\63\3\2\2\2\5:\3\2\2\2\7<\3\2\2\2\tB\3\2\2\2\13D\3"+
		"\2\2\2\rF\3\2\2\2\17N\3\2\2\2\21U\3\2\2\2\23W\3\2\2\2\25Y\3\2\2\2\27["+
		"\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35a\3\2\2\2\37\u0082\3\2\2\2!\u0084\3"+
		"\2\2\2#\u0086\3\2\2\2%\u008e\3\2\2\2\'\u00ac\3\2\2\2)\u00b7\3\2\2\2+\u00ba"+
		"\3\2\2\2-\u00c0\3\2\2\2/\u00c2\3\2\2\2\61\u00c4\3\2\2\2\63\64\7R\2\2\64"+
		"\65\7N\2\2\65\66\7W\2\2\66\67\7U\2\2\678\7G\2\289\7S\2\29\4\3\2\2\2:;"+
		"\7\61\2\2;\6\3\2\2\2<=\7F\2\2=>\7K\2\2>?\7X\2\2?@\7G\2\2@A\7S\2\2A\b\3"+
		"\2\2\2BC\7]\2\2C\n\3\2\2\2DE\7_\2\2E\f\3\2\2\2FG\7O\2\2GH\7K\2\2HI\7P"+
		"\2\2IJ\7W\2\2JK\7U\2\2KL\7G\2\2LM\7S\2\2M\16\3\2\2\2NO\7O\2\2OP\7W\2\2"+
		"PQ\7N\2\2QR\7V\2\2RS\7G\2\2ST\7S\2\2T\20\3\2\2\2UV\7\'\2\2V\22\3\2\2\2"+
		"WX\7*\2\2X\24\3\2\2\2YZ\7+\2\2Z\26\3\2\2\2[\\\7,\2\2\\\30\3\2\2\2]^\7"+
		"-\2\2^\32\3\2\2\2_`\7.\2\2`\34\3\2\2\2ab\7/\2\2b\36\3\2\2\2cd\7C\2\2d"+
		"e\7F\2\2e\u0083\7F\2\2fg\7U\2\2gh\7W\2\2hi\7D\2\2ij\7V\2\2jk\7T\2\2kl"+
		"\7C\2\2lm\7E\2\2m\u0083\7V\2\2no\7O\2\2op\7W\2\2pq\7N\2\2qr\7V\2\2rs\7"+
		"K\2\2st\7R\2\2tu\7N\2\2u\u0083\7[\2\2vw\7F\2\2wx\7K\2\2xy\7X\2\2yz\7K"+
		"\2\2z{\7F\2\2{\u0083\7G\2\2|}\7O\2\2}~\7Q\2\2~\177\7F\2\2\177\u0080\7"+
		"W\2\2\u0080\u0081\7N\2\2\u0081\u0083\7Q\2\2\u0082c\3\2\2\2\u0082f\3\2"+
		"\2\2\u0082n\3\2\2\2\u0082v\3\2\2\2\u0082|\3\2\2\2\u0083 \3\2\2\2\u0084"+
		"\u0085\7?\2\2\u0085\"\3\2\2\2\u0086\u008a\t\2\2\2\u0087\u0089\t\3\2\2"+
		"\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b$\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\5-\27\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0098\3\2\2\2\u0092\u0094\7\60\2\2\u0093\u0095\5-\27\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0099\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"&\3\2\2\2\u009a\u009e\5/\30\2\u009b\u009d\n\4\2\2\u009c\u009b\3\2\2\2"+
		"\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\5/\30\2\u00a2\u00ad\3\2\2\2\u00a3"+
		"\u00a7\5\61\31\2\u00a4\u00a6\n\5\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3"+
		"\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\5\61\31\2\u00ab\u00ad\3\2\2\2\u00ac\u009a\3"+
		"\2\2\2\u00ac\u00a3\3\2\2\2\u00ad(\3\2\2\2\u00ae\u00af\7V\2\2\u00af\u00b0"+
		"\7t\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b8\7g\2\2\u00b2\u00b3\7H\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b8\7g\2\2"+
		"\u00b7\u00ae\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8*\3\2\2\2\u00b9\u00bb\t"+
		"\6\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\26\2\2\u00bf,\3\2\2\2"+
		"\u00c0\u00c1\t\7\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3\60\3\2\2"+
		"\2\u00c4\u00c5\7)\2\2\u00c5\62\3\2\2\2\r\2\u0082\u008a\u0090\u0096\u0098"+
		"\u009e\u00a7\u00ac\u00b7\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}