// Generated from C:/Users/sayas/AI Project/Project/compiler/src/antlr\Example1Lexer.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Example1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, INT=2, WS=3, C=4, CB=5, OB=6, LIST=7, WHILE=8, SPACE=9, UN=10, 
		UT=11, UR=12, CURLYOPEN=13, CURLYCLOSE=14, SUM=15, DIVID=16, MULTIPLY=17, 
		MINUS=18, OPENTEXT=19, CLOSETEXT=20, SUMS=21, MINUSS=22, OR=23, FOR=24, 
		AND=25, SUM_EQUAL=26, MINUS_EQUAL=27, EQUALEQUAL=28, DIVID_EQUAL=29, MULTIPLY_EQUAL=30, 
		NOT_EQUAL=31, STRING=32, VOID=33, DOUBLE=34, BOOL=35, IF=36, ELSE=37, 
		ELSE_IF=38, TRUE=39, FALSE=40, DOUBLE_QUOTE=41, COMMA=42, LENGTH=43, RETURN=44, 
		CLASS=45, ABSTRACT=46, COMMENT=47, TAG_OPEN=48, TAG_OPEN_EQUAL=49, BREAK=50, 
		DOT=51, PRINT=52, TAG_CLOSE=53, TAG_CLOSE_EQUAL=54, EQUAL=55, SINGLE_QUOTE=56, 
		SEMICOLON=57, COLUMN=58, E_BUTTON=59, ROW=60, CONTAINER=61, CHILDREN=62, 
		IMAGEASSETS=63, IMAGE=64, CHILD=65, TEXT=66, SCAFFOLD=67, BODY=68, COLOR=69, 
		HEIGHT=70, WIDTH=71, ON_PRESSED=72, CENTER=73, BACK_COLOR=74, MAINAXISALIGNMENT_KEY=75, 
		MAINAXISALIGNMENT_VALUE=76, MAINAXISSIZE_KEY=77, MAINAXISSIZE_VALUE=78, 
		MAINAXISALIGNMENT_VALUES=79, MAINAXISSIZE_VALUES=80, FONTSIZE=81, STYLE=82, 
		TEXTSTYLE=83, NUMBER=84, CHARS=85, STRING_EXP=86;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VAR", "INT", "WS", "C", "CB", "OB", "LIST", "WHILE", "SPACE", "UN", 
			"UT", "UR", "CURLYOPEN", "CURLYCLOSE", "SUM", "DIVID", "MULTIPLY", "MINUS", 
			"OPENTEXT", "CLOSETEXT", "SUMS", "MINUSS", "OR", "FOR", "AND", "SUM_EQUAL", 
			"MINUS_EQUAL", "EQUALEQUAL", "DIVID_EQUAL", "MULTIPLY_EQUAL", "NOT_EQUAL", 
			"STRING", "VOID", "DOUBLE", "BOOL", "IF", "ELSE", "ELSE_IF", "TRUE", 
			"FALSE", "DOUBLE_QUOTE", "COMMA", "LENGTH", "RETURN", "CLASS", "ABSTRACT", 
			"COMMENT", "TAG_OPEN", "TAG_OPEN_EQUAL", "BREAK", "DOT", "PRINT", "TAG_CLOSE", 
			"TAG_CLOSE_EQUAL", "EQUAL", "SINGLE_QUOTE", "SEMICOLON", "COLUMN", "E_BUTTON", 
			"ROW", "CONTAINER", "CHILDREN", "IMAGEASSETS", "IMAGE", "CHILD", "TEXT", 
			"SCAFFOLD", "BODY", "COLOR", "HEIGHT", "WIDTH", "ON_PRESSED", "CENTER", 
			"BACK_COLOR", "MAINAXISALIGNMENT_KEY", "MAINAXISALIGNMENT_VALUE", "MAINAXISSIZE_KEY", 
			"MAINAXISSIZE_VALUE", "MAINAXISALIGNMENT_VALUES", "MAINAXISSIZE_VALUES", 
			"FONTSIZE", "STYLE", "TEXTSTYLE", "NUMBER", "CHARS", "STRING_EXP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'int'", null, "':'", "']'", "'['", "'list'", "'while'", 
			"' '", "'\n'", "'\t'", "'\r'", "'{'", "'}'", "'+'", "'/'", "'*'", "'-'", 
			"'('", "')'", "'++'", "'--'", "'|'", "'for'", "'&'", "'+='", "'-='", 
			"'=='", "'/='", "'*='", "'!='", "'String'", "'void'", "'double'", "'bool'", 
			"'if'", "'else'", "'else if'", "'true'", "'false'", "'\"'", "','", "'length'", 
			"'return'", "'class'", "'abstract'", "'//'", "'<'", "'<='", "'break'", 
			"'.'", "'print'", "'>'", "'>='", "'='", "'''", "';'", "'Column'", "'ElevatedButton'", 
			"'Row'", "'Container'", "'children'", "'Image.assets'", "'Image'", "'child'", 
			"'Text'", "'Scaffold'", "'body'", "'color'", "'height'", "'width'", "'onPressed'", 
			"'Center'", "'backgroundColor'", "'mainAxisAlignment'", "'MainAxisAlignment'", 
			"'mainAxisSize'", "'MainAxisSize'", null, null, "'fontSize'", "'style'", 
			"'TextStyle'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "INT", "WS", "C", "CB", "OB", "LIST", "WHILE", "SPACE", 
			"UN", "UT", "UR", "CURLYOPEN", "CURLYCLOSE", "SUM", "DIVID", "MULTIPLY", 
			"MINUS", "OPENTEXT", "CLOSETEXT", "SUMS", "MINUSS", "OR", "FOR", "AND", 
			"SUM_EQUAL", "MINUS_EQUAL", "EQUALEQUAL", "DIVID_EQUAL", "MULTIPLY_EQUAL", 
			"NOT_EQUAL", "STRING", "VOID", "DOUBLE", "BOOL", "IF", "ELSE", "ELSE_IF", 
			"TRUE", "FALSE", "DOUBLE_QUOTE", "COMMA", "LENGTH", "RETURN", "CLASS", 
			"ABSTRACT", "COMMENT", "TAG_OPEN", "TAG_OPEN_EQUAL", "BREAK", "DOT", 
			"PRINT", "TAG_CLOSE", "TAG_CLOSE_EQUAL", "EQUAL", "SINGLE_QUOTE", "SEMICOLON", 
			"COLUMN", "E_BUTTON", "ROW", "CONTAINER", "CHILDREN", "IMAGEASSETS", 
			"IMAGE", "CHILD", "TEXT", "SCAFFOLD", "BODY", "COLOR", "HEIGHT", "WIDTH", 
			"ON_PRESSED", "CENTER", "BACK_COLOR", "MAINAXISALIGNMENT_KEY", "MAINAXISALIGNMENT_VALUE", 
			"MAINAXISSIZE_KEY", "MAINAXISSIZE_VALUE", "MAINAXISALIGNMENT_VALUES", 
			"MAINAXISSIZE_VALUES", "FONTSIZE", "STYLE", "TEXTSTYLE", "NUMBER", "CHARS", 
			"STRING_EXP"
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


	public Example1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Example1Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2X\u02b7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\6\4\u00b9\n\4\r"+
		"\4\16\4\u00ba\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3"+
		"G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3"+
		"J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0280\nP\3Q\3Q\3Q\3Q\3Q\3Q\5"+
		"Q\u0288\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3U\6U\u02a4\nU\rU\16U\u02a5\3V\3V\7V\u02aa\nV\fV\16V"+
		"\u02ad\13V\3W\3W\7W\u02b1\nW\fW\16W\u02b4\13W\3W\3W\3\u02b2\2X\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9V\u00abW\u00adX\3\2\7\4\2\13\f\"\"\3\2\62;\3\2c|\6\2\62"+
		";C\\aac|\4\2\f\f\17\17\2\u02c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\3\u00af\3\2\2\2\5\u00b3\3\2\2\2\7\u00b8\3\2\2\2\t\u00be\3\2\2\2\13"+
		"\u00c0\3\2\2\2\r\u00c2\3\2\2\2\17\u00c4\3\2\2\2\21\u00c9\3\2\2\2\23\u00cf"+
		"\3\2\2\2\25\u00d3\3\2\2\2\27\u00d7\3\2\2\2\31\u00db\3\2\2\2\33\u00df\3"+
		"\2\2\2\35\u00e1\3\2\2\2\37\u00e3\3\2\2\2!\u00e5\3\2\2\2#\u00e7\3\2\2\2"+
		"%\u00e9\3\2\2\2\'\u00eb\3\2\2\2)\u00ed\3\2\2\2+\u00ef\3\2\2\2-\u00f2\3"+
		"\2\2\2/\u00f5\3\2\2\2\61\u00f7\3\2\2\2\63\u00fb\3\2\2\2\65\u00fd\3\2\2"+
		"\2\67\u0100\3\2\2\29\u0103\3\2\2\2;\u0106\3\2\2\2=\u0109\3\2\2\2?\u010c"+
		"\3\2\2\2A\u010f\3\2\2\2C\u0116\3\2\2\2E\u011b\3\2\2\2G\u0122\3\2\2\2I"+
		"\u0127\3\2\2\2K\u012a\3\2\2\2M\u012f\3\2\2\2O\u0137\3\2\2\2Q\u013c\3\2"+
		"\2\2S\u0142\3\2\2\2U\u0144\3\2\2\2W\u0146\3\2\2\2Y\u014d\3\2\2\2[\u0154"+
		"\3\2\2\2]\u015a\3\2\2\2_\u0163\3\2\2\2a\u0166\3\2\2\2c\u0168\3\2\2\2e"+
		"\u016b\3\2\2\2g\u0171\3\2\2\2i\u0173\3\2\2\2k\u0179\3\2\2\2m\u017b\3\2"+
		"\2\2o\u017e\3\2\2\2q\u0180\3\2\2\2s\u0182\3\2\2\2u\u0184\3\2\2\2w\u018b"+
		"\3\2\2\2y\u019a\3\2\2\2{\u019e\3\2\2\2}\u01a8\3\2\2\2\177\u01b1\3\2\2"+
		"\2\u0081\u01be\3\2\2\2\u0083\u01c4\3\2\2\2\u0085\u01ca\3\2\2\2\u0087\u01cf"+
		"\3\2\2\2\u0089\u01d8\3\2\2\2\u008b\u01dd\3\2\2\2\u008d\u01e3\3\2\2\2\u008f"+
		"\u01ea\3\2\2\2\u0091\u01f0\3\2\2\2\u0093\u01fa\3\2\2\2\u0095\u0201\3\2"+
		"\2\2\u0097\u0211\3\2\2\2\u0099\u0223\3\2\2\2\u009b\u0235\3\2\2\2\u009d"+
		"\u0242\3\2\2\2\u009f\u027f\3\2\2\2\u00a1\u0287\3\2\2\2\u00a3\u0289\3\2"+
		"\2\2\u00a5\u0292\3\2\2\2\u00a7\u0298\3\2\2\2\u00a9\u02a3\3\2\2\2\u00ab"+
		"\u02a7\3\2\2\2\u00ad\u02ae\3\2\2\2\u00af\u00b0\7x\2\2\u00b0\u00b1\7c\2"+
		"\2\u00b1\u00b2\7t\2\2\u00b2\4\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7"+
		"p\2\2\u00b5\u00b6\7v\2\2\u00b6\6\3\2\2\2\u00b7\u00b9\t\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\b\4\2\2\u00bd\b\3\2\2\2\u00be\u00bf\7<\2\2"+
		"\u00bf\n\3\2\2\2\u00c0\u00c1\7_\2\2\u00c1\f\3\2\2\2\u00c2\u00c3\7]\2\2"+
		"\u00c3\16\3\2\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7"+
		"u\2\2\u00c7\u00c8\7v\2\2\u00c8\20\3\2\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb"+
		"\7j\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"\22\3\2\2\2\u00cf\u00d0\7\"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\n\2"+
		"\2\u00d2\24\3\2\2\2\u00d3\u00d4\7\f\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\b\13\2\2\u00d6\26\3\2\2\2\u00d7\u00d8\7\13\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\b\f\2\2\u00da\30\3\2\2\2\u00db\u00dc\7\17\2\2\u00dc\u00dd\3\2\2"+
		"\2\u00dd\u00de\b\r\2\2\u00de\32\3\2\2\2\u00df\u00e0\7}\2\2\u00e0\34\3"+
		"\2\2\2\u00e1\u00e2\7\177\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4"+
		" \3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\"\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8"+
		"$\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7*\2\2\u00ec("+
		"\3\2\2\2\u00ed\u00ee\7+\2\2\u00ee*\3\2\2\2\u00ef\u00f0\7-\2\2\u00f0\u00f1"+
		"\7-\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7/\2\2\u00f3\u00f4\7/\2\2\u00f4.\3"+
		"\2\2\2\u00f5\u00f6\7~\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9"+
		"\7q\2\2\u00f9\u00fa\7t\2\2\u00fa\62\3\2\2\2\u00fb\u00fc\7(\2\2\u00fc\64"+
		"\3\2\2\2\u00fd\u00fe\7-\2\2\u00fe\u00ff\7?\2\2\u00ff\66\3\2\2\2\u0100"+
		"\u0101\7/\2\2\u0101\u0102\7?\2\2\u01028\3\2\2\2\u0103\u0104\7?\2\2\u0104"+
		"\u0105\7?\2\2\u0105:\3\2\2\2\u0106\u0107\7\61\2\2\u0107\u0108\7?\2\2\u0108"+
		"<\3\2\2\2\u0109\u010a\7,\2\2\u010a\u010b\7?\2\2\u010b>\3\2\2\2\u010c\u010d"+
		"\7#\2\2\u010d\u010e\7?\2\2\u010e@\3\2\2\2\u010f\u0110\7U\2\2\u0110\u0111"+
		"\7v\2\2\u0111\u0112\7t\2\2\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114"+
		"\u0115\7i\2\2\u0115B\3\2\2\2\u0116\u0117\7x\2\2\u0117\u0118\7q\2\2\u0118"+
		"\u0119\7k\2\2\u0119\u011a\7f\2\2\u011aD\3\2\2\2\u011b\u011c\7f\2\2\u011c"+
		"\u011d\7q\2\2\u011d\u011e\7w\2\2\u011e\u011f\7d\2\2\u011f\u0120\7n\2\2"+
		"\u0120\u0121\7g\2\2\u0121F\3\2\2\2\u0122\u0123\7d\2\2\u0123\u0124\7q\2"+
		"\2\u0124\u0125\7q\2\2\u0125\u0126\7n\2\2\u0126H\3\2\2\2\u0127\u0128\7"+
		"k\2\2\u0128\u0129\7h\2\2\u0129J\3\2\2\2\u012a\u012b\7g\2\2\u012b\u012c"+
		"\7n\2\2\u012c\u012d\7u\2\2\u012d\u012e\7g\2\2\u012eL\3\2\2\2\u012f\u0130"+
		"\7g\2\2\u0130\u0131\7n\2\2\u0131\u0132\7u\2\2\u0132\u0133\7g\2\2\u0133"+
		"\u0134\7\"\2\2\u0134\u0135\7k\2\2\u0135\u0136\7h\2\2\u0136N\3\2\2\2\u0137"+
		"\u0138\7v\2\2\u0138\u0139\7t\2\2\u0139\u013a\7w\2\2\u013a\u013b\7g\2\2"+
		"\u013bP\3\2\2\2\u013c\u013d\7h\2\2\u013d\u013e\7c\2\2\u013e\u013f\7n\2"+
		"\2\u013f\u0140\7u\2\2\u0140\u0141\7g\2\2\u0141R\3\2\2\2\u0142\u0143\7"+
		"$\2\2\u0143T\3\2\2\2\u0144\u0145\7.\2\2\u0145V\3\2\2\2\u0146\u0147\7n"+
		"\2\2\u0147\u0148\7g\2\2\u0148\u0149\7p\2\2\u0149\u014a\7i\2\2\u014a\u014b"+
		"\7v\2\2\u014b\u014c\7j\2\2\u014cX\3\2\2\2\u014d\u014e\7t\2\2\u014e\u014f"+
		"\7g\2\2\u014f\u0150\7v\2\2\u0150\u0151\7w\2\2\u0151\u0152\7t\2\2\u0152"+
		"\u0153\7p\2\2\u0153Z\3\2\2\2\u0154\u0155\7e\2\2\u0155\u0156\7n\2\2\u0156"+
		"\u0157\7c\2\2\u0157\u0158\7u\2\2\u0158\u0159\7u\2\2\u0159\\\3\2\2\2\u015a"+
		"\u015b\7c\2\2\u015b\u015c\7d\2\2\u015c\u015d\7u\2\2\u015d\u015e\7v\2\2"+
		"\u015e\u015f\7t\2\2\u015f\u0160\7c\2\2\u0160\u0161\7e\2\2\u0161\u0162"+
		"\7v\2\2\u0162^\3\2\2\2\u0163\u0164\7\61\2\2\u0164\u0165\7\61\2\2\u0165"+
		"`\3\2\2\2\u0166\u0167\7>\2\2\u0167b\3\2\2\2\u0168\u0169\7>\2\2\u0169\u016a"+
		"\7?\2\2\u016ad\3\2\2\2\u016b\u016c\7d\2\2\u016c\u016d\7t\2\2\u016d\u016e"+
		"\7g\2\2\u016e\u016f\7c\2\2\u016f\u0170\7m\2\2\u0170f\3\2\2\2\u0171\u0172"+
		"\7\60\2\2\u0172h\3\2\2\2\u0173\u0174\7r\2\2\u0174\u0175\7t\2\2\u0175\u0176"+
		"\7k\2\2\u0176\u0177\7p\2\2\u0177\u0178\7v\2\2\u0178j\3\2\2\2\u0179\u017a"+
		"\7@\2\2\u017al\3\2\2\2\u017b\u017c\7@\2\2\u017c\u017d\7?\2\2\u017dn\3"+
		"\2\2\2\u017e\u017f\7?\2\2\u017fp\3\2\2\2\u0180\u0181\7)\2\2\u0181r\3\2"+
		"\2\2\u0182\u0183\7=\2\2\u0183t\3\2\2\2\u0184\u0185\7E\2\2\u0185\u0186"+
		"\7q\2\2\u0186\u0187\7n\2\2\u0187\u0188\7w\2\2\u0188\u0189\7o\2\2\u0189"+
		"\u018a\7p\2\2\u018av\3\2\2\2\u018b\u018c\7G\2\2\u018c\u018d\7n\2\2\u018d"+
		"\u018e\7g\2\2\u018e\u018f\7x\2\2\u018f\u0190\7c\2\2\u0190\u0191\7v\2\2"+
		"\u0191\u0192\7g\2\2\u0192\u0193\7f\2\2\u0193\u0194\7D\2\2\u0194\u0195"+
		"\7w\2\2\u0195\u0196\7v\2\2\u0196\u0197\7v\2\2\u0197\u0198\7q\2\2\u0198"+
		"\u0199\7p\2\2\u0199x\3\2\2\2\u019a\u019b\7T\2\2\u019b\u019c\7q\2\2\u019c"+
		"\u019d\7y\2\2\u019dz\3\2\2\2\u019e\u019f\7E\2\2\u019f\u01a0\7q\2\2\u01a0"+
		"\u01a1\7p\2\2\u01a1\u01a2\7v\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7k\2\2"+
		"\u01a4\u01a5\7p\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7t\2\2\u01a7|\3\2\2"+
		"\2\u01a8\u01a9\7e\2\2\u01a9\u01aa\7j\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac"+
		"\7n\2\2\u01ac\u01ad\7f\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7g\2\2\u01af"+
		"\u01b0\7p\2\2\u01b0~\3\2\2\2\u01b1\u01b2\7K\2\2\u01b2\u01b3\7o\2\2\u01b3"+
		"\u01b4\7c\2\2\u01b4\u01b5\7i\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7\7\60\2"+
		"\2\u01b7\u01b8\7c\2\2\u01b8\u01b9\7u\2\2\u01b9\u01ba\7u\2\2\u01ba\u01bb"+
		"\7g\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7u\2\2\u01bd\u0080\3\2\2\2\u01be"+
		"\u01bf\7K\2\2\u01bf\u01c0\7o\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7i\2\2"+
		"\u01c2\u01c3\7g\2\2\u01c3\u0082\3\2\2\2\u01c4\u01c5\7e\2\2\u01c5\u01c6"+
		"\7j\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7n\2\2\u01c8\u01c9\7f\2\2\u01c9"+
		"\u0084\3\2\2\2\u01ca\u01cb\7V\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7z\2"+
		"\2\u01cd\u01ce\7v\2\2\u01ce\u0086\3\2\2\2\u01cf\u01d0\7U\2\2\u01d0\u01d1"+
		"\7e\2\2\u01d1\u01d2\7c\2\2\u01d2\u01d3\7h\2\2\u01d3\u01d4\7h\2\2\u01d4"+
		"\u01d5\7q\2\2\u01d5\u01d6\7n\2\2\u01d6\u01d7\7f\2\2\u01d7\u0088\3\2\2"+
		"\2\u01d8\u01d9\7d\2\2\u01d9\u01da\7q\2\2\u01da\u01db\7f\2\2\u01db\u01dc"+
		"\7{\2\2\u01dc\u008a\3\2\2\2\u01dd\u01de\7e\2\2\u01de\u01df\7q\2\2\u01df"+
		"\u01e0\7n\2\2\u01e0\u01e1\7q\2\2\u01e1\u01e2\7t\2\2\u01e2\u008c\3\2\2"+
		"\2\u01e3\u01e4\7j\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7k\2\2\u01e6\u01e7"+
		"\7i\2\2\u01e7\u01e8\7j\2\2\u01e8\u01e9\7v\2\2\u01e9\u008e\3\2\2\2\u01ea"+
		"\u01eb\7y\2\2\u01eb\u01ec\7k\2\2\u01ec\u01ed\7f\2\2\u01ed\u01ee\7v\2\2"+
		"\u01ee\u01ef\7j\2\2\u01ef\u0090\3\2\2\2\u01f0\u01f1\7q\2\2\u01f1\u01f2"+
		"\7p\2\2\u01f2\u01f3\7R\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7g\2\2\u01f5"+
		"\u01f6\7u\2\2\u01f6\u01f7\7u\2\2\u01f7\u01f8\7g\2\2\u01f8\u01f9\7f\2\2"+
		"\u01f9\u0092\3\2\2\2\u01fa\u01fb\7E\2\2\u01fb\u01fc\7g\2\2\u01fc\u01fd"+
		"\7p\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7g\2\2\u01ff\u0200\7t\2\2\u0200"+
		"\u0094\3\2\2\2\u0201\u0202\7d\2\2\u0202\u0203\7c\2\2\u0203\u0204\7e\2"+
		"\2\u0204\u0205\7m\2\2\u0205\u0206\7i\2\2\u0206\u0207\7t\2\2\u0207\u0208"+
		"\7q\2\2\u0208\u0209\7w\2\2\u0209\u020a\7p\2\2\u020a\u020b\7f\2\2\u020b"+
		"\u020c\7E\2\2\u020c\u020d\7q\2\2\u020d\u020e\7n\2\2\u020e\u020f\7q\2\2"+
		"\u020f\u0210\7t\2\2\u0210\u0096\3\2\2\2\u0211\u0212\7o\2\2\u0212\u0213"+
		"\7c\2\2\u0213\u0214\7k\2\2\u0214\u0215\7p\2\2\u0215\u0216\7C\2\2\u0216"+
		"\u0217\7z\2\2\u0217\u0218\7k\2\2\u0218\u0219\7u\2\2\u0219\u021a\7C\2\2"+
		"\u021a\u021b\7n\2\2\u021b\u021c\7k\2\2\u021c\u021d\7i\2\2\u021d\u021e"+
		"\7p\2\2\u021e\u021f\7o\2\2\u021f\u0220\7g\2\2\u0220\u0221\7p\2\2\u0221"+
		"\u0222\7v\2\2\u0222\u0098\3\2\2\2\u0223\u0224\7O\2\2\u0224\u0225\7c\2"+
		"\2\u0225\u0226\7k\2\2\u0226\u0227\7p\2\2\u0227\u0228\7C\2\2\u0228\u0229"+
		"\7z\2\2\u0229\u022a\7k\2\2\u022a\u022b\7u\2\2\u022b\u022c\7C\2\2\u022c"+
		"\u022d\7n\2\2\u022d\u022e\7k\2\2\u022e\u022f\7i\2\2\u022f\u0230\7p\2\2"+
		"\u0230\u0231\7o\2\2\u0231\u0232\7g\2\2\u0232\u0233\7p\2\2\u0233\u0234"+
		"\7v\2\2\u0234\u009a\3\2\2\2\u0235\u0236\7o\2\2\u0236\u0237\7c\2\2\u0237"+
		"\u0238\7k\2\2\u0238\u0239\7p\2\2\u0239\u023a\7C\2\2\u023a\u023b\7z\2\2"+
		"\u023b\u023c\7k\2\2\u023c\u023d\7u\2\2\u023d\u023e\7U\2\2\u023e\u023f"+
		"\7k\2\2\u023f\u0240\7|\2\2\u0240\u0241\7g\2\2\u0241\u009c\3\2\2\2\u0242"+
		"\u0243\7O\2\2\u0243\u0244\7c\2\2\u0244\u0245\7k\2\2\u0245\u0246\7p\2\2"+
		"\u0246\u0247\7C\2\2\u0247\u0248\7z\2\2\u0248\u0249\7k\2\2\u0249\u024a"+
		"\7u\2\2\u024a\u024b\7U\2\2\u024b\u024c\7k\2\2\u024c\u024d\7|\2\2\u024d"+
		"\u024e\7g\2\2\u024e\u009e\3\2\2\2\u024f\u0250\7e\2\2\u0250\u0251\7g\2"+
		"\2\u0251\u0252\7p\2\2\u0252\u0253\7v\2\2\u0253\u0254\7g\2\2\u0254\u0280"+
		"\7t\2\2\u0255\u0256\7u\2\2\u0256\u0257\7v\2\2\u0257\u0258\7c\2\2\u0258"+
		"\u0259\7t\2\2\u0259\u0280\7v\2\2\u025a\u025b\7g\2\2\u025b\u025c\7p\2\2"+
		"\u025c\u0280\7f\2\2\u025d\u025e\7u\2\2\u025e\u025f\7r\2\2\u025f\u0260"+
		"\7c\2\2\u0260\u0261\7e\2\2\u0261\u0262\7g\2\2\u0262\u0263\7D\2\2\u0263"+
		"\u0264\7g\2\2\u0264\u0265\7v\2\2\u0265\u0266\7y\2\2\u0266\u0267\7g\2\2"+
		"\u0267\u0268\7g\2\2\u0268\u0280\7p\2\2\u0269\u026a\7u\2\2\u026a\u026b"+
		"\7r\2\2\u026b\u026c\7c\2\2\u026c\u026d\7e\2\2\u026d\u026e\7g\2\2\u026e"+
		"\u026f\7C\2\2\u026f\u0270\7t\2\2\u0270\u0271\7q\2\2\u0271\u0272\7w\2\2"+
		"\u0272\u0273\7p\2\2\u0273\u0280\7f\2\2\u0274\u0275\7u\2\2\u0275\u0276"+
		"\7r\2\2\u0276\u0277\7c\2\2\u0277\u0278\7e\2\2\u0278\u0279\7g\2\2\u0279"+
		"\u027a\7G\2\2\u027a\u027b\7x\2\2\u027b\u027c\7g\2\2\u027c\u027d\7p\2\2"+
		"\u027d\u027e\7n\2\2\u027e\u0280\7{\2\2\u027f\u024f\3\2\2\2\u027f\u0255"+
		"\3\2\2\2\u027f\u025a\3\2\2\2\u027f\u025d\3\2\2\2\u027f\u0269\3\2\2\2\u027f"+
		"\u0274\3\2\2\2\u0280\u00a0\3\2\2\2\u0281\u0282\7o\2\2\u0282\u0283\7k\2"+
		"\2\u0283\u0288\7p\2\2\u0284\u0285\7o\2\2\u0285\u0286\7c\2\2\u0286\u0288"+
		"\7z\2\2\u0287\u0281\3\2\2\2\u0287\u0284\3\2\2\2\u0288\u00a2\3\2\2\2\u0289"+
		"\u028a\7h\2\2\u028a\u028b\7q\2\2\u028b\u028c\7p\2\2\u028c\u028d\7v\2\2"+
		"\u028d\u028e\7U\2\2\u028e\u028f\7k\2\2\u028f\u0290\7|\2\2\u0290\u0291"+
		"\7g\2\2\u0291\u00a4\3\2\2\2\u0292\u0293\7u\2\2\u0293\u0294\7v\2\2\u0294"+
		"\u0295\7{\2\2\u0295\u0296\7n\2\2\u0296\u0297\7g\2\2\u0297\u00a6\3\2\2"+
		"\2\u0298\u0299\7V\2\2\u0299\u029a\7g\2\2\u029a\u029b\7z\2\2\u029b\u029c"+
		"\7v\2\2\u029c\u029d\7U\2\2\u029d\u029e\7v\2\2\u029e\u029f\7{\2\2\u029f"+
		"\u02a0\7n\2\2\u02a0\u02a1\7g\2\2\u02a1\u00a8\3\2\2\2\u02a2\u02a4\t\3\2"+
		"\2\u02a3\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u00aa\3\2\2\2\u02a7\u02ab\t\4\2\2\u02a8\u02aa\t\5\2\2\u02a9"+
		"\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u00ac\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b2\5S*\2\u02af\u02b1"+
		"\n\6\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\5S"+
		"*\2\u02b6\u00ae\3\2\2\2\t\2\u00ba\u027f\u0287\u02a5\u02ab\u02b2\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}