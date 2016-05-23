// Generated from  by ANTLR 4.2.2

package camllight.parser;
import static camllight.parser.Tokens.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__60=1, T__59=2, T__58=3, T__57=4, T__56=5, T__55=6, T__54=7, T__53=8, 
		T__52=9, T__51=10, T__50=11, T__49=12, T__48=13, T__47=14, T__46=15, T__45=16, 
		T__44=17, T__43=18, T__42=19, T__41=20, T__40=21, T__39=22, T__38=23, 
		T__37=24, T__36=25, T__35=26, T__34=27, T__33=28, T__32=29, T__31=30, 
		T__30=31, T__29=32, T__28=33, T__27=34, T__26=35, T__25=36, T__24=37, 
		T__23=38, T__22=39, T__21=40, T__20=41, T__19=42, T__18=43, T__17=44, 
		T__16=45, T__15=46, T__14=47, T__13=48, T__12=49, T__11=50, T__10=51, 
		T__9=52, T__8=53, T__7=54, T__6=55, T__5=56, T__4=57, T__3=58, T__2=59, 
		T__1=60, T__0=61, CHARTOKEN=62, WS=63, INTTOKEN=64, NULLTOKEN=65, EMPTYARRAYTOKEN=66, 
		STRINGTOKEN=67, EMPTYLISTTOKEN=68, FLOATTOKEN=69, WILDCARDTOKEN=70, BOOLTOKEN=71, 
		IDTOKEN=72, CONSTRTOKEN=73;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'fun'", "'while'", "'{'", "'&&'", "'::'", "'='", "'for'", "'do'", "'('", 
		"'rec'", "','", "'<-'", "'done'", "'mod'", "'>='", "'<'", "';;'", "']'", 
		"'*.'", "'|]'", "'let'", "'match'", "'function'", "'downto'", "'then'", 
		"'+'", "'/'", "'as'", "'of'", "'.('", "'||'", "'/.'", "';'", "'}'", "'if'", 
		"'<='", "'[|'", "'&'", "'print'", "'''", "'*'", "'.'", "'->'", "'to'", 
		"'mutable'", "':'", "'['", "'|'", "'with'", "'>'", "'+.'", "'or'", "'-.'", 
		"'else'", "'begin'", "'in'", "'end'", "')'", "'and'", "'not'", "'-'", 
		"CHARTOKEN", "WS", "INTTOKEN", "NULLTOKEN", "EMPTYARRAYTOKEN", "STRINGTOKEN", 
		"EMPTYLISTTOKEN", "FLOATTOKEN", "'_'", "BOOLTOKEN", "IDTOKEN", "CONSTRTOKEN"
	};
	public static final String[] ruleNames = {
		"T__60", "T__59", "T__58", "T__57", "T__56", "T__55", "T__54", "T__53", 
		"T__52", "T__51", "T__50", "T__49", "T__48", "T__47", "T__46", "T__45", 
		"T__44", "T__43", "T__42", "T__41", "T__40", "T__39", "T__38", "T__37", 
		"T__36", "T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", 
		"T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", 
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "CHARTOKEN", "WS", "INTTOKEN", "NULLTOKEN", 
		"EMPTYARRAYTOKEN", "STRINGTOKEN", "EMPTYLISTTOKEN", "FLOATTOKEN", "WILDCARDTOKEN", 
		"BOOLTOKEN", "IDTOKEN", "CONSTRTOKEN"
	};


	public CLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return ""; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2K\u01d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3<\3<"+
		"\3<\3<\3=\3=\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\5?\u016b\n?\7?\u016d\n?"+
		"\f?\16?\u0170\13?\3?\3?\3@\6@\u0175\n@\r@\16@\u0176\3@\3@\3A\6A\u017c"+
		"\nA\rA\16A\u017d\3B\3B\7B\u0182\nB\fB\16B\u0185\13B\3B\3B\3C\3C\3C\3C"+
		"\7C\u018d\nC\fC\16C\u0190\13C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\5D\u019c\n"+
		"D\7D\u019e\nD\fD\16D\u01a1\13D\3D\3D\3E\3E\7E\u01a7\nE\fE\16E\u01aa\13"+
		"E\3E\3E\3F\6F\u01af\nF\rF\16F\u01b0\3F\3F\7F\u01b5\nF\fF\16F\u01b8\13"+
		"F\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u01c5\nH\3I\3I\7I\u01c9\nI\fI\16"+
		"I\u01cc\13I\3J\3J\7J\u01d0\nJ\fJ\16J\u01d3\13J\2\2K\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\3\2\13\4\2^^bb\b\2^^bbddppttvv\3\2\62;\3\2\"\"\4\2$$^^\b\2$$^^ddppt"+
		"tvv\4\2aac|\6\2\62;C\\aac|\3\2C\\\u01e3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\5\u0099\3\2\2\2\7\u009f\3\2\2"+
		"\2\t\u00a1\3\2\2\2\13\u00a4\3\2\2\2\r\u00a7\3\2\2\2\17\u00a9\3\2\2\2\21"+
		"\u00ad\3\2\2\2\23\u00b0\3\2\2\2\25\u00b2\3\2\2\2\27\u00b6\3\2\2\2\31\u00b8"+
		"\3\2\2\2\33\u00bb\3\2\2\2\35\u00c0\3\2\2\2\37\u00c4\3\2\2\2!\u00c7\3\2"+
		"\2\2#\u00c9\3\2\2\2%\u00cc\3\2\2\2\'\u00ce\3\2\2\2)\u00d1\3\2\2\2+\u00d4"+
		"\3\2\2\2-\u00d8\3\2\2\2/\u00de\3\2\2\2\61\u00e7\3\2\2\2\63\u00ee\3\2\2"+
		"\2\65\u00f3\3\2\2\2\67\u00f5\3\2\2\29\u00f7\3\2\2\2;\u00fa\3\2\2\2=\u00fd"+
		"\3\2\2\2?\u0100\3\2\2\2A\u0103\3\2\2\2C\u0106\3\2\2\2E\u0108\3\2\2\2G"+
		"\u010a\3\2\2\2I\u010d\3\2\2\2K\u0110\3\2\2\2M\u0113\3\2\2\2O\u0115\3\2"+
		"\2\2Q\u011b\3\2\2\2S\u011d\3\2\2\2U\u011f\3\2\2\2W\u0121\3\2\2\2Y\u0124"+
		"\3\2\2\2[\u0127\3\2\2\2]\u012f\3\2\2\2_\u0131\3\2\2\2a\u0133\3\2\2\2c"+
		"\u0135\3\2\2\2e\u013a\3\2\2\2g\u013c\3\2\2\2i\u013f\3\2\2\2k\u0142\3\2"+
		"\2\2m\u0145\3\2\2\2o\u014a\3\2\2\2q\u0150\3\2\2\2s\u0153\3\2\2\2u\u0157"+
		"\3\2\2\2w\u0159\3\2\2\2y\u015d\3\2\2\2{\u0161\3\2\2\2}\u0163\3\2\2\2\177"+
		"\u0174\3\2\2\2\u0081\u017b\3\2\2\2\u0083\u017f\3\2\2\2\u0085\u0188\3\2"+
		"\2\2\u0087\u0194\3\2\2\2\u0089\u01a4\3\2\2\2\u008b\u01ae\3\2\2\2\u008d"+
		"\u01b9\3\2\2\2\u008f\u01c4\3\2\2\2\u0091\u01c6\3\2\2\2\u0093\u01cd\3\2"+
		"\2\2\u0095\u0096\7h\2\2\u0096\u0097\7w\2\2\u0097\u0098\7p\2\2\u0098\4"+
		"\3\2\2\2\u0099\u009a\7y\2\2\u009a\u009b\7j\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\6\3\2\2\2\u009f\u00a0\7}\2\2\u00a0"+
		"\b\3\2\2\2\u00a1\u00a2\7(\2\2\u00a2\u00a3\7(\2\2\u00a3\n\3\2\2\2\u00a4"+
		"\u00a5\7<\2\2\u00a5\u00a6\7<\2\2\u00a6\f\3\2\2\2\u00a7\u00a8\7?\2\2\u00a8"+
		"\16\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\20\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7q\2\2\u00af\22\3\2\2\2\u00b0"+
		"\u00b1\7*\2\2\u00b1\24\3\2\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7e\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7\30\3\2\2\2\u00b8"+
		"\u00b9\7>\2\2\u00b9\u00ba\7/\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7f\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7g\2\2\u00bf\34\3\2\2\2\u00c0"+
		"\u00c1\7o\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7f\2\2\u00c3\36\3\2\2\2\u00c4"+
		"\u00c5\7@\2\2\u00c5\u00c6\7?\2\2\u00c6 \3\2\2\2\u00c7\u00c8\7>\2\2\u00c8"+
		"\"\3\2\2\2\u00c9\u00ca\7=\2\2\u00ca\u00cb\7=\2\2\u00cb$\3\2\2\2\u00cc"+
		"\u00cd\7_\2\2\u00cd&\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d0\7\60\2\2\u00d0"+
		"(\3\2\2\2\u00d1\u00d2\7~\2\2\u00d2\u00d3\7_\2\2\u00d3*\3\2\2\2\u00d4\u00d5"+
		"\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7v\2\2\u00d7,\3\2\2\2\u00d8\u00d9"+
		"\7o\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7e\2\2\u00dc"+
		"\u00dd\7j\2\2\u00dd.\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7w\2\2\u00e0"+
		"\u00e1\7p\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7k\2\2"+
		"\u00e4\u00e5\7q\2\2\u00e5\u00e6\7p\2\2\u00e6\60\3\2\2\2\u00e7\u00e8\7"+
		"f\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec"+
		"\7v\2\2\u00ec\u00ed\7q\2\2\u00ed\62\3\2\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0"+
		"\7j\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7p\2\2\u00f2\64\3\2\2\2\u00f3\u00f4"+
		"\7-\2\2\u00f4\66\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f68\3\2\2\2\u00f7\u00f8"+
		"\7c\2\2\u00f8\u00f9\7u\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc"+
		"\7h\2\2\u00fc<\3\2\2\2\u00fd\u00fe\7\60\2\2\u00fe\u00ff\7*\2\2\u00ff>"+
		"\3\2\2\2\u0100\u0101\7~\2\2\u0101\u0102\7~\2\2\u0102@\3\2\2\2\u0103\u0104"+
		"\7\61\2\2\u0104\u0105\7\60\2\2\u0105B\3\2\2\2\u0106\u0107\7=\2\2\u0107"+
		"D\3\2\2\2\u0108\u0109\7\177\2\2\u0109F\3\2\2\2\u010a\u010b\7k\2\2\u010b"+
		"\u010c\7h\2\2\u010cH\3\2\2\2\u010d\u010e\7>\2\2\u010e\u010f\7?\2\2\u010f"+
		"J\3\2\2\2\u0110\u0111\7]\2\2\u0111\u0112\7~\2\2\u0112L\3\2\2\2\u0113\u0114"+
		"\7(\2\2\u0114N\3\2\2\2\u0115\u0116\7r\2\2\u0116\u0117\7t\2\2\u0117\u0118"+
		"\7k\2\2\u0118\u0119\7p\2\2\u0119\u011a\7v\2\2\u011aP\3\2\2\2\u011b\u011c"+
		"\7)\2\2\u011cR\3\2\2\2\u011d\u011e\7,\2\2\u011eT\3\2\2\2\u011f\u0120\7"+
		"\60\2\2\u0120V\3\2\2\2\u0121\u0122\7/\2\2\u0122\u0123\7@\2\2\u0123X\3"+
		"\2\2\2\u0124\u0125\7v\2\2\u0125\u0126\7q\2\2\u0126Z\3\2\2\2\u0127\u0128"+
		"\7o\2\2\u0128\u0129\7w\2\2\u0129\u012a\7v\2\2\u012a\u012b\7c\2\2\u012b"+
		"\u012c\7d\2\2\u012c\u012d\7n\2\2\u012d\u012e\7g\2\2\u012e\\\3\2\2\2\u012f"+
		"\u0130\7<\2\2\u0130^\3\2\2\2\u0131\u0132\7]\2\2\u0132`\3\2\2\2\u0133\u0134"+
		"\7~\2\2\u0134b\3\2\2\2\u0135\u0136\7y\2\2\u0136\u0137\7k\2\2\u0137\u0138"+
		"\7v\2\2\u0138\u0139\7j\2\2\u0139d\3\2\2\2\u013a\u013b\7@\2\2\u013bf\3"+
		"\2\2\2\u013c\u013d\7-\2\2\u013d\u013e\7\60\2\2\u013eh\3\2\2\2\u013f\u0140"+
		"\7q\2\2\u0140\u0141\7t\2\2\u0141j\3\2\2\2\u0142\u0143\7/\2\2\u0143\u0144"+
		"\7\60\2\2\u0144l\3\2\2\2\u0145\u0146\7g\2\2\u0146\u0147\7n\2\2\u0147\u0148"+
		"\7u\2\2\u0148\u0149\7g\2\2\u0149n\3\2\2\2\u014a\u014b\7d\2\2\u014b\u014c"+
		"\7g\2\2\u014c\u014d\7i\2\2\u014d\u014e\7k\2\2\u014e\u014f\7p\2\2\u014f"+
		"p\3\2\2\2\u0150\u0151\7k\2\2\u0151\u0152\7p\2\2\u0152r\3\2\2\2\u0153\u0154"+
		"\7g\2\2\u0154\u0155\7p\2\2\u0155\u0156\7f\2\2\u0156t\3\2\2\2\u0157\u0158"+
		"\7+\2\2\u0158v\3\2\2\2\u0159\u015a\7c\2\2\u015a\u015b\7p\2\2\u015b\u015c"+
		"\7f\2\2\u015cx\3\2\2\2\u015d\u015e\7p\2\2\u015e\u015f\7q\2\2\u015f\u0160"+
		"\7v\2\2\u0160z\3\2\2\2\u0161\u0162\7/\2\2\u0162|\3\2\2\2\u0163\u016e\7"+
		"b\2\2\u0164\u016d\n\2\2\2\u0165\u016a\7^\2\2\u0166\u016b\t\3\2\2\u0167"+
		"\u0168\t\4\2\2\u0168\u0169\t\4\2\2\u0169\u016b\t\4\2\2\u016a\u0166\3\2"+
		"\2\2\u016a\u0167\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u0164\3\2\2\2\u016c"+
		"\u0165\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7b\2\2\u0172"+
		"~\3\2\2\2\u0173\u0175\t\5\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\b@\2\2\u0179\u0080\3\2\2\2\u017a\u017c\t\4\2\2\u017b\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0082\3\2"+
		"\2\2\u017f\u0183\7*\2\2\u0180\u0182\t\5\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7+\2\2\u0187\u0084\3\2\2\2\u0188"+
		"\u0189\7]\2\2\u0189\u018a\7~\2\2\u018a\u018e\3\2\2\2\u018b\u018d\t\5\2"+
		"\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7~\2\2\u0192"+
		"\u0193\7_\2\2\u0193\u0086\3\2\2\2\u0194\u019f\7$\2\2\u0195\u019e\n\6\2"+
		"\2\u0196\u019b\7^\2\2\u0197\u019c\t\7\2\2\u0198\u0199\t\4\2\2\u0199\u019a"+
		"\t\4\2\2\u019a\u019c\t\4\2\2\u019b\u0197\3\2\2\2\u019b\u0198\3\2\2\2\u019c"+
		"\u019e\3\2\2\2\u019d\u0195\3\2\2\2\u019d\u0196\3\2\2\2\u019e\u01a1\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a3\7$\2\2\u01a3\u0088\3\2\2\2\u01a4\u01a8\7]\2"+
		"\2\u01a5\u01a7\t\5\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ac\7_\2\2\u01ac\u008a\3\2\2\2\u01ad\u01af\t\4\2\2\u01ae\u01ad\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b6\7\60\2\2\u01b3\u01b5\t\4\2\2\u01b4\u01b3\3"+
		"\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u008c\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7a\2\2\u01ba\u008e\3\2"+
		"\2\2\u01bb\u01bc\7h\2\2\u01bc\u01bd\7c\2\2\u01bd\u01be\7n\2\2\u01be\u01bf"+
		"\7u\2\2\u01bf\u01c5\7g\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7t\2\2\u01c2"+
		"\u01c3\7w\2\2\u01c3\u01c5\7g\2\2\u01c4\u01bb\3\2\2\2\u01c4\u01c0\3\2\2"+
		"\2\u01c5\u0090\3\2\2\2\u01c6\u01ca\t\b\2\2\u01c7\u01c9\t\t\2\2\u01c8\u01c7"+
		"\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u0092\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d1\t\n\2\2\u01ce\u01d0\t\t"+
		"\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u0094\3\2\2\2\u01d3\u01d1\3\2\2\2\23\2\u016a\u016c"+
		"\u016e\u0176\u017d\u0183\u018e\u019b\u019d\u019f\u01a8\u01b0\u01b6\u01c4"+
		"\u01ca\u01d1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}