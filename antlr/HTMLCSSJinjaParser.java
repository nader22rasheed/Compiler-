// Generated from C:/Users/asus/Desktop/com/grammer/HTMLCSSJinjaParser.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLCSSJinjaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, HTML_TEXT=11, JINJA_BLOCK_START=12, 
		JINJA_EXPR_START=13, JINJA_COMMENT=14, TAG_CLOSE=15, TAG_SLASH_CLOSE=16, 
		TAG_SLASH=17, TAG_EQUALS=18, TAG_NAME=19, TAG_WHITESPACE=20, SCRIPT_BODY=21, 
		SCRIPT_SHORT_BODY=22, CSS_STYLE_CLOSE=23, CSS_STYLE_SHORT_BODY=24, CSS_OpenBracket=25, 
		CSS_CloseBracket=26, CSS_OpenParen=27, CSS_CloseParen=28, CSS_OpenBrace=29, 
		CSS_CloseBrace=30, CSS_SemiColon=31, CSS_Equal=32, CSS_Colon=33, CSS_Dot=34, 
		CSS_Multiply=35, CSS_Divide=36, CSS_Pipe=37, CSS_Underscore=38, CSS_Comment=39, 
		CSS_Space=40, CSS_Cdo=41, CSS_Cdc=42, CSS_Includes=43, CSS_DashMatch=44, 
		CSS_Hash=45, CSS_Import=46, CSS_Page=47, CSS_Media=48, CSS_Namespace=49, 
		CSS_Charset=50, CSS_Important=51, CSS_Percentage=52, CSS_Url_=53, CSS_UnicodeRange=54, 
		CSS_MediaOnly=55, CSS_Not=56, CSS_And=57, CSS_Or=58, CSS_From=59, CSS_To=60, 
		CSS_Number=61, CSS_String_=62, CSS_PrefixMatch=63, CSS_SuffixMatch=64, 
		CSS_SubstringMatch=65, CSS_FontFace=66, CSS_Supports=67, CSS_Keyframes=68, 
		CSS_Viewport=69, CSS_CounterStyle=70, CSS_FontFeatureValues=71, CSS_DxImageTransform=72, 
		CSS_Variable=73, CSS_Ident=74, CSS_Function_=75, CSS_AtKeyword=76, CSS_Dimension=77, 
		CSS_Plus=78, CSS_Minus=79, CSS_Greater=80, CSS_Comma=81, CSS_Tilde=82, 
		CSS_PseudoNot=83, CSS_UnexpectedCharacter=84, ATT_WS=85, ATTCHARS=86, 
		HEXCHARS=87, DECCHARS=88, DOUBLE_QUOTE_START=89, SINGLE_QUOTE_START=90, 
		DQUOTE_TEXT=91, DQUOTE_JINJA_START=92, DQUOTE_JINJA_BLOCK_START=93, DOUBLE_QUOTE_END=94, 
		SQUOTE_TEXT=95, SQUOTE_JINJA_START=96, SQUOTE_JINJA_BLOCK_START=97, SINGLE_QUOTE_END=98, 
		JINJA_WS=99, JINJA_NEWLINE=100, JINJA_INT=101, JINJA_DOUBLE=102, JINJA_STRING=103, 
		JINJA_TRUE=104, JINJA_FALSE=105, JINJA_BOOL=106, JINJA_ADD=107, JINJA_SUB=108, 
		JINJA_MUL=109, JINJA_DIV=110, JINJA_NOT=111, JINJA_EQ=112, JINJA_NEQ=113, 
		JINJA_GT=114, JINJA_LT=115, JINJA_GTEQ=116, JINJA_LTEQ=117, JINJA_LPAREN=118, 
		JINJA_RPAREN=119, JINJA_IF=120, JINJA_ELIF=121, JINJA_ELSE=122, JINJA_ENDIF=123, 
		JINJA_WHILE=124, JINJA_ENDWHILE=125, JINJA_SET=126, JINJA_BLOCK_END=127, 
		JINJA_EXPR_END=128, JINJA_SYMBOLS=129, JINJA_ID=130, EQ=131, VAR=132, 
		CALC=133;
	public static final int
		RULE_htmlDocument = 0, RULE_scriptletOrSeaWs = 1, RULE_htmlElements = 2, 
		RULE_htmlElement = 3, RULE_htmlContent = 4, RULE_htmlAttribute = 5, RULE_attributeValue = 6, 
		RULE_htmlChardata = 7, RULE_htmlMisc = 8, RULE_htmlComment = 9, RULE_script = 10, 
		RULE_style = 11, RULE_statement = 12, RULE_jinja_block = 13, RULE_jinja_block_content = 14, 
		RULE_assignment_statement = 15, RULE_jinja_expression = 16, RULE_jinja_expression_inner = 17, 
		RULE_boolean_expression = 18, RULE_if_statement = 19, RULE_elif_statement = 20, 
		RULE_else_statement = 21, RULE_if_fragment = 22, RULE_elif_fragment = 23, 
		RULE_else_fragment = 24, RULE_endif_fragment = 25, RULE_code_block = 26, 
		RULE_while_statement = 27, RULE_while_fragment = 28, RULE_endwhile_fragment = 29, 
		RULE_stylesheet = 30, RULE_charset = 31, RULE_imports = 32, RULE_namespace_ = 33, 
		RULE_namespacePrefix = 34, RULE_media = 35, RULE_mediaQueryList = 36, 
		RULE_mediaQuery = 37, RULE_mediaType = 38, RULE_mediaExpression = 39, 
		RULE_mediaFeature = 40, RULE_page = 41, RULE_pseudoPage = 42, RULE_selectorGroup = 43, 
		RULE_selector = 44, RULE_combinator = 45, RULE_simpleSelectorSequence = 46, 
		RULE_typeSelector = 47, RULE_typeNamespacePrefix = 48, RULE_elementName = 49, 
		RULE_universal = 50, RULE_className = 51, RULE_attrib = 52, RULE_pseudo = 53, 
		RULE_functionalPseudo = 54, RULE_css_expression = 55, RULE_negation = 56, 
		RULE_negationArg = 57, RULE_operator_ = 58, RULE_property_ = 59, RULE_ruleset = 60, 
		RULE_declarationList = 61, RULE_declaration = 62, RULE_prio = 63, RULE_value = 64, 
		RULE_expr = 65, RULE_term = 66, RULE_function_ = 67, RULE_dxImageTransform = 68, 
		RULE_hexcolor = 69, RULE_css_number = 70, RULE_css_percentage = 71, RULE_css_dimension = 72, 
		RULE_any_ = 73, RULE_atRule = 74, RULE_unused = 75, RULE_block = 76, RULE_nestedStatement = 77, 
		RULE_groupRuleBody = 78, RULE_supportsRule = 79, RULE_supportsCondition = 80, 
		RULE_supportsConditionInParens = 81, RULE_supportsNegation = 82, RULE_supportsConjunction = 83, 
		RULE_supportsDisjunction = 84, RULE_supportsDeclarationCondition = 85, 
		RULE_generalEnclosed = 86, RULE_var_ = 87, RULE_calc = 88, RULE_calcSum = 89, 
		RULE_calcProduct = 90, RULE_calcValue = 91, RULE_fontFaceRule = 92, RULE_fontFaceDeclaration = 93, 
		RULE_keyframesRule = 94, RULE_keyframeBlock = 95, RULE_keyframeSelector = 96, 
		RULE_viewport = 97, RULE_counterStyle = 98, RULE_fontFeatureValuesRule = 99, 
		RULE_fontFamilyNameList = 100, RULE_fontFamilyName = 101, RULE_featureValueBlock = 102, 
		RULE_featureType = 103, RULE_featureValueDefinition = 104, RULE_css_ident = 105, 
		RULE_css_ws = 106, RULE_css_url = 107;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "scriptletOrSeaWs", "htmlElements", "htmlElement", "htmlContent", 
			"htmlAttribute", "attributeValue", "htmlChardata", "htmlMisc", "htmlComment", 
			"script", "style", "statement", "jinja_block", "jinja_block_content", 
			"assignment_statement", "jinja_expression", "jinja_expression_inner", 
			"boolean_expression", "if_statement", "elif_statement", "else_statement", 
			"if_fragment", "elif_fragment", "else_fragment", "endif_fragment", "code_block", 
			"while_statement", "while_fragment", "endwhile_fragment", "stylesheet", 
			"charset", "imports", "namespace_", "namespacePrefix", "media", "mediaQueryList", 
			"mediaQuery", "mediaType", "mediaExpression", "mediaFeature", "page", 
			"pseudoPage", "selectorGroup", "selector", "combinator", "simpleSelectorSequence", 
			"typeSelector", "typeNamespacePrefix", "elementName", "universal", "className", 
			"attrib", "pseudo", "functionalPseudo", "css_expression", "negation", 
			"negationArg", "operator_", "property_", "ruleset", "declarationList", 
			"declaration", "prio", "value", "expr", "term", "function_", "dxImageTransform", 
			"hexcolor", "css_number", "css_percentage", "css_dimension", "any_", 
			"atRule", "unused", "block", "nestedStatement", "groupRuleBody", "supportsRule", 
			"supportsCondition", "supportsConditionInParens", "supportsNegation", 
			"supportsConjunction", "supportsDisjunction", "supportsDeclarationCondition", 
			"generalEnclosed", "var_", "calc", "calcSum", "calcProduct", "calcValue", 
			"fontFaceRule", "fontFaceDeclaration", "keyframesRule", "keyframeBlock", 
			"keyframeSelector", "viewport", "counterStyle", "fontFeatureValuesRule", 
			"fontFamilyNameList", "fontFamilyName", "featureValueBlock", "featureType", 
			"featureValueDefinition", "css_ident", "css_ws", "css_url"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'/>'", null, null, null, null, null, null, "'</style>'", 
			"'</>'", "'['", "']'", null, null, "'{'", "'}'", "';'", null, "':'", 
			"'.'", null, null, "'|'", "'_'", null, null, "'<!--'", "'-->'", "'~='", 
			"'|='", null, null, null, null, null, "'@charset '", null, null, "'url('", 
			null, null, null, null, null, null, null, null, null, "'^='", "'$='", 
			"'*='", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "','", "'~'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'True'", "'False'", null, null, null, null, null, 
			"'NOT'", "'=='", "'!='", null, null, "'>='", "'<='", null, null, "'if'", 
			"'elif'", "'else'", "'endif'", "'while'", "'endwhile'", "'set'", "'%}'", 
			"'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", 
			"JINJA_BLOCK_START", "JINJA_EXPR_START", "JINJA_COMMENT", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", 
			"SCRIPT_BODY", "SCRIPT_SHORT_BODY", "CSS_STYLE_CLOSE", "CSS_STYLE_SHORT_BODY", 
			"CSS_OpenBracket", "CSS_CloseBracket", "CSS_OpenParen", "CSS_CloseParen", 
			"CSS_OpenBrace", "CSS_CloseBrace", "CSS_SemiColon", "CSS_Equal", "CSS_Colon", 
			"CSS_Dot", "CSS_Multiply", "CSS_Divide", "CSS_Pipe", "CSS_Underscore", 
			"CSS_Comment", "CSS_Space", "CSS_Cdo", "CSS_Cdc", "CSS_Includes", "CSS_DashMatch", 
			"CSS_Hash", "CSS_Import", "CSS_Page", "CSS_Media", "CSS_Namespace", "CSS_Charset", 
			"CSS_Important", "CSS_Percentage", "CSS_Url_", "CSS_UnicodeRange", "CSS_MediaOnly", 
			"CSS_Not", "CSS_And", "CSS_Or", "CSS_From", "CSS_To", "CSS_Number", "CSS_String_", 
			"CSS_PrefixMatch", "CSS_SuffixMatch", "CSS_SubstringMatch", "CSS_FontFace", 
			"CSS_Supports", "CSS_Keyframes", "CSS_Viewport", "CSS_CounterStyle", 
			"CSS_FontFeatureValues", "CSS_DxImageTransform", "CSS_Variable", "CSS_Ident", 
			"CSS_Function_", "CSS_AtKeyword", "CSS_Dimension", "CSS_Plus", "CSS_Minus", 
			"CSS_Greater", "CSS_Comma", "CSS_Tilde", "CSS_PseudoNot", "CSS_UnexpectedCharacter", 
			"ATT_WS", "ATTCHARS", "HEXCHARS", "DECCHARS", "DOUBLE_QUOTE_START", "SINGLE_QUOTE_START", 
			"DQUOTE_TEXT", "DQUOTE_JINJA_START", "DQUOTE_JINJA_BLOCK_START", "DOUBLE_QUOTE_END", 
			"SQUOTE_TEXT", "SQUOTE_JINJA_START", "SQUOTE_JINJA_BLOCK_START", "SINGLE_QUOTE_END", 
			"JINJA_WS", "JINJA_NEWLINE", "JINJA_INT", "JINJA_DOUBLE", "JINJA_STRING", 
			"JINJA_TRUE", "JINJA_FALSE", "JINJA_BOOL", "JINJA_ADD", "JINJA_SUB", 
			"JINJA_MUL", "JINJA_DIV", "JINJA_NOT", "JINJA_EQ", "JINJA_NEQ", "JINJA_GT", 
			"JINJA_LT", "JINJA_GTEQ", "JINJA_LTEQ", "JINJA_LPAREN", "JINJA_RPAREN", 
			"JINJA_IF", "JINJA_ELIF", "JINJA_ELSE", "JINJA_ENDIF", "JINJA_WHILE", 
			"JINJA_ENDWHILE", "JINJA_SET", "JINJA_BLOCK_END", "JINJA_EXPR_END", "JINJA_SYMBOLS", 
			"JINJA_ID", "EQ", "VAR", "CALC"
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
	public String getGrammarFileName() { return "HTMLCSSJinjaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLCSSJinjaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
	 
		public HtmlDocumentContext() { }
		public void copyFrom(HtmlDocumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocContext extends HtmlDocumentContext {
		public List<ScriptletOrSeaWsContext> scriptletOrSeaWs() {
			return getRuleContexts(ScriptletOrSeaWsContext.class);
		}
		public ScriptletOrSeaWsContext scriptletOrSeaWs(int i) {
			return getRuleContext(ScriptletOrSeaWsContext.class,i);
		}
		public TerminalNode XML() { return getToken(HTMLCSSJinjaParser.XML, 0); }
		public TerminalNode DTD() { return getToken(HTMLCSSJinjaParser.DTD, 0); }
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocContext(HtmlDocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			_localctx = new HtmlDocContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(222);
				match(XML);
				}
			}

			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(231);
				match(DTD);
				}
			}

			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1990L) != 0)) {
				{
				{
				setState(240);
				htmlElements();
				}
				}
				setState(245);
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
	public static class ScriptletOrSeaWsContext extends ParserRuleContext {
		public ScriptletOrSeaWsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptletOrSeaWs; }
	 
		public ScriptletOrSeaWsContext() { }
		public void copyFrom(ScriptletOrSeaWsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScrContext extends ScriptletOrSeaWsContext {
		public TerminalNode SCRIPTLET() { return getToken(HTMLCSSJinjaParser.SCRIPTLET, 0); }
		public ScrContext(ScriptletOrSeaWsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterScr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitScr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitScr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WsContext extends ScriptletOrSeaWsContext {
		public TerminalNode SEA_WS() { return getToken(HTMLCSSJinjaParser.SEA_WS, 0); }
		public WsContext(ScriptletOrSeaWsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletOrSeaWsContext scriptletOrSeaWs() throws RecognitionException {
		ScriptletOrSeaWsContext _localctx = new ScriptletOrSeaWsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptletOrSeaWs);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCRIPTLET:
				_localctx = new ScrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(SCRIPTLET);
				}
				break;
			case SEA_WS:
				_localctx = new WsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(SEA_WS);
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
	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
	 
		public HtmlElementsContext() { }
		public void copyFrom(HtmlElementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElemsContext extends HtmlElementsContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HTMLCSSJinjaParser.EOF, 0); }
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElemsContext(HtmlElementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlElems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlElems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlElems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElements);
		int _la;
		try {
			_localctx = new HtmlElemsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134L) != 0)) {
				{
				{
				setState(250);
				htmlMisc();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			htmlElement();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134L) != 0)) {
				{
				{
				setState(257);
				htmlMisc();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlScriptContext extends HtmlElementContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public HtmlScriptContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlScript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlStyleContext extends HtmlElementContext {
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public HtmlStyleContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlScriptletContext extends HtmlElementContext {
		public TerminalNode SCRIPTLET() { return getToken(HTMLCSSJinjaParser.SCRIPTLET, 0); }
		public HtmlScriptletContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlScriptlet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlScriptlet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlScriptlet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNormalTagContext extends HtmlElementContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(HTMLCSSJinjaParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HTMLCSSJinjaParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(HTMLCSSJinjaParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HTMLCSSJinjaParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLCSSJinjaParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLCSSJinjaParser.TAG_CLOSE, i);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(HTMLCSSJinjaParser.TAG_SLASH, 0); }
		public HtmlNormalTagContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlNormalTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlNormalTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlNormalTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfClosingContext extends HtmlElementContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLCSSJinjaParser.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(HTMLCSSJinjaParser.TAG_NAME, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLCSSJinjaParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlSelfClosingContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlElement);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new HtmlNormalTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(TAG_OPEN);
				setState(266);
				match(TAG_NAME);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(267);
					htmlAttribute();
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273);
				match(TAG_CLOSE);
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(274);
					htmlContent();
					setState(275);
					match(TAG_OPEN);
					setState(276);
					match(TAG_SLASH);
					setState(277);
					match(TAG_NAME);
					setState(278);
					match(TAG_CLOSE);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new HtmlSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(TAG_OPEN);
				setState(283);
				match(TAG_NAME);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(284);
					htmlAttribute();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(290);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case 3:
				_localctx = new HtmlScriptletContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(SCRIPTLET);
				}
				break;
			case 4:
				_localctx = new HtmlScriptContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				script();
				}
				break;
			case 5:
				_localctx = new HtmlStyleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				style();
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
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	 
		public HtmlContentContext() { }
		public void copyFrom(HtmlContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentRuleContext extends HtmlContentContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(HTMLCSSJinjaParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(HTMLCSSJinjaParser.CDATA, i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public List<Jinja_blockContext> jinja_block() {
			return getRuleContexts(Jinja_blockContext.class);
		}
		public Jinja_blockContext jinja_block(int i) {
			return getRuleContext(Jinja_blockContext.class,i);
		}
		public List<Jinja_expressionContext> jinja_expression() {
			return getRuleContexts(Jinja_expressionContext.class);
		}
		public Jinja_expressionContext jinja_expression(int i) {
			return getRuleContext(Jinja_expressionContext.class,i);
		}
		public HtmlContentRuleContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlContentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlContentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlContentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			_localctx = new HtmlContentRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==HTML_TEXT) {
				{
				setState(296);
				htmlChardata();
				}
			}

			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(299);
						htmlElement();
						}
						break;
					case CDATA:
						{
						setState(300);
						match(CDATA);
						}
						break;
					case HTML_COMMENT:
					case HTML_CONDITIONAL_COMMENT:
						{
						setState(301);
						htmlComment();
						}
						break;
					case JINJA_BLOCK_START:
						{
						setState(302);
						jinja_block();
						}
						break;
					case JINJA_EXPR_START:
						{
						setState(303);
						jinja_expression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==HTML_TEXT) {
						{
						setState(306);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttrContext extends HtmlAttributeContext {
		public TerminalNode TAG_NAME() { return getToken(HTMLCSSJinjaParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(HTMLCSSJinjaParser.TAG_EQUALS, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public HtmlAttrContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlAttribute);
		int _la;
		try {
			_localctx = new HtmlAttrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(TAG_NAME);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(315);
				match(TAG_EQUALS);
				setState(316);
				attributeValue();
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
	public static class AttributeValueContext extends ParserRuleContext {
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
	 
		public AttributeValueContext() { }
		public void copyFrom(AttributeValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrDoubleContext extends AttributeValueContext {
		public TerminalNode DOUBLE_QUOTE_START() { return getToken(HTMLCSSJinjaParser.DOUBLE_QUOTE_START, 0); }
		public TerminalNode DOUBLE_QUOTE_END() { return getToken(HTMLCSSJinjaParser.DOUBLE_QUOTE_END, 0); }
		public TerminalNode ATT_WS() { return getToken(HTMLCSSJinjaParser.ATT_WS, 0); }
		public List<TerminalNode> DQUOTE_TEXT() { return getTokens(HTMLCSSJinjaParser.DQUOTE_TEXT); }
		public TerminalNode DQUOTE_TEXT(int i) {
			return getToken(HTMLCSSJinjaParser.DQUOTE_TEXT, i);
		}
		public List<TerminalNode> DQUOTE_JINJA_START() { return getTokens(HTMLCSSJinjaParser.DQUOTE_JINJA_START); }
		public TerminalNode DQUOTE_JINJA_START(int i) {
			return getToken(HTMLCSSJinjaParser.DQUOTE_JINJA_START, i);
		}
		public List<TerminalNode> JINJA_EXPR_END() { return getTokens(HTMLCSSJinjaParser.JINJA_EXPR_END); }
		public TerminalNode JINJA_EXPR_END(int i) {
			return getToken(HTMLCSSJinjaParser.JINJA_EXPR_END, i);
		}
		public List<TerminalNode> DQUOTE_JINJA_BLOCK_START() { return getTokens(HTMLCSSJinjaParser.DQUOTE_JINJA_BLOCK_START); }
		public TerminalNode DQUOTE_JINJA_BLOCK_START(int i) {
			return getToken(HTMLCSSJinjaParser.DQUOTE_JINJA_BLOCK_START, i);
		}
		public List<Jinja_block_contentContext> jinja_block_content() {
			return getRuleContexts(Jinja_block_contentContext.class);
		}
		public Jinja_block_contentContext jinja_block_content(int i) {
			return getRuleContext(Jinja_block_contentContext.class,i);
		}
		public List<TerminalNode> JINJA_BLOCK_END() { return getTokens(HTMLCSSJinjaParser.JINJA_BLOCK_END); }
		public TerminalNode JINJA_BLOCK_END(int i) {
			return getToken(HTMLCSSJinjaParser.JINJA_BLOCK_END, i);
		}
		public List<Jinja_expression_innerContext> jinja_expression_inner() {
			return getRuleContexts(Jinja_expression_innerContext.class);
		}
		public Jinja_expression_innerContext jinja_expression_inner(int i) {
			return getRuleContext(Jinja_expression_innerContext.class,i);
		}
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public AttrDoubleContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAttrDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAttrDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAttrDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrDecContext extends AttributeValueContext {
		public TerminalNode DECCHARS() { return getToken(HTMLCSSJinjaParser.DECCHARS, 0); }
		public TerminalNode ATT_WS() { return getToken(HTMLCSSJinjaParser.ATT_WS, 0); }
		public AttrDecContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAttrDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAttrDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAttrDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrSingleContext extends AttributeValueContext {
		public TerminalNode SINGLE_QUOTE_START() { return getToken(HTMLCSSJinjaParser.SINGLE_QUOTE_START, 0); }
		public TerminalNode SINGLE_QUOTE_END() { return getToken(HTMLCSSJinjaParser.SINGLE_QUOTE_END, 0); }
		public TerminalNode ATT_WS() { return getToken(HTMLCSSJinjaParser.ATT_WS, 0); }
		public List<TerminalNode> SQUOTE_TEXT() { return getTokens(HTMLCSSJinjaParser.SQUOTE_TEXT); }
		public TerminalNode SQUOTE_TEXT(int i) {
			return getToken(HTMLCSSJinjaParser.SQUOTE_TEXT, i);
		}
		public List<TerminalNode> SQUOTE_JINJA_START() { return getTokens(HTMLCSSJinjaParser.SQUOTE_JINJA_START); }
		public TerminalNode SQUOTE_JINJA_START(int i) {
			return getToken(HTMLCSSJinjaParser.SQUOTE_JINJA_START, i);
		}
		public List<TerminalNode> JINJA_EXPR_END() { return getTokens(HTMLCSSJinjaParser.JINJA_EXPR_END); }
		public TerminalNode JINJA_EXPR_END(int i) {
			return getToken(HTMLCSSJinjaParser.JINJA_EXPR_END, i);
		}
		public List<TerminalNode> SQUOTE_JINJA_BLOCK_START() { return getTokens(HTMLCSSJinjaParser.SQUOTE_JINJA_BLOCK_START); }
		public TerminalNode SQUOTE_JINJA_BLOCK_START(int i) {
			return getToken(HTMLCSSJinjaParser.SQUOTE_JINJA_BLOCK_START, i);
		}
		public List<Jinja_block_contentContext> jinja_block_content() {
			return getRuleContexts(Jinja_block_contentContext.class);
		}
		public Jinja_block_contentContext jinja_block_content(int i) {
			return getRuleContext(Jinja_block_contentContext.class,i);
		}
		public List<TerminalNode> JINJA_BLOCK_END() { return getTokens(HTMLCSSJinjaParser.JINJA_BLOCK_END); }
		public TerminalNode JINJA_BLOCK_END(int i) {
			return getToken(HTMLCSSJinjaParser.JINJA_BLOCK_END, i);
		}
		public List<Jinja_expression_innerContext> jinja_expression_inner() {
			return getRuleContexts(Jinja_expression_innerContext.class);
		}
		public Jinja_expression_innerContext jinja_expression_inner(int i) {
			return getRuleContext(Jinja_expression_innerContext.class,i);
		}
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public AttrSingleContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAttrSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAttrSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAttrSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrHexContext extends AttributeValueContext {
		public TerminalNode HEXCHARS() { return getToken(HTMLCSSJinjaParser.HEXCHARS, 0); }
		public TerminalNode ATT_WS() { return getToken(HTMLCSSJinjaParser.ATT_WS, 0); }
		public AttrHexContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAttrHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAttrHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAttrHex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrCharsContext extends AttributeValueContext {
		public TerminalNode ATTCHARS() { return getToken(HTMLCSSJinjaParser.ATTCHARS, 0); }
		public TerminalNode ATT_WS() { return getToken(HTMLCSSJinjaParser.ATT_WS, 0); }
		public AttrCharsContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAttrChars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAttrChars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAttrChars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attributeValue);
		int _la;
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new AttrDoubleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATT_WS) {
					{
					setState(319);
					match(ATT_WS);
					}
				}

				setState(322);
				match(DOUBLE_QUOTE_START);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 7L) != 0)) {
					{
					setState(335);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DQUOTE_TEXT:
						{
						setState(323);
						match(DQUOTE_TEXT);
						}
						break;
					case DQUOTE_JINJA_START:
						{
						setState(324);
						match(DQUOTE_JINJA_START);
						setState(327);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(325);
							jinja_expression_inner(0);
							}
							break;
						case 2:
							{
							setState(326);
							boolean_expression();
							}
							break;
						}
						setState(329);
						match(JINJA_EXPR_END);
						}
						break;
					case DQUOTE_JINJA_BLOCK_START:
						{
						setState(331);
						match(DQUOTE_JINJA_BLOCK_START);
						setState(332);
						jinja_block_content();
						setState(333);
						match(JINJA_BLOCK_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
				match(DOUBLE_QUOTE_END);
				}
				break;
			case 2:
				_localctx = new AttrSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATT_WS) {
					{
					setState(341);
					match(ATT_WS);
					}
				}

				setState(344);
				match(SINGLE_QUOTE_START);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 7L) != 0)) {
					{
					setState(357);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SQUOTE_TEXT:
						{
						setState(345);
						match(SQUOTE_TEXT);
						}
						break;
					case SQUOTE_JINJA_START:
						{
						setState(346);
						match(SQUOTE_JINJA_START);
						setState(349);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(347);
							jinja_expression_inner(0);
							}
							break;
						case 2:
							{
							setState(348);
							boolean_expression();
							}
							break;
						}
						setState(351);
						match(JINJA_EXPR_END);
						}
						break;
					case SQUOTE_JINJA_BLOCK_START:
						{
						setState(353);
						match(SQUOTE_JINJA_BLOCK_START);
						setState(354);
						jinja_block_content();
						setState(355);
						match(JINJA_BLOCK_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(362);
				match(SINGLE_QUOTE_END);
				}
				break;
			case 3:
				_localctx = new AttrCharsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATT_WS) {
					{
					setState(363);
					match(ATT_WS);
					}
				}

				setState(366);
				match(ATTCHARS);
				}
				break;
			case 4:
				_localctx = new AttrHexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATT_WS) {
					{
					setState(367);
					match(ATT_WS);
					}
				}

				setState(370);
				match(HEXCHARS);
				}
				break;
			case 5:
				_localctx = new AttrDecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATT_WS) {
					{
					setState(371);
					match(ATT_WS);
					}
				}

				setState(374);
				match(DECCHARS);
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
	public static class HtmlChardataContext extends ParserRuleContext {
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
	 
		public HtmlChardataContext() { }
		public void copyFrom(HtmlChardataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlWsContext extends HtmlChardataContext {
		public TerminalNode SEA_WS() { return getToken(HTMLCSSJinjaParser.SEA_WS, 0); }
		public HtmlWsContext(HtmlChardataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlWs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextContext extends HtmlChardataContext {
		public TerminalNode HTML_TEXT() { return getToken(HTMLCSSJinjaParser.HTML_TEXT, 0); }
		public HtmlTextContext(HtmlChardataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlChardata);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
				_localctx = new HtmlTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(HTML_TEXT);
				}
				break;
			case SEA_WS:
				_localctx = new HtmlWsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(SEA_WS);
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
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
	 
		public HtmlMiscContext() { }
		public void copyFrom(HtmlMiscContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentMiscContext extends HtmlMiscContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public HtmlCommentMiscContext(HtmlMiscContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlCommentMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlCommentMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlCommentMisc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlMiscWsContext extends HtmlMiscContext {
		public TerminalNode SEA_WS() { return getToken(HTMLCSSJinjaParser.SEA_WS, 0); }
		public HtmlMiscWsContext(HtmlMiscContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlMiscWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlMiscWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlMiscWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlMisc);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				_localctx = new HtmlCommentMiscContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				htmlComment();
				}
				break;
			case SEA_WS:
				_localctx = new HtmlMiscWsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(SEA_WS);
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
	public static class HtmlCommentContext extends ParserRuleContext {
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
	 
		public HtmlCommentContext() { }
		public void copyFrom(HtmlCommentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentConditionalContext extends HtmlCommentContext {
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(HTMLCSSJinjaParser.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentConditionalContext(HtmlCommentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlCommentConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlCommentConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlCommentConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentNormalContext extends HtmlCommentContext {
		public TerminalNode HTML_COMMENT() { return getToken(HTMLCSSJinjaParser.HTML_COMMENT, 0); }
		public HtmlCommentNormalContext(HtmlCommentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHtmlCommentNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHtmlCommentNormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHtmlCommentNormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlComment);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				_localctx = new HtmlCommentNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(HTML_COMMENT);
				}
				break;
			case HTML_CONDITIONAL_COMMENT:
				_localctx = new HtmlCommentConditionalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(HTML_CONDITIONAL_COMMENT);
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
	public static class ScriptContext extends ParserRuleContext {
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	 
		public ScriptContext() { }
		public void copyFrom(ScriptContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptTagContext extends ScriptContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(HTMLCSSJinjaParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(HTMLCSSJinjaParser.SCRIPT_BODY, 0); }
		public TerminalNode SCRIPT_SHORT_BODY() { return getToken(HTMLCSSJinjaParser.SCRIPT_SHORT_BODY, 0); }
		public ScriptTagContext(ScriptContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterScriptTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitScriptTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitScriptTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_script);
		int _la;
		try {
			_localctx = new ScriptTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(SCRIPT_OPEN);
			setState(390);
			_la = _input.LA(1);
			if ( !(_la==SCRIPT_BODY || _la==SCRIPT_SHORT_BODY) ) {
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
	public static class StyleContext extends ParserRuleContext {
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
	 
		public StyleContext() { }
		public void copyFrom(StyleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleTagContext extends StyleContext {
		public TerminalNode STYLE_OPEN() { return getToken(HTMLCSSJinjaParser.STYLE_OPEN, 0); }
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public TerminalNode CSS_STYLE_CLOSE() { return getToken(HTMLCSSJinjaParser.CSS_STYLE_CLOSE, 0); }
		public StyleTagContext(StyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterStyleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitStyleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitStyleTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_style);
		try {
			_localctx = new StyleTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(STYLE_OPEN);
			setState(393);
			stylesheet();
			setState(394);
			match(CSS_STYLE_CLOSE);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtBlockContext extends StatementContext {
		public Jinja_blockContext jinja_block() {
			return getRuleContext(Jinja_blockContext.class,0);
		}
		public StmtBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitStmtBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitStmtBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtExprContext extends StatementContext {
		public Jinja_expressionContext jinja_expression() {
			return getRuleContext(Jinja_expressionContext.class,0);
		}
		public StmtExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterStmtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitStmtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitStmtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtWhileContext extends StatementContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public StmtWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterStmtWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitStmtWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitStmtWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIfContext extends StatementContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public StmtIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAssignContext extends StatementContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public StmtAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterStmtAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitStmtAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitStmtAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_EXPR_START:
				_localctx = new StmtExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				jinja_expression();
				}
				break;
			case JINJA_BLOCK_START:
				_localctx = new StmtBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				jinja_block();
				}
				break;
			case JINJA_SET:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				assignment_statement();
				}
				break;
			case JINJA_IF:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				if_statement();
				}
				break;
			case JINJA_WHILE:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				while_statement();
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
	public static class Jinja_blockContext extends ParserRuleContext {
		public Jinja_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_block; }
	 
		public Jinja_blockContext() { }
		public void copyFrom(Jinja_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockContext extends Jinja_blockContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(HTMLCSSJinjaParser.JINJA_BLOCK_START, 0); }
		public Jinja_block_contentContext jinja_block_content() {
			return getRuleContext(Jinja_block_contentContext.class,0);
		}
		public TerminalNode JINJA_BLOCK_END() { return getToken(HTMLCSSJinjaParser.JINJA_BLOCK_END, 0); }
		public TerminalNode JINJA_NEWLINE() { return getToken(HTMLCSSJinjaParser.JINJA_NEWLINE, 0); }
		public JinjaBlockContext(Jinja_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_blockContext jinja_block() throws RecognitionException {
		Jinja_blockContext _localctx = new Jinja_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jinja_block);
		try {
			_localctx = new JinjaBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(JINJA_BLOCK_START);
			setState(404);
			jinja_block_content();
			setState(405);
			match(JINJA_BLOCK_END);
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(406);
				match(JINJA_NEWLINE);
				}
				break;
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
	public static class Jinja_block_contentContext extends ParserRuleContext {
		public Jinja_block_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_block_content; }
	 
		public Jinja_block_contentContext() { }
		public void copyFrom(Jinja_block_contentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlkAssignContext extends Jinja_block_contentContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public BlkAssignContext(Jinja_block_contentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBlkAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBlkAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBlkAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlkWhileContext extends Jinja_block_contentContext {
		public While_fragmentContext while_fragment() {
			return getRuleContext(While_fragmentContext.class,0);
		}
		public BlkWhileContext(Jinja_block_contentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBlkWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBlkWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBlkWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlkElifContext extends Jinja_block_contentContext {
		public Elif_fragmentContext elif_fragment() {
			return getRuleContext(Elif_fragmentContext.class,0);
		}
		public BlkElifContext(Jinja_block_contentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBlkElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBlkElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBlkElif(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlkEndWhileContext extends Jinja_block_contentContext {
		public Endwhile_fragmentContext endwhile_fragment() {
			return getRuleContext(Endwhile_fragmentContext.class,0);
		}
		public BlkEndWhileContext(Jinja_block_contentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBlkEndWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBlkEndWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBlkEndWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlkElseContext extends Jinja_block_contentContext {
		public Else_fragmentContext else_fragment() {
			return getRuleContext(Else_fragmentContext.class,0);
		}
		public BlkElseContext(Jinja_block_contentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBlkElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBlkElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBlkElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlkIfContext extends Jinja_block_contentContext {
		public If_fragmentContext if_fragment() {
			return getRuleContext(If_fragmentContext.class,0);
		}
		public BlkIfContext(Jinja_block_contentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBlkIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBlkIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBlkIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlkEndIfContext extends Jinja_block_contentContext {
		public Endif_fragmentContext endif_fragment() {
			return getRuleContext(Endif_fragmentContext.class,0);
		}
		public BlkEndIfContext(Jinja_block_contentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBlkEndIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBlkEndIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBlkEndIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_block_contentContext jinja_block_content() throws RecognitionException {
		Jinja_block_contentContext _localctx = new Jinja_block_contentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jinja_block_content);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_IF:
				_localctx = new BlkIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				if_fragment();
				}
				break;
			case JINJA_ELIF:
				_localctx = new BlkElifContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				elif_fragment();
				}
				break;
			case JINJA_ELSE:
				_localctx = new BlkElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				else_fragment();
				}
				break;
			case JINJA_ENDIF:
				_localctx = new BlkEndIfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
				endif_fragment();
				}
				break;
			case JINJA_WHILE:
				_localctx = new BlkWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				while_fragment();
				}
				break;
			case JINJA_ENDWHILE:
				_localctx = new BlkEndWhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(414);
				endwhile_fragment();
				}
				break;
			case JINJA_SET:
				_localctx = new BlkAssignContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(415);
				assignment_statement();
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
	public static class Assignment_statementContext extends ParserRuleContext {
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	 
		public Assignment_statementContext() { }
		public void copyFrom(Assignment_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends Assignment_statementContext {
		public TerminalNode JINJA_SET() { return getToken(HTMLCSSJinjaParser.JINJA_SET, 0); }
		public TerminalNode JINJA_LPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_LPAREN, 0); }
		public TerminalNode JINJA_ID() { return getToken(HTMLCSSJinjaParser.JINJA_ID, 0); }
		public TerminalNode EQ() { return getToken(HTMLCSSJinjaParser.EQ, 0); }
		public Jinja_expression_innerContext jinja_expression_inner() {
			return getRuleContext(Jinja_expression_innerContext.class,0);
		}
		public TerminalNode JINJA_RPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_RPAREN, 0); }
		public AssignStmtContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_statement);
		try {
			_localctx = new AssignStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(JINJA_SET);
			setState(419);
			match(JINJA_LPAREN);
			setState(420);
			match(JINJA_ID);
			setState(421);
			match(EQ);
			setState(422);
			jinja_expression_inner(0);
			setState(423);
			match(JINJA_RPAREN);
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
	public static class Jinja_expressionContext extends ParserRuleContext {
		public Jinja_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_expression; }
	 
		public Jinja_expressionContext() { }
		public void copyFrom(Jinja_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprContext extends Jinja_expressionContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(HTMLCSSJinjaParser.JINJA_EXPR_START, 0); }
		public TerminalNode JINJA_EXPR_END() { return getToken(HTMLCSSJinjaParser.JINJA_EXPR_END, 0); }
		public Jinja_expression_innerContext jinja_expression_inner() {
			return getRuleContext(Jinja_expression_innerContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public JinjaExprContext(Jinja_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterJinjaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitJinjaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitJinjaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_expressionContext jinja_expression() throws RecognitionException {
		Jinja_expressionContext _localctx = new Jinja_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinja_expression);
		try {
			_localctx = new JinjaExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(JINJA_EXPR_START);
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(426);
				jinja_expression_inner(0);
				}
				break;
			case 2:
				{
				setState(427);
				boolean_expression();
				}
				break;
			}
			setState(430);
			match(JINJA_EXPR_END);
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
	public static class Jinja_expression_innerContext extends ParserRuleContext {
		public Jinja_expression_innerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_expression_inner; }
	 
		public Jinja_expression_innerContext() { }
		public void copyFrom(Jinja_expression_innerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqIntContext extends Jinja_expression_innerContext {
		public TerminalNode JINJA_INT() { return getToken(HTMLCSSJinjaParser.JINJA_INT, 0); }
		public EqIntContext(Jinja_expression_innerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterEqInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitEqInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitEqInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqDblContext extends Jinja_expression_innerContext {
		public TerminalNode JINJA_DOUBLE() { return getToken(HTMLCSSJinjaParser.JINJA_DOUBLE, 0); }
		public EqDblContext(Jinja_expression_innerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterEqDbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitEqDbl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitEqDbl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqParContext extends Jinja_expression_innerContext {
		public TerminalNode JINJA_LPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_LPAREN, 0); }
		public Jinja_expression_innerContext jinja_expression_inner() {
			return getRuleContext(Jinja_expression_innerContext.class,0);
		}
		public TerminalNode JINJA_RPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_RPAREN, 0); }
		public EqParContext(Jinja_expression_innerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterEqPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitEqPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitEqPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqStrContext extends Jinja_expression_innerContext {
		public TerminalNode JINJA_STRING() { return getToken(HTMLCSSJinjaParser.JINJA_STRING, 0); }
		public EqStrContext(Jinja_expression_innerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterEqStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitEqStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitEqStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqAddContext extends Jinja_expression_innerContext {
		public Jinja_expression_innerContext left;
		public Token operator;
		public Jinja_expression_innerContext right;
		public List<Jinja_expression_innerContext> jinja_expression_inner() {
			return getRuleContexts(Jinja_expression_innerContext.class);
		}
		public Jinja_expression_innerContext jinja_expression_inner(int i) {
			return getRuleContext(Jinja_expression_innerContext.class,i);
		}
		public TerminalNode JINJA_ADD() { return getToken(HTMLCSSJinjaParser.JINJA_ADD, 0); }
		public TerminalNode JINJA_SUB() { return getToken(HTMLCSSJinjaParser.JINJA_SUB, 0); }
		public EqAddContext(Jinja_expression_innerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterEqAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitEqAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitEqAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqVarContext extends Jinja_expression_innerContext {
		public TerminalNode JINJA_ID() { return getToken(HTMLCSSJinjaParser.JINJA_ID, 0); }
		public EqVarContext(Jinja_expression_innerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterEqVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitEqVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitEqVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqMULContext extends Jinja_expression_innerContext {
		public Jinja_expression_innerContext left;
		public Token operator;
		public Jinja_expression_innerContext right;
		public List<Jinja_expression_innerContext> jinja_expression_inner() {
			return getRuleContexts(Jinja_expression_innerContext.class);
		}
		public Jinja_expression_innerContext jinja_expression_inner(int i) {
			return getRuleContext(Jinja_expression_innerContext.class,i);
		}
		public TerminalNode JINJA_MUL() { return getToken(HTMLCSSJinjaParser.JINJA_MUL, 0); }
		public TerminalNode JINJA_DIV() { return getToken(HTMLCSSJinjaParser.JINJA_DIV, 0); }
		public EqMULContext(Jinja_expression_innerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterEqMUL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitEqMUL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitEqMUL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_expression_innerContext jinja_expression_inner() throws RecognitionException {
		return jinja_expression_inner(0);
	}

	private Jinja_expression_innerContext jinja_expression_inner(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Jinja_expression_innerContext _localctx = new Jinja_expression_innerContext(_ctx, _parentState);
		Jinja_expression_innerContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_jinja_expression_inner, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_LPAREN:
				{
				_localctx = new EqParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(433);
				match(JINJA_LPAREN);
				setState(434);
				jinja_expression_inner(0);
				setState(435);
				match(JINJA_RPAREN);
				}
				break;
			case JINJA_DOUBLE:
				{
				_localctx = new EqDblContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(437);
				match(JINJA_DOUBLE);
				}
				break;
			case JINJA_INT:
				{
				_localctx = new EqIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(438);
				match(JINJA_INT);
				}
				break;
			case JINJA_STRING:
				{
				_localctx = new EqStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(439);
				match(JINJA_STRING);
				}
				break;
			case JINJA_ID:
				{
				_localctx = new EqVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(440);
				match(JINJA_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(449);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new EqMULContext(new Jinja_expression_innerContext(_parentctx, _parentState));
						((EqMULContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_jinja_expression_inner);
						setState(443);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(444);
						((EqMULContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==JINJA_MUL || _la==JINJA_DIV) ) {
							((EqMULContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(445);
						((EqMULContext)_localctx).right = jinja_expression_inner(7);
						}
						break;
					case 2:
						{
						_localctx = new EqAddContext(new Jinja_expression_innerContext(_parentctx, _parentState));
						((EqAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_jinja_expression_inner);
						setState(446);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(447);
						((EqAddContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==JINJA_ADD || _la==JINJA_SUB) ) {
							((EqAddContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(448);
						((EqAddContext)_localctx).right = jinja_expression_inner(6);
						}
						break;
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
	public static class Boolean_expressionContext extends ParserRuleContext {
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
	 
		public Boolean_expressionContext() { }
		public void copyFrom(Boolean_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqBoolParContext extends Boolean_expressionContext {
		public TerminalNode JINJA_LPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_LPAREN, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode JINJA_RPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_RPAREN, 0); }
		public EqBoolParContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterEqBoolPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitEqBoolPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitEqBoolPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqBoolContext extends Boolean_expressionContext {
		public TerminalNode JINJA_BOOL() { return getToken(HTMLCSSJinjaParser.JINJA_BOOL, 0); }
		public EqBoolContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterEqBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitEqBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitEqBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolEqContext extends Boolean_expressionContext {
		public Jinja_expression_innerContext left;
		public Token operator;
		public Jinja_expression_innerContext right;
		public List<Jinja_expression_innerContext> jinja_expression_inner() {
			return getRuleContexts(Jinja_expression_innerContext.class);
		}
		public Jinja_expression_innerContext jinja_expression_inner(int i) {
			return getRuleContext(Jinja_expression_innerContext.class,i);
		}
		public TerminalNode JINJA_EQ() { return getToken(HTMLCSSJinjaParser.JINJA_EQ, 0); }
		public TerminalNode JINJA_NEQ() { return getToken(HTMLCSSJinjaParser.JINJA_NEQ, 0); }
		public BoolEqContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBoolEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBoolEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBoolEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationExprContext extends Boolean_expressionContext {
		public Jinja_expression_innerContext left;
		public Token operator;
		public Jinja_expression_innerContext right;
		public List<Jinja_expression_innerContext> jinja_expression_inner() {
			return getRuleContexts(Jinja_expression_innerContext.class);
		}
		public Jinja_expression_innerContext jinja_expression_inner(int i) {
			return getRuleContext(Jinja_expression_innerContext.class,i);
		}
		public TerminalNode JINJA_GT() { return getToken(HTMLCSSJinjaParser.JINJA_GT, 0); }
		public TerminalNode JINJA_GTEQ() { return getToken(HTMLCSSJinjaParser.JINJA_GTEQ, 0); }
		public TerminalNode JINJA_LT() { return getToken(HTMLCSSJinjaParser.JINJA_LT, 0); }
		public TerminalNode JINJA_LTEQ() { return getToken(HTMLCSSJinjaParser.JINJA_LTEQ, 0); }
		public RelationExprContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterRelationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitRelationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitRelationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolean_expression);
		int _la;
		try {
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new EqBoolParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(JINJA_LPAREN);
				setState(455);
				boolean_expression();
				setState(456);
				match(JINJA_RPAREN);
				}
				break;
			case 2:
				_localctx = new RelationExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				((RelationExprContext)_localctx).left = jinja_expression_inner(0);
				setState(459);
				((RelationExprContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 15L) != 0)) ) {
					((RelationExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(460);
				((RelationExprContext)_localctx).right = jinja_expression_inner(0);
				}
				break;
			case 3:
				_localctx = new BoolEqContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				((BoolEqContext)_localctx).left = jinja_expression_inner(0);
				setState(463);
				((BoolEqContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==JINJA_EQ || _la==JINJA_NEQ) ) {
					((BoolEqContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(464);
				((BoolEqContext)_localctx).right = jinja_expression_inner(0);
				}
				break;
			case 4:
				_localctx = new EqBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(JINJA_BOOL);
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
	public static class If_statementContext extends ParserRuleContext {
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends If_statementContext {
		public If_fragmentContext if_fragment() {
			return getRuleContext(If_fragmentContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Endif_fragmentContext endif_fragment() {
			return getRuleContext(Endif_fragmentContext.class,0);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public IfStmtContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_statement);
		try {
			_localctx = new IfStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			if_fragment();
			setState(470);
			code_block();
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_ELIF:
				{
				setState(471);
				elif_statement();
				}
				break;
			case JINJA_ELSE:
				{
				setState(472);
				else_statement();
				}
				break;
			case JINJA_ENDIF:
				break;
			default:
				break;
			}
			setState(475);
			endif_fragment();
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
	public static class Elif_statementContext extends ParserRuleContext {
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
	 
		public Elif_statementContext() { }
		public void copyFrom(Elif_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElifStmtContext extends Elif_statementContext {
		public Elif_fragmentContext elif_fragment() {
			return getRuleContext(Elif_fragmentContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public ElifStmtContext(Elif_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterElifStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitElifStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitElifStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elif_statement);
		try {
			_localctx = new ElifStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			elif_fragment();
			setState(478);
			code_block();
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_ELIF:
				{
				setState(479);
				elif_statement();
				}
				break;
			case JINJA_ELSE:
				{
				setState(480);
				else_statement();
				}
				break;
			case JINJA_ENDIF:
				break;
			default:
				break;
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
	public static class Else_statementContext extends ParserRuleContext {
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	 
		public Else_statementContext() { }
		public void copyFrom(Else_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseStmtContext extends Else_statementContext {
		public Else_fragmentContext else_fragment() {
			return getRuleContext(Else_fragmentContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ElseStmtContext(Else_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_else_statement);
		try {
			_localctx = new ElseStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			else_fragment();
			setState(484);
			code_block();
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
	public static class If_fragmentContext extends ParserRuleContext {
		public If_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_fragment; }
	 
		public If_fragmentContext() { }
		public void copyFrom(If_fragmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfFrgContext extends If_fragmentContext {
		public TerminalNode JINJA_IF() { return getToken(HTMLCSSJinjaParser.JINJA_IF, 0); }
		public TerminalNode JINJA_LPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_LPAREN, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode JINJA_RPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_RPAREN, 0); }
		public TerminalNode JINJA_NEWLINE() { return getToken(HTMLCSSJinjaParser.JINJA_NEWLINE, 0); }
		public IfFrgContext(If_fragmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterIfFrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitIfFrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitIfFrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_fragmentContext if_fragment() throws RecognitionException {
		If_fragmentContext _localctx = new If_fragmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_fragment);
		try {
			_localctx = new IfFrgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(JINJA_IF);
			setState(487);
			match(JINJA_LPAREN);
			setState(488);
			boolean_expression();
			setState(489);
			match(JINJA_RPAREN);
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(490);
				match(JINJA_NEWLINE);
				}
				break;
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
	public static class Elif_fragmentContext extends ParserRuleContext {
		public Elif_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_fragment; }
	 
		public Elif_fragmentContext() { }
		public void copyFrom(Elif_fragmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElifFrgContext extends Elif_fragmentContext {
		public TerminalNode JINJA_ELIF() { return getToken(HTMLCSSJinjaParser.JINJA_ELIF, 0); }
		public TerminalNode JINJA_LPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_LPAREN, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode JINJA_RPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_RPAREN, 0); }
		public TerminalNode JINJA_NEWLINE() { return getToken(HTMLCSSJinjaParser.JINJA_NEWLINE, 0); }
		public ElifFrgContext(Elif_fragmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterElifFrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitElifFrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitElifFrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_fragmentContext elif_fragment() throws RecognitionException {
		Elif_fragmentContext _localctx = new Elif_fragmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elif_fragment);
		try {
			_localctx = new ElifFrgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(JINJA_ELIF);
			setState(494);
			match(JINJA_LPAREN);
			setState(495);
			boolean_expression();
			setState(496);
			match(JINJA_RPAREN);
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(497);
				match(JINJA_NEWLINE);
				}
				break;
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
	public static class Else_fragmentContext extends ParserRuleContext {
		public Else_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_fragment; }
	 
		public Else_fragmentContext() { }
		public void copyFrom(Else_fragmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseFrgContext extends Else_fragmentContext {
		public TerminalNode JINJA_ELSE() { return getToken(HTMLCSSJinjaParser.JINJA_ELSE, 0); }
		public TerminalNode JINJA_NEWLINE() { return getToken(HTMLCSSJinjaParser.JINJA_NEWLINE, 0); }
		public ElseFrgContext(Else_fragmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterElseFrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitElseFrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitElseFrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_fragmentContext else_fragment() throws RecognitionException {
		Else_fragmentContext _localctx = new Else_fragmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_else_fragment);
		try {
			_localctx = new ElseFrgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(JINJA_ELSE);
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(501);
				match(JINJA_NEWLINE);
				}
				break;
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
	public static class Endif_fragmentContext extends ParserRuleContext {
		public Endif_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif_fragment; }
	 
		public Endif_fragmentContext() { }
		public void copyFrom(Endif_fragmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EndifFrgContext extends Endif_fragmentContext {
		public TerminalNode JINJA_ENDIF() { return getToken(HTMLCSSJinjaParser.JINJA_ENDIF, 0); }
		public TerminalNode JINJA_NEWLINE() { return getToken(HTMLCSSJinjaParser.JINJA_NEWLINE, 0); }
		public EndifFrgContext(Endif_fragmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterEndifFrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitEndifFrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitEndifFrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endif_fragmentContext endif_fragment() throws RecognitionException {
		Endif_fragmentContext _localctx = new Endif_fragmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_endif_fragment);
		int _la;
		try {
			_localctx = new EndifFrgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(JINJA_ENDIF);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_NEWLINE) {
				{
				setState(505);
				match(JINJA_NEWLINE);
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
	public static class Code_blockContext extends ParserRuleContext {
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	 
		public Code_blockContext() { }
		public void copyFrom(Code_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeblockContext extends Code_blockContext {
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public List<TerminalNode> JINJA_NEWLINE() { return getTokens(HTMLCSSJinjaParser.JINJA_NEWLINE); }
		public TerminalNode JINJA_NEWLINE(int i) {
			return getToken(HTMLCSSJinjaParser.JINJA_NEWLINE, i);
		}
		public CodeblockContext(Code_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_code_block);
		int _la;
		try {
			_localctx = new CodeblockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(508);
				match(JINJA_NEWLINE);
				}
				break;
			}
			setState(511);
			htmlContent();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_NEWLINE) {
				{
				setState(512);
				match(JINJA_NEWLINE);
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
	public static class While_statementContext extends ParserRuleContext {
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	 
		public While_statementContext() { }
		public void copyFrom(While_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends While_statementContext {
		public While_fragmentContext while_fragment() {
			return getRuleContext(While_fragmentContext.class,0);
		}
		public Endwhile_fragmentContext endwhile_fragment() {
			return getRuleContext(Endwhile_fragmentContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStmtContext(While_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_while_statement);
		try {
			int _alt;
			_localctx = new WhileStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			while_fragment();
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(516);
					statement();
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(522);
			endwhile_fragment();
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
	public static class While_fragmentContext extends ParserRuleContext {
		public While_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_fragment; }
	 
		public While_fragmentContext() { }
		public void copyFrom(While_fragmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileFrgContext extends While_fragmentContext {
		public TerminalNode JINJA_WHILE() { return getToken(HTMLCSSJinjaParser.JINJA_WHILE, 0); }
		public TerminalNode JINJA_LPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_LPAREN, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode JINJA_RPAREN() { return getToken(HTMLCSSJinjaParser.JINJA_RPAREN, 0); }
		public TerminalNode JINJA_NEWLINE() { return getToken(HTMLCSSJinjaParser.JINJA_NEWLINE, 0); }
		public WhileFrgContext(While_fragmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterWhileFrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitWhileFrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitWhileFrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_fragmentContext while_fragment() throws RecognitionException {
		While_fragmentContext _localctx = new While_fragmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_while_fragment);
		int _la;
		try {
			_localctx = new WhileFrgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(JINJA_WHILE);
			setState(525);
			match(JINJA_LPAREN);
			setState(526);
			boolean_expression();
			setState(527);
			match(JINJA_RPAREN);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_NEWLINE) {
				{
				setState(528);
				match(JINJA_NEWLINE);
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
	public static class Endwhile_fragmentContext extends ParserRuleContext {
		public Endwhile_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endwhile_fragment; }
	 
		public Endwhile_fragmentContext() { }
		public void copyFrom(Endwhile_fragmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EndwhileFrgContext extends Endwhile_fragmentContext {
		public TerminalNode JINJA_ENDWHILE() { return getToken(HTMLCSSJinjaParser.JINJA_ENDWHILE, 0); }
		public TerminalNode JINJA_NEWLINE() { return getToken(HTMLCSSJinjaParser.JINJA_NEWLINE, 0); }
		public EndwhileFrgContext(Endwhile_fragmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterEndwhileFrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitEndwhileFrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitEndwhileFrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endwhile_fragmentContext endwhile_fragment() throws RecognitionException {
		Endwhile_fragmentContext _localctx = new Endwhile_fragmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_endwhile_fragment);
		int _la;
		try {
			_localctx = new EndwhileFrgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(JINJA_ENDWHILE);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_NEWLINE) {
				{
				setState(532);
				match(JINJA_NEWLINE);
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
	public static class StylesheetContext extends ParserRuleContext {
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
	 
		public StylesheetContext() { }
		public void copyFrom(StylesheetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetRuleContext extends StylesheetContext {
		public List<CharsetContext> charset() {
			return getRuleContexts(CharsetContext.class);
		}
		public CharsetContext charset(int i) {
			return getRuleContext(CharsetContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public StylesheetRuleContext(StylesheetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterStylesheetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitStylesheetRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitStylesheetRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stylesheet);
		try {
			int _alt;
			_localctx = new StylesheetRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(539);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(535);
						charset();
						}
						break;
					case 2:
						{
						setState(536);
						imports();
						}
						break;
					case 3:
						{
						setState(537);
						nestedStatement();
						}
						break;
					case 4:
						{
						setState(538);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
	public static class CharsetContext extends ParserRuleContext {
		public CharsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset; }
	 
		public CharsetContext() { }
		public void copyFrom(CharsetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadCharsetContext extends CharsetContext {
		public TerminalNode CSS_Charset() { return getToken(HTMLCSSJinjaParser.CSS_Charset, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_String_() { return getToken(HTMLCSSJinjaParser.CSS_String_, 0); }
		public BadCharsetContext(CharsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBadCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBadCharset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBadCharset(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodCharsetContext extends CharsetContext {
		public TerminalNode CSS_Charset() { return getToken(HTMLCSSJinjaParser.CSS_Charset, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_String_() { return getToken(HTMLCSSJinjaParser.CSS_String_, 0); }
		public TerminalNode CSS_SemiColon() { return getToken(HTMLCSSJinjaParser.CSS_SemiColon, 0); }
		public GoodCharsetContext(CharsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterGoodCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitGoodCharset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitGoodCharset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharsetContext charset() throws RecognitionException {
		CharsetContext _localctx = new CharsetContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_charset);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new GoodCharsetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(CSS_Charset);
				setState(545);
				css_ws();
				setState(546);
				match(CSS_String_);
				setState(547);
				css_ws();
				setState(548);
				match(CSS_SemiColon);
				setState(549);
				css_ws();
				}
				break;
			case 2:
				_localctx = new BadCharsetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(CSS_Charset);
				setState(552);
				css_ws();
				setState(553);
				match(CSS_String_);
				setState(554);
				css_ws();
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
	public static class ImportsContext extends ParserRuleContext {
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
	 
		public ImportsContext() { }
		public void copyFrom(ImportsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadImportContext extends ImportsContext {
		public TerminalNode CSS_Import() { return getToken(HTMLCSSJinjaParser.CSS_Import, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode CSS_String_() { return getToken(HTMLCSSJinjaParser.CSS_String_, 0); }
		public Css_urlContext css_url() {
			return getRuleContext(Css_urlContext.class,0);
		}
		public BadImportContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBadImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBadImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBadImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodImportContext extends ImportsContext {
		public TerminalNode CSS_Import() { return getToken(HTMLCSSJinjaParser.CSS_Import, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode CSS_SemiColon() { return getToken(HTMLCSSJinjaParser.CSS_SemiColon, 0); }
		public TerminalNode CSS_String_() { return getToken(HTMLCSSJinjaParser.CSS_String_, 0); }
		public Css_urlContext css_url() {
			return getRuleContext(Css_urlContext.class,0);
		}
		public GoodImportContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterGoodImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitGoodImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitGoodImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_imports);
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(CSS_Import);
				setState(559);
				css_ws();
				setState(562);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_String_:
					{
					setState(560);
					match(CSS_String_);
					}
					break;
				case CSS_Url_:
					{
					setState(561);
					css_url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(564);
				css_ws();
				setState(565);
				mediaQueryList();
				setState(566);
				match(CSS_SemiColon);
				setState(567);
				css_ws();
				}
				break;
			case 2:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				match(CSS_Import);
				setState(570);
				css_ws();
				setState(573);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_String_:
					{
					setState(571);
					match(CSS_String_);
					}
					break;
				case CSS_Url_:
					{
					setState(572);
					css_url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(575);
				css_ws();
				setState(576);
				match(CSS_SemiColon);
				setState(577);
				css_ws();
				}
				break;
			case 3:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				match(CSS_Import);
				setState(580);
				css_ws();
				setState(583);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_String_:
					{
					setState(581);
					match(CSS_String_);
					}
					break;
				case CSS_Url_:
					{
					setState(582);
					css_url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(585);
				css_ws();
				setState(586);
				mediaQueryList();
				}
				break;
			case 4:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(588);
				match(CSS_Import);
				setState(589);
				css_ws();
				setState(592);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_String_:
					{
					setState(590);
					match(CSS_String_);
					}
					break;
				case CSS_Url_:
					{
					setState(591);
					css_url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(594);
				css_ws();
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
	public static class Namespace_Context extends ParserRuleContext {
		public Namespace_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_; }
	 
		public Namespace_Context() { }
		public void copyFrom(Namespace_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodNamespaceContext extends Namespace_Context {
		public TerminalNode CSS_Namespace() { return getToken(HTMLCSSJinjaParser.CSS_Namespace, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_SemiColon() { return getToken(HTMLCSSJinjaParser.CSS_SemiColon, 0); }
		public TerminalNode CSS_String_() { return getToken(HTMLCSSJinjaParser.CSS_String_, 0); }
		public Css_urlContext css_url() {
			return getRuleContext(Css_urlContext.class,0);
		}
		public NamespacePrefixContext namespacePrefix() {
			return getRuleContext(NamespacePrefixContext.class,0);
		}
		public GoodNamespaceContext(Namespace_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterGoodNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitGoodNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitGoodNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadNamespaceContext extends Namespace_Context {
		public TerminalNode CSS_Namespace() { return getToken(HTMLCSSJinjaParser.CSS_Namespace, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_String_() { return getToken(HTMLCSSJinjaParser.CSS_String_, 0); }
		public Css_urlContext css_url() {
			return getRuleContext(Css_urlContext.class,0);
		}
		public NamespacePrefixContext namespacePrefix() {
			return getRuleContext(NamespacePrefixContext.class,0);
		}
		public BadNamespaceContext(Namespace_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBadNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBadNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBadNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_Context namespace_() throws RecognitionException {
		Namespace_Context _localctx = new Namespace_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_namespace_);
		int _la;
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new GoodNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(CSS_Namespace);
				setState(599);
				css_ws();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 524351L) != 0)) {
					{
					setState(600);
					namespacePrefix();
					setState(601);
					css_ws();
					}
				}

				setState(607);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_String_:
					{
					setState(605);
					match(CSS_String_);
					}
					break;
				case CSS_Url_:
					{
					setState(606);
					css_url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(609);
				css_ws();
				setState(610);
				match(CSS_SemiColon);
				setState(611);
				css_ws();
				}
				break;
			case 2:
				_localctx = new BadNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(CSS_Namespace);
				setState(614);
				css_ws();
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 524351L) != 0)) {
					{
					setState(615);
					namespacePrefix();
					setState(616);
					css_ws();
					}
				}

				setState(622);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_String_:
					{
					setState(620);
					match(CSS_String_);
					}
					break;
				case CSS_Url_:
					{
					setState(621);
					css_url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(624);
				css_ws();
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
	public static class NamespacePrefixContext extends ParserRuleContext {
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public NamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNamespacePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNamespacePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacePrefixContext namespacePrefix() throws RecognitionException {
		NamespacePrefixContext _localctx = new NamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_namespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			css_ident();
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
	public static class MediaContext extends ParserRuleContext {
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
	 
		public MediaContext() { }
		public void copyFrom(MediaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaRuleContext extends MediaContext {
		public TerminalNode CSS_Media() { return getToken(HTMLCSSJinjaParser.CSS_Media, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public GroupRuleBodyContext groupRuleBody() {
			return getRuleContext(GroupRuleBodyContext.class,0);
		}
		public MediaRuleContext(MediaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterMediaRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitMediaRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitMediaRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_media);
		try {
			_localctx = new MediaRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(CSS_Media);
			setState(631);
			css_ws();
			setState(632);
			mediaQueryList();
			setState(633);
			groupRuleBody();
			setState(634);
			css_ws();
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
	public static class MediaQueryListContext extends ParserRuleContext {
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
	 
		public MediaQueryListContext() { }
		public void copyFrom(MediaQueryListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaQueryListRuleContext extends MediaQueryListContext {
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<MediaQueryContext> mediaQuery() {
			return getRuleContexts(MediaQueryContext.class);
		}
		public MediaQueryContext mediaQuery(int i) {
			return getRuleContext(MediaQueryContext.class,i);
		}
		public List<TerminalNode> CSS_Comma() { return getTokens(HTMLCSSJinjaParser.CSS_Comma); }
		public TerminalNode CSS_Comma(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Comma, i);
		}
		public MediaQueryListRuleContext(MediaQueryListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterMediaQueryListRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitMediaQueryListRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitMediaQueryListRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mediaQueryList);
		try {
			int _alt;
			_localctx = new MediaQueryListRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(636);
				mediaQuery();
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(637);
						match(CSS_Comma);
						setState(638);
						css_ws();
						setState(639);
						mediaQuery();
						}
						} 
					}
					setState(645);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			}
			setState(648);
			css_ws();
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
	public static class MediaQueryContext extends ParserRuleContext {
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
	 
		public MediaQueryContext() { }
		public void copyFrom(MediaQueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaTypeQueryContext extends MediaQueryContext {
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public MediaTypeContext mediaType() {
			return getRuleContext(MediaTypeContext.class,0);
		}
		public List<TerminalNode> CSS_And() { return getTokens(HTMLCSSJinjaParser.CSS_And); }
		public TerminalNode CSS_And(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_And, i);
		}
		public List<MediaExpressionContext> mediaExpression() {
			return getRuleContexts(MediaExpressionContext.class);
		}
		public MediaExpressionContext mediaExpression(int i) {
			return getRuleContext(MediaExpressionContext.class,i);
		}
		public TerminalNode CSS_MediaOnly() { return getToken(HTMLCSSJinjaParser.CSS_MediaOnly, 0); }
		public TerminalNode CSS_Not() { return getToken(HTMLCSSJinjaParser.CSS_Not, 0); }
		public MediaTypeQueryContext(MediaQueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterMediaTypeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitMediaTypeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitMediaTypeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaExprQueryContext extends MediaQueryContext {
		public List<MediaExpressionContext> mediaExpression() {
			return getRuleContexts(MediaExpressionContext.class);
		}
		public MediaExpressionContext mediaExpression(int i) {
			return getRuleContext(MediaExpressionContext.class,i);
		}
		public List<TerminalNode> CSS_And() { return getTokens(HTMLCSSJinjaParser.CSS_And); }
		public TerminalNode CSS_And(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_And, i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public MediaExprQueryContext(MediaQueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterMediaExprQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitMediaExprQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitMediaExprQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mediaQuery);
		int _la;
		try {
			int _alt;
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_Comment:
			case CSS_Space:
			case CSS_MediaOnly:
			case CSS_Not:
			case CSS_And:
			case CSS_Or:
			case CSS_From:
			case CSS_To:
			case CSS_Ident:
				_localctx = new MediaTypeQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(650);
					_la = _input.LA(1);
					if ( !(_la==CSS_MediaOnly || _la==CSS_Not) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(653);
				css_ws();
				setState(654);
				mediaType();
				setState(655);
				css_ws();
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(656);
						match(CSS_And);
						setState(657);
						css_ws();
						setState(658);
						mediaExpression();
						}
						} 
					}
					setState(664);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				}
				break;
			case CSS_OpenParen:
				_localctx = new MediaExprQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				mediaExpression();
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(666);
						match(CSS_And);
						setState(667);
						css_ws();
						setState(668);
						mediaExpression();
						}
						} 
					}
					setState(674);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
	public static class MediaTypeContext extends ParserRuleContext {
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public MediaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterMediaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitMediaType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitMediaType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaTypeContext mediaType() throws RecognitionException {
		MediaTypeContext _localctx = new MediaTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mediaType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			css_ident();
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
	public static class MediaExpressionContext extends ParserRuleContext {
		public TerminalNode CSS_OpenParen() { return getToken(HTMLCSSJinjaParser.CSS_OpenParen, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public MediaFeatureContext mediaFeature() {
			return getRuleContext(MediaFeatureContext.class,0);
		}
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public TerminalNode CSS_Colon() { return getToken(HTMLCSSJinjaParser.CSS_Colon, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MediaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterMediaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitMediaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitMediaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaExpressionContext mediaExpression() throws RecognitionException {
		MediaExpressionContext _localctx = new MediaExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_mediaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(CSS_OpenParen);
			setState(680);
			css_ws();
			setState(681);
			mediaFeature();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_Colon) {
				{
				setState(682);
				match(CSS_Colon);
				setState(683);
				css_ws();
				setState(684);
				expr();
				}
			}

			setState(688);
			match(CSS_CloseParen);
			setState(689);
			css_ws();
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
	public static class MediaFeatureContext extends ParserRuleContext {
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public MediaFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterMediaFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitMediaFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitMediaFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaFeatureContext mediaFeature() throws RecognitionException {
		MediaFeatureContext _localctx = new MediaFeatureContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_mediaFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			css_ident();
			setState(692);
			css_ws();
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
	public static class PageContext extends ParserRuleContext {
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
	 
		public PageContext() { }
		public void copyFrom(PageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PageRuleContext extends PageContext {
		public TerminalNode CSS_Page() { return getToken(HTMLCSSJinjaParser.CSS_Page, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public PseudoPageContext pseudoPage() {
			return getRuleContext(PseudoPageContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> CSS_SemiColon() { return getTokens(HTMLCSSJinjaParser.CSS_SemiColon); }
		public TerminalNode CSS_SemiColon(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_SemiColon, i);
		}
		public PageRuleContext(PageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterPageRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitPageRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitPageRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_page);
		int _la;
		try {
			_localctx = new PageRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(CSS_Page);
			setState(695);
			css_ws();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_Colon) {
				{
				setState(696);
				pseudoPage();
				}
			}

			setState(699);
			match(CSS_OpenBrace);
			setState(700);
			css_ws();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 824699781129L) != 0)) {
				{
				setState(701);
				declaration();
				}
			}

			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_SemiColon) {
				{
				{
				setState(704);
				match(CSS_SemiColon);
				setState(705);
				css_ws();
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 824699781129L) != 0)) {
					{
					setState(706);
					declaration();
					}
				}

				}
				}
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(714);
			match(CSS_CloseBrace);
			setState(715);
			css_ws();
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
	public static class PseudoPageContext extends ParserRuleContext {
		public TerminalNode CSS_Colon() { return getToken(HTMLCSSJinjaParser.CSS_Colon, 0); }
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public PseudoPageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoPage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterPseudoPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitPseudoPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitPseudoPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoPageContext pseudoPage() throws RecognitionException {
		PseudoPageContext _localctx = new PseudoPageContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_pseudoPage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(CSS_Colon);
			setState(718);
			css_ident();
			setState(719);
			css_ws();
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
	public static class SelectorGroupContext extends ParserRuleContext {
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
	 
		public SelectorGroupContext() { }
		public void copyFrom(SelectorGroupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorGroupRuleContext extends SelectorGroupContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> CSS_Comma() { return getTokens(HTMLCSSJinjaParser.CSS_Comma); }
		public TerminalNode CSS_Comma(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Comma, i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public SelectorGroupRuleContext(SelectorGroupContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSelectorGroupRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSelectorGroupRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSelectorGroupRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_selectorGroup);
		int _la;
		try {
			_localctx = new SelectorGroupRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			selector();
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Comma) {
				{
				{
				setState(722);
				match(CSS_Comma);
				setState(723);
				css_ws();
				setState(724);
				selector();
				}
				}
				setState(730);
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
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorRuleContext extends SelectorContext {
		public List<SimpleSelectorSequenceContext> simpleSelectorSequence() {
			return getRuleContexts(SimpleSelectorSequenceContext.class);
		}
		public SimpleSelectorSequenceContext simpleSelectorSequence(int i) {
			return getRuleContext(SimpleSelectorSequenceContext.class,i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public SelectorRuleContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSelectorRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSelectorRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSelectorRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_selector);
		int _la;
		try {
			_localctx = new SelectorRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			simpleSelectorSequence();
			setState(732);
			css_ws();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 5772436045825L) != 0)) {
				{
				{
				setState(733);
				combinator();
				setState(734);
				simpleSelectorSequence();
				setState(735);
				css_ws();
				}
				}
				setState(741);
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
	public static class CombinatorContext extends ParserRuleContext {
		public TerminalNode CSS_Plus() { return getToken(HTMLCSSJinjaParser.CSS_Plus, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public TerminalNode CSS_Greater() { return getToken(HTMLCSSJinjaParser.CSS_Greater, 0); }
		public TerminalNode CSS_Tilde() { return getToken(HTMLCSSJinjaParser.CSS_Tilde, 0); }
		public TerminalNode CSS_Space() { return getToken(HTMLCSSJinjaParser.CSS_Space, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_combinator);
		try {
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				match(CSS_Plus);
				setState(743);
				css_ws();
				}
				break;
			case CSS_Greater:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				match(CSS_Greater);
				setState(745);
				css_ws();
				}
				break;
			case CSS_Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(746);
				match(CSS_Tilde);
				setState(747);
				css_ws();
				}
				break;
			case CSS_Space:
				enterOuterAlt(_localctx, 4);
				{
				setState(748);
				match(CSS_Space);
				setState(749);
				css_ws();
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
	public static class SimpleSelectorSequenceContext extends ParserRuleContext {
		public SimpleSelectorSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelectorSequence; }
	 
		public SimpleSelectorSequenceContext() { }
		public void copyFrom(SimpleSelectorSequenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSeq2Context extends SimpleSelectorSequenceContext {
		public List<TerminalNode> CSS_Hash() { return getTokens(HTMLCSSJinjaParser.CSS_Hash); }
		public TerminalNode CSS_Hash(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Hash, i);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
		}
		public SimpleSeq2Context(SimpleSelectorSequenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSimpleSeq2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSimpleSeq2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSimpleSeq2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSeq1Context extends SimpleSelectorSequenceContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public List<TerminalNode> CSS_Hash() { return getTokens(HTMLCSSJinjaParser.CSS_Hash); }
		public TerminalNode CSS_Hash(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Hash, i);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
		}
		public SimpleSeq1Context(SimpleSelectorSequenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSimpleSeq1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSimpleSeq1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSimpleSeq1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorSequenceContext simpleSelectorSequence() throws RecognitionException {
		SimpleSelectorSequenceContext _localctx = new SimpleSelectorSequenceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_simpleSelectorSequence);
		int _la;
		try {
			setState(775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_Multiply:
			case CSS_Pipe:
			case CSS_MediaOnly:
			case CSS_Not:
			case CSS_And:
			case CSS_Or:
			case CSS_From:
			case CSS_To:
			case CSS_Ident:
				_localctx = new SimpleSeq1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(752);
					typeSelector();
					}
					break;
				case 2:
					{
					setState(753);
					universal();
					}
					break;
				}
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 288230376152761089L) != 0)) {
					{
					setState(761);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_Hash:
						{
						setState(756);
						match(CSS_Hash);
						}
						break;
					case CSS_Dot:
						{
						setState(757);
						className();
						}
						break;
					case CSS_OpenBracket:
						{
						setState(758);
						attrib();
						}
						break;
					case CSS_Colon:
						{
						setState(759);
						pseudo();
						}
						break;
					case CSS_PseudoNot:
						{
						setState(760);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CSS_OpenBracket:
			case CSS_Colon:
			case CSS_Dot:
			case CSS_Hash:
			case CSS_PseudoNot:
				_localctx = new SimpleSeq2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(771); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(771);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_Hash:
						{
						setState(766);
						match(CSS_Hash);
						}
						break;
					case CSS_Dot:
						{
						setState(767);
						className();
						}
						break;
					case CSS_OpenBracket:
						{
						setState(768);
						attrib();
						}
						break;
					case CSS_Colon:
						{
						setState(769);
						pseudo();
						}
						break;
					case CSS_PseudoNot:
						{
						setState(770);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(773); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 288230376152761089L) != 0) );
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
	public static class TypeSelectorContext extends ParserRuleContext {
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(777);
				typeNamespacePrefix();
				}
				break;
			}
			setState(780);
			elementName();
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
	public static class TypeNamespacePrefixContext extends ParserRuleContext {
		public TerminalNode CSS_Pipe() { return getToken(HTMLCSSJinjaParser.CSS_Pipe, 0); }
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public TerminalNode CSS_Multiply() { return getToken(HTMLCSSJinjaParser.CSS_Multiply, 0); }
		public TypeNamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNamespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterTypeNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitTypeNamespacePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitTypeNamespacePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNamespacePrefixContext typeNamespacePrefix() throws RecognitionException {
		TypeNamespacePrefixContext _localctx = new TypeNamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeNamespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MediaOnly:
			case CSS_Not:
			case CSS_And:
			case CSS_Or:
			case CSS_From:
			case CSS_To:
			case CSS_Ident:
				{
				setState(782);
				css_ident();
				}
				break;
			case CSS_Multiply:
				{
				setState(783);
				match(CSS_Multiply);
				}
				break;
			case CSS_Pipe:
				break;
			default:
				break;
			}
			setState(786);
			match(CSS_Pipe);
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
	public static class ElementNameContext extends ParserRuleContext {
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			css_ident();
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
	public static class UniversalContext extends ParserRuleContext {
		public TerminalNode CSS_Multiply() { return getToken(HTMLCSSJinjaParser.CSS_Multiply, 0); }
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterUniversal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitUniversal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitUniversal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(790);
				typeNamespacePrefix();
				}
				break;
			}
			setState(793);
			match(CSS_Multiply);
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
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode CSS_Dot() { return getToken(HTMLCSSJinjaParser.CSS_Dot, 0); }
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(CSS_Dot);
			setState(796);
			css_ident();
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
	public static class AttribContext extends ParserRuleContext {
		public TerminalNode CSS_OpenBracket() { return getToken(HTMLCSSJinjaParser.CSS_OpenBracket, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<Css_identContext> css_ident() {
			return getRuleContexts(Css_identContext.class);
		}
		public Css_identContext css_ident(int i) {
			return getRuleContext(Css_identContext.class,i);
		}
		public TerminalNode CSS_CloseBracket() { return getToken(HTMLCSSJinjaParser.CSS_CloseBracket, 0); }
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TerminalNode CSS_PrefixMatch() { return getToken(HTMLCSSJinjaParser.CSS_PrefixMatch, 0); }
		public TerminalNode CSS_SuffixMatch() { return getToken(HTMLCSSJinjaParser.CSS_SuffixMatch, 0); }
		public TerminalNode CSS_SubstringMatch() { return getToken(HTMLCSSJinjaParser.CSS_SubstringMatch, 0); }
		public TerminalNode CSS_Equal() { return getToken(HTMLCSSJinjaParser.CSS_Equal, 0); }
		public TerminalNode CSS_Includes() { return getToken(HTMLCSSJinjaParser.CSS_Includes, 0); }
		public TerminalNode CSS_DashMatch() { return getToken(HTMLCSSJinjaParser.CSS_DashMatch, 0); }
		public TerminalNode CSS_String_() { return getToken(HTMLCSSJinjaParser.CSS_String_, 0); }
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(CSS_OpenBracket);
			setState(799);
			css_ws();
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(800);
				typeNamespacePrefix();
				}
				break;
			}
			setState(803);
			css_ident();
			setState(804);
			css_ws();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 15032391681L) != 0)) {
				{
				setState(805);
				_la = _input.LA(1);
				if ( !(((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 15032391681L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(806);
				css_ws();
				setState(809);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_MediaOnly:
				case CSS_Not:
				case CSS_And:
				case CSS_Or:
				case CSS_From:
				case CSS_To:
				case CSS_Ident:
					{
					setState(807);
					css_ident();
					}
					break;
				case CSS_String_:
					{
					setState(808);
					match(CSS_String_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(811);
				css_ws();
				}
			}

			setState(815);
			match(CSS_CloseBracket);
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
	public static class PseudoContext extends ParserRuleContext {
		public List<TerminalNode> CSS_Colon() { return getTokens(HTMLCSSJinjaParser.CSS_Colon); }
		public TerminalNode CSS_Colon(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Colon, i);
		}
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public FunctionalPseudoContext functionalPseudo() {
			return getRuleContext(FunctionalPseudoContext.class,0);
		}
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(CSS_Colon);
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_Colon) {
				{
				setState(818);
				match(CSS_Colon);
				}
			}

			setState(823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MediaOnly:
			case CSS_Not:
			case CSS_And:
			case CSS_Or:
			case CSS_From:
			case CSS_To:
			case CSS_Ident:
				{
				setState(821);
				css_ident();
				}
				break;
			case CSS_Function_:
				{
				setState(822);
				functionalPseudo();
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
	public static class FunctionalPseudoContext extends ParserRuleContext {
		public FunctionalPseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalPseudo; }
	 
		public FunctionalPseudoContext() { }
		public void copyFrom(FunctionalPseudoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncPseudoContext extends FunctionalPseudoContext {
		public TerminalNode CSS_Function_() { return getToken(HTMLCSSJinjaParser.CSS_Function_, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public Css_expressionContext css_expression() {
			return getRuleContext(Css_expressionContext.class,0);
		}
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public FuncPseudoContext(FunctionalPseudoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterFuncPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitFuncPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitFuncPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalPseudoContext functionalPseudo() throws RecognitionException {
		FunctionalPseudoContext _localctx = new FunctionalPseudoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_functionalPseudo);
		try {
			_localctx = new FuncPseudoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(CSS_Function_);
			setState(826);
			css_ws();
			setState(827);
			css_expression();
			setState(828);
			match(CSS_CloseParen);
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
	public static class Css_expressionContext extends ParserRuleContext {
		public Css_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_expression; }
	 
		public Css_expressionContext() { }
		public void copyFrom(Css_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssExprContext extends Css_expressionContext {
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_Plus() { return getTokens(HTMLCSSJinjaParser.CSS_Plus); }
		public TerminalNode CSS_Plus(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Plus, i);
		}
		public List<TerminalNode> CSS_Minus() { return getTokens(HTMLCSSJinjaParser.CSS_Minus); }
		public TerminalNode CSS_Minus(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Minus, i);
		}
		public List<TerminalNode> CSS_Dimension() { return getTokens(HTMLCSSJinjaParser.CSS_Dimension); }
		public TerminalNode CSS_Dimension(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Dimension, i);
		}
		public List<TerminalNode> CSS_Number() { return getTokens(HTMLCSSJinjaParser.CSS_Number); }
		public TerminalNode CSS_Number(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Number, i);
		}
		public List<TerminalNode> CSS_String_() { return getTokens(HTMLCSSJinjaParser.CSS_String_); }
		public TerminalNode CSS_String_(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_String_, i);
		}
		public List<Css_identContext> css_ident() {
			return getRuleContexts(Css_identContext.class);
		}
		public Css_identContext css_ident(int i) {
			return getRuleContext(Css_identContext.class,i);
		}
		public CssExprContext(Css_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCssExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCssExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCssExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_expressionContext css_expression() throws RecognitionException {
		Css_expressionContext _localctx = new Css_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_css_expression);
		int _la;
		try {
			_localctx = new CssExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(840); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(830);
					match(CSS_Plus);
					}
					break;
				case 2:
					{
					setState(831);
					match(CSS_Minus);
					}
					break;
				case 3:
					{
					setState(832);
					match(CSS_Dimension);
					}
					break;
				case 4:
					{
					setState(833);
					match(CSS_Dimension);
					}
					break;
				case 5:
					{
					setState(834);
					match(CSS_Number);
					}
					break;
				case 6:
					{
					setState(835);
					match(CSS_String_);
					}
					break;
				case 7:
					{
					setState(836);
					css_ident();
					}
					break;
				}
				setState(839);
				css_ws();
				}
				}
				setState(842); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 29884671L) != 0) );
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
	public static class NegationContext extends ParserRuleContext {
		public TerminalNode CSS_PseudoNot() { return getToken(HTMLCSSJinjaParser.CSS_PseudoNot, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public NegationArgContext negationArg() {
			return getRuleContext(NegationArgContext.class,0);
		}
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(CSS_PseudoNot);
			setState(845);
			css_ws();
			setState(846);
			negationArg();
			setState(847);
			css_ws();
			setState(848);
			match(CSS_CloseParen);
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
	public static class NegationArgContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public TerminalNode CSS_Hash() { return getToken(HTMLCSSJinjaParser.CSS_Hash, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public AttribContext attrib() {
			return getRuleContext(AttribContext.class,0);
		}
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public NegationArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNegationArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNegationArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNegationArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationArgContext negationArg() throws RecognitionException {
		NegationArgContext _localctx = new NegationArgContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_negationArg);
		try {
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				typeSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				universal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(852);
				match(CSS_Hash);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(853);
				className();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(854);
				attrib();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(855);
				pseudo();
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
	public static class Operator_Context extends ParserRuleContext {
		public Operator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_; }
	 
		public Operator_Context() { }
		public void copyFrom(Operator_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadOperatorContext extends Operator_Context {
		public TerminalNode CSS_Equal() { return getToken(HTMLCSSJinjaParser.CSS_Equal, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public BadOperatorContext(Operator_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBadOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBadOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBadOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodOperatorContext extends Operator_Context {
		public TerminalNode CSS_Divide() { return getToken(HTMLCSSJinjaParser.CSS_Divide, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public TerminalNode CSS_Comma() { return getToken(HTMLCSSJinjaParser.CSS_Comma, 0); }
		public TerminalNode CSS_Space() { return getToken(HTMLCSSJinjaParser.CSS_Space, 0); }
		public GoodOperatorContext(Operator_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterGoodOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitGoodOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitGoodOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_Context operator_() throws RecognitionException {
		Operator_Context _localctx = new Operator_Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_operator_);
		try {
			setState(866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_Divide:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				match(CSS_Divide);
				setState(859);
				css_ws();
				}
				break;
			case CSS_Comma:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				match(CSS_Comma);
				setState(861);
				css_ws();
				}
				break;
			case CSS_Space:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(862);
				match(CSS_Space);
				setState(863);
				css_ws();
				}
				break;
			case CSS_Equal:
				_localctx = new BadOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(864);
				match(CSS_Equal);
				setState(865);
				css_ws();
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
	public static class Property_Context extends ParserRuleContext {
		public Property_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_; }
	 
		public Property_Context() { }
		public void copyFrom(Property_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadPropertyContext extends Property_Context {
		public TerminalNode CSS_Multiply() { return getToken(HTMLCSSJinjaParser.CSS_Multiply, 0); }
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public TerminalNode CSS_Underscore() { return getToken(HTMLCSSJinjaParser.CSS_Underscore, 0); }
		public BadPropertyContext(Property_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBadProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBadProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBadProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodPropertyContext extends Property_Context {
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public TerminalNode CSS_Variable() { return getToken(HTMLCSSJinjaParser.CSS_Variable, 0); }
		public GoodPropertyContext(Property_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterGoodProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitGoodProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitGoodProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_Context property_() throws RecognitionException {
		Property_Context _localctx = new Property_Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_property_);
		try {
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_MediaOnly:
			case CSS_Not:
			case CSS_And:
			case CSS_Or:
			case CSS_From:
			case CSS_To:
			case CSS_Ident:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				css_ident();
				setState(869);
				css_ws();
				}
				break;
			case CSS_Variable:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				match(CSS_Variable);
				setState(872);
				css_ws();
				}
				break;
			case CSS_Multiply:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(873);
				match(CSS_Multiply);
				setState(874);
				css_ident();
				}
				break;
			case CSS_Underscore:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(875);
				match(CSS_Underscore);
				setState(876);
				css_ident();
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
	public static class RulesetContext extends ParserRuleContext {
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
	 
		public RulesetContext() { }
		public void copyFrom(RulesetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownRulesetContext extends RulesetContext {
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public UnknownRulesetContext(RulesetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterUnknownRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitUnknownRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitUnknownRuleset(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownRulesetContext extends RulesetContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public KnownRulesetContext(RulesetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterKnownRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitKnownRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitKnownRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ruleset);
		int _la;
		try {
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new KnownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				selectorGroup();
				setState(880);
				match(CSS_OpenBrace);
				setState(881);
				css_ws();
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & 13195196498065L) != 0)) {
					{
					setState(882);
					declarationList();
					}
				}

				setState(885);
				match(CSS_CloseBrace);
				setState(886);
				css_ws();
				}
				break;
			case 2:
				_localctx = new UnknownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 33214321997381893L) != 0)) {
					{
					{
					setState(888);
					any_();
					}
					}
					setState(893);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(894);
				match(CSS_OpenBrace);
				setState(895);
				css_ws();
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & 13195196498065L) != 0)) {
					{
					setState(896);
					declarationList();
					}
				}

				setState(899);
				match(CSS_CloseBrace);
				setState(900);
				css_ws();
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
	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	 
		public DeclarationListContext() { }
		public void copyFrom(DeclarationListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclListContext extends DeclarationListContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_SemiColon() { return getTokens(HTMLCSSJinjaParser.CSS_SemiColon); }
		public TerminalNode CSS_SemiColon(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_SemiColon, i);
		}
		public DeclListContext(DeclarationListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declarationList);
		int _la;
		try {
			int _alt;
			_localctx = new DeclListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_SemiColon) {
				{
				{
				setState(904);
				match(CSS_SemiColon);
				setState(905);
				css_ws();
				}
				}
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(911);
			declaration();
			setState(912);
			css_ws();
			setState(920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(913);
					match(CSS_SemiColon);
					setState(914);
					css_ws();
					setState(916);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						setState(915);
						declaration();
						}
						break;
					}
					}
					} 
				}
				setState(922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownDeclarationContext extends DeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode CSS_Colon() { return getToken(HTMLCSSJinjaParser.CSS_Colon, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnknownDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterUnknownDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitUnknownDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitUnknownDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownDeclarationContext extends DeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode CSS_Colon() { return getToken(HTMLCSSJinjaParser.CSS_Colon, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrioContext prio() {
			return getRuleContext(PrioContext.class,0);
		}
		public KnownDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterKnownDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitKnownDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitKnownDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_declaration);
		int _la;
		try {
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				_localctx = new KnownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				property_();
				setState(924);
				match(CSS_Colon);
				setState(925);
				css_ws();
				setState(926);
				expr();
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_Important) {
					{
					setState(927);
					prio();
					}
				}

				}
				break;
			case 2:
				_localctx = new UnknownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(930);
				property_();
				setState(931);
				match(CSS_Colon);
				setState(932);
				css_ws();
				setState(933);
				value();
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
	public static class PrioContext extends ParserRuleContext {
		public PrioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prio; }
	 
		public PrioContext() { }
		public void copyFrom(PrioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrioRuleContext extends PrioContext {
		public TerminalNode CSS_Important() { return getToken(HTMLCSSJinjaParser.CSS_Important, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public PrioRuleContext(PrioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterPrioRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitPrioRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitPrioRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrioContext prio() throws RecognitionException {
		PrioContext _localctx = new PrioContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_prio);
		try {
			_localctx = new PrioRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(CSS_Important);
			setState(938);
			css_ws();
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
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueRuleContext extends ValueContext {
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> CSS_AtKeyword() { return getTokens(HTMLCSSJinjaParser.CSS_AtKeyword); }
		public TerminalNode CSS_AtKeyword(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_AtKeyword, i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public ValueRuleContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterValueRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitValueRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitValueRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_value);
		try {
			int _alt;
			_localctx = new ValueRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(944); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(944);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_OpenBracket:
					case CSS_OpenParen:
					case CSS_Colon:
					case CSS_Includes:
					case CSS_DashMatch:
					case CSS_Hash:
					case CSS_Percentage:
					case CSS_Url_:
					case CSS_UnicodeRange:
					case CSS_MediaOnly:
					case CSS_Not:
					case CSS_And:
					case CSS_Or:
					case CSS_From:
					case CSS_To:
					case CSS_Number:
					case CSS_String_:
					case CSS_Ident:
					case CSS_Function_:
					case CSS_Dimension:
					case CSS_Plus:
					case CSS_Minus:
						{
						setState(940);
						any_();
						}
						break;
					case CSS_OpenBrace:
						{
						setState(941);
						block();
						}
						break;
					case CSS_AtKeyword:
						{
						setState(942);
						match(CSS_AtKeyword);
						setState(943);
						css_ws();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(946); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRuleContext extends ExprContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Operator_Context> operator_() {
			return getRuleContexts(Operator_Context.class);
		}
		public Operator_Context operator_(int i) {
			return getRuleContext(Operator_Context.class,i);
		}
		public ExprRuleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterExprRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitExprRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitExprRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_expr);
		int _la;
		try {
			int _alt;
			_localctx = new ExprRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			term();
			setState(955);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(950);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 562949953421585L) != 0)) {
						{
						setState(949);
						operator_();
						}
					}

					setState(952);
					term();
					}
					} 
				}
				setState(957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadTermContext extends TermContext {
		public DxImageTransformContext dxImageTransform() {
			return getRuleContext(DxImageTransformContext.class,0);
		}
		public BadTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBadTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBadTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBadTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownTermContext extends TermContext {
		public Css_numberContext css_number() {
			return getRuleContext(Css_numberContext.class,0);
		}
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public TerminalNode CSS_Percentage() { return getToken(HTMLCSSJinjaParser.CSS_Percentage, 0); }
		public TerminalNode CSS_Dimension() { return getToken(HTMLCSSJinjaParser.CSS_Dimension, 0); }
		public TerminalNode CSS_String_() { return getToken(HTMLCSSJinjaParser.CSS_String_, 0); }
		public TerminalNode CSS_UnicodeRange() { return getToken(HTMLCSSJinjaParser.CSS_UnicodeRange, 0); }
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public Css_urlContext css_url() {
			return getRuleContext(Css_urlContext.class,0);
		}
		public HexcolorContext hexcolor() {
			return getRuleContext(HexcolorContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public KnownTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterKnownTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitKnownTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitKnownTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownTermContext extends TermContext {
		public TerminalNode CSS_Dimension() { return getToken(HTMLCSSJinjaParser.CSS_Dimension, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public UnknownTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterUnknownTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitUnknownTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitUnknownTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_term);
		try {
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				css_number();
				setState(959);
				css_ws();
				}
				break;
			case 2:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(961);
				match(CSS_Percentage);
				setState(962);
				css_ws();
				}
				break;
			case 3:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(963);
				match(CSS_Dimension);
				setState(964);
				css_ws();
				}
				break;
			case 4:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(965);
				match(CSS_String_);
				setState(966);
				css_ws();
				}
				break;
			case 5:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(967);
				match(CSS_UnicodeRange);
				setState(968);
				css_ws();
				}
				break;
			case 6:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(969);
				css_ident();
				setState(970);
				css_ws();
				}
				break;
			case 7:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(972);
				var_();
				}
				break;
			case 8:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(973);
				css_url();
				setState(974);
				css_ws();
				}
				break;
			case 9:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(976);
				hexcolor();
				}
				break;
			case 10:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(977);
				calc();
				}
				break;
			case 11:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(978);
				function_();
				}
				break;
			case 12:
				_localctx = new UnknownTermContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(979);
				match(CSS_Dimension);
				setState(980);
				css_ws();
				}
				break;
			case 13:
				_localctx = new BadTermContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(981);
				dxImageTransform();
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
	public static class Function_Context extends ParserRuleContext {
		public Function_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_; }
	 
		public Function_Context() { }
		public void copyFrom(Function_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncRuleContext extends Function_Context {
		public TerminalNode CSS_Function_() { return getToken(HTMLCSSJinjaParser.CSS_Function_, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public FuncRuleContext(Function_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterFuncRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitFuncRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitFuncRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_Context function_() throws RecognitionException {
		Function_Context _localctx = new Function_Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_function_);
		try {
			_localctx = new FuncRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(CSS_Function_);
			setState(985);
			css_ws();
			setState(986);
			expr();
			setState(987);
			match(CSS_CloseParen);
			setState(988);
			css_ws();
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
	public static class DxImageTransformContext extends ParserRuleContext {
		public DxImageTransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dxImageTransform; }
	 
		public DxImageTransformContext() { }
		public void copyFrom(DxImageTransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DxTransformContext extends DxImageTransformContext {
		public TerminalNode CSS_DxImageTransform() { return getToken(HTMLCSSJinjaParser.CSS_DxImageTransform, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public DxTransformContext(DxImageTransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterDxTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitDxTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitDxTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DxImageTransformContext dxImageTransform() throws RecognitionException {
		DxImageTransformContext _localctx = new DxImageTransformContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_dxImageTransform);
		try {
			_localctx = new DxTransformContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(CSS_DxImageTransform);
			setState(991);
			css_ws();
			setState(992);
			expr();
			setState(993);
			match(CSS_CloseParen);
			setState(994);
			css_ws();
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
	public static class HexcolorContext extends ParserRuleContext {
		public TerminalNode CSS_Hash() { return getToken(HTMLCSSJinjaParser.CSS_Hash, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public HexcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterHexcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitHexcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitHexcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexcolorContext hexcolor() throws RecognitionException {
		HexcolorContext _localctx = new HexcolorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_hexcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(CSS_Hash);
			setState(997);
			css_ws();
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
	public static class Css_numberContext extends ParserRuleContext {
		public Css_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_number; }
	 
		public Css_numberContext() { }
		public void copyFrom(Css_numberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNumContext extends Css_numberContext {
		public TerminalNode CSS_Number() { return getToken(HTMLCSSJinjaParser.CSS_Number, 0); }
		public TerminalNode CSS_Plus() { return getToken(HTMLCSSJinjaParser.CSS_Plus, 0); }
		public TerminalNode CSS_Minus() { return getToken(HTMLCSSJinjaParser.CSS_Minus, 0); }
		public CssNumContext(Css_numberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCssNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCssNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCssNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_numberContext css_number() throws RecognitionException {
		Css_numberContext _localctx = new Css_numberContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_css_number);
		int _la;
		try {
			_localctx = new CssNumContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_Plus || _la==CSS_Minus) {
				{
				setState(999);
				_la = _input.LA(1);
				if ( !(_la==CSS_Plus || _la==CSS_Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1002);
			match(CSS_Number);
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
	public static class Css_percentageContext extends ParserRuleContext {
		public Css_percentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_percentage; }
	 
		public Css_percentageContext() { }
		public void copyFrom(Css_percentageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPercentContext extends Css_percentageContext {
		public TerminalNode CSS_Percentage() { return getToken(HTMLCSSJinjaParser.CSS_Percentage, 0); }
		public TerminalNode CSS_Plus() { return getToken(HTMLCSSJinjaParser.CSS_Plus, 0); }
		public TerminalNode CSS_Minus() { return getToken(HTMLCSSJinjaParser.CSS_Minus, 0); }
		public CssPercentContext(Css_percentageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCssPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCssPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCssPercent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_percentageContext css_percentage() throws RecognitionException {
		Css_percentageContext _localctx = new Css_percentageContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_css_percentage);
		int _la;
		try {
			_localctx = new CssPercentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_Plus || _la==CSS_Minus) {
				{
				setState(1004);
				_la = _input.LA(1);
				if ( !(_la==CSS_Plus || _la==CSS_Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1007);
			match(CSS_Percentage);
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
	public static class Css_dimensionContext extends ParserRuleContext {
		public Css_dimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_dimension; }
	 
		public Css_dimensionContext() { }
		public void copyFrom(Css_dimensionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDimContext extends Css_dimensionContext {
		public TerminalNode CSS_Dimension() { return getToken(HTMLCSSJinjaParser.CSS_Dimension, 0); }
		public TerminalNode CSS_Plus() { return getToken(HTMLCSSJinjaParser.CSS_Plus, 0); }
		public TerminalNode CSS_Minus() { return getToken(HTMLCSSJinjaParser.CSS_Minus, 0); }
		public CssDimContext(Css_dimensionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCssDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCssDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCssDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_dimensionContext css_dimension() throws RecognitionException {
		Css_dimensionContext _localctx = new Css_dimensionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_css_dimension);
		int _la;
		try {
			_localctx = new CssDimContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_Plus || _la==CSS_Minus) {
				{
				setState(1009);
				_la = _input.LA(1);
				if ( !(_la==CSS_Plus || _la==CSS_Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1012);
			match(CSS_Dimension);
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
	public static class Any_Context extends ParserRuleContext {
		public Any_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_; }
	 
		public Any_Context() { }
		public void copyFrom(Any_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyStringContext extends Any_Context {
		public TerminalNode CSS_String_() { return getToken(HTMLCSSJinjaParser.CSS_String_, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public AnyStringContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyHashContext extends Any_Context {
		public TerminalNode CSS_Hash() { return getToken(HTMLCSSJinjaParser.CSS_Hash, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public AnyHashContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyHash(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyIdentContext extends Any_Context {
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public AnyIdentContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyNumberContext extends Any_Context {
		public Css_numberContext css_number() {
			return getRuleContext(Css_numberContext.class,0);
		}
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public AnyNumberContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyFuncContext extends Any_Context {
		public TerminalNode CSS_Function_() { return getToken(HTMLCSSJinjaParser.CSS_Function_, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public AnyFuncContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyColonContext extends Any_Context {
		public TerminalNode CSS_Colon() { return getToken(HTMLCSSJinjaParser.CSS_Colon, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public AnyColonContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyColon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyUrlContext extends Any_Context {
		public Css_urlContext css_url() {
			return getRuleContext(Css_urlContext.class,0);
		}
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public AnyUrlContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyUrl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyDimContext extends Any_Context {
		public TerminalNode CSS_Dimension() { return getToken(HTMLCSSJinjaParser.CSS_Dimension, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public AnyDimContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyDim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyParenContext extends Any_Context {
		public TerminalNode CSS_OpenParen() { return getToken(HTMLCSSJinjaParser.CSS_OpenParen, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public AnyParenContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyPercentContext extends Any_Context {
		public Css_percentageContext css_percentage() {
			return getRuleContext(Css_percentageContext.class,0);
		}
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public AnyPercentContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyPercent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyUnicodeContext extends Any_Context {
		public TerminalNode CSS_UnicodeRange() { return getToken(HTMLCSSJinjaParser.CSS_UnicodeRange, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public AnyUnicodeContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyUnicode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyUnicode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyUnicode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyIncludeContext extends Any_Context {
		public TerminalNode CSS_Includes() { return getToken(HTMLCSSJinjaParser.CSS_Includes, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public AnyIncludeContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyInclude(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyBracketsContext extends Any_Context {
		public TerminalNode CSS_OpenBracket() { return getToken(HTMLCSSJinjaParser.CSS_OpenBracket, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_CloseBracket() { return getToken(HTMLCSSJinjaParser.CSS_CloseBracket, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public AnyBracketsContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyDashMatchContext extends Any_Context {
		public TerminalNode CSS_DashMatch() { return getToken(HTMLCSSJinjaParser.CSS_DashMatch, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public AnyDashMatchContext(Any_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAnyDashMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAnyDashMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAnyDashMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_Context any_() throws RecognitionException {
		Any_Context _localctx = new Any_Context(_ctx, getState());
		enterRule(_localctx, 146, RULE_any_);
		int _la;
		try {
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new AnyIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				css_ident();
				setState(1015);
				css_ws();
				}
				break;
			case 2:
				_localctx = new AnyNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				css_number();
				setState(1018);
				css_ws();
				}
				break;
			case 3:
				_localctx = new AnyPercentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1020);
				css_percentage();
				setState(1021);
				css_ws();
				}
				break;
			case 4:
				_localctx = new AnyDimContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1023);
				match(CSS_Dimension);
				setState(1024);
				css_ws();
				}
				break;
			case 5:
				_localctx = new AnyStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1025);
				match(CSS_String_);
				setState(1026);
				css_ws();
				}
				break;
			case 6:
				_localctx = new AnyUrlContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1027);
				css_url();
				setState(1028);
				css_ws();
				}
				break;
			case 7:
				_localctx = new AnyHashContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1030);
				match(CSS_Hash);
				setState(1031);
				css_ws();
				}
				break;
			case 8:
				_localctx = new AnyUnicodeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1032);
				match(CSS_UnicodeRange);
				setState(1033);
				css_ws();
				}
				break;
			case 9:
				_localctx = new AnyIncludeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1034);
				match(CSS_Includes);
				setState(1035);
				css_ws();
				}
				break;
			case 10:
				_localctx = new AnyDashMatchContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1036);
				match(CSS_DashMatch);
				setState(1037);
				css_ws();
				}
				break;
			case 11:
				_localctx = new AnyColonContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1038);
				match(CSS_Colon);
				setState(1039);
				css_ws();
				}
				break;
			case 12:
				_localctx = new AnyFuncContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1040);
				match(CSS_Function_);
				setState(1041);
				css_ws();
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 35466121811263829L) != 0)) {
					{
					setState(1044);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_OpenBracket:
					case CSS_OpenParen:
					case CSS_Colon:
					case CSS_Includes:
					case CSS_DashMatch:
					case CSS_Hash:
					case CSS_Percentage:
					case CSS_Url_:
					case CSS_UnicodeRange:
					case CSS_MediaOnly:
					case CSS_Not:
					case CSS_And:
					case CSS_Or:
					case CSS_From:
					case CSS_To:
					case CSS_Number:
					case CSS_String_:
					case CSS_Ident:
					case CSS_Function_:
					case CSS_Dimension:
					case CSS_Plus:
					case CSS_Minus:
						{
						setState(1042);
						any_();
						}
						break;
					case CSS_OpenBrace:
					case CSS_SemiColon:
					case CSS_Cdo:
					case CSS_Cdc:
					case CSS_AtKeyword:
						{
						setState(1043);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1049);
				match(CSS_CloseParen);
				setState(1050);
				css_ws();
				}
				break;
			case 13:
				_localctx = new AnyParenContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1052);
				match(CSS_OpenParen);
				setState(1053);
				css_ws();
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 35466121811263829L) != 0)) {
					{
					setState(1056);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_OpenBracket:
					case CSS_OpenParen:
					case CSS_Colon:
					case CSS_Includes:
					case CSS_DashMatch:
					case CSS_Hash:
					case CSS_Percentage:
					case CSS_Url_:
					case CSS_UnicodeRange:
					case CSS_MediaOnly:
					case CSS_Not:
					case CSS_And:
					case CSS_Or:
					case CSS_From:
					case CSS_To:
					case CSS_Number:
					case CSS_String_:
					case CSS_Ident:
					case CSS_Function_:
					case CSS_Dimension:
					case CSS_Plus:
					case CSS_Minus:
						{
						setState(1054);
						any_();
						}
						break;
					case CSS_OpenBrace:
					case CSS_SemiColon:
					case CSS_Cdo:
					case CSS_Cdc:
					case CSS_AtKeyword:
						{
						setState(1055);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1060);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1061);
				match(CSS_CloseParen);
				setState(1062);
				css_ws();
				}
				break;
			case 14:
				_localctx = new AnyBracketsContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1064);
				match(CSS_OpenBracket);
				setState(1065);
				css_ws();
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 35466121811263829L) != 0)) {
					{
					setState(1068);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_OpenBracket:
					case CSS_OpenParen:
					case CSS_Colon:
					case CSS_Includes:
					case CSS_DashMatch:
					case CSS_Hash:
					case CSS_Percentage:
					case CSS_Url_:
					case CSS_UnicodeRange:
					case CSS_MediaOnly:
					case CSS_Not:
					case CSS_And:
					case CSS_Or:
					case CSS_From:
					case CSS_To:
					case CSS_Number:
					case CSS_String_:
					case CSS_Ident:
					case CSS_Function_:
					case CSS_Dimension:
					case CSS_Plus:
					case CSS_Minus:
						{
						setState(1066);
						any_();
						}
						break;
					case CSS_OpenBrace:
					case CSS_SemiColon:
					case CSS_Cdo:
					case CSS_Cdc:
					case CSS_AtKeyword:
						{
						setState(1067);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1072);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1073);
				match(CSS_CloseBracket);
				setState(1074);
				css_ws();
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
	public static class AtRuleContext extends ParserRuleContext {
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
	 
		public AtRuleContext() { }
		public void copyFrom(AtRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleUnknownContext extends AtRuleContext {
		public TerminalNode CSS_AtKeyword() { return getToken(HTMLCSSJinjaParser.CSS_AtKeyword, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CSS_SemiColon() { return getToken(HTMLCSSJinjaParser.CSS_SemiColon, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public AtRuleUnknownContext(AtRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterAtRuleUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitAtRuleUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitAtRuleUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_atRule);
		int _la;
		try {
			_localctx = new AtRuleUnknownContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(CSS_AtKeyword);
			setState(1079);
			css_ws();
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 33214321997381893L) != 0)) {
				{
				{
				setState(1080);
				any_();
				}
				}
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1089);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_OpenBrace:
				{
				setState(1086);
				block();
				}
				break;
			case CSS_SemiColon:
				{
				setState(1087);
				match(CSS_SemiColon);
				setState(1088);
				css_ws();
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
	public static class UnusedContext extends ParserRuleContext {
		public UnusedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unused; }
	 
		public UnusedContext() { }
		public void copyFrom(UnusedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnusedCdcContext extends UnusedContext {
		public TerminalNode CSS_Cdc() { return getToken(HTMLCSSJinjaParser.CSS_Cdc, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public UnusedCdcContext(UnusedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterUnusedCdc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitUnusedCdc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitUnusedCdc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnusedSemiContext extends UnusedContext {
		public TerminalNode CSS_SemiColon() { return getToken(HTMLCSSJinjaParser.CSS_SemiColon, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public UnusedSemiContext(UnusedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterUnusedSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitUnusedSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitUnusedSemi(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnusedCdoContext extends UnusedContext {
		public TerminalNode CSS_Cdo() { return getToken(HTMLCSSJinjaParser.CSS_Cdo, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public UnusedCdoContext(UnusedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterUnusedCdo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitUnusedCdo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitUnusedCdo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnusedBlockContext extends UnusedContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UnusedBlockContext(UnusedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterUnusedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitUnusedBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitUnusedBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnusedAtContext extends UnusedContext {
		public TerminalNode CSS_AtKeyword() { return getToken(HTMLCSSJinjaParser.CSS_AtKeyword, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public UnusedAtContext(UnusedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterUnusedAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitUnusedAt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitUnusedAt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnusedContext unused() throws RecognitionException {
		UnusedContext _localctx = new UnusedContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_unused);
		try {
			setState(1100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_OpenBrace:
				_localctx = new UnusedBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				block();
				}
				break;
			case CSS_AtKeyword:
				_localctx = new UnusedAtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				match(CSS_AtKeyword);
				setState(1093);
				css_ws();
				}
				break;
			case CSS_SemiColon:
				_localctx = new UnusedSemiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1094);
				match(CSS_SemiColon);
				setState(1095);
				css_ws();
				}
				break;
			case CSS_Cdo:
				_localctx = new UnusedCdoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1096);
				match(CSS_Cdo);
				setState(1097);
				css_ws();
				}
				break;
			case CSS_Cdc:
				_localctx = new UnusedCdcContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1098);
				match(CSS_Cdc);
				setState(1099);
				css_ws();
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
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockRuleContext extends BlockContext {
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public List<DeclarationListContext> declarationList() {
			return getRuleContexts(DeclarationListContext.class);
		}
		public DeclarationListContext declarationList(int i) {
			return getRuleContext(DeclarationListContext.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> CSS_AtKeyword() { return getTokens(HTMLCSSJinjaParser.CSS_AtKeyword); }
		public TerminalNode CSS_AtKeyword(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_AtKeyword, i);
		}
		public List<TerminalNode> CSS_SemiColon() { return getTokens(HTMLCSSJinjaParser.CSS_SemiColon); }
		public TerminalNode CSS_SemiColon(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_SemiColon, i);
		}
		public BlockRuleContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterBlockRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitBlockRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitBlockRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_block);
		int _la;
		try {
			_localctx = new BlockRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(CSS_OpenBrace);
			setState(1103);
			css_ws();
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 324116511417186133L) != 0)) {
				{
				setState(1112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1104);
					declarationList();
					}
					break;
				case 2:
					{
					setState(1105);
					nestedStatement();
					}
					break;
				case 3:
					{
					setState(1106);
					any_();
					}
					break;
				case 4:
					{
					setState(1107);
					block();
					}
					break;
				case 5:
					{
					setState(1108);
					match(CSS_AtKeyword);
					setState(1109);
					css_ws();
					}
					break;
				case 6:
					{
					setState(1110);
					match(CSS_SemiColon);
					setState(1111);
					css_ws();
					}
					break;
				}
				}
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1117);
			match(CSS_CloseBrace);
			setState(1118);
			css_ws();
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
	public static class NestedStatementContext extends ParserRuleContext {
		public NestedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedStatement; }
	 
		public NestedStatementContext() { }
		public void copyFrom(NestedStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestViewportContext extends NestedStatementContext {
		public ViewportContext viewport() {
			return getRuleContext(ViewportContext.class,0);
		}
		public NestViewportContext(NestedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNestViewport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNestViewport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNestViewport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestCounterContext extends NestedStatementContext {
		public CounterStyleContext counterStyle() {
			return getRuleContext(CounterStyleContext.class,0);
		}
		public NestCounterContext(NestedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNestCounter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNestCounter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNestCounter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestFontFeatureContext extends NestedStatementContext {
		public FontFeatureValuesRuleContext fontFeatureValuesRule() {
			return getRuleContext(FontFeatureValuesRuleContext.class,0);
		}
		public NestFontFeatureContext(NestedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNestFontFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNestFontFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNestFontFeature(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestRulesetContext extends NestedStatementContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public NestRulesetContext(NestedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNestRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNestRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNestRuleset(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestKeyframesContext extends NestedStatementContext {
		public KeyframesRuleContext keyframesRule() {
			return getRuleContext(KeyframesRuleContext.class,0);
		}
		public NestKeyframesContext(NestedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNestKeyframes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNestKeyframes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNestKeyframes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestMediaContext extends NestedStatementContext {
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public NestMediaContext(NestedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNestMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNestMedia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNestMedia(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestFontFaceContext extends NestedStatementContext {
		public FontFaceRuleContext fontFaceRule() {
			return getRuleContext(FontFaceRuleContext.class,0);
		}
		public NestFontFaceContext(NestedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNestFontFace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNestFontFace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNestFontFace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestAtRuleContext extends NestedStatementContext {
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public NestAtRuleContext(NestedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNestAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNestAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNestAtRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestPageContext extends NestedStatementContext {
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public NestPageContext(NestedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNestPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNestPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNestPage(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestSupportsContext extends NestedStatementContext {
		public SupportsRuleContext supportsRule() {
			return getRuleContext(SupportsRuleContext.class,0);
		}
		public NestSupportsContext(NestedStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterNestSupports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitNestSupports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitNestSupports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedStatementContext nestedStatement() throws RecognitionException {
		NestedStatementContext _localctx = new NestedStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_nestedStatement);
		try {
			setState(1130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_OpenBracket:
			case CSS_OpenParen:
			case CSS_OpenBrace:
			case CSS_Colon:
			case CSS_Dot:
			case CSS_Multiply:
			case CSS_Pipe:
			case CSS_Includes:
			case CSS_DashMatch:
			case CSS_Hash:
			case CSS_Percentage:
			case CSS_Url_:
			case CSS_UnicodeRange:
			case CSS_MediaOnly:
			case CSS_Not:
			case CSS_And:
			case CSS_Or:
			case CSS_From:
			case CSS_To:
			case CSS_Number:
			case CSS_String_:
			case CSS_Ident:
			case CSS_Function_:
			case CSS_Dimension:
			case CSS_Plus:
			case CSS_Minus:
			case CSS_PseudoNot:
				_localctx = new NestRulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1120);
				ruleset();
				}
				break;
			case CSS_Media:
				_localctx = new NestMediaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1121);
				media();
				}
				break;
			case CSS_Page:
				_localctx = new NestPageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1122);
				page();
				}
				break;
			case CSS_FontFace:
				_localctx = new NestFontFaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1123);
				fontFaceRule();
				}
				break;
			case CSS_Keyframes:
				_localctx = new NestKeyframesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1124);
				keyframesRule();
				}
				break;
			case CSS_Supports:
				_localctx = new NestSupportsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1125);
				supportsRule();
				}
				break;
			case CSS_Viewport:
				_localctx = new NestViewportContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1126);
				viewport();
				}
				break;
			case CSS_CounterStyle:
				_localctx = new NestCounterContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1127);
				counterStyle();
				}
				break;
			case CSS_FontFeatureValues:
				_localctx = new NestFontFeatureContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1128);
				fontFeatureValuesRule();
				}
				break;
			case CSS_AtKeyword:
				_localctx = new NestAtRuleContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1129);
				atRule();
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
	public static class GroupRuleBodyContext extends ParserRuleContext {
		public GroupRuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupRuleBody; }
	 
		public GroupRuleBodyContext() { }
		public void copyFrom(GroupRuleBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupBodyContext extends GroupRuleBodyContext {
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public GroupBodyContext(GroupRuleBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterGroupBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitGroupBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitGroupBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupRuleBodyContext groupRuleBody() throws RecognitionException {
		GroupRuleBodyContext _localctx = new GroupRuleBodyContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_groupRuleBody);
		int _la;
		try {
			_localctx = new GroupBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			match(CSS_OpenBrace);
			setState(1133);
			css_ws();
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 323835036440467221L) != 0)) {
				{
				{
				setState(1134);
				nestedStatement();
				}
				}
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1140);
			match(CSS_CloseBrace);
			setState(1141);
			css_ws();
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
	public static class SupportsRuleContext extends ParserRuleContext {
		public SupportsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsRule; }
	 
		public SupportsRuleContext() { }
		public void copyFrom(SupportsRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SupportsRuleLabelContext extends SupportsRuleContext {
		public TerminalNode CSS_Supports() { return getToken(HTMLCSSJinjaParser.CSS_Supports, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public GroupRuleBodyContext groupRuleBody() {
			return getRuleContext(GroupRuleBodyContext.class,0);
		}
		public SupportsRuleLabelContext(SupportsRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSupportsRuleLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSupportsRuleLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSupportsRuleLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsRuleContext supportsRule() throws RecognitionException {
		SupportsRuleContext _localctx = new SupportsRuleContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_supportsRule);
		try {
			_localctx = new SupportsRuleLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			match(CSS_Supports);
			setState(1144);
			css_ws();
			setState(1145);
			supportsCondition();
			setState(1146);
			css_ws();
			setState(1147);
			groupRuleBody();
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
	public static class SupportsConditionContext extends ParserRuleContext {
		public SupportsNegationContext supportsNegation() {
			return getRuleContext(SupportsNegationContext.class,0);
		}
		public SupportsConjunctionContext supportsConjunction() {
			return getRuleContext(SupportsConjunctionContext.class,0);
		}
		public SupportsDisjunctionContext supportsDisjunction() {
			return getRuleContext(SupportsDisjunctionContext.class,0);
		}
		public SupportsConditionInParensContext supportsConditionInParens() {
			return getRuleContext(SupportsConditionInParensContext.class,0);
		}
		public SupportsConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSupportsCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSupportsCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSupportsCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConditionContext supportsCondition() throws RecognitionException {
		SupportsConditionContext _localctx = new SupportsConditionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_supportsCondition);
		try {
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				supportsNegation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				supportsConjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1151);
				supportsDisjunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1152);
				supportsConditionInParens();
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
	public static class SupportsConditionInParensContext extends ParserRuleContext {
		public SupportsConditionInParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsConditionInParens; }
	 
		public SupportsConditionInParensContext() { }
		public void copyFrom(SupportsConditionInParensContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SupportDeclCondContext extends SupportsConditionInParensContext {
		public SupportsDeclarationConditionContext supportsDeclarationCondition() {
			return getRuleContext(SupportsDeclarationConditionContext.class,0);
		}
		public SupportDeclCondContext(SupportsConditionInParensContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSupportDeclCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSupportDeclCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSupportDeclCond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SupportGeneralContext extends SupportsConditionInParensContext {
		public GeneralEnclosedContext generalEnclosed() {
			return getRuleContext(GeneralEnclosedContext.class,0);
		}
		public SupportGeneralContext(SupportsConditionInParensContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSupportGeneral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSupportGeneral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSupportGeneral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SupportParenContext extends SupportsConditionInParensContext {
		public TerminalNode CSS_OpenParen() { return getToken(HTMLCSSJinjaParser.CSS_OpenParen, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public SupportParenContext(SupportsConditionInParensContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSupportParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSupportParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSupportParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConditionInParensContext supportsConditionInParens() throws RecognitionException {
		SupportsConditionInParensContext _localctx = new SupportsConditionInParensContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_supportsConditionInParens);
		try {
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				_localctx = new SupportParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				match(CSS_OpenParen);
				setState(1156);
				css_ws();
				setState(1157);
				supportsCondition();
				setState(1158);
				css_ws();
				setState(1159);
				match(CSS_CloseParen);
				}
				break;
			case 2:
				_localctx = new SupportDeclCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				supportsDeclarationCondition();
				}
				break;
			case 3:
				_localctx = new SupportGeneralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1162);
				generalEnclosed();
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
	public static class SupportsNegationContext extends ParserRuleContext {
		public TerminalNode CSS_Not() { return getToken(HTMLCSSJinjaParser.CSS_Not, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_Space() { return getToken(HTMLCSSJinjaParser.CSS_Space, 0); }
		public SupportsConditionInParensContext supportsConditionInParens() {
			return getRuleContext(SupportsConditionInParensContext.class,0);
		}
		public SupportsNegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsNegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSupportsNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSupportsNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSupportsNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsNegationContext supportsNegation() throws RecognitionException {
		SupportsNegationContext _localctx = new SupportsNegationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_supportsNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(CSS_Not);
			setState(1166);
			css_ws();
			setState(1167);
			match(CSS_Space);
			setState(1168);
			css_ws();
			setState(1169);
			supportsConditionInParens();
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
	public static class SupportsConjunctionContext extends ParserRuleContext {
		public List<SupportsConditionInParensContext> supportsConditionInParens() {
			return getRuleContexts(SupportsConditionInParensContext.class);
		}
		public SupportsConditionInParensContext supportsConditionInParens(int i) {
			return getRuleContext(SupportsConditionInParensContext.class,i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_Space() { return getTokens(HTMLCSSJinjaParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Space, i);
		}
		public List<TerminalNode> CSS_And() { return getTokens(HTMLCSSJinjaParser.CSS_And); }
		public TerminalNode CSS_And(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_And, i);
		}
		public SupportsConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsConjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSupportsConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSupportsConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSupportsConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConjunctionContext supportsConjunction() throws RecognitionException {
		SupportsConjunctionContext _localctx = new SupportsConjunctionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_supportsConjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			supportsConditionInParens();
			setState(1181); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1172);
					css_ws();
					setState(1173);
					match(CSS_Space);
					setState(1174);
					css_ws();
					setState(1175);
					match(CSS_And);
					setState(1176);
					css_ws();
					setState(1177);
					match(CSS_Space);
					setState(1178);
					css_ws();
					setState(1179);
					supportsConditionInParens();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1183); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class SupportsDisjunctionContext extends ParserRuleContext {
		public List<SupportsConditionInParensContext> supportsConditionInParens() {
			return getRuleContexts(SupportsConditionInParensContext.class);
		}
		public SupportsConditionInParensContext supportsConditionInParens(int i) {
			return getRuleContext(SupportsConditionInParensContext.class,i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_Space() { return getTokens(HTMLCSSJinjaParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Space, i);
		}
		public List<TerminalNode> CSS_Or() { return getTokens(HTMLCSSJinjaParser.CSS_Or); }
		public TerminalNode CSS_Or(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Or, i);
		}
		public SupportsDisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsDisjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSupportsDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSupportsDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSupportsDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsDisjunctionContext supportsDisjunction() throws RecognitionException {
		SupportsDisjunctionContext _localctx = new SupportsDisjunctionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_supportsDisjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			supportsConditionInParens();
			setState(1195); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1186);
					css_ws();
					setState(1187);
					match(CSS_Space);
					setState(1188);
					css_ws();
					setState(1189);
					match(CSS_Or);
					setState(1190);
					css_ws();
					setState(1191);
					match(CSS_Space);
					setState(1192);
					css_ws();
					setState(1193);
					supportsConditionInParens();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1197); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class SupportsDeclarationConditionContext extends ParserRuleContext {
		public TerminalNode CSS_OpenParen() { return getToken(HTMLCSSJinjaParser.CSS_OpenParen, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public SupportsDeclarationConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsDeclarationCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterSupportsDeclarationCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitSupportsDeclarationCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitSupportsDeclarationCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsDeclarationConditionContext supportsDeclarationCondition() throws RecognitionException {
		SupportsDeclarationConditionContext _localctx = new SupportsDeclarationConditionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_supportsDeclarationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(CSS_OpenParen);
			setState(1200);
			css_ws();
			setState(1201);
			declaration();
			setState(1202);
			match(CSS_CloseParen);
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
	public static class GeneralEnclosedContext extends ParserRuleContext {
		public GeneralEnclosedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalEnclosed; }
	 
		public GeneralEnclosedContext() { }
		public void copyFrom(GeneralEnclosedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneralEnclosedRuleContext extends GeneralEnclosedContext {
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public TerminalNode CSS_Function_() { return getToken(HTMLCSSJinjaParser.CSS_Function_, 0); }
		public TerminalNode CSS_OpenParen() { return getToken(HTMLCSSJinjaParser.CSS_OpenParen, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public GeneralEnclosedRuleContext(GeneralEnclosedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterGeneralEnclosedRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitGeneralEnclosedRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitGeneralEnclosedRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralEnclosedContext generalEnclosed() throws RecognitionException {
		GeneralEnclosedContext _localctx = new GeneralEnclosedContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_generalEnclosed);
		int _la;
		try {
			_localctx = new GeneralEnclosedRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			_la = _input.LA(1);
			if ( !(_la==CSS_OpenParen || _la==CSS_Function_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 35466121811263829L) != 0)) {
				{
				setState(1207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_OpenBracket:
				case CSS_OpenParen:
				case CSS_Colon:
				case CSS_Includes:
				case CSS_DashMatch:
				case CSS_Hash:
				case CSS_Percentage:
				case CSS_Url_:
				case CSS_UnicodeRange:
				case CSS_MediaOnly:
				case CSS_Not:
				case CSS_And:
				case CSS_Or:
				case CSS_From:
				case CSS_To:
				case CSS_Number:
				case CSS_String_:
				case CSS_Ident:
				case CSS_Function_:
				case CSS_Dimension:
				case CSS_Plus:
				case CSS_Minus:
					{
					setState(1205);
					any_();
					}
					break;
				case CSS_OpenBrace:
				case CSS_SemiColon:
				case CSS_Cdo:
				case CSS_Cdc:
				case CSS_AtKeyword:
					{
					setState(1206);
					unused();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1212);
			match(CSS_CloseParen);
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
	public static class Var_Context extends ParserRuleContext {
		public Var_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_; }
	 
		public Var_Context() { }
		public void copyFrom(Var_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarRuleContext extends Var_Context {
		public TerminalNode VAR() { return getToken(HTMLCSSJinjaParser.VAR, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_Variable() { return getToken(HTMLCSSJinjaParser.CSS_Variable, 0); }
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public VarRuleContext(Var_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterVarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitVarRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitVarRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_Context var_() throws RecognitionException {
		Var_Context _localctx = new Var_Context(_ctx, getState());
		enterRule(_localctx, 174, RULE_var_);
		try {
			_localctx = new VarRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(VAR);
			setState(1215);
			css_ws();
			setState(1216);
			match(CSS_Variable);
			setState(1217);
			css_ws();
			setState(1218);
			match(CSS_CloseParen);
			setState(1219);
			css_ws();
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
	public static class CalcContext extends ParserRuleContext {
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
	 
		public CalcContext() { }
		public void copyFrom(CalcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcRuleContext extends CalcContext {
		public TerminalNode CALC() { return getToken(HTMLCSSJinjaParser.CALC, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public CalcRuleContext(CalcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCalcRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCalcRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCalcRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_calc);
		try {
			_localctx = new CalcRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			match(CALC);
			setState(1222);
			css_ws();
			setState(1223);
			calcSum();
			setState(1224);
			match(CSS_CloseParen);
			setState(1225);
			css_ws();
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
	public static class CalcSumContext extends ParserRuleContext {
		public CalcSumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcSum; }
	 
		public CalcSumContext() { }
		public void copyFrom(CalcSumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcSumRuleContext extends CalcSumContext {
		public List<CalcProductContext> calcProduct() {
			return getRuleContexts(CalcProductContext.class);
		}
		public CalcProductContext calcProduct(int i) {
			return getRuleContext(CalcProductContext.class,i);
		}
		public List<TerminalNode> CSS_Space() { return getTokens(HTMLCSSJinjaParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Space, i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_Plus() { return getTokens(HTMLCSSJinjaParser.CSS_Plus); }
		public TerminalNode CSS_Plus(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Plus, i);
		}
		public List<TerminalNode> CSS_Minus() { return getTokens(HTMLCSSJinjaParser.CSS_Minus); }
		public TerminalNode CSS_Minus(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Minus, i);
		}
		public CalcSumRuleContext(CalcSumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCalcSumRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCalcSumRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCalcSumRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcSumContext calcSum() throws RecognitionException {
		CalcSumContext _localctx = new CalcSumContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_calcSum);
		int _la;
		try {
			_localctx = new CalcSumRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			calcProduct();
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Space) {
				{
				{
				setState(1228);
				match(CSS_Space);
				setState(1229);
				css_ws();
				setState(1230);
				_la = _input.LA(1);
				if ( !(_la==CSS_Plus || _la==CSS_Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1231);
				css_ws();
				setState(1232);
				match(CSS_Space);
				setState(1233);
				css_ws();
				setState(1234);
				calcProduct();
				}
				}
				setState(1240);
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
	public static class CalcProductContext extends ParserRuleContext {
		public CalcProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcProduct; }
	 
		public CalcProductContext() { }
		public void copyFrom(CalcProductContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcProdRuleContext extends CalcProductContext {
		public List<CalcValueContext> calcValue() {
			return getRuleContexts(CalcValueContext.class);
		}
		public CalcValueContext calcValue(int i) {
			return getRuleContext(CalcValueContext.class,i);
		}
		public List<TerminalNode> CSS_Multiply() { return getTokens(HTMLCSSJinjaParser.CSS_Multiply); }
		public TerminalNode CSS_Multiply(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Multiply, i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_Divide() { return getTokens(HTMLCSSJinjaParser.CSS_Divide); }
		public TerminalNode CSS_Divide(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Divide, i);
		}
		public List<Css_numberContext> css_number() {
			return getRuleContexts(Css_numberContext.class);
		}
		public Css_numberContext css_number(int i) {
			return getRuleContext(Css_numberContext.class,i);
		}
		public CalcProdRuleContext(CalcProductContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCalcProdRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCalcProdRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCalcProdRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcProductContext calcProduct() throws RecognitionException {
		CalcProductContext _localctx = new CalcProductContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_calcProduct);
		int _la;
		try {
			_localctx = new CalcProdRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			calcValue();
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Multiply || _la==CSS_Divide) {
				{
				setState(1251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_Multiply:
					{
					setState(1242);
					match(CSS_Multiply);
					setState(1243);
					css_ws();
					setState(1244);
					calcValue();
					}
					break;
				case CSS_Divide:
					{
					setState(1246);
					match(CSS_Divide);
					setState(1247);
					css_ws();
					setState(1248);
					css_number();
					setState(1249);
					css_ws();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1255);
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
	public static class CalcValueContext extends ParserRuleContext {
		public CalcValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcValue; }
	 
		public CalcValueContext() { }
		public void copyFrom(CalcValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcValParenContext extends CalcValueContext {
		public TerminalNode CSS_OpenParen() { return getToken(HTMLCSSJinjaParser.CSS_OpenParen, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public CalcValParenContext(CalcValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCalcValParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCalcValParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCalcValParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcValDimContext extends CalcValueContext {
		public TerminalNode CSS_Dimension() { return getToken(HTMLCSSJinjaParser.CSS_Dimension, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public CalcValDimContext(CalcValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCalcValDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCalcValDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCalcValDim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcValNumContext extends CalcValueContext {
		public Css_numberContext css_number() {
			return getRuleContext(Css_numberContext.class,0);
		}
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public CalcValNumContext(CalcValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCalcValNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCalcValNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCalcValNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcValPercentContext extends CalcValueContext {
		public TerminalNode CSS_Percentage() { return getToken(HTMLCSSJinjaParser.CSS_Percentage, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public CalcValPercentContext(CalcValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCalcValPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCalcValPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCalcValPercent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcValueContext calcValue() throws RecognitionException {
		CalcValueContext _localctx = new CalcValueContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_calcValue);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_Number:
			case CSS_Plus:
			case CSS_Minus:
				_localctx = new CalcValNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				css_number();
				setState(1257);
				css_ws();
				}
				break;
			case CSS_Dimension:
				_localctx = new CalcValDimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1259);
				match(CSS_Dimension);
				setState(1260);
				css_ws();
				}
				break;
			case CSS_Percentage:
				_localctx = new CalcValPercentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1261);
				match(CSS_Percentage);
				setState(1262);
				css_ws();
				}
				break;
			case CSS_OpenParen:
				_localctx = new CalcValParenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1263);
				match(CSS_OpenParen);
				setState(1264);
				css_ws();
				setState(1265);
				calcSum();
				setState(1266);
				match(CSS_CloseParen);
				setState(1267);
				css_ws();
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
	public static class FontFaceRuleContext extends ParserRuleContext {
		public FontFaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceRule; }
	 
		public FontFaceRuleContext() { }
		public void copyFrom(FontFaceRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontFaceRuleLabelContext extends FontFaceRuleContext {
		public TerminalNode CSS_FontFace() { return getToken(HTMLCSSJinjaParser.CSS_FontFace, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public List<FontFaceDeclarationContext> fontFaceDeclaration() {
			return getRuleContexts(FontFaceDeclarationContext.class);
		}
		public FontFaceDeclarationContext fontFaceDeclaration(int i) {
			return getRuleContext(FontFaceDeclarationContext.class,i);
		}
		public List<TerminalNode> CSS_SemiColon() { return getTokens(HTMLCSSJinjaParser.CSS_SemiColon); }
		public TerminalNode CSS_SemiColon(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_SemiColon, i);
		}
		public FontFaceRuleLabelContext(FontFaceRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterFontFaceRuleLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitFontFaceRuleLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitFontFaceRuleLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFaceRuleContext fontFaceRule() throws RecognitionException {
		FontFaceRuleContext _localctx = new FontFaceRuleContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_fontFaceRule);
		int _la;
		try {
			_localctx = new FontFaceRuleLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(CSS_FontFace);
			setState(1272);
			css_ws();
			setState(1273);
			match(CSS_OpenBrace);
			setState(1274);
			css_ws();
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 824699781129L) != 0)) {
				{
				setState(1275);
				fontFaceDeclaration();
				}
			}

			setState(1285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_SemiColon) {
				{
				{
				setState(1278);
				match(CSS_SemiColon);
				setState(1279);
				css_ws();
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 824699781129L) != 0)) {
					{
					setState(1280);
					fontFaceDeclaration();
					}
				}

				}
				}
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1288);
			match(CSS_CloseBrace);
			setState(1289);
			css_ws();
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
	public static class FontFaceDeclarationContext extends ParserRuleContext {
		public FontFaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceDeclaration; }
	 
		public FontFaceDeclarationContext() { }
		public void copyFrom(FontFaceDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownFontFaceDeclarationContext extends FontFaceDeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode CSS_Colon() { return getToken(HTMLCSSJinjaParser.CSS_Colon, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KnownFontFaceDeclarationContext(FontFaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterKnownFontFaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitKnownFontFaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitKnownFontFaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownFontFaceDeclarationContext extends FontFaceDeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode CSS_Colon() { return getToken(HTMLCSSJinjaParser.CSS_Colon, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnknownFontFaceDeclarationContext(FontFaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterUnknownFontFaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitUnknownFontFaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitUnknownFontFaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFaceDeclarationContext fontFaceDeclaration() throws RecognitionException {
		FontFaceDeclarationContext _localctx = new FontFaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_fontFaceDeclaration);
		try {
			setState(1301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new KnownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1291);
				property_();
				setState(1292);
				match(CSS_Colon);
				setState(1293);
				css_ws();
				setState(1294);
				expr();
				}
				break;
			case 2:
				_localctx = new UnknownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				property_();
				setState(1297);
				match(CSS_Colon);
				setState(1298);
				css_ws();
				setState(1299);
				value();
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
	public static class KeyframesRuleContext extends ParserRuleContext {
		public TerminalNode CSS_Keyframes() { return getToken(HTMLCSSJinjaParser.CSS_Keyframes, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_Space() { return getToken(HTMLCSSJinjaParser.CSS_Space, 0); }
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public List<KeyframeBlockContext> keyframeBlock() {
			return getRuleContexts(KeyframeBlockContext.class);
		}
		public KeyframeBlockContext keyframeBlock(int i) {
			return getRuleContext(KeyframeBlockContext.class,i);
		}
		public KeyframesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterKeyframesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitKeyframesRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitKeyframesRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframesRuleContext keyframesRule() throws RecognitionException {
		KeyframesRuleContext _localctx = new KeyframesRuleContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_keyframesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			match(CSS_Keyframes);
			setState(1304);
			css_ws();
			setState(1305);
			match(CSS_Space);
			setState(1306);
			css_ws();
			setState(1307);
			css_ident();
			setState(1308);
			css_ws();
			setState(1309);
			match(CSS_OpenBrace);
			setState(1310);
			css_ws();
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1733885856537640960L) != 0)) {
				{
				{
				setState(1311);
				keyframeBlock();
				}
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1317);
			match(CSS_CloseBrace);
			setState(1318);
			css_ws();
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
	public static class KeyframeBlockContext extends ParserRuleContext {
		public KeyframeSelectorContext keyframeSelector() {
			return getRuleContext(KeyframeSelectorContext.class,0);
		}
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public KeyframeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterKeyframeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitKeyframeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitKeyframeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeBlockContext keyframeBlock() throws RecognitionException {
		KeyframeBlockContext _localctx = new KeyframeBlockContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_keyframeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1320);
			keyframeSelector();
			setState(1321);
			match(CSS_OpenBrace);
			setState(1322);
			css_ws();
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & 13195196498065L) != 0)) {
				{
				setState(1323);
				declarationList();
				}
			}

			setState(1326);
			match(CSS_CloseBrace);
			setState(1327);
			css_ws();
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
	public static class KeyframeSelectorContext extends ParserRuleContext {
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_From() { return getTokens(HTMLCSSJinjaParser.CSS_From); }
		public TerminalNode CSS_From(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_From, i);
		}
		public List<TerminalNode> CSS_To() { return getTokens(HTMLCSSJinjaParser.CSS_To); }
		public TerminalNode CSS_To(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_To, i);
		}
		public List<TerminalNode> CSS_Percentage() { return getTokens(HTMLCSSJinjaParser.CSS_Percentage); }
		public TerminalNode CSS_Percentage(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Percentage, i);
		}
		public List<TerminalNode> CSS_Comma() { return getTokens(HTMLCSSJinjaParser.CSS_Comma); }
		public TerminalNode CSS_Comma(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Comma, i);
		}
		public KeyframeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterKeyframeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitKeyframeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitKeyframeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeSelectorContext keyframeSelector() throws RecognitionException {
		KeyframeSelectorContext _localctx = new KeyframeSelectorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_keyframeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1733885856537640960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1330);
			css_ws();
			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Comma) {
				{
				{
				setState(1331);
				match(CSS_Comma);
				setState(1332);
				css_ws();
				setState(1333);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1733885856537640960L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1334);
				css_ws();
				}
				}
				setState(1340);
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
	public static class ViewportContext extends ParserRuleContext {
		public TerminalNode CSS_Viewport() { return getToken(HTMLCSSJinjaParser.CSS_Viewport, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public ViewportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterViewport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitViewport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitViewport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportContext viewport() throws RecognitionException {
		ViewportContext _localctx = new ViewportContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_viewport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			match(CSS_Viewport);
			setState(1342);
			css_ws();
			setState(1343);
			match(CSS_OpenBrace);
			setState(1344);
			css_ws();
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & 13195196498065L) != 0)) {
				{
				setState(1345);
				declarationList();
				}
			}

			setState(1348);
			match(CSS_CloseBrace);
			setState(1349);
			css_ws();
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
	public static class CounterStyleContext extends ParserRuleContext {
		public TerminalNode CSS_CounterStyle() { return getToken(HTMLCSSJinjaParser.CSS_CounterStyle, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public CounterStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_counterStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCounterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCounterStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCounterStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CounterStyleContext counterStyle() throws RecognitionException {
		CounterStyleContext _localctx = new CounterStyleContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_counterStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			match(CSS_CounterStyle);
			setState(1352);
			css_ws();
			setState(1353);
			css_ident();
			setState(1354);
			css_ws();
			setState(1355);
			match(CSS_OpenBrace);
			setState(1356);
			css_ws();
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & 13195196498065L) != 0)) {
				{
				setState(1357);
				declarationList();
				}
			}

			setState(1360);
			match(CSS_CloseBrace);
			setState(1361);
			css_ws();
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
	public static class FontFeatureValuesRuleContext extends ParserRuleContext {
		public TerminalNode CSS_FontFeatureValues() { return getToken(HTMLCSSJinjaParser.CSS_FontFeatureValues, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public FontFamilyNameListContext fontFamilyNameList() {
			return getRuleContext(FontFamilyNameListContext.class,0);
		}
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public List<FeatureValueBlockContext> featureValueBlock() {
			return getRuleContexts(FeatureValueBlockContext.class);
		}
		public FeatureValueBlockContext featureValueBlock(int i) {
			return getRuleContext(FeatureValueBlockContext.class,i);
		}
		public FontFeatureValuesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFeatureValuesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterFontFeatureValuesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitFontFeatureValuesRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitFontFeatureValuesRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFeatureValuesRuleContext fontFeatureValuesRule() throws RecognitionException {
		FontFeatureValuesRuleContext _localctx = new FontFeatureValuesRuleContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_fontFeatureValuesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(CSS_FontFeatureValues);
			setState(1364);
			css_ws();
			setState(1365);
			fontFamilyNameList();
			setState(1366);
			css_ws();
			setState(1367);
			match(CSS_OpenBrace);
			setState(1368);
			css_ws();
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_AtKeyword) {
				{
				{
				setState(1369);
				featureValueBlock();
				}
				}
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1375);
			match(CSS_CloseBrace);
			setState(1376);
			css_ws();
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
	public static class FontFamilyNameListContext extends ParserRuleContext {
		public FontFamilyNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyNameList; }
	 
		public FontFamilyNameListContext() { }
		public void copyFrom(FontFamilyNameListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FfNameListContext extends FontFamilyNameListContext {
		public List<FontFamilyNameContext> fontFamilyName() {
			return getRuleContexts(FontFamilyNameContext.class);
		}
		public FontFamilyNameContext fontFamilyName(int i) {
			return getRuleContext(FontFamilyNameContext.class,i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_Comma() { return getTokens(HTMLCSSJinjaParser.CSS_Comma); }
		public TerminalNode CSS_Comma(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Comma, i);
		}
		public FfNameListContext(FontFamilyNameListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterFfNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitFfNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitFfNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyNameListContext fontFamilyNameList() throws RecognitionException {
		FontFamilyNameListContext _localctx = new FontFamilyNameListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_fontFamilyNameList);
		try {
			int _alt;
			_localctx = new FfNameListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			fontFamilyName();
			setState(1386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1379);
					css_ws();
					setState(1380);
					match(CSS_Comma);
					setState(1381);
					css_ws();
					setState(1382);
					fontFamilyName();
					}
					} 
				}
				setState(1388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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
	public static class FontFamilyNameContext extends ParserRuleContext {
		public FontFamilyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyName; }
	 
		public FontFamilyNameContext() { }
		public void copyFrom(FontFamilyNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FfNameStrContext extends FontFamilyNameContext {
		public TerminalNode CSS_String_() { return getToken(HTMLCSSJinjaParser.CSS_String_, 0); }
		public FfNameStrContext(FontFamilyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterFfNameStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitFfNameStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitFfNameStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FfNameIdentContext extends FontFamilyNameContext {
		public List<Css_identContext> css_ident() {
			return getRuleContexts(Css_identContext.class);
		}
		public Css_identContext css_ident(int i) {
			return getRuleContext(Css_identContext.class,i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public FfNameIdentContext(FontFamilyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterFfNameIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitFfNameIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitFfNameIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyNameContext fontFamilyName() throws RecognitionException {
		FontFamilyNameContext _localctx = new FontFamilyNameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_fontFamilyName);
		try {
			int _alt;
			setState(1399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_String_:
				_localctx = new FfNameStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1389);
				match(CSS_String_);
				}
				break;
			case CSS_MediaOnly:
			case CSS_Not:
			case CSS_And:
			case CSS_Or:
			case CSS_From:
			case CSS_To:
			case CSS_Ident:
				_localctx = new FfNameIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1390);
				css_ident();
				setState(1396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1391);
						css_ws();
						setState(1392);
						css_ident();
						}
						} 
					}
					setState(1398);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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
	public static class FeatureValueBlockContext extends ParserRuleContext {
		public FeatureTypeContext featureType() {
			return getRuleContext(FeatureTypeContext.class,0);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_OpenBrace() { return getToken(HTMLCSSJinjaParser.CSS_OpenBrace, 0); }
		public TerminalNode CSS_CloseBrace() { return getToken(HTMLCSSJinjaParser.CSS_CloseBrace, 0); }
		public List<FeatureValueDefinitionContext> featureValueDefinition() {
			return getRuleContexts(FeatureValueDefinitionContext.class);
		}
		public FeatureValueDefinitionContext featureValueDefinition(int i) {
			return getRuleContext(FeatureValueDefinitionContext.class,i);
		}
		public List<TerminalNode> CSS_SemiColon() { return getTokens(HTMLCSSJinjaParser.CSS_SemiColon); }
		public TerminalNode CSS_SemiColon(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_SemiColon, i);
		}
		public FeatureValueBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureValueBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterFeatureValueBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitFeatureValueBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitFeatureValueBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureValueBlockContext featureValueBlock() throws RecognitionException {
		FeatureValueBlockContext _localctx = new FeatureValueBlockContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_featureValueBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			featureType();
			setState(1402);
			css_ws();
			setState(1403);
			match(CSS_OpenBrace);
			setState(1404);
			css_ws();
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 524351L) != 0)) {
				{
				setState(1405);
				featureValueDefinition();
				}
			}

			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1651414925312L) != 0)) {
				{
				{
				setState(1408);
				css_ws();
				setState(1409);
				match(CSS_SemiColon);
				setState(1410);
				css_ws();
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 524351L) != 0)) {
					{
					setState(1411);
					featureValueDefinition();
					}
				}

				}
				}
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1419);
			match(CSS_CloseBrace);
			setState(1420);
			css_ws();
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
	public static class FeatureTypeContext extends ParserRuleContext {
		public TerminalNode CSS_AtKeyword() { return getToken(HTMLCSSJinjaParser.CSS_AtKeyword, 0); }
		public FeatureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterFeatureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitFeatureType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitFeatureType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureTypeContext featureType() throws RecognitionException {
		FeatureTypeContext _localctx = new FeatureTypeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_featureType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			match(CSS_AtKeyword);
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
	public static class FeatureValueDefinitionContext extends ParserRuleContext {
		public Css_identContext css_ident() {
			return getRuleContext(Css_identContext.class,0);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_Colon() { return getToken(HTMLCSSJinjaParser.CSS_Colon, 0); }
		public List<Css_numberContext> css_number() {
			return getRuleContexts(Css_numberContext.class);
		}
		public Css_numberContext css_number(int i) {
			return getRuleContext(Css_numberContext.class,i);
		}
		public FeatureValueDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureValueDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterFeatureValueDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitFeatureValueDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitFeatureValueDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureValueDefinitionContext featureValueDefinition() throws RecognitionException {
		FeatureValueDefinitionContext _localctx = new FeatureValueDefinitionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_featureValueDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			css_ident();
			setState(1425);
			css_ws();
			setState(1426);
			match(CSS_Colon);
			setState(1427);
			css_ws();
			setState(1428);
			css_number();
			setState(1434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1429);
					css_ws();
					setState(1430);
					css_number();
					}
					} 
				}
				setState(1436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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
	public static class Css_identContext extends ParserRuleContext {
		public TerminalNode CSS_Ident() { return getToken(HTMLCSSJinjaParser.CSS_Ident, 0); }
		public TerminalNode CSS_MediaOnly() { return getToken(HTMLCSSJinjaParser.CSS_MediaOnly, 0); }
		public TerminalNode CSS_Not() { return getToken(HTMLCSSJinjaParser.CSS_Not, 0); }
		public TerminalNode CSS_And() { return getToken(HTMLCSSJinjaParser.CSS_And, 0); }
		public TerminalNode CSS_Or() { return getToken(HTMLCSSJinjaParser.CSS_Or, 0); }
		public TerminalNode CSS_From() { return getToken(HTMLCSSJinjaParser.CSS_From, 0); }
		public TerminalNode CSS_To() { return getToken(HTMLCSSJinjaParser.CSS_To, 0); }
		public Css_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCss_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCss_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCss_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_identContext css_ident() throws RecognitionException {
		Css_identContext _localctx = new Css_identContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_css_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			_la = _input.LA(1);
			if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 524351L) != 0)) ) {
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
	public static class Css_wsContext extends ParserRuleContext {
		public List<TerminalNode> CSS_Comment() { return getTokens(HTMLCSSJinjaParser.CSS_Comment); }
		public TerminalNode CSS_Comment(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Comment, i);
		}
		public List<TerminalNode> CSS_Space() { return getTokens(HTMLCSSJinjaParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(HTMLCSSJinjaParser.CSS_Space, i);
		}
		public Css_wsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCss_ws(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCss_ws(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCss_ws(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_wsContext css_ws() throws RecognitionException {
		Css_wsContext _localctx = new Css_wsContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_css_ws);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1439);
					_la = _input.LA(1);
					if ( !(_la==CSS_Comment || _la==CSS_Space) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(1444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
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
	public static class Css_urlContext extends ParserRuleContext {
		public TerminalNode CSS_Url_() { return getToken(HTMLCSSJinjaParser.CSS_Url_, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_String_() { return getToken(HTMLCSSJinjaParser.CSS_String_, 0); }
		public TerminalNode CSS_CloseParen() { return getToken(HTMLCSSJinjaParser.CSS_CloseParen, 0); }
		public Css_urlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).enterCss_url(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLCSSJinjaParserListener ) ((HTMLCSSJinjaParserListener)listener).exitCss_url(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLCSSJinjaParserVisitor ) return ((HTMLCSSJinjaParserVisitor<? extends T>)visitor).visitCss_url(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_urlContext css_url() throws RecognitionException {
		Css_urlContext _localctx = new Css_urlContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_css_url);
		try {
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1445);
				match(CSS_Url_);
				setState(1446);
				css_ws();
				setState(1447);
				match(CSS_String_);
				setState(1448);
				css_ws();
				setState(1449);
				match(CSS_CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1451);
				match(CSS_Url_);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return jinja_expression_inner_sempred((Jinja_expression_innerContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean jinja_expression_inner_sempred(Jinja_expression_innerContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0085\u05af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0001\u0000\u0005\u0000\u00da"+
		"\b\u0000\n\u0000\f\u0000\u00dd\t\u0000\u0001\u0000\u0003\u0000\u00e0\b"+
		"\u0000\u0001\u0000\u0005\u0000\u00e3\b\u0000\n\u0000\f\u0000\u00e6\t\u0000"+
		"\u0001\u0000\u0003\u0000\u00e9\b\u0000\u0001\u0000\u0005\u0000\u00ec\b"+
		"\u0000\n\u0000\f\u0000\u00ef\t\u0000\u0001\u0000\u0005\u0000\u00f2\b\u0000"+
		"\n\u0000\f\u0000\u00f5\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u00f9"+
		"\b\u0001\u0001\u0002\u0005\u0002\u00fc\b\u0002\n\u0002\f\u0002\u00ff\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0103\b\u0002\n\u0002\f\u0002"+
		"\u0106\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u010d\b\u0003\n\u0003\f\u0003\u0110\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0119\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u011e"+
		"\b\u0003\n\u0003\f\u0003\u0121\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0127\b\u0003\u0001\u0004\u0003\u0004\u012a\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0131\b\u0004\u0001\u0004\u0003\u0004\u0134\b\u0004\u0005\u0004"+
		"\u0136\b\u0004\n\u0004\f\u0004\u0139\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u013e\b\u0005\u0001\u0006\u0003\u0006\u0141\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0148\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0150\b\u0006\n\u0006\f\u0006\u0153\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0157\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u015e\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0166"+
		"\b\u0006\n\u0006\f\u0006\u0169\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u016d\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0171\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0175\b\u0006\u0001\u0006\u0003\u0006\u0178"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u017c\b\u0007\u0001\b\u0001"+
		"\b\u0003\b\u0180\b\b\u0001\t\u0001\t\u0003\t\u0184\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0192\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0198\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01a1\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01ad\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01ba\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u01c2\b\u0011\n\u0011\f\u0011\u01c5\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u01d4\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01da\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u01e2\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u01ec\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u01f3\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u01f7\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u01fb\b\u0019\u0001\u001a\u0003"+
		"\u001a\u01fe\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0202\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0206\b\u001b\n\u001b\f\u001b\u0209"+
		"\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0212\b\u001c\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0216\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u021c\b\u001e\n\u001e\f\u001e\u021f\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u022d\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u0233\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u023e\b \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0248\b \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u0251\b \u0001 \u0001 \u0003 \u0255"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u025c\b!\u0001!\u0001!\u0003"+
		"!\u0260\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u026b\b!\u0001!\u0001!\u0003!\u026f\b!\u0001!\u0001!\u0003!\u0273"+
		"\b!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u0282\b$\n$\f$\u0285\t$\u0003$\u0287\b$"+
		"\u0001$\u0001$\u0001%\u0003%\u028c\b%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0005%\u0295\b%\n%\f%\u0298\t%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0005%\u029f\b%\n%\f%\u02a2\t%\u0003%\u02a4\b%\u0001&\u0001&"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02af"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0003)\u02ba\b)\u0001)\u0001)\u0001)\u0003)\u02bf\b)\u0001)\u0001)\u0001"+
		")\u0003)\u02c4\b)\u0005)\u02c6\b)\n)\f)\u02c9\t)\u0001)\u0001)\u0001)"+
		"\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0005"+
		"+\u02d7\b+\n+\f+\u02da\t+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u02e2\b,\n,\f,\u02e5\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u02ef\b-\u0001.\u0001.\u0003.\u02f3\b.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0005.\u02fa\b.\n.\f.\u02fd\t.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0004.\u0304\b.\u000b.\f.\u0305\u0003.\u0308\b.\u0001/\u0003"+
		"/\u030b\b/\u0001/\u0001/\u00010\u00010\u00030\u0311\b0\u00010\u00010\u0001"+
		"1\u00011\u00012\u00032\u0318\b2\u00012\u00012\u00013\u00013\u00013\u0001"+
		"4\u00014\u00014\u00034\u0322\b4\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00034\u032a\b4\u00014\u00014\u00034\u032e\b4\u00014\u00014\u00015\u0001"+
		"5\u00035\u0334\b5\u00015\u00015\u00035\u0338\b5\u00016\u00016\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0346"+
		"\b7\u00017\u00047\u0349\b7\u000b7\f7\u034a\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u0359"+
		"\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u0363"+
		"\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003"+
		";\u036e\b;\u0001<\u0001<\u0001<\u0001<\u0003<\u0374\b<\u0001<\u0001<\u0001"+
		"<\u0001<\u0005<\u037a\b<\n<\f<\u037d\t<\u0001<\u0001<\u0001<\u0003<\u0382"+
		"\b<\u0001<\u0001<\u0001<\u0003<\u0387\b<\u0001=\u0001=\u0005=\u038b\b"+
		"=\n=\f=\u038e\t=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u0395\b=\u0005"+
		"=\u0397\b=\n=\f=\u039a\t=\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u03a1"+
		"\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u03a8\b>\u0001?\u0001?\u0001"+
		"?\u0001@\u0001@\u0001@\u0001@\u0004@\u03b1\b@\u000b@\f@\u03b2\u0001A\u0001"+
		"A\u0003A\u03b7\bA\u0001A\u0005A\u03ba\bA\nA\fA\u03bd\tA\u0001B\u0001B"+
		"\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0003B\u03d7\bB\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001"+
		"F\u0003F\u03e9\bF\u0001F\u0001F\u0001G\u0003G\u03ee\bG\u0001G\u0001G\u0001"+
		"H\u0003H\u03f3\bH\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0005I\u0415\bI\nI\fI\u0418\tI\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0005I\u0421\bI\nI\fI\u0424\tI\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0005I\u042d\bI\nI\fI\u0430"+
		"\tI\u0001I\u0001I\u0001I\u0003I\u0435\bI\u0001J\u0001J\u0001J\u0005J\u043a"+
		"\bJ\nJ\fJ\u043d\tJ\u0001J\u0001J\u0001J\u0003J\u0442\bJ\u0001K\u0001K"+
		"\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u044d\bK\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0005"+
		"L\u0459\bL\nL\fL\u045c\tL\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u046b\bM\u0001N\u0001"+
		"N\u0001N\u0005N\u0470\bN\nN\fN\u0473\tN\u0001N\u0001N\u0001N\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0003P\u0482"+
		"\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u048c"+
		"\bQ\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0004S\u049e\bS\u000bS\fS"+
		"\u049f\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T"+
		"\u0001T\u0004T\u04ac\bT\u000bT\fT\u04ad\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001V\u0001V\u0001V\u0005V\u04b8\bV\nV\fV\u04bb\tV\u0001V\u0001V\u0001"+
		"W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0005Y\u04d5\bY\nY\fY\u04d8\tY\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u04e4\bZ\nZ\fZ\u04e7\tZ\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0003[\u04f6\b[\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0003\\\u04fd\b\\\u0001\\\u0001\\\u0001\\\u0003\\\u0502\b\\\u0005\\"+
		"\u0504\b\\\n\\\f\\\u0507\t\\\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0003]\u0516\b]\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0005^\u0521"+
		"\b^\n^\f^\u0524\t^\u0001^\u0001^\u0001^\u0001_\u0001_\u0001_\u0001_\u0003"+
		"_\u052d\b_\u0001_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0001`\u0005`\u0539\b`\n`\f`\u053c\t`\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0003a\u0543\ba\u0001a\u0001a\u0001a\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0003b\u054f\bb\u0001b\u0001b\u0001b\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0005c\u055b\bc\nc\fc\u055e\tc\u0001c\u0001"+
		"c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0005d\u0569\bd\nd"+
		"\fd\u056c\td\u0001e\u0001e\u0001e\u0001e\u0001e\u0005e\u0573\be\ne\fe"+
		"\u0576\te\u0003e\u0578\be\u0001f\u0001f\u0001f\u0001f\u0001f\u0003f\u057f"+
		"\bf\u0001f\u0001f\u0001f\u0001f\u0003f\u0585\bf\u0005f\u0587\bf\nf\ff"+
		"\u058a\tf\u0001f\u0001f\u0001f\u0001g\u0001g\u0001h\u0001h\u0001h\u0001"+
		"h\u0001h\u0001h\u0001h\u0001h\u0005h\u0599\bh\nh\fh\u059c\th\u0001i\u0001"+
		"i\u0001j\u0005j\u05a1\bj\nj\fj\u05a4\tj\u0001k\u0001k\u0001k\u0001k\u0001"+
		"k\u0001k\u0001k\u0003k\u05ad\bk\u0001k\u0002\u0207\u021d\u0001\"l\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u0000\f\u0001\u0000\u0015\u0016\u0001\u0000"+
		"mn\u0001\u0000kl\u0001\u0000ru\u0001\u0000pq\u0001\u000078\u0003\u0000"+
		"  +,?A\u0001\u0000NO\u0002\u0000\u001b\u001bKK\u0002\u000044;<\u0002\u0000"+
		"7<JJ\u0001\u0000\'(\u0640\u0000\u00db\u0001\u0000\u0000\u0000\u0002\u00f8"+
		"\u0001\u0000\u0000\u0000\u0004\u00fd\u0001\u0000\u0000\u0000\u0006\u0126"+
		"\u0001\u0000\u0000\u0000\b\u0129\u0001\u0000\u0000\u0000\n\u013a\u0001"+
		"\u0000\u0000\u0000\f\u0177\u0001\u0000\u0000\u0000\u000e\u017b\u0001\u0000"+
		"\u0000\u0000\u0010\u017f\u0001\u0000\u0000\u0000\u0012\u0183\u0001\u0000"+
		"\u0000\u0000\u0014\u0185\u0001\u0000\u0000\u0000\u0016\u0188\u0001\u0000"+
		"\u0000\u0000\u0018\u0191\u0001\u0000\u0000\u0000\u001a\u0193\u0001\u0000"+
		"\u0000\u0000\u001c\u01a0\u0001\u0000\u0000\u0000\u001e\u01a2\u0001\u0000"+
		"\u0000\u0000 \u01a9\u0001\u0000\u0000\u0000\"\u01b9\u0001\u0000\u0000"+
		"\u0000$\u01d3\u0001\u0000\u0000\u0000&\u01d5\u0001\u0000\u0000\u0000("+
		"\u01dd\u0001\u0000\u0000\u0000*\u01e3\u0001\u0000\u0000\u0000,\u01e6\u0001"+
		"\u0000\u0000\u0000.\u01ed\u0001\u0000\u0000\u00000\u01f4\u0001\u0000\u0000"+
		"\u00002\u01f8\u0001\u0000\u0000\u00004\u01fd\u0001\u0000\u0000\u00006"+
		"\u0203\u0001\u0000\u0000\u00008\u020c\u0001\u0000\u0000\u0000:\u0213\u0001"+
		"\u0000\u0000\u0000<\u021d\u0001\u0000\u0000\u0000>\u022c\u0001\u0000\u0000"+
		"\u0000@\u0254\u0001\u0000\u0000\u0000B\u0272\u0001\u0000\u0000\u0000D"+
		"\u0274\u0001\u0000\u0000\u0000F\u0276\u0001\u0000\u0000\u0000H\u0286\u0001"+
		"\u0000\u0000\u0000J\u02a3\u0001\u0000\u0000\u0000L\u02a5\u0001\u0000\u0000"+
		"\u0000N\u02a7\u0001\u0000\u0000\u0000P\u02b3\u0001\u0000\u0000\u0000R"+
		"\u02b6\u0001\u0000\u0000\u0000T\u02cd\u0001\u0000\u0000\u0000V\u02d1\u0001"+
		"\u0000\u0000\u0000X\u02db\u0001\u0000\u0000\u0000Z\u02ee\u0001\u0000\u0000"+
		"\u0000\\\u0307\u0001\u0000\u0000\u0000^\u030a\u0001\u0000\u0000\u0000"+
		"`\u0310\u0001\u0000\u0000\u0000b\u0314\u0001\u0000\u0000\u0000d\u0317"+
		"\u0001\u0000\u0000\u0000f\u031b\u0001\u0000\u0000\u0000h\u031e\u0001\u0000"+
		"\u0000\u0000j\u0331\u0001\u0000\u0000\u0000l\u0339\u0001\u0000\u0000\u0000"+
		"n\u0348\u0001\u0000\u0000\u0000p\u034c\u0001\u0000\u0000\u0000r\u0358"+
		"\u0001\u0000\u0000\u0000t\u0362\u0001\u0000\u0000\u0000v\u036d\u0001\u0000"+
		"\u0000\u0000x\u0386\u0001\u0000\u0000\u0000z\u038c\u0001\u0000\u0000\u0000"+
		"|\u03a7\u0001\u0000\u0000\u0000~\u03a9\u0001\u0000\u0000\u0000\u0080\u03b0"+
		"\u0001\u0000\u0000\u0000\u0082\u03b4\u0001\u0000\u0000\u0000\u0084\u03d6"+
		"\u0001\u0000\u0000\u0000\u0086\u03d8\u0001\u0000\u0000\u0000\u0088\u03de"+
		"\u0001\u0000\u0000\u0000\u008a\u03e4\u0001\u0000\u0000\u0000\u008c\u03e8"+
		"\u0001\u0000\u0000\u0000\u008e\u03ed\u0001\u0000\u0000\u0000\u0090\u03f2"+
		"\u0001\u0000\u0000\u0000\u0092\u0434\u0001\u0000\u0000\u0000\u0094\u0436"+
		"\u0001\u0000\u0000\u0000\u0096\u044c\u0001\u0000\u0000\u0000\u0098\u044e"+
		"\u0001\u0000\u0000\u0000\u009a\u046a\u0001\u0000\u0000\u0000\u009c\u046c"+
		"\u0001\u0000\u0000\u0000\u009e\u0477\u0001\u0000\u0000\u0000\u00a0\u0481"+
		"\u0001\u0000\u0000\u0000\u00a2\u048b\u0001\u0000\u0000\u0000\u00a4\u048d"+
		"\u0001\u0000\u0000\u0000\u00a6\u0493\u0001\u0000\u0000\u0000\u00a8\u04a1"+
		"\u0001\u0000\u0000\u0000\u00aa\u04af\u0001\u0000\u0000\u0000\u00ac\u04b4"+
		"\u0001\u0000\u0000\u0000\u00ae\u04be\u0001\u0000\u0000\u0000\u00b0\u04c5"+
		"\u0001\u0000\u0000\u0000\u00b2\u04cb\u0001\u0000\u0000\u0000\u00b4\u04d9"+
		"\u0001\u0000\u0000\u0000\u00b6\u04f5\u0001\u0000\u0000\u0000\u00b8\u04f7"+
		"\u0001\u0000\u0000\u0000\u00ba\u0515\u0001\u0000\u0000\u0000\u00bc\u0517"+
		"\u0001\u0000\u0000\u0000\u00be\u0528\u0001\u0000\u0000\u0000\u00c0\u0531"+
		"\u0001\u0000\u0000\u0000\u00c2\u053d\u0001\u0000\u0000\u0000\u00c4\u0547"+
		"\u0001\u0000\u0000\u0000\u00c6\u0553\u0001\u0000\u0000\u0000\u00c8\u0562"+
		"\u0001\u0000\u0000\u0000\u00ca\u0577\u0001\u0000\u0000\u0000\u00cc\u0579"+
		"\u0001\u0000\u0000\u0000\u00ce\u058e\u0001\u0000\u0000\u0000\u00d0\u0590"+
		"\u0001\u0000\u0000\u0000\u00d2\u059d\u0001\u0000\u0000\u0000\u00d4\u05a2"+
		"\u0001\u0000\u0000\u0000\u00d6\u05ac\u0001\u0000\u0000\u0000\u00d8\u00da"+
		"\u0003\u0002\u0001\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00de\u00e0\u0005\u0003\u0000\u0000\u00df\u00de"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e3\u0003\u0002\u0001\u0000\u00e2\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e9"+
		"\u0005\u0005\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ed\u0001\u0000\u0000\u0000\u00ea\u00ec"+
		"\u0003\u0002\u0001\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f3\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u0003\u0004\u0002\u0000\u00f1\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u0001"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9"+
		"\u0005\u0006\u0000\u0000\u00f7\u00f9\u0005\u0007\u0000\u0000\u00f8\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u0003"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003\u0010\b\u0000\u00fb\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0104\u0003"+
		"\u0006\u0003\u0000\u0101\u0103\u0003\u0010\b\u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0000"+
		"\u0000\u0001\u0108\u0005\u0001\u0000\u0000\u0000\u0109\u010a\u0005\n\u0000"+
		"\u0000\u010a\u010e\u0005\u0013\u0000\u0000\u010b\u010d\u0003\n\u0005\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0111\u0118\u0005\u000f\u0000\u0000\u0112\u0113\u0003\b\u0004\u0000\u0113"+
		"\u0114\u0005\n\u0000\u0000\u0114\u0115\u0005\u0011\u0000\u0000\u0115\u0116"+
		"\u0005\u0013\u0000\u0000\u0116\u0117\u0005\u000f\u0000\u0000\u0117\u0119"+
		"\u0001\u0000\u0000\u0000\u0118\u0112\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u0127\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0005\n\u0000\u0000\u011b\u011f\u0005\u0013\u0000\u0000\u011c\u011e\u0003"+
		"\n\u0005\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0122\u0127\u0005\u0010\u0000\u0000\u0123\u0127\u0005\u0006"+
		"\u0000\u0000\u0124\u0127\u0003\u0014\n\u0000\u0125\u0127\u0003\u0016\u000b"+
		"\u0000\u0126\u0109\u0001\u0000\u0000\u0000\u0126\u011a\u0001\u0000\u0000"+
		"\u0000\u0126\u0123\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0007\u0001\u0000\u0000"+
		"\u0000\u0128\u012a\u0003\u000e\u0007\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u0137\u0001\u0000\u0000"+
		"\u0000\u012b\u0131\u0003\u0006\u0003\u0000\u012c\u0131\u0005\u0004\u0000"+
		"\u0000\u012d\u0131\u0003\u0012\t\u0000\u012e\u0131\u0003\u001a\r\u0000"+
		"\u012f\u0131\u0003 \u0010\u0000\u0130\u012b\u0001\u0000\u0000\u0000\u0130"+
		"\u012c\u0001\u0000\u0000\u0000\u0130\u012d\u0001\u0000\u0000\u0000\u0130"+
		"\u012e\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0133\u0001\u0000\u0000\u0000\u0132\u0134\u0003\u000e\u0007\u0000\u0133"+
		"\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u0136\u0001\u0000\u0000\u0000\u0135\u0130\u0001\u0000\u0000\u0000\u0136"+
		"\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0001\u0000\u0000\u0000\u0138\t\u0001\u0000\u0000\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u013a\u013d\u0005\u0013\u0000\u0000\u013b\u013c"+
		"\u0005\u0012\u0000\u0000\u013c\u013e\u0003\f\u0006\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u000b\u0001"+
		"\u0000\u0000\u0000\u013f\u0141\u0005U\u0000\u0000\u0140\u013f\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u0151\u0005Y\u0000\u0000\u0143\u0150\u0005[\u0000\u0000"+
		"\u0144\u0147\u0005\\\u0000\u0000\u0145\u0148\u0003\"\u0011\u0000\u0146"+
		"\u0148\u0003$\u0012\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0146"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0005\u0080\u0000\u0000\u014a\u0150\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0005]\u0000\u0000\u014c\u014d\u0003\u001c\u000e\u0000\u014d\u014e\u0005"+
		"\u007f\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u0143\u0001"+
		"\u0000\u0000\u0000\u014f\u0144\u0001\u0000\u0000\u0000\u014f\u014b\u0001"+
		"\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0154\u0001"+
		"\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0178\u0005"+
		"^\u0000\u0000\u0155\u0157\u0005U\u0000\u0000\u0156\u0155\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158\u0167\u0005Z\u0000\u0000\u0159\u0166\u0005_\u0000\u0000\u015a"+
		"\u015d\u0005`\u0000\u0000\u015b\u015e\u0003\"\u0011\u0000\u015c\u015e"+
		"\u0003$\u0012\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"\u0080\u0000\u0000\u0160\u0166\u0001\u0000\u0000\u0000\u0161\u0162\u0005"+
		"a\u0000\u0000\u0162\u0163\u0003\u001c\u000e\u0000\u0163\u0164\u0005\u007f"+
		"\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0159\u0001\u0000"+
		"\u0000\u0000\u0165\u015a\u0001\u0000\u0000\u0000\u0165\u0161\u0001\u0000"+
		"\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000"+
		"\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u0178\u0005b\u0000"+
		"\u0000\u016b\u016d\u0005U\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000"+
		"\u016e\u0178\u0005V\u0000\u0000\u016f\u0171\u0005U\u0000\u0000\u0170\u016f"+
		"\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0001\u0000\u0000\u0000\u0172\u0178\u0005W\u0000\u0000\u0173\u0175\u0005"+
		"U\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0178\u0005X\u0000"+
		"\u0000\u0177\u0140\u0001\u0000\u0000\u0000\u0177\u0156\u0001\u0000\u0000"+
		"\u0000\u0177\u016c\u0001\u0000\u0000\u0000\u0177\u0170\u0001\u0000\u0000"+
		"\u0000\u0177\u0174\u0001\u0000\u0000\u0000\u0178\r\u0001\u0000\u0000\u0000"+
		"\u0179\u017c\u0005\u000b\u0000\u0000\u017a\u017c\u0005\u0007\u0000\u0000"+
		"\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000"+
		"\u017c\u000f\u0001\u0000\u0000\u0000\u017d\u0180\u0003\u0012\t\u0000\u017e"+
		"\u0180\u0005\u0007\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f"+
		"\u017e\u0001\u0000\u0000\u0000\u0180\u0011\u0001\u0000\u0000\u0000\u0181"+
		"\u0184\u0005\u0001\u0000\u0000\u0182\u0184\u0005\u0002\u0000\u0000\u0183"+
		"\u0181\u0001\u0000\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184"+
		"\u0013\u0001\u0000\u0000\u0000\u0185\u0186\u0005\b\u0000\u0000\u0186\u0187"+
		"\u0007\u0000\u0000\u0000\u0187\u0015\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0005\t\u0000\u0000\u0189\u018a\u0003<\u001e\u0000\u018a\u018b\u0005"+
		"\u0017\u0000\u0000\u018b\u0017\u0001\u0000\u0000\u0000\u018c\u0192\u0003"+
		" \u0010\u0000\u018d\u0192\u0003\u001a\r\u0000\u018e\u0192\u0003\u001e"+
		"\u000f\u0000\u018f\u0192\u0003&\u0013\u0000\u0190\u0192\u00036\u001b\u0000"+
		"\u0191\u018c\u0001\u0000\u0000\u0000\u0191\u018d\u0001\u0000\u0000\u0000"+
		"\u0191\u018e\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000"+
		"\u0191\u0190\u0001\u0000\u0000\u0000\u0192\u0019\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0005\f\u0000\u0000\u0194\u0195\u0003\u001c\u000e\u0000\u0195"+
		"\u0197\u0005\u007f\u0000\u0000\u0196\u0198\u0005d\u0000\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u001b"+
		"\u0001\u0000\u0000\u0000\u0199\u01a1\u0003,\u0016\u0000\u019a\u01a1\u0003"+
		".\u0017\u0000\u019b\u01a1\u00030\u0018\u0000\u019c\u01a1\u00032\u0019"+
		"\u0000\u019d\u01a1\u00038\u001c\u0000\u019e\u01a1\u0003:\u001d\u0000\u019f"+
		"\u01a1\u0003\u001e\u000f\u0000\u01a0\u0199\u0001\u0000\u0000\u0000\u01a0"+
		"\u019a\u0001\u0000\u0000\u0000\u01a0\u019b\u0001\u0000\u0000\u0000\u01a0"+
		"\u019c\u0001\u0000\u0000\u0000\u01a0\u019d\u0001\u0000\u0000\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1"+
		"\u001d\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005~\u0000\u0000\u01a3\u01a4"+
		"\u0005v\u0000\u0000\u01a4\u01a5\u0005\u0082\u0000\u0000\u01a5\u01a6\u0005"+
		"\u0083\u0000\u0000\u01a6\u01a7\u0003\"\u0011\u0000\u01a7\u01a8\u0005w"+
		"\u0000\u0000\u01a8\u001f\u0001\u0000\u0000\u0000\u01a9\u01ac\u0005\r\u0000"+
		"\u0000\u01aa\u01ad\u0003\"\u0011\u0000\u01ab\u01ad\u0003$\u0012\u0000"+
		"\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\u0080\u0000\u0000"+
		"\u01af!\u0001\u0000\u0000\u0000\u01b0\u01b1\u0006\u0011\uffff\uffff\u0000"+
		"\u01b1\u01b2\u0005v\u0000\u0000\u01b2\u01b3\u0003\"\u0011\u0000\u01b3"+
		"\u01b4\u0005w\u0000\u0000\u01b4\u01ba\u0001\u0000\u0000\u0000\u01b5\u01ba"+
		"\u0005f\u0000\u0000\u01b6\u01ba\u0005e\u0000\u0000\u01b7\u01ba\u0005g"+
		"\u0000\u0000\u01b8\u01ba\u0005\u0082\u0000\u0000\u01b9\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b9\u01b5\u0001\u0000\u0000\u0000\u01b9\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01b8\u0001\u0000"+
		"\u0000\u0000\u01ba\u01c3\u0001\u0000\u0000\u0000\u01bb\u01bc\n\u0006\u0000"+
		"\u0000\u01bc\u01bd\u0007\u0001\u0000\u0000\u01bd\u01c2\u0003\"\u0011\u0007"+
		"\u01be\u01bf\n\u0005\u0000\u0000\u01bf\u01c0\u0007\u0002\u0000\u0000\u01c0"+
		"\u01c2\u0003\"\u0011\u0006\u01c1\u01bb\u0001\u0000\u0000\u0000\u01c1\u01be"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4#\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005"+
		"v\u0000\u0000\u01c7\u01c8\u0003$\u0012\u0000\u01c8\u01c9\u0005w\u0000"+
		"\u0000\u01c9\u01d4\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003\"\u0011\u0000"+
		"\u01cb\u01cc\u0007\u0003\u0000\u0000\u01cc\u01cd\u0003\"\u0011\u0000\u01cd"+
		"\u01d4\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003\"\u0011\u0000\u01cf\u01d0"+
		"\u0007\u0004\u0000\u0000\u01d0\u01d1\u0003\"\u0011\u0000\u01d1\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d4\u0005j\u0000\u0000\u01d3\u01c6\u0001\u0000"+
		"\u0000\u0000\u01d3\u01ca\u0001\u0000\u0000\u0000\u01d3\u01ce\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4%\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d6\u0003,\u0016\u0000\u01d6\u01d9\u00034\u001a\u0000\u01d7"+
		"\u01da\u0003(\u0014\u0000\u01d8\u01da\u0003*\u0015\u0000\u01d9\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01d9\u01da\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0003"+
		"2\u0019\u0000\u01dc\'\u0001\u0000\u0000\u0000\u01dd\u01de\u0003.\u0017"+
		"\u0000\u01de\u01e1\u00034\u001a\u0000\u01df\u01e2\u0003(\u0014\u0000\u01e0"+
		"\u01e2\u0003*\u0015\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2)\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u00030\u0018\u0000\u01e4\u01e5\u00034\u001a"+
		"\u0000\u01e5+\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005x\u0000\u0000\u01e7"+
		"\u01e8\u0005v\u0000\u0000\u01e8\u01e9\u0003$\u0012\u0000\u01e9\u01eb\u0005"+
		"w\u0000\u0000\u01ea\u01ec\u0005d\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec-\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0005y\u0000\u0000\u01ee\u01ef\u0005v\u0000\u0000\u01ef\u01f0"+
		"\u0003$\u0012\u0000\u01f0\u01f2\u0005w\u0000\u0000\u01f1\u01f3\u0005d"+
		"\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3/\u0001\u0000\u0000\u0000\u01f4\u01f6\u0005z\u0000\u0000"+
		"\u01f5\u01f7\u0005d\u0000\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f71\u0001\u0000\u0000\u0000\u01f8\u01fa"+
		"\u0005{\u0000\u0000\u01f9\u01fb\u0005d\u0000\u0000\u01fa\u01f9\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb3\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fe\u0005d\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000"+
		"\u01ff\u0201\u0003\b\u0004\u0000\u0200\u0202\u0005d\u0000\u0000\u0201"+
		"\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"5\u0001\u0000\u0000\u0000\u0203\u0207\u00038\u001c\u0000\u0204\u0206\u0003"+
		"\u0018\f\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0206\u0209\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000"+
		"\u0000\u0000\u0208\u020a\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0003:\u001d\u0000\u020b7\u0001\u0000\u0000\u0000"+
		"\u020c\u020d\u0005|\u0000\u0000\u020d\u020e\u0005v\u0000\u0000\u020e\u020f"+
		"\u0003$\u0012\u0000\u020f\u0211\u0005w\u0000\u0000\u0210\u0212\u0005d"+
		"\u0000\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000"+
		"\u0000\u0000\u02129\u0001\u0000\u0000\u0000\u0213\u0215\u0005}\u0000\u0000"+
		"\u0214\u0216\u0005d\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0001\u0000\u0000\u0000\u0216;\u0001\u0000\u0000\u0000\u0217\u021c"+
		"\u0003>\u001f\u0000\u0218\u021c\u0003@ \u0000\u0219\u021c\u0003\u009a"+
		"M\u0000\u021a\u021c\t\u0000\u0000\u0000\u021b\u0217\u0001\u0000\u0000"+
		"\u0000\u021b\u0218\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000"+
		"\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000"+
		"\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000"+
		"\u0000\u021e=\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000"+
		"\u0220\u0221\u00052\u0000\u0000\u0221\u0222\u0003\u00d4j\u0000\u0222\u0223"+
		"\u0005>\u0000\u0000\u0223\u0224\u0003\u00d4j\u0000\u0224\u0225\u0005\u001f"+
		"\u0000\u0000\u0225\u0226\u0003\u00d4j\u0000\u0226\u022d\u0001\u0000\u0000"+
		"\u0000\u0227\u0228\u00052\u0000\u0000\u0228\u0229\u0003\u00d4j\u0000\u0229"+
		"\u022a\u0005>\u0000\u0000\u022a\u022b\u0003\u00d4j\u0000\u022b\u022d\u0001"+
		"\u0000\u0000\u0000\u022c\u0220\u0001\u0000\u0000\u0000\u022c\u0227\u0001"+
		"\u0000\u0000\u0000\u022d?\u0001\u0000\u0000\u0000\u022e\u022f\u0005.\u0000"+
		"\u0000\u022f\u0232\u0003\u00d4j\u0000\u0230\u0233\u0005>\u0000\u0000\u0231"+
		"\u0233\u0003\u00d6k\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0231"+
		"\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0235"+
		"\u0003\u00d4j\u0000\u0235\u0236\u0003H$\u0000\u0236\u0237\u0005\u001f"+
		"\u0000\u0000\u0237\u0238\u0003\u00d4j\u0000\u0238\u0255\u0001\u0000\u0000"+
		"\u0000\u0239\u023a\u0005.\u0000\u0000\u023a\u023d\u0003\u00d4j\u0000\u023b"+
		"\u023e\u0005>\u0000\u0000\u023c\u023e\u0003\u00d6k\u0000\u023d\u023b\u0001"+
		"\u0000\u0000\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u023f\u0001"+
		"\u0000\u0000\u0000\u023f\u0240\u0003\u00d4j\u0000\u0240\u0241\u0005\u001f"+
		"\u0000\u0000\u0241\u0242\u0003\u00d4j\u0000\u0242\u0255\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0005.\u0000\u0000\u0244\u0247\u0003\u00d4j\u0000\u0245"+
		"\u0248\u0005>\u0000\u0000\u0246\u0248\u0003\u00d6k\u0000\u0247\u0245\u0001"+
		"\u0000\u0000\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0248\u0249\u0001"+
		"\u0000\u0000\u0000\u0249\u024a\u0003\u00d4j\u0000\u024a\u024b\u0003H$"+
		"\u0000\u024b\u0255\u0001\u0000\u0000\u0000\u024c\u024d\u0005.\u0000\u0000"+
		"\u024d\u0250\u0003\u00d4j\u0000\u024e\u0251\u0005>\u0000\u0000\u024f\u0251"+
		"\u0003\u00d6k\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250\u024f\u0001"+
		"\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u0003"+
		"\u00d4j\u0000\u0253\u0255\u0001\u0000\u0000\u0000\u0254\u022e\u0001\u0000"+
		"\u0000\u0000\u0254\u0239\u0001\u0000\u0000\u0000\u0254\u0243\u0001\u0000"+
		"\u0000\u0000\u0254\u024c\u0001\u0000\u0000\u0000\u0255A\u0001\u0000\u0000"+
		"\u0000\u0256\u0257\u00051\u0000\u0000\u0257\u025b\u0003\u00d4j\u0000\u0258"+
		"\u0259\u0003D\"\u0000\u0259\u025a\u0003\u00d4j\u0000\u025a\u025c\u0001"+
		"\u0000\u0000\u0000\u025b\u0258\u0001\u0000\u0000\u0000\u025b\u025c\u0001"+
		"\u0000\u0000\u0000\u025c\u025f\u0001\u0000\u0000\u0000\u025d\u0260\u0005"+
		">\u0000\u0000\u025e\u0260\u0003\u00d6k\u0000\u025f\u025d\u0001\u0000\u0000"+
		"\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000"+
		"\u0000\u0261\u0262\u0003\u00d4j\u0000\u0262\u0263\u0005\u001f\u0000\u0000"+
		"\u0263\u0264\u0003\u00d4j\u0000\u0264\u0273\u0001\u0000\u0000\u0000\u0265"+
		"\u0266\u00051\u0000\u0000\u0266\u026a\u0003\u00d4j\u0000\u0267\u0268\u0003"+
		"D\"\u0000\u0268\u0269\u0003\u00d4j\u0000\u0269\u026b\u0001\u0000\u0000"+
		"\u0000\u026a\u0267\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000"+
		"\u0000\u026b\u026e\u0001\u0000\u0000\u0000\u026c\u026f\u0005>\u0000\u0000"+
		"\u026d\u026f\u0003\u00d6k\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026e"+
		"\u026d\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270"+
		"\u0271\u0003\u00d4j\u0000\u0271\u0273\u0001\u0000\u0000\u0000\u0272\u0256"+
		"\u0001\u0000\u0000\u0000\u0272\u0265\u0001\u0000\u0000\u0000\u0273C\u0001"+
		"\u0000\u0000\u0000\u0274\u0275\u0003\u00d2i\u0000\u0275E\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u00050\u0000\u0000\u0277\u0278\u0003\u00d4j\u0000\u0278"+
		"\u0279\u0003H$\u0000\u0279\u027a\u0003\u009cN\u0000\u027a\u027b\u0003"+
		"\u00d4j\u0000\u027bG\u0001\u0000\u0000\u0000\u027c\u0283\u0003J%\u0000"+
		"\u027d\u027e\u0005Q\u0000\u0000\u027e\u027f\u0003\u00d4j\u0000\u027f\u0280"+
		"\u0003J%\u0000\u0280\u0282\u0001\u0000\u0000\u0000\u0281\u027d\u0001\u0000"+
		"\u0000\u0000\u0282\u0285\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000"+
		"\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000"+
		"\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0286\u027c\u0001\u0000"+
		"\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000"+
		"\u0000\u0000\u0288\u0289\u0003\u00d4j\u0000\u0289I\u0001\u0000\u0000\u0000"+
		"\u028a\u028c\u0007\u0005\u0000\u0000\u028b\u028a\u0001\u0000\u0000\u0000"+
		"\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000"+
		"\u028d\u028e\u0003\u00d4j\u0000\u028e\u028f\u0003L&\u0000\u028f\u0296"+
		"\u0003\u00d4j\u0000\u0290\u0291\u00059\u0000\u0000\u0291\u0292\u0003\u00d4"+
		"j\u0000\u0292\u0293\u0003N\'\u0000\u0293\u0295\u0001\u0000\u0000\u0000"+
		"\u0294\u0290\u0001\u0000\u0000\u0000\u0295\u0298\u0001\u0000\u0000\u0000"+
		"\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000"+
		"\u0297\u02a4\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0299\u02a0\u0003N\'\u0000\u029a\u029b\u00059\u0000\u0000\u029b\u029c"+
		"\u0003\u00d4j\u0000\u029c\u029d\u0003N\'\u0000\u029d\u029f\u0001\u0000"+
		"\u0000\u0000\u029e\u029a\u0001\u0000\u0000\u0000\u029f\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a3\u028b\u0001\u0000\u0000\u0000\u02a3\u0299\u0001\u0000"+
		"\u0000\u0000\u02a4K\u0001\u0000\u0000\u0000\u02a5\u02a6\u0003\u00d2i\u0000"+
		"\u02a6M\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005\u001b\u0000\u0000\u02a8"+
		"\u02a9\u0003\u00d4j\u0000\u02a9\u02ae\u0003P(\u0000\u02aa\u02ab\u0005"+
		"!\u0000\u0000\u02ab\u02ac\u0003\u00d4j\u0000\u02ac\u02ad\u0003\u0082A"+
		"\u0000\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u02aa\u0001\u0000\u0000"+
		"\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b0\u02b1\u0005\u001c\u0000\u0000\u02b1\u02b2\u0003\u00d4j\u0000"+
		"\u02b2O\u0001\u0000\u0000\u0000\u02b3\u02b4\u0003\u00d2i\u0000\u02b4\u02b5"+
		"\u0003\u00d4j\u0000\u02b5Q\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005/"+
		"\u0000\u0000\u02b7\u02b9\u0003\u00d4j\u0000\u02b8\u02ba\u0003T*\u0000"+
		"\u02b9\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc\u0005\u001d\u0000\u0000"+
		"\u02bc\u02be\u0003\u00d4j\u0000\u02bd\u02bf\u0003|>\u0000\u02be\u02bd"+
		"\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005\u001f\u0000\u0000\u02c1\u02c3"+
		"\u0003\u00d4j\u0000\u02c2\u02c4\u0003|>\u0000\u02c3\u02c2\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c6\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c0\u0001\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000"+
		"\u0000\u0000\u02c8\u02ca\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000"+
		"\u0000\u0000\u02ca\u02cb\u0005\u001e\u0000\u0000\u02cb\u02cc\u0003\u00d4"+
		"j\u0000\u02ccS\u0001\u0000\u0000\u0000\u02cd\u02ce\u0005!\u0000\u0000"+
		"\u02ce\u02cf\u0003\u00d2i\u0000\u02cf\u02d0\u0003\u00d4j\u0000\u02d0U"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d8\u0003X,\u0000\u02d2\u02d3\u0005Q"+
		"\u0000\u0000\u02d3\u02d4\u0003\u00d4j\u0000\u02d4\u02d5\u0003X,\u0000"+
		"\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d7\u02da\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9W\u0001\u0000\u0000\u0000\u02da"+
		"\u02d8\u0001\u0000\u0000\u0000\u02db\u02dc\u0003\\.\u0000\u02dc\u02e3"+
		"\u0003\u00d4j\u0000\u02dd\u02de\u0003Z-\u0000\u02de\u02df\u0003\\.\u0000"+
		"\u02df\u02e0\u0003\u00d4j\u0000\u02e0\u02e2\u0001\u0000\u0000\u0000\u02e1"+
		"\u02dd\u0001\u0000\u0000\u0000\u02e2\u02e5\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4"+
		"Y\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e7"+
		"\u0005N\u0000\u0000\u02e7\u02ef\u0003\u00d4j\u0000\u02e8\u02e9\u0005P"+
		"\u0000\u0000\u02e9\u02ef\u0003\u00d4j\u0000\u02ea\u02eb\u0005R\u0000\u0000"+
		"\u02eb\u02ef\u0003\u00d4j\u0000\u02ec\u02ed\u0005(\u0000\u0000\u02ed\u02ef"+
		"\u0003\u00d4j\u0000\u02ee\u02e6\u0001\u0000\u0000\u0000\u02ee\u02e8\u0001"+
		"\u0000\u0000\u0000\u02ee\u02ea\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ef[\u0001\u0000\u0000\u0000\u02f0\u02f3\u0003^/"+
		"\u0000\u02f1\u02f3\u0003d2\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f1\u0001\u0000\u0000\u0000\u02f3\u02fb\u0001\u0000\u0000\u0000\u02f4"+
		"\u02fa\u0005-\u0000\u0000\u02f5\u02fa\u0003f3\u0000\u02f6\u02fa\u0003"+
		"h4\u0000\u02f7\u02fa\u0003j5\u0000\u02f8\u02fa\u0003p8\u0000\u02f9\u02f4"+
		"\u0001\u0000\u0000\u0000\u02f9\u02f5\u0001\u0000\u0000\u0000\u02f9\u02f6"+
		"\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02f9\u02f8"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fd\u0001\u0000\u0000\u0000\u02fb\u02f9"+
		"\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u0308"+
		"\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fe\u0304"+
		"\u0005-\u0000\u0000\u02ff\u0304\u0003f3\u0000\u0300\u0304\u0003h4\u0000"+
		"\u0301\u0304\u0003j5\u0000\u0302\u0304\u0003p8\u0000\u0303\u02fe\u0001"+
		"\u0000\u0000\u0000\u0303\u02ff\u0001\u0000\u0000\u0000\u0303\u0300\u0001"+
		"\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0303\u0302\u0001"+
		"\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0303\u0001"+
		"\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0308\u0001"+
		"\u0000\u0000\u0000\u0307\u02f2\u0001\u0000\u0000\u0000\u0307\u0303\u0001"+
		"\u0000\u0000\u0000\u0308]\u0001\u0000\u0000\u0000\u0309\u030b\u0003`0"+
		"\u0000\u030a\u0309\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000"+
		"\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030d\u0003b1\u0000\u030d"+
		"_\u0001\u0000\u0000\u0000\u030e\u0311\u0003\u00d2i\u0000\u030f\u0311\u0005"+
		"#\u0000\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310\u030f\u0001\u0000"+
		"\u0000\u0000\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000"+
		"\u0000\u0000\u0312\u0313\u0005%\u0000\u0000\u0313a\u0001\u0000\u0000\u0000"+
		"\u0314\u0315\u0003\u00d2i\u0000\u0315c\u0001\u0000\u0000\u0000\u0316\u0318"+
		"\u0003`0\u0000\u0317\u0316\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000"+
		"\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u031a\u0005#\u0000"+
		"\u0000\u031ae\u0001\u0000\u0000\u0000\u031b\u031c\u0005\"\u0000\u0000"+
		"\u031c\u031d\u0003\u00d2i\u0000\u031dg\u0001\u0000\u0000\u0000\u031e\u031f"+
		"\u0005\u0019\u0000\u0000\u031f\u0321\u0003\u00d4j\u0000\u0320\u0322\u0003"+
		"`0\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000"+
		"\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323\u0324\u0003\u00d2i\u0000"+
		"\u0324\u032d\u0003\u00d4j\u0000\u0325\u0326\u0007\u0006\u0000\u0000\u0326"+
		"\u0329\u0003\u00d4j\u0000\u0327\u032a\u0003\u00d2i\u0000\u0328\u032a\u0005"+
		">\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u0328\u0001\u0000"+
		"\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032c\u0003\u00d4"+
		"j\u0000\u032c\u032e\u0001\u0000\u0000\u0000\u032d\u0325\u0001\u0000\u0000"+
		"\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000"+
		"\u0000\u032f\u0330\u0005\u001a\u0000\u0000\u0330i\u0001\u0000\u0000\u0000"+
		"\u0331\u0333\u0005!\u0000\u0000\u0332\u0334\u0005!\u0000\u0000\u0333\u0332"+
		"\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0337"+
		"\u0001\u0000\u0000\u0000\u0335\u0338\u0003\u00d2i\u0000\u0336\u0338\u0003"+
		"l6\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0337\u0336\u0001\u0000\u0000"+
		"\u0000\u0338k\u0001\u0000\u0000\u0000\u0339\u033a\u0005K\u0000\u0000\u033a"+
		"\u033b\u0003\u00d4j\u0000\u033b\u033c\u0003n7\u0000\u033c\u033d\u0005"+
		"\u001c\u0000\u0000\u033dm\u0001\u0000\u0000\u0000\u033e\u0346\u0005N\u0000"+
		"\u0000\u033f\u0346\u0005O\u0000\u0000\u0340\u0346\u0005M\u0000\u0000\u0341"+
		"\u0346\u0005M\u0000\u0000\u0342\u0346\u0005=\u0000\u0000\u0343\u0346\u0005"+
		">\u0000\u0000\u0344\u0346\u0003\u00d2i\u0000\u0345\u033e\u0001\u0000\u0000"+
		"\u0000\u0345\u033f\u0001\u0000\u0000\u0000\u0345\u0340\u0001\u0000\u0000"+
		"\u0000\u0345\u0341\u0001\u0000\u0000\u0000\u0345\u0342\u0001\u0000\u0000"+
		"\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0345\u0344\u0001\u0000\u0000"+
		"\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u0349\u0003\u00d4j\u0000"+
		"\u0348\u0345\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000"+
		"\u034a\u0348\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000"+
		"\u034bo\u0001\u0000\u0000\u0000\u034c\u034d\u0005S\u0000\u0000\u034d\u034e"+
		"\u0003\u00d4j\u0000\u034e\u034f\u0003r9\u0000\u034f\u0350\u0003\u00d4"+
		"j\u0000\u0350\u0351\u0005\u001c\u0000\u0000\u0351q\u0001\u0000\u0000\u0000"+
		"\u0352\u0359\u0003^/\u0000\u0353\u0359\u0003d2\u0000\u0354\u0359\u0005"+
		"-\u0000\u0000\u0355\u0359\u0003f3\u0000\u0356\u0359\u0003h4\u0000\u0357"+
		"\u0359\u0003j5\u0000\u0358\u0352\u0001\u0000\u0000\u0000\u0358\u0353\u0001"+
		"\u0000\u0000\u0000\u0358\u0354\u0001\u0000\u0000\u0000\u0358\u0355\u0001"+
		"\u0000\u0000\u0000\u0358\u0356\u0001\u0000\u0000\u0000\u0358\u0357\u0001"+
		"\u0000\u0000\u0000\u0359s\u0001\u0000\u0000\u0000\u035a\u035b\u0005$\u0000"+
		"\u0000\u035b\u0363\u0003\u00d4j\u0000\u035c\u035d\u0005Q\u0000\u0000\u035d"+
		"\u0363\u0003\u00d4j\u0000\u035e\u035f\u0005(\u0000\u0000\u035f\u0363\u0003"+
		"\u00d4j\u0000\u0360\u0361\u0005 \u0000\u0000\u0361\u0363\u0003\u00d4j"+
		"\u0000\u0362\u035a\u0001\u0000\u0000\u0000\u0362\u035c\u0001\u0000\u0000"+
		"\u0000\u0362\u035e\u0001\u0000\u0000\u0000\u0362\u0360\u0001\u0000\u0000"+
		"\u0000\u0363u\u0001\u0000\u0000\u0000\u0364\u0365\u0003\u00d2i\u0000\u0365"+
		"\u0366\u0003\u00d4j\u0000\u0366\u036e\u0001\u0000\u0000\u0000\u0367\u0368"+
		"\u0005I\u0000\u0000\u0368\u036e\u0003\u00d4j\u0000\u0369\u036a\u0005#"+
		"\u0000\u0000\u036a\u036e\u0003\u00d2i\u0000\u036b\u036c\u0005&\u0000\u0000"+
		"\u036c\u036e\u0003\u00d2i\u0000\u036d\u0364\u0001\u0000\u0000\u0000\u036d"+
		"\u0367\u0001\u0000\u0000\u0000\u036d\u0369\u0001\u0000\u0000\u0000\u036d"+
		"\u036b\u0001\u0000\u0000\u0000\u036ew\u0001\u0000\u0000\u0000\u036f\u0370"+
		"\u0003V+\u0000\u0370\u0371\u0005\u001d\u0000\u0000\u0371\u0373\u0003\u00d4"+
		"j\u0000\u0372\u0374\u0003z=\u0000\u0373\u0372\u0001\u0000\u0000\u0000"+
		"\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000"+
		"\u0375\u0376\u0005\u001e\u0000\u0000\u0376\u0377\u0003\u00d4j\u0000\u0377"+
		"\u0387\u0001\u0000\u0000\u0000\u0378\u037a\u0003\u0092I\u0000\u0379\u0378"+
		"\u0001\u0000\u0000\u0000\u037a\u037d\u0001\u0000\u0000\u0000\u037b\u0379"+
		"\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037e"+
		"\u0001\u0000\u0000\u0000\u037d\u037b\u0001\u0000\u0000\u0000\u037e\u037f"+
		"\u0005\u001d\u0000\u0000\u037f\u0381\u0003\u00d4j\u0000\u0380\u0382\u0003"+
		"z=\u0000\u0381\u0380\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000"+
		"\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0384\u0005\u001e\u0000"+
		"\u0000\u0384\u0385\u0003\u00d4j\u0000\u0385\u0387\u0001\u0000\u0000\u0000"+
		"\u0386\u036f\u0001\u0000\u0000\u0000\u0386\u037b\u0001\u0000\u0000\u0000"+
		"\u0387y\u0001\u0000\u0000\u0000\u0388\u0389\u0005\u001f\u0000\u0000\u0389"+
		"\u038b\u0003\u00d4j\u0000\u038a\u0388\u0001\u0000\u0000\u0000\u038b\u038e"+
		"\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038c\u038d"+
		"\u0001\u0000\u0000\u0000\u038d\u038f\u0001\u0000\u0000\u0000\u038e\u038c"+
		"\u0001\u0000\u0000\u0000\u038f\u0390\u0003|>\u0000\u0390\u0398\u0003\u00d4"+
		"j\u0000\u0391\u0392\u0005\u001f\u0000\u0000\u0392\u0394\u0003\u00d4j\u0000"+
		"\u0393\u0395\u0003|>\u0000\u0394\u0393\u0001\u0000\u0000\u0000\u0394\u0395"+
		"\u0001\u0000\u0000\u0000\u0395\u0397\u0001\u0000\u0000\u0000\u0396\u0391"+
		"\u0001\u0000\u0000\u0000\u0397\u039a\u0001\u0000\u0000\u0000\u0398\u0396"+
		"\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399{\u0001"+
		"\u0000\u0000\u0000\u039a\u0398\u0001\u0000\u0000\u0000\u039b\u039c\u0003"+
		"v;\u0000\u039c\u039d\u0005!\u0000\u0000\u039d\u039e\u0003\u00d4j\u0000"+
		"\u039e\u03a0\u0003\u0082A\u0000\u039f\u03a1\u0003~?\u0000\u03a0\u039f"+
		"\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1\u03a8"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a3\u0003v;\u0000\u03a3\u03a4\u0005!"+
		"\u0000\u0000\u03a4\u03a5\u0003\u00d4j\u0000\u03a5\u03a6\u0003\u0080@\u0000"+
		"\u03a6\u03a8\u0001\u0000\u0000\u0000\u03a7\u039b\u0001\u0000\u0000\u0000"+
		"\u03a7\u03a2\u0001\u0000\u0000\u0000\u03a8}\u0001\u0000\u0000\u0000\u03a9"+
		"\u03aa\u00053\u0000\u0000\u03aa\u03ab\u0003\u00d4j\u0000\u03ab\u007f\u0001"+
		"\u0000\u0000\u0000\u03ac\u03b1\u0003\u0092I\u0000\u03ad\u03b1\u0003\u0098"+
		"L\u0000\u03ae\u03af\u0005L\u0000\u0000\u03af\u03b1\u0003\u00d4j\u0000"+
		"\u03b0\u03ac\u0001\u0000\u0000\u0000\u03b0\u03ad\u0001\u0000\u0000\u0000"+
		"\u03b0\u03ae\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000"+
		"\u03b3\u0081\u0001\u0000\u0000\u0000\u03b4\u03bb\u0003\u0084B\u0000\u03b5"+
		"\u03b7\u0003t:\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001"+
		"\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03ba\u0003"+
		"\u0084B\u0000\u03b9\u03b6\u0001\u0000\u0000\u0000\u03ba\u03bd\u0001\u0000"+
		"\u0000\u0000\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bb\u03bc\u0001\u0000"+
		"\u0000\u0000\u03bc\u0083\u0001\u0000\u0000\u0000\u03bd\u03bb\u0001\u0000"+
		"\u0000\u0000\u03be\u03bf\u0003\u008cF\u0000\u03bf\u03c0\u0003\u00d4j\u0000"+
		"\u03c0\u03d7\u0001\u0000\u0000\u0000\u03c1\u03c2\u00054\u0000\u0000\u03c2"+
		"\u03d7\u0003\u00d4j\u0000\u03c3\u03c4\u0005M\u0000\u0000\u03c4\u03d7\u0003"+
		"\u00d4j\u0000\u03c5\u03c6\u0005>\u0000\u0000\u03c6\u03d7\u0003\u00d4j"+
		"\u0000\u03c7\u03c8\u00056\u0000\u0000\u03c8\u03d7\u0003\u00d4j\u0000\u03c9"+
		"\u03ca\u0003\u00d2i\u0000\u03ca\u03cb\u0003\u00d4j\u0000\u03cb\u03d7\u0001"+
		"\u0000\u0000\u0000\u03cc\u03d7\u0003\u00aeW\u0000\u03cd\u03ce\u0003\u00d6"+
		"k\u0000\u03ce\u03cf\u0003\u00d4j\u0000\u03cf\u03d7\u0001\u0000\u0000\u0000"+
		"\u03d0\u03d7\u0003\u008aE\u0000\u03d1\u03d7\u0003\u00b0X\u0000\u03d2\u03d7"+
		"\u0003\u0086C\u0000\u03d3\u03d4\u0005M\u0000\u0000\u03d4\u03d7\u0003\u00d4"+
		"j\u0000\u03d5\u03d7\u0003\u0088D\u0000\u03d6\u03be\u0001\u0000\u0000\u0000"+
		"\u03d6\u03c1\u0001\u0000\u0000\u0000\u03d6\u03c3\u0001\u0000\u0000\u0000"+
		"\u03d6\u03c5\u0001\u0000\u0000\u0000\u03d6\u03c7\u0001\u0000\u0000\u0000"+
		"\u03d6\u03c9\u0001\u0000\u0000\u0000\u03d6\u03cc\u0001\u0000\u0000\u0000"+
		"\u03d6\u03cd\u0001\u0000\u0000\u0000\u03d6\u03d0\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d1\u0001\u0000\u0000\u0000\u03d6\u03d2\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d3\u0001\u0000\u0000\u0000\u03d6\u03d5\u0001\u0000\u0000\u0000"+
		"\u03d7\u0085\u0001\u0000\u0000\u0000\u03d8\u03d9\u0005K\u0000\u0000\u03d9"+
		"\u03da\u0003\u00d4j\u0000\u03da\u03db\u0003\u0082A\u0000\u03db\u03dc\u0005"+
		"\u001c\u0000\u0000\u03dc\u03dd\u0003\u00d4j\u0000\u03dd\u0087\u0001\u0000"+
		"\u0000\u0000\u03de\u03df\u0005H\u0000\u0000\u03df\u03e0\u0003\u00d4j\u0000"+
		"\u03e0\u03e1\u0003\u0082A\u0000\u03e1\u03e2\u0005\u001c\u0000\u0000\u03e2"+
		"\u03e3\u0003\u00d4j\u0000\u03e3\u0089\u0001\u0000\u0000\u0000\u03e4\u03e5"+
		"\u0005-\u0000\u0000\u03e5\u03e6\u0003\u00d4j\u0000\u03e6\u008b\u0001\u0000"+
		"\u0000\u0000\u03e7\u03e9\u0007\u0007\u0000\u0000\u03e8\u03e7\u0001\u0000"+
		"\u0000\u0000\u03e8\u03e9\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001\u0000"+
		"\u0000\u0000\u03ea\u03eb\u0005=\u0000\u0000\u03eb\u008d\u0001\u0000\u0000"+
		"\u0000\u03ec\u03ee\u0007\u0007\u0000\u0000\u03ed\u03ec\u0001\u0000\u0000"+
		"\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000"+
		"\u0000\u03ef\u03f0\u00054\u0000\u0000\u03f0\u008f\u0001\u0000\u0000\u0000"+
		"\u03f1\u03f3\u0007\u0007\u0000\u0000\u03f2\u03f1\u0001\u0000\u0000\u0000"+
		"\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000"+
		"\u03f4\u03f5\u0005M\u0000\u0000\u03f5\u0091\u0001\u0000\u0000\u0000\u03f6"+
		"\u03f7\u0003\u00d2i\u0000\u03f7\u03f8\u0003\u00d4j\u0000\u03f8\u0435\u0001"+
		"\u0000\u0000\u0000\u03f9\u03fa\u0003\u008cF\u0000\u03fa\u03fb\u0003\u00d4"+
		"j\u0000\u03fb\u0435\u0001\u0000\u0000\u0000\u03fc\u03fd\u0003\u008eG\u0000"+
		"\u03fd\u03fe\u0003\u00d4j\u0000\u03fe\u0435\u0001\u0000\u0000\u0000\u03ff"+
		"\u0400\u0005M\u0000\u0000\u0400\u0435\u0003\u00d4j\u0000\u0401\u0402\u0005"+
		">\u0000\u0000\u0402\u0435\u0003\u00d4j\u0000\u0403\u0404\u0003\u00d6k"+
		"\u0000\u0404\u0405\u0003\u00d4j\u0000\u0405\u0435\u0001\u0000\u0000\u0000"+
		"\u0406\u0407\u0005-\u0000\u0000\u0407\u0435\u0003\u00d4j\u0000\u0408\u0409"+
		"\u00056\u0000\u0000\u0409\u0435\u0003\u00d4j\u0000\u040a\u040b\u0005+"+
		"\u0000\u0000\u040b\u0435\u0003\u00d4j\u0000\u040c\u040d\u0005,\u0000\u0000"+
		"\u040d\u0435\u0003\u00d4j\u0000\u040e\u040f\u0005!\u0000\u0000\u040f\u0435"+
		"\u0003\u00d4j\u0000\u0410\u0411\u0005K\u0000\u0000\u0411\u0416\u0003\u00d4"+
		"j\u0000\u0412\u0415\u0003\u0092I\u0000\u0413\u0415\u0003\u0096K\u0000"+
		"\u0414\u0412\u0001\u0000\u0000\u0000\u0414\u0413\u0001\u0000\u0000\u0000"+
		"\u0415\u0418\u0001\u0000\u0000\u0000\u0416\u0414\u0001\u0000\u0000\u0000"+
		"\u0416\u0417\u0001\u0000\u0000\u0000\u0417\u0419\u0001\u0000\u0000\u0000"+
		"\u0418\u0416\u0001\u0000\u0000\u0000\u0419\u041a\u0005\u001c\u0000\u0000"+
		"\u041a\u041b\u0003\u00d4j\u0000\u041b\u0435\u0001\u0000\u0000\u0000\u041c"+
		"\u041d\u0005\u001b\u0000\u0000\u041d\u0422\u0003\u00d4j\u0000\u041e\u0421"+
		"\u0003\u0092I\u0000\u041f\u0421\u0003\u0096K\u0000\u0420\u041e\u0001\u0000"+
		"\u0000\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0421\u0424\u0001\u0000"+
		"\u0000\u0000\u0422\u0420\u0001\u0000\u0000\u0000\u0422\u0423\u0001\u0000"+
		"\u0000\u0000\u0423\u0425\u0001\u0000\u0000\u0000\u0424\u0422\u0001\u0000"+
		"\u0000\u0000\u0425\u0426\u0005\u001c\u0000\u0000\u0426\u0427\u0003\u00d4"+
		"j\u0000\u0427\u0435\u0001\u0000\u0000\u0000\u0428\u0429\u0005\u0019\u0000"+
		"\u0000\u0429\u042e\u0003\u00d4j\u0000\u042a\u042d\u0003\u0092I\u0000\u042b"+
		"\u042d\u0003\u0096K\u0000\u042c\u042a\u0001\u0000\u0000\u0000\u042c\u042b"+
		"\u0001\u0000\u0000\u0000\u042d\u0430\u0001\u0000\u0000\u0000\u042e\u042c"+
		"\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000\u042f\u0431"+
		"\u0001\u0000\u0000\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0431\u0432"+
		"\u0005\u001a\u0000\u0000\u0432\u0433\u0003\u00d4j\u0000\u0433\u0435\u0001"+
		"\u0000\u0000\u0000\u0434\u03f6\u0001\u0000\u0000\u0000\u0434\u03f9\u0001"+
		"\u0000\u0000\u0000\u0434\u03fc\u0001\u0000\u0000\u0000\u0434\u03ff\u0001"+
		"\u0000\u0000\u0000\u0434\u0401\u0001\u0000\u0000\u0000\u0434\u0403\u0001"+
		"\u0000\u0000\u0000\u0434\u0406\u0001\u0000\u0000\u0000\u0434\u0408\u0001"+
		"\u0000\u0000\u0000\u0434\u040a\u0001\u0000\u0000\u0000\u0434\u040c\u0001"+
		"\u0000\u0000\u0000\u0434\u040e\u0001\u0000\u0000\u0000\u0434\u0410\u0001"+
		"\u0000\u0000\u0000\u0434\u041c\u0001\u0000\u0000\u0000\u0434\u0428\u0001"+
		"\u0000\u0000\u0000\u0435\u0093\u0001\u0000\u0000\u0000\u0436\u0437\u0005"+
		"L\u0000\u0000\u0437\u043b\u0003\u00d4j\u0000\u0438\u043a\u0003\u0092I"+
		"\u0000\u0439\u0438\u0001\u0000\u0000\u0000\u043a\u043d\u0001\u0000\u0000"+
		"\u0000\u043b\u0439\u0001\u0000\u0000\u0000\u043b\u043c\u0001\u0000\u0000"+
		"\u0000\u043c\u0441\u0001\u0000\u0000\u0000\u043d\u043b\u0001\u0000\u0000"+
		"\u0000\u043e\u0442\u0003\u0098L\u0000\u043f\u0440\u0005\u001f\u0000\u0000"+
		"\u0440\u0442\u0003\u00d4j\u0000\u0441\u043e\u0001\u0000\u0000\u0000\u0441"+
		"\u043f\u0001\u0000\u0000\u0000\u0442\u0095\u0001\u0000\u0000\u0000\u0443"+
		"\u044d\u0003\u0098L\u0000\u0444\u0445\u0005L\u0000\u0000\u0445\u044d\u0003"+
		"\u00d4j\u0000\u0446\u0447\u0005\u001f\u0000\u0000\u0447\u044d\u0003\u00d4"+
		"j\u0000\u0448\u0449\u0005)\u0000\u0000\u0449\u044d\u0003\u00d4j\u0000"+
		"\u044a\u044b\u0005*\u0000\u0000\u044b\u044d\u0003\u00d4j\u0000\u044c\u0443"+
		"\u0001\u0000\u0000\u0000\u044c\u0444\u0001\u0000\u0000\u0000\u044c\u0446"+
		"\u0001\u0000\u0000\u0000\u044c\u0448\u0001\u0000\u0000\u0000\u044c\u044a"+
		"\u0001\u0000\u0000\u0000\u044d\u0097\u0001\u0000\u0000\u0000\u044e\u044f"+
		"\u0005\u001d\u0000\u0000\u044f\u045a\u0003\u00d4j\u0000\u0450\u0459\u0003"+
		"z=\u0000\u0451\u0459\u0003\u009aM\u0000\u0452\u0459\u0003\u0092I\u0000"+
		"\u0453\u0459\u0003\u0098L\u0000\u0454\u0455\u0005L\u0000\u0000\u0455\u0459"+
		"\u0003\u00d4j\u0000\u0456\u0457\u0005\u001f\u0000\u0000\u0457\u0459\u0003"+
		"\u00d4j\u0000\u0458\u0450\u0001\u0000\u0000\u0000\u0458\u0451\u0001\u0000"+
		"\u0000\u0000\u0458\u0452\u0001\u0000\u0000\u0000\u0458\u0453\u0001\u0000"+
		"\u0000\u0000\u0458\u0454\u0001\u0000\u0000\u0000\u0458\u0456\u0001\u0000"+
		"\u0000\u0000\u0459\u045c\u0001\u0000\u0000\u0000\u045a\u0458\u0001\u0000"+
		"\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000\u045b\u045d\u0001\u0000"+
		"\u0000\u0000\u045c\u045a\u0001\u0000\u0000\u0000\u045d\u045e\u0005\u001e"+
		"\u0000\u0000\u045e\u045f\u0003\u00d4j\u0000\u045f\u0099\u0001\u0000\u0000"+
		"\u0000\u0460\u046b\u0003x<\u0000\u0461\u046b\u0003F#\u0000\u0462\u046b"+
		"\u0003R)\u0000\u0463\u046b\u0003\u00b8\\\u0000\u0464\u046b\u0003\u00bc"+
		"^\u0000\u0465\u046b\u0003\u009eO\u0000\u0466\u046b\u0003\u00c2a\u0000"+
		"\u0467\u046b\u0003\u00c4b\u0000\u0468\u046b\u0003\u00c6c\u0000\u0469\u046b"+
		"\u0003\u0094J\u0000\u046a\u0460\u0001\u0000\u0000\u0000\u046a\u0461\u0001"+
		"\u0000\u0000\u0000\u046a\u0462\u0001\u0000\u0000\u0000\u046a\u0463\u0001"+
		"\u0000\u0000\u0000\u046a\u0464\u0001\u0000\u0000\u0000\u046a\u0465\u0001"+
		"\u0000\u0000\u0000\u046a\u0466\u0001\u0000\u0000\u0000\u046a\u0467\u0001"+
		"\u0000\u0000\u0000\u046a\u0468\u0001\u0000\u0000\u0000\u046a\u0469\u0001"+
		"\u0000\u0000\u0000\u046b\u009b\u0001\u0000\u0000\u0000\u046c\u046d\u0005"+
		"\u001d\u0000\u0000\u046d\u0471\u0003\u00d4j\u0000\u046e\u0470\u0003\u009a"+
		"M\u0000\u046f\u046e\u0001\u0000\u0000\u0000\u0470\u0473\u0001\u0000\u0000"+
		"\u0000\u0471\u046f\u0001\u0000\u0000\u0000\u0471\u0472\u0001\u0000\u0000"+
		"\u0000\u0472\u0474\u0001\u0000\u0000\u0000\u0473\u0471\u0001\u0000\u0000"+
		"\u0000\u0474\u0475\u0005\u001e\u0000\u0000\u0475\u0476\u0003\u00d4j\u0000"+
		"\u0476\u009d\u0001\u0000\u0000\u0000\u0477\u0478\u0005C\u0000\u0000\u0478"+
		"\u0479\u0003\u00d4j\u0000\u0479\u047a\u0003\u00a0P\u0000\u047a\u047b\u0003"+
		"\u00d4j\u0000\u047b\u047c\u0003\u009cN\u0000\u047c\u009f\u0001\u0000\u0000"+
		"\u0000\u047d\u0482\u0003\u00a4R\u0000\u047e\u0482\u0003\u00a6S\u0000\u047f"+
		"\u0482\u0003\u00a8T\u0000\u0480\u0482\u0003\u00a2Q\u0000\u0481\u047d\u0001"+
		"\u0000\u0000\u0000\u0481\u047e\u0001\u0000\u0000\u0000\u0481\u047f\u0001"+
		"\u0000\u0000\u0000\u0481\u0480\u0001\u0000\u0000\u0000\u0482\u00a1\u0001"+
		"\u0000\u0000\u0000\u0483\u0484\u0005\u001b\u0000\u0000\u0484\u0485\u0003"+
		"\u00d4j\u0000\u0485\u0486\u0003\u00a0P\u0000\u0486\u0487\u0003\u00d4j"+
		"\u0000\u0487\u0488\u0005\u001c\u0000\u0000\u0488\u048c\u0001\u0000\u0000"+
		"\u0000\u0489\u048c\u0003\u00aaU\u0000\u048a\u048c\u0003\u00acV\u0000\u048b"+
		"\u0483\u0001\u0000\u0000\u0000\u048b\u0489\u0001\u0000\u0000\u0000\u048b"+
		"\u048a\u0001\u0000\u0000\u0000\u048c\u00a3\u0001\u0000\u0000\u0000\u048d"+
		"\u048e\u00058\u0000\u0000\u048e\u048f\u0003\u00d4j\u0000\u048f\u0490\u0005"+
		"(\u0000\u0000\u0490\u0491\u0003\u00d4j\u0000\u0491\u0492\u0003\u00a2Q"+
		"\u0000\u0492\u00a5\u0001\u0000\u0000\u0000\u0493\u049d\u0003\u00a2Q\u0000"+
		"\u0494\u0495\u0003\u00d4j\u0000\u0495\u0496\u0005(\u0000\u0000\u0496\u0497"+
		"\u0003\u00d4j\u0000\u0497\u0498\u00059\u0000\u0000\u0498\u0499\u0003\u00d4"+
		"j\u0000\u0499\u049a\u0005(\u0000\u0000\u049a\u049b\u0003\u00d4j\u0000"+
		"\u049b\u049c\u0003\u00a2Q\u0000\u049c\u049e\u0001\u0000\u0000\u0000\u049d"+
		"\u0494\u0001\u0000\u0000\u0000\u049e\u049f\u0001\u0000\u0000\u0000\u049f"+
		"\u049d\u0001\u0000\u0000\u0000\u049f\u04a0\u0001\u0000\u0000\u0000\u04a0"+
		"\u00a7\u0001\u0000\u0000\u0000\u04a1\u04ab\u0003\u00a2Q\u0000\u04a2\u04a3"+
		"\u0003\u00d4j\u0000\u04a3\u04a4\u0005(\u0000\u0000\u04a4\u04a5\u0003\u00d4"+
		"j\u0000\u04a5\u04a6\u0005:\u0000\u0000\u04a6\u04a7\u0003\u00d4j\u0000"+
		"\u04a7\u04a8\u0005(\u0000\u0000\u04a8\u04a9\u0003\u00d4j\u0000\u04a9\u04aa"+
		"\u0003\u00a2Q\u0000\u04aa\u04ac\u0001\u0000\u0000\u0000\u04ab\u04a2\u0001"+
		"\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000\u0000\u0000\u04ad\u04ab\u0001"+
		"\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000\u0000\u04ae\u00a9\u0001"+
		"\u0000\u0000\u0000\u04af\u04b0\u0005\u001b\u0000\u0000\u04b0\u04b1\u0003"+
		"\u00d4j\u0000\u04b1\u04b2\u0003|>\u0000\u04b2\u04b3\u0005\u001c\u0000"+
		"\u0000\u04b3\u00ab\u0001\u0000\u0000\u0000\u04b4\u04b9\u0007\b\u0000\u0000"+
		"\u04b5\u04b8\u0003\u0092I\u0000\u04b6\u04b8\u0003\u0096K\u0000\u04b7\u04b5"+
		"\u0001\u0000\u0000\u0000\u04b7\u04b6\u0001\u0000\u0000\u0000\u04b8\u04bb"+
		"\u0001\u0000\u0000\u0000\u04b9\u04b7\u0001\u0000\u0000\u0000\u04b9\u04ba"+
		"\u0001\u0000\u0000\u0000\u04ba\u04bc\u0001\u0000\u0000\u0000\u04bb\u04b9"+
		"\u0001\u0000\u0000\u0000\u04bc\u04bd\u0005\u001c\u0000\u0000\u04bd\u00ad"+
		"\u0001\u0000\u0000\u0000\u04be\u04bf\u0005\u0084\u0000\u0000\u04bf\u04c0"+
		"\u0003\u00d4j\u0000\u04c0\u04c1\u0005I\u0000\u0000\u04c1\u04c2\u0003\u00d4"+
		"j\u0000\u04c2\u04c3\u0005\u001c\u0000\u0000\u04c3\u04c4\u0003\u00d4j\u0000"+
		"\u04c4\u00af\u0001\u0000\u0000\u0000\u04c5\u04c6\u0005\u0085\u0000\u0000"+
		"\u04c6\u04c7\u0003\u00d4j\u0000\u04c7\u04c8\u0003\u00b2Y\u0000\u04c8\u04c9"+
		"\u0005\u001c\u0000\u0000\u04c9\u04ca\u0003\u00d4j\u0000\u04ca\u00b1\u0001"+
		"\u0000\u0000\u0000\u04cb\u04d6\u0003\u00b4Z\u0000\u04cc\u04cd\u0005(\u0000"+
		"\u0000\u04cd\u04ce\u0003\u00d4j\u0000\u04ce\u04cf\u0007\u0007\u0000\u0000"+
		"\u04cf\u04d0\u0003\u00d4j\u0000\u04d0\u04d1\u0005(\u0000\u0000\u04d1\u04d2"+
		"\u0003\u00d4j\u0000\u04d2\u04d3\u0003\u00b4Z\u0000\u04d3\u04d5\u0001\u0000"+
		"\u0000\u0000\u04d4\u04cc\u0001\u0000\u0000\u0000\u04d5\u04d8\u0001\u0000"+
		"\u0000\u0000\u04d6\u04d4\u0001\u0000\u0000\u0000\u04d6\u04d7\u0001\u0000"+
		"\u0000\u0000\u04d7\u00b3\u0001\u0000\u0000\u0000\u04d8\u04d6\u0001\u0000"+
		"\u0000\u0000\u04d9\u04e5\u0003\u00b6[\u0000\u04da\u04db\u0005#\u0000\u0000"+
		"\u04db\u04dc\u0003\u00d4j\u0000\u04dc\u04dd\u0003\u00b6[\u0000\u04dd\u04e4"+
		"\u0001\u0000\u0000\u0000\u04de\u04df\u0005$\u0000\u0000\u04df\u04e0\u0003"+
		"\u00d4j\u0000\u04e0\u04e1\u0003\u008cF\u0000\u04e1\u04e2\u0003\u00d4j"+
		"\u0000\u04e2\u04e4\u0001\u0000\u0000\u0000\u04e3\u04da\u0001\u0000\u0000"+
		"\u0000\u04e3\u04de\u0001\u0000\u0000\u0000\u04e4\u04e7\u0001\u0000\u0000"+
		"\u0000\u04e5\u04e3\u0001\u0000\u0000\u0000\u04e5\u04e6\u0001\u0000\u0000"+
		"\u0000\u04e6\u00b5\u0001\u0000\u0000\u0000\u04e7\u04e5\u0001\u0000\u0000"+
		"\u0000\u04e8\u04e9\u0003\u008cF\u0000\u04e9\u04ea\u0003\u00d4j\u0000\u04ea"+
		"\u04f6\u0001\u0000\u0000\u0000\u04eb\u04ec\u0005M\u0000\u0000\u04ec\u04f6"+
		"\u0003\u00d4j\u0000\u04ed\u04ee\u00054\u0000\u0000\u04ee\u04f6\u0003\u00d4"+
		"j\u0000\u04ef\u04f0\u0005\u001b\u0000\u0000\u04f0\u04f1\u0003\u00d4j\u0000"+
		"\u04f1\u04f2\u0003\u00b2Y\u0000\u04f2\u04f3\u0005\u001c\u0000\u0000\u04f3"+
		"\u04f4\u0003\u00d4j\u0000\u04f4\u04f6\u0001\u0000\u0000\u0000\u04f5\u04e8"+
		"\u0001\u0000\u0000\u0000\u04f5\u04eb\u0001\u0000\u0000\u0000\u04f5\u04ed"+
		"\u0001\u0000\u0000\u0000\u04f5\u04ef\u0001\u0000\u0000\u0000\u04f6\u00b7"+
		"\u0001\u0000\u0000\u0000\u04f7\u04f8\u0005B\u0000\u0000\u04f8\u04f9\u0003"+
		"\u00d4j\u0000\u04f9\u04fa\u0005\u001d\u0000\u0000\u04fa\u04fc\u0003\u00d4"+
		"j\u0000\u04fb\u04fd\u0003\u00ba]\u0000\u04fc\u04fb\u0001\u0000\u0000\u0000"+
		"\u04fc\u04fd\u0001\u0000\u0000\u0000\u04fd\u0505\u0001\u0000\u0000\u0000"+
		"\u04fe\u04ff\u0005\u001f\u0000\u0000\u04ff\u0501\u0003\u00d4j\u0000\u0500"+
		"\u0502\u0003\u00ba]\u0000\u0501\u0500\u0001\u0000\u0000\u0000\u0501\u0502"+
		"\u0001\u0000\u0000\u0000\u0502\u0504\u0001\u0000\u0000\u0000\u0503\u04fe"+
		"\u0001\u0000\u0000\u0000\u0504\u0507\u0001\u0000\u0000\u0000\u0505\u0503"+
		"\u0001\u0000\u0000\u0000\u0505\u0506\u0001\u0000\u0000\u0000\u0506\u0508"+
		"\u0001\u0000\u0000\u0000\u0507\u0505\u0001\u0000\u0000\u0000\u0508\u0509"+
		"\u0005\u001e\u0000\u0000\u0509\u050a\u0003\u00d4j\u0000\u050a\u00b9\u0001"+
		"\u0000\u0000\u0000\u050b\u050c\u0003v;\u0000\u050c\u050d\u0005!\u0000"+
		"\u0000\u050d\u050e\u0003\u00d4j\u0000\u050e\u050f\u0003\u0082A\u0000\u050f"+
		"\u0516\u0001\u0000\u0000\u0000\u0510\u0511\u0003v;\u0000\u0511\u0512\u0005"+
		"!\u0000\u0000\u0512\u0513\u0003\u00d4j\u0000\u0513\u0514\u0003\u0080@"+
		"\u0000\u0514\u0516\u0001\u0000\u0000\u0000\u0515\u050b\u0001\u0000\u0000"+
		"\u0000\u0515\u0510\u0001\u0000\u0000\u0000\u0516\u00bb\u0001\u0000\u0000"+
		"\u0000\u0517\u0518\u0005D\u0000\u0000\u0518\u0519\u0003\u00d4j\u0000\u0519"+
		"\u051a\u0005(\u0000\u0000\u051a\u051b\u0003\u00d4j\u0000\u051b\u051c\u0003"+
		"\u00d2i\u0000\u051c\u051d\u0003\u00d4j\u0000\u051d\u051e\u0005\u001d\u0000"+
		"\u0000\u051e\u0522\u0003\u00d4j\u0000\u051f\u0521\u0003\u00be_\u0000\u0520"+
		"\u051f\u0001\u0000\u0000\u0000\u0521\u0524\u0001\u0000\u0000\u0000\u0522"+
		"\u0520\u0001\u0000\u0000\u0000\u0522\u0523\u0001\u0000\u0000\u0000\u0523"+
		"\u0525\u0001\u0000\u0000\u0000\u0524\u0522\u0001\u0000\u0000\u0000\u0525"+
		"\u0526\u0005\u001e\u0000\u0000\u0526\u0527\u0003\u00d4j\u0000\u0527\u00bd"+
		"\u0001\u0000\u0000\u0000\u0528\u0529\u0003\u00c0`\u0000\u0529\u052a\u0005"+
		"\u001d\u0000\u0000\u052a\u052c\u0003\u00d4j\u0000\u052b\u052d\u0003z="+
		"\u0000\u052c\u052b\u0001\u0000\u0000\u0000\u052c\u052d\u0001\u0000\u0000"+
		"\u0000\u052d\u052e\u0001\u0000\u0000\u0000\u052e\u052f\u0005\u001e\u0000"+
		"\u0000\u052f\u0530\u0003\u00d4j\u0000\u0530\u00bf\u0001\u0000\u0000\u0000"+
		"\u0531\u0532\u0007\t\u0000\u0000\u0532\u053a\u0003\u00d4j\u0000\u0533"+
		"\u0534\u0005Q\u0000\u0000\u0534\u0535\u0003\u00d4j\u0000\u0535\u0536\u0007"+
		"\t\u0000\u0000\u0536\u0537\u0003\u00d4j\u0000\u0537\u0539\u0001\u0000"+
		"\u0000\u0000\u0538\u0533\u0001\u0000\u0000\u0000\u0539\u053c\u0001\u0000"+
		"\u0000\u0000\u053a\u0538\u0001\u0000\u0000\u0000\u053a\u053b\u0001\u0000"+
		"\u0000\u0000\u053b\u00c1\u0001\u0000\u0000\u0000\u053c\u053a\u0001\u0000"+
		"\u0000\u0000\u053d\u053e\u0005E\u0000\u0000\u053e\u053f\u0003\u00d4j\u0000"+
		"\u053f\u0540\u0005\u001d\u0000\u0000\u0540\u0542\u0003\u00d4j\u0000\u0541"+
		"\u0543\u0003z=\u0000\u0542\u0541\u0001\u0000\u0000\u0000\u0542\u0543\u0001"+
		"\u0000\u0000\u0000\u0543\u0544\u0001\u0000\u0000\u0000\u0544\u0545\u0005"+
		"\u001e\u0000\u0000\u0545\u0546\u0003\u00d4j\u0000\u0546\u00c3\u0001\u0000"+
		"\u0000\u0000\u0547\u0548\u0005F\u0000\u0000\u0548\u0549\u0003\u00d4j\u0000"+
		"\u0549\u054a\u0003\u00d2i\u0000\u054a\u054b\u0003\u00d4j\u0000\u054b\u054c"+
		"\u0005\u001d\u0000\u0000\u054c\u054e\u0003\u00d4j\u0000\u054d\u054f\u0003"+
		"z=\u0000\u054e\u054d\u0001\u0000\u0000\u0000\u054e\u054f\u0001\u0000\u0000"+
		"\u0000\u054f\u0550\u0001\u0000\u0000\u0000\u0550\u0551\u0005\u001e\u0000"+
		"\u0000\u0551\u0552\u0003\u00d4j\u0000\u0552\u00c5\u0001\u0000\u0000\u0000"+
		"\u0553\u0554\u0005G\u0000\u0000\u0554\u0555\u0003\u00d4j\u0000\u0555\u0556"+
		"\u0003\u00c8d\u0000\u0556\u0557\u0003\u00d4j\u0000\u0557\u0558\u0005\u001d"+
		"\u0000\u0000\u0558\u055c\u0003\u00d4j\u0000\u0559\u055b\u0003\u00ccf\u0000"+
		"\u055a\u0559\u0001\u0000\u0000\u0000\u055b\u055e\u0001\u0000\u0000\u0000"+
		"\u055c\u055a\u0001\u0000\u0000\u0000\u055c\u055d\u0001\u0000\u0000\u0000"+
		"\u055d\u055f\u0001\u0000\u0000\u0000\u055e\u055c\u0001\u0000\u0000\u0000"+
		"\u055f\u0560\u0005\u001e\u0000\u0000\u0560\u0561\u0003\u00d4j\u0000\u0561"+
		"\u00c7\u0001\u0000\u0000\u0000\u0562\u056a\u0003\u00cae\u0000\u0563\u0564"+
		"\u0003\u00d4j\u0000\u0564\u0565\u0005Q\u0000\u0000\u0565\u0566\u0003\u00d4"+
		"j\u0000\u0566\u0567\u0003\u00cae\u0000\u0567\u0569\u0001\u0000\u0000\u0000"+
		"\u0568\u0563\u0001\u0000\u0000\u0000\u0569\u056c\u0001\u0000\u0000\u0000"+
		"\u056a\u0568\u0001\u0000\u0000\u0000\u056a\u056b\u0001\u0000\u0000\u0000"+
		"\u056b\u00c9\u0001\u0000\u0000\u0000\u056c\u056a\u0001\u0000\u0000\u0000"+
		"\u056d\u0578\u0005>\u0000\u0000\u056e\u0574\u0003\u00d2i\u0000\u056f\u0570"+
		"\u0003\u00d4j\u0000\u0570\u0571\u0003\u00d2i\u0000\u0571\u0573\u0001\u0000"+
		"\u0000\u0000\u0572\u056f\u0001\u0000\u0000\u0000\u0573\u0576\u0001\u0000"+
		"\u0000\u0000\u0574\u0572\u0001\u0000\u0000\u0000\u0574\u0575\u0001\u0000"+
		"\u0000\u0000\u0575\u0578\u0001\u0000\u0000\u0000\u0576\u0574\u0001\u0000"+
		"\u0000\u0000\u0577\u056d\u0001\u0000\u0000\u0000\u0577\u056e\u0001\u0000"+
		"\u0000\u0000\u0578\u00cb\u0001\u0000\u0000\u0000\u0579\u057a\u0003\u00ce"+
		"g\u0000\u057a\u057b\u0003\u00d4j\u0000\u057b\u057c\u0005\u001d\u0000\u0000"+
		"\u057c\u057e\u0003\u00d4j\u0000\u057d\u057f\u0003\u00d0h\u0000\u057e\u057d"+
		"\u0001\u0000\u0000\u0000\u057e\u057f\u0001\u0000\u0000\u0000\u057f\u0588"+
		"\u0001\u0000\u0000\u0000\u0580\u0581\u0003\u00d4j\u0000\u0581\u0582\u0005"+
		"\u001f\u0000\u0000\u0582\u0584\u0003\u00d4j\u0000\u0583\u0585\u0003\u00d0"+
		"h\u0000\u0584\u0583\u0001\u0000\u0000\u0000\u0584\u0585\u0001\u0000\u0000"+
		"\u0000\u0585\u0587\u0001\u0000\u0000\u0000\u0586\u0580\u0001\u0000\u0000"+
		"\u0000\u0587\u058a\u0001\u0000\u0000\u0000\u0588\u0586\u0001\u0000\u0000"+
		"\u0000\u0588\u0589\u0001\u0000\u0000\u0000\u0589\u058b\u0001\u0000\u0000"+
		"\u0000\u058a\u0588\u0001\u0000\u0000\u0000\u058b\u058c\u0005\u001e\u0000"+
		"\u0000\u058c\u058d\u0003\u00d4j\u0000\u058d\u00cd\u0001\u0000\u0000\u0000"+
		"\u058e\u058f\u0005L\u0000\u0000\u058f\u00cf\u0001\u0000\u0000\u0000\u0590"+
		"\u0591\u0003\u00d2i\u0000\u0591\u0592\u0003\u00d4j\u0000\u0592\u0593\u0005"+
		"!\u0000\u0000\u0593\u0594\u0003\u00d4j\u0000\u0594\u059a\u0003\u008cF"+
		"\u0000\u0595\u0596\u0003\u00d4j\u0000\u0596\u0597\u0003\u008cF\u0000\u0597"+
		"\u0599\u0001\u0000\u0000\u0000\u0598\u0595\u0001\u0000\u0000\u0000\u0599"+
		"\u059c\u0001\u0000\u0000\u0000\u059a\u0598\u0001\u0000\u0000\u0000\u059a"+
		"\u059b\u0001\u0000\u0000\u0000\u059b\u00d1\u0001\u0000\u0000\u0000\u059c"+
		"\u059a\u0001\u0000\u0000\u0000\u059d\u059e\u0007\n\u0000\u0000\u059e\u00d3"+
		"\u0001\u0000\u0000\u0000\u059f\u05a1\u0007\u000b\u0000\u0000\u05a0\u059f"+
		"\u0001\u0000\u0000\u0000\u05a1\u05a4\u0001\u0000\u0000\u0000\u05a2\u05a0"+
		"\u0001\u0000\u0000\u0000\u05a2\u05a3\u0001\u0000\u0000\u0000\u05a3\u00d5"+
		"\u0001\u0000\u0000\u0000\u05a4\u05a2\u0001\u0000\u0000\u0000\u05a5\u05a6"+
		"\u00055\u0000\u0000\u05a6\u05a7\u0003\u00d4j\u0000\u05a7\u05a8\u0005>"+
		"\u0000\u0000\u05a8\u05a9\u0003\u00d4j\u0000\u05a9\u05aa\u0005\u001c\u0000"+
		"\u0000\u05aa\u05ad\u0001\u0000\u0000\u0000\u05ab\u05ad\u00055\u0000\u0000"+
		"\u05ac\u05a5\u0001\u0000\u0000\u0000\u05ac\u05ab\u0001\u0000\u0000\u0000"+
		"\u05ad\u00d7\u0001\u0000\u0000\u0000\u009e\u00db\u00df\u00e4\u00e8\u00ed"+
		"\u00f3\u00f8\u00fd\u0104\u010e\u0118\u011f\u0126\u0129\u0130\u0133\u0137"+
		"\u013d\u0140\u0147\u014f\u0151\u0156\u015d\u0165\u0167\u016c\u0170\u0174"+
		"\u0177\u017b\u017f\u0183\u0191\u0197\u01a0\u01ac\u01b9\u01c1\u01c3\u01d3"+
		"\u01d9\u01e1\u01eb\u01f2\u01f6\u01fa\u01fd\u0201\u0207\u0211\u0215\u021b"+
		"\u021d\u022c\u0232\u023d\u0247\u0250\u0254\u025b\u025f\u026a\u026e\u0272"+
		"\u0283\u0286\u028b\u0296\u02a0\u02a3\u02ae\u02b9\u02be\u02c3\u02c7\u02d8"+
		"\u02e3\u02ee\u02f2\u02f9\u02fb\u0303\u0305\u0307\u030a\u0310\u0317\u0321"+
		"\u0329\u032d\u0333\u0337\u0345\u034a\u0358\u0362\u036d\u0373\u037b\u0381"+
		"\u0386\u038c\u0394\u0398\u03a0\u03a7\u03b0\u03b2\u03b6\u03bb\u03d6\u03e8"+
		"\u03ed\u03f2\u0414\u0416\u0420\u0422\u042c\u042e\u0434\u043b\u0441\u044c"+
		"\u0458\u045a\u046a\u0471\u0481\u048b\u049f\u04ad\u04b7\u04b9\u04d6\u04e3"+
		"\u04e5\u04f5\u04fc\u0501\u0505\u0515\u0522\u052c\u053a\u0542\u054e\u055c"+
		"\u056a\u0574\u0577\u057e\u0584\u0588\u059a\u05a2\u05ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}