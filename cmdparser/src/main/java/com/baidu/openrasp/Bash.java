// Generated from Bash.g4 by ANTLR 4.5
package com.baidu.openrasp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Bash extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, HERE_DOC=2, SPACIAL_CAHR=3, DOUBLE_CURLY=4, VAR=5, ARGS=6, 
		MATH_EXEC=7, EXEC=8, DOLLAR=9, FUNCTION_DEFINE=10, WS=11, SINGLE_QUOTED_STR=12, 
		SINGLE_QUOTED_ERR=13, DOUBLE_QUOTE=14, TICK=15, UNQUOTED_STRING=16, IN_DOUBLE_DOLLAR_TOKEN=17, 
		IN_DOUBLE_QUOTE_MATH_EXEC=18, IN_DOUBLE_EXEC=19, TICK_START=20, IN_DOUBLE_ERROR=21, 
		END_DOUBLE_QUOTE=22, DOUBLE_QUOTED_STRING=23, IN_TICK_DOLLAR_TOKEN=24, 
		IN_TICK_COMMENT=25, IN_TICK_COMMENT2=26, IN_TICK_MATH_EXEC=27, IN_TICK_EXEC=28, 
		IN_TICK_DOUBLE_QUOTE=29, END_TICK_TOKEN=30, IN_TICK_SINGLE_QUOTED_ERR=31, 
		IN_TICK_HERE_DOC=32, IN_TICK_TOKEN=33, IN_TICK_WS=34, IN_EXEC_DOLLAR_TOKEN=35, 
		IN_EXEC_COMMENT=36, IN_EXEC_MATH_EXEC=37, IN_EXEC_EXEC=38, END_EXEC_TOKEN=39, 
		IN_EXEC_TICK_START=40, IN_EXEC_ERROR=41, IN_EXEC_DOUBLE_QUOTE=42, IN_EXEC_SINGLE_QUOTED_ERR=43, 
		IN_EXEC_HERE_DOC=44, IN_EXEC_TOKEN=45, IN_EXEC_WS=46, IN_TICK_IN_DOUBLE_DOLLAR_TOKEN=47, 
		IN_TICK_IN_DOUBLE_QUOTE_MATH_EXEC=48, IN_TICK_IN_DOUBLE_EXEC=49, IN_TICK_IN_DOUBLE_ERROR=50, 
		IN_TICK_END_DOUBLE_QUOTE=51, IN_TICK_DOUBLE_QUOTED_STRING=52, IN_TICK_IN_EXEC_DOLLAR_TOKEN=53, 
		IN_TICK_IN_EXEC_COMMENT=54, IN_TICK_IN_EXEC_MATH_EXEC=55, IN_TICK_IN_EXEC_EXEC=56, 
		IN_TICK_END_EXEC_TOKEN=57, IN_TICK_IN_EXEC_ERROR=58, IN_TICK_IN_EXEC_DOUBLE_QUOTE=59, 
		IN_TICK_IN_EXEC_SINGLE_QUOTED_ERR=60, IN_TICK_IN_EXEC_HERE_DOC=61, IN_TICK_IN_EXEC_TOKEN=62, 
		IN_TICK_IN_EXEC_WS=63;
	public static final int IN_DOUBLE_QUOTE = 1;
	public static final int IN_TICK = 2;
	public static final int IN_EXEC = 3;
	public static final int IN_TICK_IN_DOUBLE_QUOTE = 4;
	public static final int IN_TICK_IN_EXEC = 5;
	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_DOUBLE_QUOTE", "IN_TICK", "IN_EXEC", "IN_TICK_IN_DOUBLE_QUOTE", 
		"IN_TICK_IN_EXEC"
	};

	public static final String[] ruleNames = {
		"SPCAE_CHAR", "ESC_CHAR", "BASE_CHAR", "VAR_NAME", "UNICODE_CHAR", "BASE_DOUBLE_QUOTED_STR", 
		"COMMENT", "HERE_DOC", "SPACIAL_CAHR", "DOUBLE_CURLY", "VAR", "ARGS", 
		"MATH_EXEC", "EXEC", "DOLLAR", "FUNCTION_DEFINE", "WS", "SINGLE_QUOTED_STR", 
		"SINGLE_QUOTED_ERR", "DOUBLE_QUOTE", "TICK", "UNQUOTED_STRING", "NORMAL_TOKEN", 
		"DOLLAR_TOKEN", "IN_DOUBLE_DOLLAR_TOKEN", "IN_DOUBLE_QUOTE_MATH_EXEC", 
		"IN_DOUBLE_EXEC", "TICK_START", "IN_DOUBLE_ERROR", "END_DOUBLE_QUOTE", 
		"DOUBLE_QUOTED_STRING", "IN_TICK_DOLLAR_TOKEN", "IN_TICK_COMMENT", "IN_TICK_COMMENT2", 
		"IN_TICK_MATH_EXEC", "IN_TICK_EXEC", "IN_TICK_DOUBLE_QUOTE", "END_TICK_TOKEN", 
		"IN_TICK_SINGLE_QUOTED_ERR", "IN_TICK_HERE_DOC", "IN_TICK_TOKEN", "IN_TICK_WS", 
		"IN_EXEC_DOLLAR_TOKEN", "IN_EXEC_COMMENT", "IN_EXEC_MATH_EXEC", "IN_EXEC_EXEC", 
		"END_EXEC_TOKEN", "IN_EXEC_TICK_START", "IN_EXEC_ERROR", "IN_EXEC_DOUBLE_QUOTE", 
		"IN_EXEC_SINGLE_QUOTED_ERR", "IN_EXEC_HERE_DOC", "IN_EXEC_TOKEN", "IN_EXEC_WS", 
		"IN_TICK_IN_DOUBLE_DOLLAR_TOKEN", "IN_TICK_IN_DOUBLE_QUOTE_MATH_EXEC", 
		"IN_TICK_IN_DOUBLE_EXEC", "IN_TICK_IN_DOUBLE_ERROR", "IN_TICK_END_DOUBLE_QUOTE", 
		"IN_TICK_DOUBLE_QUOTED_STRING", "IN_TICK_IN_EXEC_DOLLAR_TOKEN", "IN_TICK_IN_EXEC_COMMENT", 
		"IN_TICK_IN_EXEC_MATH_EXEC", "IN_TICK_IN_EXEC_EXEC", "IN_TICK_END_EXEC_TOKEN", 
		"IN_TICK_IN_EXEC_ERROR", "IN_TICK_IN_EXEC_DOUBLE_QUOTE", "IN_TICK_IN_EXEC_SINGLE_QUOTED_ERR", 
		"IN_TICK_IN_EXEC_HERE_DOC", "IN_TICK_IN_EXEC_TOKEN", "IN_TICK_IN_EXEC_WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'${{'", null, null, null, "'$('", "'$'", "'()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "HERE_DOC", "SPACIAL_CAHR", "DOUBLE_CURLY", "VAR", "ARGS", 
		"MATH_EXEC", "EXEC", "DOLLAR", "FUNCTION_DEFINE", "WS", "SINGLE_QUOTED_STR", 
		"SINGLE_QUOTED_ERR", "DOUBLE_QUOTE", "TICK", "UNQUOTED_STRING", "IN_DOUBLE_DOLLAR_TOKEN", 
		"IN_DOUBLE_QUOTE_MATH_EXEC", "IN_DOUBLE_EXEC", "TICK_START", "IN_DOUBLE_ERROR", 
		"END_DOUBLE_QUOTE", "DOUBLE_QUOTED_STRING", "IN_TICK_DOLLAR_TOKEN", "IN_TICK_COMMENT", 
		"IN_TICK_COMMENT2", "IN_TICK_MATH_EXEC", "IN_TICK_EXEC", "IN_TICK_DOUBLE_QUOTE", 
		"END_TICK_TOKEN", "IN_TICK_SINGLE_QUOTED_ERR", "IN_TICK_HERE_DOC", "IN_TICK_TOKEN", 
		"IN_TICK_WS", "IN_EXEC_DOLLAR_TOKEN", "IN_EXEC_COMMENT", "IN_EXEC_MATH_EXEC", 
		"IN_EXEC_EXEC", "END_EXEC_TOKEN", "IN_EXEC_TICK_START", "IN_EXEC_ERROR", 
		"IN_EXEC_DOUBLE_QUOTE", "IN_EXEC_SINGLE_QUOTED_ERR", "IN_EXEC_HERE_DOC", 
		"IN_EXEC_TOKEN", "IN_EXEC_WS", "IN_TICK_IN_DOUBLE_DOLLAR_TOKEN", "IN_TICK_IN_DOUBLE_QUOTE_MATH_EXEC", 
		"IN_TICK_IN_DOUBLE_EXEC", "IN_TICK_IN_DOUBLE_ERROR", "IN_TICK_END_DOUBLE_QUOTE", 
		"IN_TICK_DOUBLE_QUOTED_STRING", "IN_TICK_IN_EXEC_DOLLAR_TOKEN", "IN_TICK_IN_EXEC_COMMENT", 
		"IN_TICK_IN_EXEC_MATH_EXEC", "IN_TICK_IN_EXEC_EXEC", "IN_TICK_END_EXEC_TOKEN", 
		"IN_TICK_IN_EXEC_ERROR", "IN_TICK_IN_EXEC_DOUBLE_QUOTE", "IN_TICK_IN_EXEC_SINGLE_QUOTED_ERR", 
		"IN_TICK_IN_EXEC_HERE_DOC", "IN_TICK_IN_EXEC_TOKEN", "IN_TICK_IN_EXEC_WS"
	};
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


	public Bash(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bash.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2A\u01d8\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t"+
		"\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t"+
		":\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4"+
		"F\tF\4G\tG\4H\tH\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\u009e\n\4\3\5\3\5\7\5"+
		"\u00a2\n\5\f\5\16\5\u00a5\13\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7\u00ae\n"+
		"\7\r\7\16\7\u00af\3\7\3\7\3\b\3\b\7\b\u00b6\n\b\f\b\16\b\u00b9\13\b\3"+
		"\b\5\b\u00bc\n\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\6\f\u00ce\n\f\r\f\16\f\u00cf\3\f\3\f\3\f\5\f\u00d5\n\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\6\22\u00e9\n\22\r\22\16\22\u00ea\3\22\3\22\3\23\3\23"+
		"\3\23\7\23\u00f2\n\23\f\23\16\23\u00f5\13\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\6\27\u0105\n\27\r\27\16"+
		"\27\u0106\3\30\3\30\3\30\3\30\3\30\5\30\u010e\n\30\3\31\3\31\3\31\5\31"+
		"\u0113\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \6 \u012e\n \r"+
		" \16 \u012f\3!\3!\3\"\3\"\7\"\u0136\n\"\f\"\16\"\u0139\13\"\3\"\3\"\3"+
		"#\3#\7#\u013f\n#\f#\16#\u0142\13#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\6+\u0160\n+\r+\16"+
		"+\u0161\3+\3+\3,\3,\3-\3-\7-\u016a\n-\f-\16-\u016d\13-\3-\3-\3.\3.\3."+
		"\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\6\67\u018f\n\67"+
		"\r\67\16\67\u0190\3\67\3\67\38\38\39\39\39\39\3:\3:\3:\3:\3;\3;\3<\3<"+
		"\3<\3<\3=\3=\3=\3=\3=\6=\u01aa\n=\r=\16=\u01ab\3>\3>\3?\3?\7?\u01b2\n"+
		"?\f?\16?\u01b5\13?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3D"+
		"\3D\3D\3D\3E\3E\3F\3F\3F\3G\3G\3H\6H\u01d3\nH\rH\16H\u01d4\3H\3H\3\u00cf"+
		"\2I\b\2\n\2\f\2\16\2\20\2\22\2\24\3\26\4\30\5\32\6\34\7\36\b \t\"\n$\13"+
		"&\f(\r*\16,\17.\20\60\21\62\22\64\2\66\28\23:\24<\25>\26@\27B\30D\31F"+
		"\32H\33J\34L\35N\36P\37R T!V\"X#Z$\\%^&`\'b(d)f*h+j,l-n.p/r\60t\61v\62"+
		"x\63z\64|\65~\66\u0080\67\u00828\u00849\u0086:\u0088;\u008a<\u008c=\u008e"+
		">\u0090?\u0092@\u0094A\b\2\3\4\5\6\7\20\5\2\13\f\16\17\"\"\t\2##\'\',"+
		"<??Aac}\177\177\5\2C\\aac|\6\2\62;C\\aac|\3\2\2\u0081\4\2\f\f\17\17\4"+
		"\3\f\f\17\17\b\2((*+=>@@~~\u0080\u0080\t\2##%&,,//\62;ABaa\4\2))^^\4\2"+
		"%%))\5\2\f\f\17\17bb\4\2&&bb\4\2**bb\u01f3\2\24\3\2\2\2\2\26\3\2\2\2\2"+
		"\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2"+
		"\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2"+
		"\2\60\3\2\2\2\2\62\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2"+
		"\3@\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\4F\3\2\2\2\4H\3\2\2\2\4J\3\2\2\2\4L"+
		"\3\2\2\2\4N\3\2\2\2\4P\3\2\2\2\4R\3\2\2\2\4T\3\2\2\2\4V\3\2\2\2\4X\3\2"+
		"\2\2\4Z\3\2\2\2\5\\\3\2\2\2\5^\3\2\2\2\5`\3\2\2\2\5b\3\2\2\2\5d\3\2\2"+
		"\2\5f\3\2\2\2\5h\3\2\2\2\5j\3\2\2\2\5l\3\2\2\2\5n\3\2\2\2\5p\3\2\2\2\5"+
		"r\3\2\2\2\6t\3\2\2\2\6v\3\2\2\2\6x\3\2\2\2\6z\3\2\2\2\6|\3\2\2\2\6~\3"+
		"\2\2\2\7\u0080\3\2\2\2\7\u0082\3\2\2\2\7\u0084\3\2\2\2\7\u0086\3\2\2\2"+
		"\7\u0088\3\2\2\2\7\u008a\3\2\2\2\7\u008c\3\2\2\2\7\u008e\3\2\2\2\7\u0090"+
		"\3\2\2\2\7\u0092\3\2\2\2\7\u0094\3\2\2\2\b\u0096\3\2\2\2\n\u0098\3\2\2"+
		"\2\f\u009d\3\2\2\2\16\u009f\3\2\2\2\20\u00a6\3\2\2\2\22\u00a8\3\2\2\2"+
		"\24\u00b3\3\2\2\2\26\u00bd\3\2\2\2\30\u00c0\3\2\2\2\32\u00c2\3\2\2\2\34"+
		"\u00c6\3\2\2\2\36\u00d6\3\2\2\2 \u00d9\3\2\2\2\"\u00dd\3\2\2\2$\u00e2"+
		"\3\2\2\2&\u00e4\3\2\2\2(\u00e8\3\2\2\2*\u00ee\3\2\2\2,\u00f8\3\2\2\2."+
		"\u00fa\3\2\2\2\60\u00fe\3\2\2\2\62\u0104\3\2\2\2\64\u010d\3\2\2\2\66\u0112"+
		"\3\2\2\28\u0114\3\2\2\2:\u0116\3\2\2\2<\u011a\3\2\2\2>\u011e\3\2\2\2@"+
		"\u0122\3\2\2\2B\u0124\3\2\2\2D\u012d\3\2\2\2F\u0131\3\2\2\2H\u0133\3\2"+
		"\2\2J\u013c\3\2\2\2L\u0147\3\2\2\2N\u014b\3\2\2\2P\u014f\3\2\2\2R\u0153"+
		"\3\2\2\2T\u0157\3\2\2\2V\u0159\3\2\2\2X\u015c\3\2\2\2Z\u015f\3\2\2\2\\"+
		"\u0165\3\2\2\2^\u0167\3\2\2\2`\u0170\3\2\2\2b\u0174\3\2\2\2d\u0178\3\2"+
		"\2\2f\u017c\3\2\2\2h\u0180\3\2\2\2j\u0182\3\2\2\2l\u0186\3\2\2\2n\u0188"+
		"\3\2\2\2p\u018b\3\2\2\2r\u018e\3\2\2\2t\u0194\3\2\2\2v\u0196\3\2\2\2x"+
		"\u019a\3\2\2\2z\u019e\3\2\2\2|\u01a0\3\2\2\2~\u01a9\3\2\2\2\u0080\u01ad"+
		"\3\2\2\2\u0082\u01af\3\2\2\2\u0084\u01b8\3\2\2\2\u0086\u01bc\3\2\2\2\u0088"+
		"\u01c0\3\2\2\2\u008a\u01c4\3\2\2\2\u008c\u01c6\3\2\2\2\u008e\u01ca\3\2"+
		"\2\2\u0090\u01cc\3\2\2\2\u0092\u01cf\3\2\2\2\u0094\u01d2\3\2\2\2\u0096"+
		"\u0097\t\2\2\2\u0097\t\3\2\2\2\u0098\u0099\7^\2\2\u0099\u009a\13\2\2\2"+
		"\u009a\13\3\2\2\2\u009b\u009e\t\3\2\2\u009c\u009e\5\n\3\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009c\3\2\2\2\u009e\r\3\2\2\2\u009f\u00a3\t\4\2\2\u00a0"+
		"\u00a2\t\5\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\17\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7"+
		"\n\6\2\2\u00a7\21\3\2\2\2\u00a8\u00ad\7$\2\2\u00a9\u00ae\5\f\4\2\u00aa"+
		"\u00ae\5\20\6\2\u00ab\u00ae\5\34\f\2\u00ac\u00ae\5\36\r\2\u00ad\u00a9"+
		"\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\7$\2\2\u00b2\23\3\2\2\2\u00b3\u00b7\7%\2\2\u00b4\u00b6"+
		"\n\7\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\t\b"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\25\3\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf"+
		"\7>\2\2\u00bf\27\3\2\2\2\u00c0\u00c1\t\t\2\2\u00c1\31\3\2\2\2\u00c2\u00c3"+
		"\7&\2\2\u00c3\u00c4\7}\2\2\u00c4\u00c5\7}\2\2\u00c5\33\3\2\2\2\u00c6\u00d4"+
		"\7&\2\2\u00c7\u00cd\7}\2\2\u00c8\u00ce\5\f\4\2\u00c9\u00ce\5\20\6\2\u00ca"+
		"\u00ce\5*\23\2\u00cb\u00ce\5\34\f\2\u00cc\u00ce\5\22\7\2\u00cd\u00c8\3"+
		"\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\177\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d5\5\16\5\2\u00d4\u00c7\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\35\3\2\2"+
		"\2\u00d6\u00d7\7&\2\2\u00d7\u00d8\t\n\2\2\u00d8\37\3\2\2\2\u00d9\u00da"+
		"\7&\2\2\u00da\u00db\7*\2\2\u00db\u00dc\7*\2\2\u00dc!\3\2\2\2\u00dd\u00de"+
		"\7&\2\2\u00de\u00df\7*\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\17\2\2\u00e1"+
		"#\3\2\2\2\u00e2\u00e3\7&\2\2\u00e3%\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5\u00e6"+
		"\7+\2\2\u00e6\'\3\2\2\2\u00e7\u00e9\5\b\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\b\22\3\2\u00ed)\3\2\2\2\u00ee\u00f3\7)\2\2\u00ef\u00f2"+
		"\n\13\2\2\u00f0\u00f2\5\n\3\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7)\2\2\u00f7+\3\2\2\2\u00f8\u00f9"+
		"\7)\2\2\u00f9-\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd"+
		"\b\25\4\2\u00fd/\3\2\2\2\u00fe\u00ff\7b\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\b\26\5\2\u0101\61\3\2\2\2\u0102\u0105\5\f\4\2\u0103\u0105\5\20"+
		"\6\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\63\3\2\2\2\u0108\u010e\5\62\27"+
		"\2\u0109\u010e\5\30\n\2\u010a\u010e\5*\23\2\u010b\u010e\5$\20\2\u010c"+
		"\u010e\5\20\6\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\65\3\2\2\2\u010f"+
		"\u0113\5\34\f\2\u0110\u0113\5\36\r\2\u0111\u0113\5&\21\2\u0112\u010f\3"+
		"\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\67\3\2\2\2\u0114"+
		"\u0115\5\66\31\2\u01159\3\2\2\2\u0116\u0117\7&\2\2\u0117\u0118\7*\2\2"+
		"\u0118\u0119\7*\2\2\u0119;\3\2\2\2\u011a\u011b\5\"\17\2\u011b\u011c\3"+
		"\2\2\2\u011c\u011d\b\34\2\2\u011d=\3\2\2\2\u011e\u011f\7b\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0121\b\35\5\2\u0121?\3\2\2\2\u0122\u0123\7&\2\2\u0123"+
		"A\3\2\2\2\u0124\u0125\7$\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b\37\6\2"+
		"\u0127C\3\2\2\2\u0128\u012e\5\f\4\2\u0129\u012e\5\30\n\2\u012a\u012e\5"+
		"\b\2\2\u012b\u012e\5\20\6\2\u012c\u012e\t\f\2\2\u012d\u0128\3\2\2\2\u012d"+
		"\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"E\3\2\2\2\u0131\u0132\5\66\31\2\u0132G\3\2\2\2\u0133\u0137\7%\2\2\u0134"+
		"\u0136\n\r\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013b\t\7\2\2\u013bI\3\2\2\2\u013c\u0140\7%\2\2\u013d\u013f\n\r\2\2\u013e"+
		"\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7b\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\b#\6\2\u0146K\3\2\2\2\u0147\u0148\7&\2\2\u0148"+
		"\u0149\7*\2\2\u0149\u014a\7*\2\2\u014aM\3\2\2\2\u014b\u014c\5\"\17\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\b%\7\2\u014eO\3\2\2\2\u014f\u0150\7$\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\b&\b\2\u0152Q\3\2\2\2\u0153\u0154\7b\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\b\'\6\2\u0156S\3\2\2\2\u0157\u0158\7)\2\2\u0158"+
		"U\3\2\2\2\u0159\u015a\7>\2\2\u015a\u015b\7>\2\2\u015bW\3\2\2\2\u015c\u015d"+
		"\5\64\30\2\u015dY\3\2\2\2\u015e\u0160\5\b\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0164\b+\3\2\u0164[\3\2\2\2\u0165\u0166\5\66\31\2\u0166]\3"+
		"\2\2\2\u0167\u016b\7%\2\2\u0168\u016a\n\7\2\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016e\u016f\t\7\2\2\u016f_\3\2\2\2\u0170\u0171"+
		"\7&\2\2\u0171\u0172\7*\2\2\u0172\u0173\7*\2\2\u0173a\3\2\2\2\u0174\u0175"+
		"\5\"\17\2\u0175\u0176\3\2\2\2\u0176\u0177\b/\2\2\u0177c\3\2\2\2\u0178"+
		"\u0179\7+\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b\60\6\2\u017be\3\2\2\2"+
		"\u017c\u017d\7b\2\2\u017d\u017e\3\2\2\2\u017e\u017f\b\61\5\2\u017fg\3"+
		"\2\2\2\u0180\u0181\7*\2\2\u0181i\3\2\2\2\u0182\u0183\7$\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\b\63\4\2\u0185k\3\2\2\2\u0186\u0187\7)\2\2\u0187"+
		"m\3\2\2\2\u0188\u0189\7>\2\2\u0189\u018a\7>\2\2\u018ao\3\2\2\2\u018b\u018c"+
		"\5\64\30\2\u018cq\3\2\2\2\u018d\u018f\5\b\2\2\u018e\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0193\b\67\3\2\u0193s\3\2\2\2\u0194\u0195\5\66\31\2\u0195u"+
		"\3\2\2\2\u0196\u0197\7&\2\2\u0197\u0198\7*\2\2\u0198\u0199\7*\2\2\u0199"+
		"w\3\2\2\2\u019a\u019b\5\"\17\2\u019b\u019c\3\2\2\2\u019c\u019d\b:\7\2"+
		"\u019dy\3\2\2\2\u019e\u019f\t\16\2\2\u019f{\3\2\2\2\u01a0\u01a1\7$\2\2"+
		"\u01a1\u01a2\3\2\2\2\u01a2\u01a3\b<\6\2\u01a3}\3\2\2\2\u01a4\u01aa\5\f"+
		"\4\2\u01a5\u01aa\5\30\n\2\u01a6\u01aa\5\b\2\2\u01a7\u01aa\5\20\6\2\u01a8"+
		"\u01aa\t\f\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a6\3\2"+
		"\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\177\3\2\2\2\u01ad\u01ae\5\66"+
		"\31\2\u01ae\u0081\3\2\2\2\u01af\u01b3\7%\2\2\u01b0\u01b2\n\7\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\t\7\2\2\u01b7"+
		"\u0083\3\2\2\2\u01b8\u01b9\7&\2\2\u01b9\u01ba\7*\2\2\u01ba\u01bb\7*\2"+
		"\2\u01bb\u0085\3\2\2\2\u01bc\u01bd\5\"\17\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\bA\7\2\u01bf\u0087\3\2\2\2\u01c0\u01c1\7+\2\2\u01c1\u01c2\3\2\2"+
		"\2\u01c2\u01c3\bB\6\2\u01c3\u0089\3\2\2\2\u01c4\u01c5\t\17\2\2\u01c5\u008b"+
		"\3\2\2\2\u01c6\u01c7\7$\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\bD\b\2\u01c9"+
		"\u008d\3\2\2\2\u01ca\u01cb\7)\2\2\u01cb\u008f\3\2\2\2\u01cc\u01cd\7>\2"+
		"\2\u01cd\u01ce\7>\2\2\u01ce\u0091\3\2\2\2\u01cf\u01d0\5\64\30\2\u01d0"+
		"\u0093\3\2\2\2\u01d1\u01d3\5\b\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d7\bH\3\2\u01d7\u0095\3\2\2\2#\2\3\4\5\6\7\u009d\u00a3\u00ad\u00af"+
		"\u00b7\u00bb\u00cd\u00cf\u00d4\u00ea\u00f1\u00f3\u0104\u0106\u010d\u0112"+
		"\u012d\u012f\u0137\u0140\u0161\u016b\u0190\u01a9\u01ab\u01b3\u01d4\t\7"+
		"\5\2\b\2\2\7\3\2\7\4\2\6\2\2\7\7\2\7\6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}