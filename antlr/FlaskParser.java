// Generated from C:/Users/asus/Desktop/com/grammer/FlaskParser.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FlaskParser extends Python3ParserBase {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, AND=3, AS=4, ASSERT=5, ASYNC=6, AWAIT=7, BREAK=8, 
		CLASS=9, CONTINUE=10, DEF=11, DEL=12, ELIF=13, ELSE=14, EXCEPT=15, FALSE=16, 
		FINALLY=17, FOR=18, FROM=19, GLOBAL=20, IF=21, IMPORT=22, IN=23, IS=24, 
		LAMBDA=25, MATCH=26, NONE=27, NONLOCAL=28, NOT=29, OR=30, PASS=31, RAISE=32, 
		RETURN=33, TRUE=34, TRY=35, UNDERSCORE=36, WHILE=37, WITH=38, YIELD=39, 
		NAME=40, NUMBER=41, INTEGER=42, DECIMAL_INTEGER=43, OCT_INTEGER=44, HEX_INTEGER=45, 
		BIN_INTEGER=46, FLOAT_NUMBER=47, IMAG_NUMBER=48, ELLIPSIS=49, POWER=50, 
		IDIV=51, LESS_THAN=52, GREATER_THAN=53, LT_EQ=54, GT_EQ=55, EQUALS=56, 
		NOT_EQ_1=57, NOT_EQ_2=58, ADD_ASSIGN=59, SUB_ASSIGN=60, MULT_ASSIGN=61, 
		AT_ASSIGN=62, DIV_ASSIGN=63, MOD_ASSIGN=64, AND_ASSIGN=65, OR_ASSIGN=66, 
		XOR_ASSIGN=67, LEFT_SHIFT_ASSIGN=68, RIGHT_SHIFT_ASSIGN=69, POWER_ASSIGN=70, 
		IDIV_ASSIGN=71, DOT=72, STAR=73, ASSIGN=74, OPEN_PAREN=75, CLOSE_PAREN=76, 
		OPEN_BRACK=77, CLOSE_BRACK=78, OPEN_BRACE=79, CLOSE_BRACE=80, COMMA=81, 
		COLON=82, SEMI_COLON=83, ADD=84, MINUS=85, DIV=86, MOD=87, AT=88, ARROW=89, 
		NEWLINE=90, SKIP_=91, UNKNOWN_CHAR=92, CASE=93, OR_OP=94, NOT_OP=95, LEFT_SHIFT=96, 
		RIGHT_SHIFT=97, AND_OP=98, XOR=99, STRING=100;
	public static final int
		RULE_single_input = 0, RULE_file_input = 1, RULE_eval_input = 2, RULE_decorator = 3, 
		RULE_decorators = 4, RULE_decorated = 5, RULE_async_funcdef = 6, RULE_funcdef = 7, 
		RULE_parameters = 8, RULE_typedargslist = 9, RULE_tfpdef = 10, RULE_varargslist = 11, 
		RULE_vfpdef = 12, RULE_stmt = 13, RULE_simple_stmts = 14, RULE_simple_stmt = 15, 
		RULE_expr_stmt = 16, RULE_annassign = 17, RULE_testlist_star_expr = 18, 
		RULE_augassign = 19, RULE_del_stmt = 20, RULE_pass_stmt = 21, RULE_flow_stmt = 22, 
		RULE_break_stmt = 23, RULE_continue_stmt = 24, RULE_return_stmt = 25, 
		RULE_yield_stmt = 26, RULE_raise_stmt = 27, RULE_import_stmt = 28, RULE_import_name = 29, 
		RULE_import_from = 30, RULE_import_as_name = 31, RULE_dotted_as_name = 32, 
		RULE_import_as_names = 33, RULE_dotted_as_names = 34, RULE_dotted_name = 35, 
		RULE_global_stmt = 36, RULE_nonlocal_stmt = 37, RULE_assert_stmt = 38, 
		RULE_compound_stmt = 39, RULE_async_stmt = 40, RULE_if_stmt = 41, RULE_while_stmt = 42, 
		RULE_for_stmt = 43, RULE_try_stmt = 44, RULE_with_stmt = 45, RULE_with_item = 46, 
		RULE_except_clause = 47, RULE_block = 48, RULE_match_stmt = 49, RULE_subject_expr = 50, 
		RULE_star_named_expressions = 51, RULE_star_named_expression = 52, RULE_case_block = 53, 
		RULE_guard = 54, RULE_patterns = 55, RULE_pattern = 56, RULE_as_pattern = 57, 
		RULE_or_pattern = 58, RULE_closed_pattern = 59, RULE_literal_pattern = 60, 
		RULE_literal_expr = 61, RULE_complex_number = 62, RULE_signed_number = 63, 
		RULE_signed_real_number = 64, RULE_real_number = 65, RULE_imaginary_number = 66, 
		RULE_capture_pattern = 67, RULE_pattern_capture_target = 68, RULE_wildcard_pattern = 69, 
		RULE_value_pattern = 70, RULE_attr = 71, RULE_name_or_attr = 72, RULE_group_pattern = 73, 
		RULE_sequence_pattern = 74, RULE_open_sequence_pattern = 75, RULE_maybe_sequence_pattern = 76, 
		RULE_maybe_star_pattern = 77, RULE_star_pattern = 78, RULE_mapping_pattern = 79, 
		RULE_items_pattern = 80, RULE_key_value_pattern = 81, RULE_double_star_pattern = 82, 
		RULE_class_pattern = 83, RULE_positional_patterns = 84, RULE_keyword_patterns = 85, 
		RULE_keyword_pattern = 86, RULE_test = 87, RULE_test_nocond = 88, RULE_lambdef = 89, 
		RULE_lambdef_nocond = 90, RULE_or_test = 91, RULE_and_test = 92, RULE_not_test = 93, 
		RULE_comparison = 94, RULE_comp_op = 95, RULE_star_expr = 96, RULE_expr = 97, 
		RULE_atom_expr = 98, RULE_atom = 99, RULE_name = 100, RULE_testlist_comp = 101, 
		RULE_trailer = 102, RULE_subscriptlist = 103, RULE_subscript_ = 104, RULE_sliceop = 105, 
		RULE_exprlist = 106, RULE_testlist = 107, RULE_dictorsetmaker = 108, RULE_classdef = 109, 
		RULE_arglist = 110, RULE_argument = 111, RULE_comp_iter = 112, RULE_comp_for = 113, 
		RULE_comp_if = 114, RULE_encoding_decl = 115, RULE_yield_expr = 116, RULE_yield_arg = 117, 
		RULE_strings = 118;
	private static String[] makeRuleNames() {
		return new String[] {
			"single_input", "file_input", "eval_input", "decorator", "decorators", 
			"decorated", "async_funcdef", "funcdef", "parameters", "typedargslist", 
			"tfpdef", "varargslist", "vfpdef", "stmt", "simple_stmts", "simple_stmt", 
			"expr_stmt", "annassign", "testlist_star_expr", "augassign", "del_stmt", 
			"pass_stmt", "flow_stmt", "break_stmt", "continue_stmt", "return_stmt", 
			"yield_stmt", "raise_stmt", "import_stmt", "import_name", "import_from", 
			"import_as_name", "dotted_as_name", "import_as_names", "dotted_as_names", 
			"dotted_name", "global_stmt", "nonlocal_stmt", "assert_stmt", "compound_stmt", 
			"async_stmt", "if_stmt", "while_stmt", "for_stmt", "try_stmt", "with_stmt", 
			"with_item", "except_clause", "block", "match_stmt", "subject_expr", 
			"star_named_expressions", "star_named_expression", "case_block", "guard", 
			"patterns", "pattern", "as_pattern", "or_pattern", "closed_pattern", 
			"literal_pattern", "literal_expr", "complex_number", "signed_number", 
			"signed_real_number", "real_number", "imaginary_number", "capture_pattern", 
			"pattern_capture_target", "wildcard_pattern", "value_pattern", "attr", 
			"name_or_attr", "group_pattern", "sequence_pattern", "open_sequence_pattern", 
			"maybe_sequence_pattern", "maybe_star_pattern", "star_pattern", "mapping_pattern", 
			"items_pattern", "key_value_pattern", "double_star_pattern", "class_pattern", 
			"positional_patterns", "keyword_patterns", "keyword_pattern", "test", 
			"test_nocond", "lambdef", "lambdef_nocond", "or_test", "and_test", "not_test", 
			"comparison", "comp_op", "star_expr", "expr", "atom_expr", "atom", "name", 
			"testlist_comp", "trailer", "subscriptlist", "subscript_", "sliceop", 
			"exprlist", "testlist", "dictorsetmaker", "classdef", "arglist", "argument", 
			"comp_iter", "comp_for", "comp_if", "encoding_decl", "yield_expr", "yield_arg", 
			"strings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'and'", "'as'", "'assert'", "'async'", "'await'", 
			"'break'", "'class'", "'continue'", "'def'", "'del'", "'elif'", "'else'", 
			"'except'", "'False'", "'finally'", "'for'", "'from'", "'global'", "'if'", 
			"'import'", "'in'", "'is'", "'lambda'", "'match'", "'None'", "'nonlocal'", 
			"'not'", "'or'", "'pass'", "'raise'", "'return'", "'True'", "'try'", 
			"'_'", "'while'", "'with'", "'yield'", null, null, null, null, null, 
			null, null, null, null, "'...'", "'**'", "'//'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'<>'", "'+='", "'-='", "'*='", "'@='", "'/='", 
			"'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'**='", "'//='", "'.'", 
			"'*'", "'='", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'", 
			"';'", "'+'", "'-'", "'/'", "'%'", "'@'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "AND", "AS", "ASSERT", "ASYNC", "AWAIT", "BREAK", 
			"CLASS", "CONTINUE", "DEF", "DEL", "ELIF", "ELSE", "EXCEPT", "FALSE", 
			"FINALLY", "FOR", "FROM", "GLOBAL", "IF", "IMPORT", "IN", "IS", "LAMBDA", 
			"MATCH", "NONE", "NONLOCAL", "NOT", "OR", "PASS", "RAISE", "RETURN", 
			"TRUE", "TRY", "UNDERSCORE", "WHILE", "WITH", "YIELD", "NAME", "NUMBER", 
			"INTEGER", "DECIMAL_INTEGER", "OCT_INTEGER", "HEX_INTEGER", "BIN_INTEGER", 
			"FLOAT_NUMBER", "IMAG_NUMBER", "ELLIPSIS", "POWER", "IDIV", "LESS_THAN", 
			"GREATER_THAN", "LT_EQ", "GT_EQ", "EQUALS", "NOT_EQ_1", "NOT_EQ_2", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
			"POWER_ASSIGN", "IDIV_ASSIGN", "DOT", "STAR", "ASSIGN", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", 
			"COMMA", "COLON", "SEMI_COLON", "ADD", "MINUS", "DIV", "MOD", "AT", "ARROW", 
			"NEWLINE", "SKIP_", "UNKNOWN_CHAR", "CASE", "OR_OP", "NOT_OP", "LEFT_SHIFT", 
			"RIGHT_SHIFT", "AND_OP", "XOR", "STRING"
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
	public String getGrammarFileName() { return "FlaskParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlaskParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_inputContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(FlaskParser.NEWLINE, 0); }
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Single_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSingle_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSingle_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSingle_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_inputContext single_input() throws RecognitionException {
		Single_inputContext _localctx = new Single_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_single_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(238);
				simple_stmts();
				}
				break;
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 446746069568L) != 0) || _la==AT) {
				{
				setState(241);
				compound_stmt();
				}
			}

			setState(244);
			match(NEWLINE);
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
	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FlaskParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FlaskParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterFile_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitFile_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitFile_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 567346900836320L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 138582101L) != 0)) {
				{
				setState(248);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(246);
					match(NEWLINE);
					}
					break;
				case ASSERT:
				case ASYNC:
				case AWAIT:
				case BREAK:
				case CLASS:
				case CONTINUE:
				case DEF:
				case DEL:
				case FALSE:
				case FOR:
				case FROM:
				case GLOBAL:
				case IF:
				case IMPORT:
				case LAMBDA:
				case MATCH:
				case NONE:
				case NONLOCAL:
				case NOT:
				case PASS:
				case RAISE:
				case RETURN:
				case TRUE:
				case TRY:
				case UNDERSCORE:
				case WHILE:
				case WITH:
				case YIELD:
				case NAME:
				case NUMBER:
				case ELLIPSIS:
				case STAR:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case OPEN_BRACE:
				case ADD:
				case MINUS:
				case AT:
				case NOT_OP:
				case STRING:
					{
					setState(247);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
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
	public static class Eval_inputContext extends ParserRuleContext {
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FlaskParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FlaskParser.NEWLINE, i);
		}
		public Eval_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterEval_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitEval_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitEval_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eval_inputContext eval_input() throws RecognitionException {
		Eval_inputContext _localctx = new Eval_inputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eval_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			testlist();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(256);
				match(NEWLINE);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
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
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(FlaskParser.AT, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FlaskParser.NEWLINE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlaskParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlaskParser.CLOSE_PAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(AT);
			setState(265);
			dotted_name();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(266);
				match(OPEN_PAREN);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1692235066310784L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 138418261L) != 0)) {
					{
					setState(267);
					arglist();
					}
				}

				setState(270);
				match(CLOSE_PAREN);
				}
			}

			setState(273);
			match(NEWLINE);
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
	public static class DecoratorsContext extends ParserRuleContext {
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDecorators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDecorators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDecorators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorsContext decorators() throws RecognitionException {
		DecoratorsContext _localctx = new DecoratorsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decorators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(275);
				decorator();
				}
				}
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
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
	public static class DecoratedContext extends ParserRuleContext {
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Async_funcdefContext async_funcdef() {
			return getRuleContext(Async_funcdefContext.class,0);
		}
		public DecoratedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDecorated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDecorated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDecorated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratedContext decorated() throws RecognitionException {
		DecoratedContext _localctx = new DecoratedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decorated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			decorators();
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(281);
				classdef();
				}
				break;
			case DEF:
				{
				setState(282);
				funcdef();
				}
				break;
			case ASYNC:
				{
				setState(283);
				async_funcdef();
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
	public static class Async_funcdefContext extends ParserRuleContext {
		public TerminalNode ASYNC() { return getToken(FlaskParser.ASYNC, 0); }
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Async_funcdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_async_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAsync_funcdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAsync_funcdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAsync_funcdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Async_funcdefContext async_funcdef() throws RecognitionException {
		Async_funcdefContext _localctx = new Async_funcdefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_async_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ASYNC);
			setState(287);
			funcdef();
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
	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FlaskParser.DEF, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(FlaskParser.ARROW, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(DEF);
			setState(290);
			name();
			setState(291);
			parameters();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(292);
				match(ARROW);
				setState(293);
				test();
				}
			}

			setState(296);
			match(COLON);
			setState(297);
			block();
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
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(FlaskParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlaskParser.CLOSE_PAREN, 0); }
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(OPEN_PAREN);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 140737505149953L) != 0)) {
				{
				setState(300);
				typedargslist();
				}
			}

			setState(303);
			match(CLOSE_PAREN);
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
	public static class TypedargslistContext extends ParserRuleContext {
		public List<TfpdefContext> tfpdef() {
			return getRuleContexts(TfpdefContext.class);
		}
		public TfpdefContext tfpdef(int i) {
			return getRuleContext(TfpdefContext.class,i);
		}
		public TerminalNode STAR() { return getToken(FlaskParser.STAR, 0); }
		public TerminalNode POWER() { return getToken(FlaskParser.POWER, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(FlaskParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FlaskParser.ASSIGN, i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTypedargslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTypedargslist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTypedargslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typedargslist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATCH:
			case UNDERSCORE:
			case NAME:
				{
				setState(305);
				tfpdef();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(306);
					match(ASSIGN);
					setState(307);
					test();
					}
				}

				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(310);
						match(COMMA);
						setState(311);
						tfpdef();
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(312);
							match(ASSIGN);
							setState(313);
							test();
							}
						}

						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(321);
					match(COMMA);
					setState(352);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(322);
						match(STAR);
						setState(324);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1168298213376L) != 0)) {
							{
							setState(323);
							tfpdef();
							}
						}

						setState(334);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(326);
								match(COMMA);
								setState(327);
								tfpdef();
								setState(330);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==ASSIGN) {
									{
									setState(328);
									match(ASSIGN);
									setState(329);
									test();
									}
								}

								}
								} 
							}
							setState(336);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						}
						setState(345);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(337);
							match(COMMA);
							setState(343);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==POWER) {
								{
								setState(338);
								match(POWER);
								setState(339);
								tfpdef();
								setState(341);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==COMMA) {
									{
									setState(340);
									match(COMMA);
									}
								}

								}
							}

							}
						}

						}
						break;
					case POWER:
						{
						setState(347);
						match(POWER);
						setState(348);
						tfpdef();
						setState(350);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(349);
							match(COMMA);
							}
						}

						}
						break;
					case CLOSE_PAREN:
						break;
					default:
						break;
					}
					}
				}

				}
				break;
			case STAR:
				{
				setState(356);
				match(STAR);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1168298213376L) != 0)) {
					{
					setState(357);
					tfpdef();
					}
				}

				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(360);
						match(COMMA);
						setState(361);
						tfpdef();
						setState(364);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(362);
							match(ASSIGN);
							setState(363);
							test();
							}
						}

						}
						} 
					}
					setState(370);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(371);
					match(COMMA);
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==POWER) {
						{
						setState(372);
						match(POWER);
						setState(373);
						tfpdef();
						setState(375);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(374);
							match(COMMA);
							}
						}

						}
					}

					}
				}

				}
				break;
			case POWER:
				{
				setState(381);
				match(POWER);
				setState(382);
				tfpdef();
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(383);
					match(COMMA);
					}
				}

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
	public static class TfpdefContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfpdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTfpdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTfpdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTfpdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TfpdefContext tfpdef() throws RecognitionException {
		TfpdefContext _localctx = new TfpdefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tfpdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			name();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(389);
				match(COLON);
				setState(390);
				test();
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
	public static class VarargslistContext extends ParserRuleContext {
		public List<VfpdefContext> vfpdef() {
			return getRuleContexts(VfpdefContext.class);
		}
		public VfpdefContext vfpdef(int i) {
			return getRuleContext(VfpdefContext.class,i);
		}
		public TerminalNode STAR() { return getToken(FlaskParser.STAR, 0); }
		public TerminalNode POWER() { return getToken(FlaskParser.POWER, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(FlaskParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FlaskParser.ASSIGN, i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public VarargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varargslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterVarargslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitVarargslist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitVarargslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarargslistContext varargslist() throws RecognitionException {
		VarargslistContext _localctx = new VarargslistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varargslist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATCH:
			case UNDERSCORE:
			case NAME:
				{
				setState(393);
				vfpdef();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(394);
					match(ASSIGN);
					setState(395);
					test();
					}
				}

				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						match(COMMA);
						setState(399);
						vfpdef();
						setState(402);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(400);
							match(ASSIGN);
							setState(401);
							test();
							}
						}

						}
						} 
					}
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(409);
					match(COMMA);
					setState(440);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(410);
						match(STAR);
						setState(412);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1168298213376L) != 0)) {
							{
							setState(411);
							vfpdef();
							}
						}

						setState(422);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(414);
								match(COMMA);
								setState(415);
								vfpdef();
								setState(418);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==ASSIGN) {
									{
									setState(416);
									match(ASSIGN);
									setState(417);
									test();
									}
								}

								}
								} 
							}
							setState(424);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
						}
						setState(433);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(425);
							match(COMMA);
							setState(431);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==POWER) {
								{
								setState(426);
								match(POWER);
								setState(427);
								vfpdef();
								setState(429);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==COMMA) {
									{
									setState(428);
									match(COMMA);
									}
								}

								}
							}

							}
						}

						}
						break;
					case POWER:
						{
						setState(435);
						match(POWER);
						setState(436);
						vfpdef();
						setState(438);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(437);
							match(COMMA);
							}
						}

						}
						break;
					case COLON:
						break;
					default:
						break;
					}
					}
				}

				}
				break;
			case STAR:
				{
				setState(444);
				match(STAR);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1168298213376L) != 0)) {
					{
					setState(445);
					vfpdef();
					}
				}

				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(448);
						match(COMMA);
						setState(449);
						vfpdef();
						setState(452);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(450);
							match(ASSIGN);
							setState(451);
							test();
							}
						}

						}
						} 
					}
					setState(458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(459);
					match(COMMA);
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==POWER) {
						{
						setState(460);
						match(POWER);
						setState(461);
						vfpdef();
						setState(463);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(462);
							match(COMMA);
							}
						}

						}
					}

					}
				}

				}
				break;
			case POWER:
				{
				setState(469);
				match(POWER);
				setState(470);
				vfpdef();
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(471);
					match(COMMA);
					}
				}

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
	public static class VfpdefContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfpdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterVfpdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitVfpdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitVfpdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VfpdefContext vfpdef() throws RecognitionException {
		VfpdefContext _localctx = new VfpdefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_vfpdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			name();
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
	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				simple_stmts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				compound_stmt();
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
	public static class Simple_stmtsContext extends ParserRuleContext {
		public List<Simple_stmtContext> simple_stmt() {
			return getRuleContexts(Simple_stmtContext.class);
		}
		public Simple_stmtContext simple_stmt(int i) {
			return getRuleContext(Simple_stmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(FlaskParser.NEWLINE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(FlaskParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(FlaskParser.SEMI_COLON, i);
		}
		public Simple_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSimple_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSimple_stmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSimple_stmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtsContext simple_stmts() throws RecognitionException {
		Simple_stmtsContext _localctx = new Simple_stmtsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simple_stmts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			simple_stmt();
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					match(SEMI_COLON);
					setState(484);
					simple_stmt();
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(490);
				match(SEMI_COLON);
				}
			}

			setState(493);
			match(NEWLINE);
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
	public static class Simple_stmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Del_stmtContext del_stmt() {
			return getRuleContext(Del_stmtContext.class,0);
		}
		public Pass_stmtContext pass_stmt() {
			return getRuleContext(Pass_stmtContext.class,0);
		}
		public Flow_stmtContext flow_stmt() {
			return getRuleContext(Flow_stmtContext.class,0);
		}
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public Nonlocal_stmtContext nonlocal_stmt() {
			return getRuleContext(Nonlocal_stmtContext.class,0);
		}
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simple_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
			case FALSE:
			case LAMBDA:
			case MATCH:
			case NONE:
			case NOT:
			case TRUE:
			case UNDERSCORE:
			case NAME:
			case NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
				{
				setState(495);
				expr_stmt();
				}
				break;
			case DEL:
				{
				setState(496);
				del_stmt();
				}
				break;
			case PASS:
				{
				setState(497);
				pass_stmt();
				}
				break;
			case BREAK:
			case CONTINUE:
			case RAISE:
			case RETURN:
			case YIELD:
				{
				setState(498);
				flow_stmt();
				}
				break;
			case FROM:
			case IMPORT:
				{
				setState(499);
				import_stmt();
				}
				break;
			case GLOBAL:
				{
				setState(500);
				global_stmt();
				}
				break;
			case NONLOCAL:
				{
				setState(501);
				nonlocal_stmt();
				}
				break;
			case ASSERT:
				{
				setState(502);
				assert_stmt();
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
	public static class Expr_stmtContext extends ParserRuleContext {
		public List<Testlist_star_exprContext> testlist_star_expr() {
			return getRuleContexts(Testlist_star_exprContext.class);
		}
		public Testlist_star_exprContext testlist_star_expr(int i) {
			return getRuleContext(Testlist_star_exprContext.class,i);
		}
		public AnnassignContext annassign() {
			return getRuleContext(AnnassignContext.class,0);
		}
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public List<Yield_exprContext> yield_expr() {
			return getRuleContexts(Yield_exprContext.class);
		}
		public Yield_exprContext yield_expr(int i) {
			return getRuleContext(Yield_exprContext.class,i);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FlaskParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FlaskParser.ASSIGN, i);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			testlist_star_expr();
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				setState(506);
				annassign();
				}
				break;
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MULT_ASSIGN:
			case AT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case XOR_ASSIGN:
			case LEFT_SHIFT_ASSIGN:
			case RIGHT_SHIFT_ASSIGN:
			case POWER_ASSIGN:
			case IDIV_ASSIGN:
				{
				setState(507);
				augassign();
				setState(510);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(508);
					yield_expr();
					}
					break;
				case AWAIT:
				case FALSE:
				case LAMBDA:
				case MATCH:
				case NONE:
				case NOT:
				case TRUE:
				case UNDERSCORE:
				case NAME:
				case NUMBER:
				case ELLIPSIS:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case OPEN_BRACE:
				case ADD:
				case MINUS:
				case NOT_OP:
				case STRING:
					{
					setState(509);
					testlist();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case ASSIGN:
			case SEMI_COLON:
			case NEWLINE:
				{
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSIGN) {
					{
					{
					setState(512);
					match(ASSIGN);
					setState(515);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case YIELD:
						{
						setState(513);
						yield_expr();
						}
						break;
					case AWAIT:
					case FALSE:
					case LAMBDA:
					case MATCH:
					case NONE:
					case NOT:
					case TRUE:
					case UNDERSCORE:
					case NAME:
					case NUMBER:
					case ELLIPSIS:
					case STAR:
					case OPEN_PAREN:
					case OPEN_BRACK:
					case OPEN_BRACE:
					case ADD:
					case MINUS:
					case NOT_OP:
					case STRING:
						{
						setState(514);
						testlist_star_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class AnnassignContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(FlaskParser.ASSIGN, 0); }
		public AnnassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAnnassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAnnassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAnnassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnassignContext annassign() throws RecognitionException {
		AnnassignContext _localctx = new AnnassignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_annassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(COLON);
			setState(525);
			test();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(526);
				match(ASSIGN);
				setState(527);
				test();
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
	public static class Testlist_star_exprContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Testlist_star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_star_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTestlist_star_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTestlist_star_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTestlist_star_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_star_exprContext testlist_star_expr() throws RecognitionException {
		Testlist_star_exprContext _localctx = new Testlist_star_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_testlist_star_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
			case FALSE:
			case LAMBDA:
			case MATCH:
			case NONE:
			case NOT:
			case TRUE:
			case UNDERSCORE:
			case NAME:
			case NUMBER:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
				{
				setState(530);
				test();
				}
				break;
			case STAR:
				{
				setState(531);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(534);
					match(COMMA);
					setState(537);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AWAIT:
					case FALSE:
					case LAMBDA:
					case MATCH:
					case NONE:
					case NOT:
					case TRUE:
					case UNDERSCORE:
					case NAME:
					case NUMBER:
					case ELLIPSIS:
					case OPEN_PAREN:
					case OPEN_BRACK:
					case OPEN_BRACE:
					case ADD:
					case MINUS:
					case NOT_OP:
					case STRING:
						{
						setState(535);
						test();
						}
						break;
					case STAR:
						{
						setState(536);
						star_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(544);
				match(COMMA);
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
	public static class AugassignContext extends ParserRuleContext {
		public TerminalNode ADD_ASSIGN() { return getToken(FlaskParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(FlaskParser.SUB_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(FlaskParser.MULT_ASSIGN, 0); }
		public TerminalNode AT_ASSIGN() { return getToken(FlaskParser.AT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(FlaskParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FlaskParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(FlaskParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(FlaskParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(FlaskParser.XOR_ASSIGN, 0); }
		public TerminalNode LEFT_SHIFT_ASSIGN() { return getToken(FlaskParser.LEFT_SHIFT_ASSIGN, 0); }
		public TerminalNode RIGHT_SHIFT_ASSIGN() { return getToken(FlaskParser.RIGHT_SHIFT_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(FlaskParser.POWER_ASSIGN, 0); }
		public TerminalNode IDIV_ASSIGN() { return getToken(FlaskParser.IDIV_ASSIGN, 0); }
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAugassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAugassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAugassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 8191L) != 0)) ) {
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
	public static class Del_stmtContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(FlaskParser.DEL, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public Del_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDel_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDel_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDel_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(DEL);
			setState(550);
			exprlist();
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
	public static class Pass_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(FlaskParser.PASS, 0); }
		public Pass_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterPass_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitPass_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitPass_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pass_stmtContext pass_stmt() throws RecognitionException {
		Pass_stmtContext _localctx = new Pass_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pass_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(PASS);
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
	public static class Flow_stmtContext extends ParserRuleContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Raise_stmtContext raise_stmt() {
			return getRuleContext(Raise_stmtContext.class,0);
		}
		public Yield_stmtContext yield_stmt() {
			return getRuleContext(Yield_stmtContext.class,0);
		}
		public Flow_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterFlow_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitFlow_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitFlow_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_flow_stmt);
		try {
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				continue_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				return_stmt();
				}
				break;
			case RAISE:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				raise_stmt();
				}
				break;
			case YIELD:
				enterOuterAlt(_localctx, 5);
				{
				setState(558);
				yield_stmt();
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
	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FlaskParser.BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(BREAK);
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
	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(FlaskParser.CONTINUE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitContinue_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(CONTINUE);
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
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FlaskParser.RETURN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(RETURN);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566335159468160L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 34604565L) != 0)) {
				{
				setState(566);
				testlist();
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
	public static class Yield_stmtContext extends ParserRuleContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Yield_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterYield_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitYield_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitYield_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_stmtContext yield_stmt() throws RecognitionException {
		Yield_stmtContext _localctx = new Yield_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_yield_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			yield_expr();
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
	public static class Raise_stmtContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(FlaskParser.RAISE, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode FROM() { return getToken(FlaskParser.FROM, 0); }
		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterRaise_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitRaise_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitRaise_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_stmtContext raise_stmt() throws RecognitionException {
		Raise_stmtContext _localctx = new Raise_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_raise_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(RAISE);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566335159468160L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 34604565L) != 0)) {
				{
				setState(572);
				test();
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(573);
					match(FROM);
					setState(574);
					test();
					}
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
	public static class Import_stmtContext extends ParserRuleContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterImport_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitImport_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitImport_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_import_stmt);
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				import_name();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				import_from();
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
	public static class Import_nameContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(FlaskParser.IMPORT, 0); }
		public Dotted_as_namesContext dotted_as_names() {
			return getRuleContext(Dotted_as_namesContext.class,0);
		}
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitImport_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(IMPORT);
			setState(584);
			dotted_as_names();
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
	public static class Import_fromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(FlaskParser.FROM, 0); }
		public TerminalNode IMPORT() { return getToken(FlaskParser.IMPORT, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(FlaskParser.STAR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlaskParser.OPEN_PAREN, 0); }
		public Import_as_namesContext import_as_names() {
			return getRuleContext(Import_as_namesContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(FlaskParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(FlaskParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FlaskParser.DOT, i);
		}
		public List<TerminalNode> ELLIPSIS() { return getTokens(FlaskParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(FlaskParser.ELLIPSIS, i);
		}
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterImport_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitImport_from(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitImport_from(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_import_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(586);
			match(FROM);
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELLIPSIS || _la==DOT) {
					{
					{
					setState(587);
					_la = _input.LA(1);
					if ( !(_la==ELLIPSIS || _la==DOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(593);
				dotted_name();
				}
				break;
			case 2:
				{
				setState(595); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(594);
					_la = _input.LA(1);
					if ( !(_la==ELLIPSIS || _la==DOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(597); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELLIPSIS || _la==DOT );
				}
				break;
			}
			setState(601);
			match(IMPORT);
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(602);
				match(STAR);
				}
				break;
			case OPEN_PAREN:
				{
				setState(603);
				match(OPEN_PAREN);
				setState(604);
				import_as_names();
				setState(605);
				match(CLOSE_PAREN);
				}
				break;
			case MATCH:
			case UNDERSCORE:
			case NAME:
				{
				setState(607);
				import_as_names();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Import_as_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode AS() { return getToken(FlaskParser.AS, 0); }
		public Import_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterImport_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitImport_as_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitImport_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_nameContext import_as_name() throws RecognitionException {
		Import_as_nameContext _localctx = new Import_as_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_import_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			name();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(611);
				match(AS);
				setState(612);
				name();
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
	public static class Dotted_as_nameContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(FlaskParser.AS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Dotted_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDotted_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDotted_as_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDotted_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_nameContext dotted_as_name() throws RecognitionException {
		Dotted_as_nameContext _localctx = new Dotted_as_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dotted_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			dotted_name();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(616);
				match(AS);
				setState(617);
				name();
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
	public static class Import_as_namesContext extends ParserRuleContext {
		public List<Import_as_nameContext> import_as_name() {
			return getRuleContexts(Import_as_nameContext.class);
		}
		public Import_as_nameContext import_as_name(int i) {
			return getRuleContext(Import_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Import_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterImport_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitImport_as_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitImport_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_namesContext import_as_names() throws RecognitionException {
		Import_as_namesContext _localctx = new Import_as_namesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_import_as_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			import_as_name();
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(621);
					match(COMMA);
					setState(622);
					import_as_name();
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(628);
				match(COMMA);
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
	public static class Dotted_as_namesContext extends ParserRuleContext {
		public List<Dotted_as_nameContext> dotted_as_name() {
			return getRuleContexts(Dotted_as_nameContext.class);
		}
		public Dotted_as_nameContext dotted_as_name(int i) {
			return getRuleContext(Dotted_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Dotted_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDotted_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDotted_as_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDotted_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_namesContext dotted_as_names() throws RecognitionException {
		Dotted_as_namesContext _localctx = new Dotted_as_namesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dotted_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			dotted_as_name();
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(632);
				match(COMMA);
				setState(633);
				dotted_as_name();
				}
				}
				setState(638);
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
	public static class Dotted_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(FlaskParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FlaskParser.DOT, i);
		}
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDotted_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDotted_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDotted_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dotted_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			name();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(640);
				match(DOT);
				setState(641);
				name();
				}
				}
				setState(646);
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
	public static class Global_stmtContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(FlaskParser.GLOBAL, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterGlobal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitGlobal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitGlobal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_global_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(GLOBAL);
			setState(648);
			name();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(649);
				match(COMMA);
				setState(650);
				name();
				}
				}
				setState(655);
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
	public static class Nonlocal_stmtContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(FlaskParser.NONLOCAL, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Nonlocal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterNonlocal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitNonlocal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitNonlocal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonlocal_stmtContext nonlocal_stmt() throws RecognitionException {
		Nonlocal_stmtContext _localctx = new Nonlocal_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_nonlocal_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(NONLOCAL);
			setState(657);
			name();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(658);
				match(COMMA);
				setState(659);
				name();
				}
				}
				setState(664);
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
	public static class Assert_stmtContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(FlaskParser.ASSERT, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(FlaskParser.COMMA, 0); }
		public Assert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAssert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAssert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAssert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_stmtContext assert_stmt() throws RecognitionException {
		Assert_stmtContext _localctx = new Assert_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(ASSERT);
			setState(666);
			test();
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(667);
				match(COMMA);
				setState(668);
				test();
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
	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Try_stmtContext try_stmt() {
			return getRuleContext(Try_stmtContext.class,0);
		}
		public With_stmtContext with_stmt() {
			return getRuleContext(With_stmtContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public DecoratedContext decorated() {
			return getRuleContext(DecoratedContext.class,0);
		}
		public Async_stmtContext async_stmt() {
			return getRuleContext(Async_stmtContext.class,0);
		}
		public Match_stmtContext match_stmt() {
			return getRuleContext(Match_stmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_compound_stmt);
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				for_stmt();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 4);
				{
				setState(674);
				try_stmt();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 5);
				{
				setState(675);
				with_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 6);
				{
				setState(676);
				funcdef();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 7);
				{
				setState(677);
				classdef();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 8);
				{
				setState(678);
				decorated();
				}
				break;
			case ASYNC:
				enterOuterAlt(_localctx, 9);
				{
				setState(679);
				async_stmt();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 10);
				{
				setState(680);
				match_stmt();
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
	public static class Async_stmtContext extends ParserRuleContext {
		public TerminalNode ASYNC() { return getToken(FlaskParser.ASYNC, 0); }
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public With_stmtContext with_stmt() {
			return getRuleContext(With_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Async_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_async_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAsync_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAsync_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAsync_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Async_stmtContext async_stmt() throws RecognitionException {
		Async_stmtContext _localctx = new Async_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_async_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(ASYNC);
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				{
				setState(684);
				funcdef();
				}
				break;
			case WITH:
				{
				setState(685);
				with_stmt();
				}
				break;
			case FOR:
				{
				setState(686);
				for_stmt();
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
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FlaskParser.IF, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(FlaskParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FlaskParser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(FlaskParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(FlaskParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(FlaskParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(IF);
			setState(690);
			test();
			setState(691);
			match(COLON);
			setState(692);
			block();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(693);
				match(ELIF);
				setState(694);
				test();
				setState(695);
				match(COLON);
				setState(696);
				block();
				}
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(703);
				match(ELSE);
				setState(704);
				match(COLON);
				setState(705);
				block();
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
	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FlaskParser.WHILE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(FlaskParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FlaskParser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FlaskParser.ELSE, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(WHILE);
			setState(709);
			test();
			setState(710);
			match(COLON);
			setState(711);
			block();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(712);
				match(ELSE);
				setState(713);
				match(COLON);
				setState(714);
				block();
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
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FlaskParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(FlaskParser.IN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(FlaskParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FlaskParser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FlaskParser.ELSE, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(FOR);
			setState(718);
			exprlist();
			setState(719);
			match(IN);
			setState(720);
			testlist();
			setState(721);
			match(COLON);
			setState(722);
			block();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(723);
				match(ELSE);
				setState(724);
				match(COLON);
				setState(725);
				block();
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
	public static class Try_stmtContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(FlaskParser.TRY, 0); }
		public List<TerminalNode> COLON() { return getTokens(FlaskParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FlaskParser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode FINALLY() { return getToken(FlaskParser.FINALLY, 0); }
		public List<Except_clauseContext> except_clause() {
			return getRuleContexts(Except_clauseContext.class);
		}
		public Except_clauseContext except_clause(int i) {
			return getRuleContext(Except_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FlaskParser.ELSE, 0); }
		public Try_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTry_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTry_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTry_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_stmtContext try_stmt() throws RecognitionException {
		Try_stmtContext _localctx = new Try_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_try_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(728);
			match(TRY);
			setState(729);
			match(COLON);
			setState(730);
			block();
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCEPT:
				{
				setState(735); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(731);
					except_clause();
					setState(732);
					match(COLON);
					setState(733);
					block();
					}
					}
					setState(737); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXCEPT );
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(739);
					match(ELSE);
					setState(740);
					match(COLON);
					setState(741);
					block();
					}
				}

				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(744);
					match(FINALLY);
					setState(745);
					match(COLON);
					setState(746);
					block();
					}
				}

				}
				break;
			case FINALLY:
				{
				setState(749);
				match(FINALLY);
				setState(750);
				match(COLON);
				setState(751);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class With_stmtContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(FlaskParser.WITH, 0); }
		public List<With_itemContext> with_item() {
			return getRuleContexts(With_itemContext.class);
		}
		public With_itemContext with_item(int i) {
			return getRuleContext(With_itemContext.class,i);
		}
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public With_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterWith_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitWith_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitWith_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_stmtContext with_stmt() throws RecognitionException {
		With_stmtContext _localctx = new With_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_with_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(WITH);
			setState(755);
			with_item();
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(756);
				match(COMMA);
				setState(757);
				with_item();
				}
				}
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(763);
			match(COLON);
			setState(764);
			block();
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
	public static class With_itemContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode AS() { return getToken(FlaskParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public With_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterWith_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitWith_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitWith_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_itemContext with_item() throws RecognitionException {
		With_itemContext _localctx = new With_itemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_with_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			test();
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(767);
				match(AS);
				setState(768);
				expr(0);
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
	public static class Except_clauseContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(FlaskParser.EXCEPT, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode AS() { return getToken(FlaskParser.AS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Except_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterExcept_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitExcept_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitExcept_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Except_clauseContext except_clause() throws RecognitionException {
		Except_clauseContext _localctx = new Except_clauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_except_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(EXCEPT);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566335159468160L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 34604565L) != 0)) {
				{
				setState(772);
				test();
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(773);
					match(AS);
					setState(774);
					name();
					}
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
	public static class BlockContext extends ParserRuleContext {
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FlaskParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(FlaskParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(FlaskParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_block);
		int _la;
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSERT:
			case AWAIT:
			case BREAK:
			case CONTINUE:
			case DEL:
			case FALSE:
			case FROM:
			case GLOBAL:
			case IMPORT:
			case LAMBDA:
			case MATCH:
			case NONE:
			case NONLOCAL:
			case NOT:
			case PASS:
			case RAISE:
			case RETURN:
			case TRUE:
			case UNDERSCORE:
			case YIELD:
			case NAME:
			case NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				simple_stmts();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(NEWLINE);
				setState(781);
				match(INDENT);
				setState(783); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(782);
					stmt();
					}
					}
					setState(785); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 567346900836320L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 138451029L) != 0) );
				setState(787);
				match(DEDENT);
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
	public static class Match_stmtContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(FlaskParser.MATCH, 0); }
		public Subject_exprContext subject_expr() {
			return getRuleContext(Subject_exprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(FlaskParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(FlaskParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(FlaskParser.DEDENT, 0); }
		public List<Case_blockContext> case_block() {
			return getRuleContexts(Case_blockContext.class);
		}
		public Case_blockContext case_block(int i) {
			return getRuleContext(Case_blockContext.class,i);
		}
		public Match_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterMatch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitMatch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitMatch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_stmtContext match_stmt() throws RecognitionException {
		Match_stmtContext _localctx = new Match_stmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_match_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(MATCH);
			setState(792);
			subject_expr();
			setState(793);
			match(COLON);
			setState(794);
			match(NEWLINE);
			setState(795);
			match(INDENT);
			setState(797); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(796);
				case_block();
				}
				}
				setState(799); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(801);
			match(DEDENT);
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
	public static class Subject_exprContext extends ParserRuleContext {
		public Star_named_expressionContext star_named_expression() {
			return getRuleContext(Star_named_expressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FlaskParser.COMMA, 0); }
		public Star_named_expressionsContext star_named_expressions() {
			return getRuleContext(Star_named_expressionsContext.class,0);
		}
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public Subject_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSubject_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSubject_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSubject_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subject_exprContext subject_expr() throws RecognitionException {
		Subject_exprContext _localctx = new Subject_exprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_subject_expr);
		int _la;
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				star_named_expression();
				setState(804);
				match(COMMA);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(805);
					star_named_expressions();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				test();
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
	public static class Star_named_expressionsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public List<Star_named_expressionContext> star_named_expression() {
			return getRuleContexts(Star_named_expressionContext.class);
		}
		public Star_named_expressionContext star_named_expression(int i) {
			return getRuleContext(Star_named_expressionContext.class,i);
		}
		public Star_named_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_named_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterStar_named_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitStar_named_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitStar_named_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_named_expressionsContext star_named_expressions() throws RecognitionException {
		Star_named_expressionsContext _localctx = new Star_named_expressionsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_star_named_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(COMMA);
			setState(813); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(812);
				star_named_expression();
				}
				}
				setState(815); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 566335159468160L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 138418261L) != 0) );
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(817);
				match(COMMA);
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
	public static class Star_named_expressionContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(FlaskParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public Star_named_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_named_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterStar_named_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitStar_named_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitStar_named_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_named_expressionContext star_named_expression() throws RecognitionException {
		Star_named_expressionContext _localctx = new Star_named_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_star_named_expression);
		try {
			setState(823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				match(STAR);
				setState(821);
				expr(0);
				}
				break;
			case AWAIT:
			case FALSE:
			case LAMBDA:
			case MATCH:
			case NONE:
			case NOT:
			case TRUE:
			case UNDERSCORE:
			case NAME:
			case NUMBER:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				test();
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
	public static class Case_blockContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(FlaskParser.CASE, 0); }
		public PatternsContext patterns() {
			return getRuleContext(PatternsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCase_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCase_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCase_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_case_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(CASE);
			setState(826);
			patterns();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(827);
				guard();
				}
			}

			setState(830);
			match(COLON);
			setState(831);
			block();
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
	public static class GuardContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FlaskParser.IF, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(IF);
			setState(834);
			test();
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
	public static class PatternsContext extends ParserRuleContext {
		public Open_sequence_patternContext open_sequence_pattern() {
			return getRuleContext(Open_sequence_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterPatterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitPatterns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitPatterns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternsContext patterns() throws RecognitionException {
		PatternsContext _localctx = new PatternsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_patterns);
		try {
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				open_sequence_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				pattern();
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
	public static class PatternContext extends ParserRuleContext {
		public As_patternContext as_pattern() {
			return getRuleContext(As_patternContext.class,0);
		}
		public Or_patternContext or_pattern() {
			return getRuleContext(Or_patternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_pattern);
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				as_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				or_pattern();
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
	public static class As_patternContext extends ParserRuleContext {
		public Or_patternContext or_pattern() {
			return getRuleContext(Or_patternContext.class,0);
		}
		public TerminalNode AS() { return getToken(FlaskParser.AS, 0); }
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public As_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAs_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAs_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAs_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_patternContext as_pattern() throws RecognitionException {
		As_patternContext _localctx = new As_patternContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_as_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			or_pattern();
			setState(845);
			match(AS);
			setState(846);
			pattern_capture_target();
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
	public static class Or_patternContext extends ParserRuleContext {
		public List<Closed_patternContext> closed_pattern() {
			return getRuleContexts(Closed_patternContext.class);
		}
		public Closed_patternContext closed_pattern(int i) {
			return getRuleContext(Closed_patternContext.class,i);
		}
		public List<TerminalNode> OR_OP() { return getTokens(FlaskParser.OR_OP); }
		public TerminalNode OR_OP(int i) {
			return getToken(FlaskParser.OR_OP, i);
		}
		public Or_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterOr_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitOr_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitOr_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_patternContext or_pattern() throws RecognitionException {
		Or_patternContext _localctx = new Or_patternContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_or_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			closed_pattern();
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OP) {
				{
				{
				setState(849);
				match(OR_OP);
				setState(850);
				closed_pattern();
				}
				}
				setState(855);
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
	public static class Closed_patternContext extends ParserRuleContext {
		public Literal_patternContext literal_pattern() {
			return getRuleContext(Literal_patternContext.class,0);
		}
		public Capture_patternContext capture_pattern() {
			return getRuleContext(Capture_patternContext.class,0);
		}
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Value_patternContext value_pattern() {
			return getRuleContext(Value_patternContext.class,0);
		}
		public Group_patternContext group_pattern() {
			return getRuleContext(Group_patternContext.class,0);
		}
		public Sequence_patternContext sequence_pattern() {
			return getRuleContext(Sequence_patternContext.class,0);
		}
		public Mapping_patternContext mapping_pattern() {
			return getRuleContext(Mapping_patternContext.class,0);
		}
		public Class_patternContext class_pattern() {
			return getRuleContext(Class_patternContext.class,0);
		}
		public Closed_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closed_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterClosed_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitClosed_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitClosed_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closed_patternContext closed_pattern() throws RecognitionException {
		Closed_patternContext _localctx = new Closed_patternContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_closed_pattern);
		try {
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				literal_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				capture_pattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(858);
				wildcard_pattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(859);
				value_pattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(860);
				group_pattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(861);
				sequence_pattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(862);
				mapping_pattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(863);
				class_pattern();
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
	public static class Literal_patternContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Complex_numberContext complex_number() {
			return getRuleContext(Complex_numberContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode NONE() { return getToken(FlaskParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(FlaskParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FlaskParser.FALSE, 0); }
		public Literal_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterLiteral_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitLiteral_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitLiteral_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_patternContext literal_pattern() throws RecognitionException {
		Literal_patternContext _localctx = new Literal_patternContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_literal_pattern);
		try {
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				signed_number();
				setState(867);
				if (!( this.CannotBePlusMinus() )) throw new FailedPredicateException(this, " this.CannotBePlusMinus() ");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				complex_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				strings();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				match(NONE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(872);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(873);
				match(FALSE);
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
	public static class Literal_exprContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Complex_numberContext complex_number() {
			return getRuleContext(Complex_numberContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode NONE() { return getToken(FlaskParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(FlaskParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FlaskParser.FALSE, 0); }
		public Literal_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterLiteral_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitLiteral_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitLiteral_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_exprContext literal_expr() throws RecognitionException {
		Literal_exprContext _localctx = new Literal_exprContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_literal_expr);
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				signed_number();
				setState(877);
				if (!( this.CannotBePlusMinus() )) throw new FailedPredicateException(this, " this.CannotBePlusMinus() ");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				complex_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				strings();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(881);
				match(NONE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(882);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(883);
				match(FALSE);
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
	public static class Complex_numberContext extends ParserRuleContext {
		public Signed_real_numberContext signed_real_number() {
			return getRuleContext(Signed_real_numberContext.class,0);
		}
		public TerminalNode ADD() { return getToken(FlaskParser.ADD, 0); }
		public Imaginary_numberContext imaginary_number() {
			return getRuleContext(Imaginary_numberContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FlaskParser.MINUS, 0); }
		public Complex_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterComplex_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitComplex_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitComplex_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_numberContext complex_number() throws RecognitionException {
		Complex_numberContext _localctx = new Complex_numberContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_complex_number);
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				signed_real_number();
				setState(887);
				match(ADD);
				setState(888);
				imaginary_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				signed_real_number();
				setState(891);
				match(MINUS);
				setState(892);
				imaginary_number();
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
	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FlaskParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(FlaskParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_signed_number);
		try {
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				match(NUMBER);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				match(MINUS);
				setState(898);
				match(NUMBER);
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
	public static class Signed_real_numberContext extends ParserRuleContext {
		public Real_numberContext real_number() {
			return getRuleContext(Real_numberContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FlaskParser.MINUS, 0); }
		public Signed_real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_real_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSigned_real_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSigned_real_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSigned_real_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_real_numberContext signed_real_number() throws RecognitionException {
		Signed_real_numberContext _localctx = new Signed_real_numberContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_signed_real_number);
		try {
			setState(904);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				real_number();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				match(MINUS);
				setState(903);
				real_number();
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
	public static class Real_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FlaskParser.NUMBER, 0); }
		public Real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterReal_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitReal_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitReal_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_numberContext real_number() throws RecognitionException {
		Real_numberContext _localctx = new Real_numberContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_real_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(NUMBER);
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
	public static class Imaginary_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FlaskParser.NUMBER, 0); }
		public Imaginary_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imaginary_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterImaginary_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitImaginary_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitImaginary_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imaginary_numberContext imaginary_number() throws RecognitionException {
		Imaginary_numberContext _localctx = new Imaginary_numberContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_imaginary_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(NUMBER);
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
	public static class Capture_patternContext extends ParserRuleContext {
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public Capture_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterCapture_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitCapture_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitCapture_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_patternContext capture_pattern() throws RecognitionException {
		Capture_patternContext _localctx = new Capture_patternContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_capture_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			pattern_capture_target();
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
	public static class Pattern_capture_targetContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Pattern_capture_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_capture_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterPattern_capture_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitPattern_capture_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitPattern_capture_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_capture_targetContext pattern_capture_target() throws RecognitionException {
		Pattern_capture_targetContext _localctx = new Pattern_capture_targetContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_pattern_capture_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			name();
			setState(913);
			if (!( this.CannotBeDotLpEq() )) throw new FailedPredicateException(this, " this.CannotBeDotLpEq() ");
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
	public static class Wildcard_patternContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(FlaskParser.UNDERSCORE, 0); }
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterWildcard_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitWildcard_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitWildcard_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(UNDERSCORE);
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
	public static class Value_patternContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public Value_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterValue_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitValue_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitValue_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_patternContext value_pattern() throws RecognitionException {
		Value_patternContext _localctx = new Value_patternContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_value_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			attr();
			setState(918);
			if (!( this.CannotBeDotLpEq() )) throw new FailedPredicateException(this, " this.CannotBeDotLpEq() ");
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
	public static class AttrContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(FlaskParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FlaskParser.DOT, i);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_attr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			name();
			setState(923); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(921);
					match(DOT);
					setState(922);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(925); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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
	public static class Name_or_attrContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Name_or_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_or_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterName_or_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitName_or_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitName_or_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_or_attrContext name_or_attr() throws RecognitionException {
		Name_or_attrContext _localctx = new Name_or_attrContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_name_or_attr);
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				attr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				name();
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
	public static class Group_patternContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(FlaskParser.OPEN_PAREN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(FlaskParser.CLOSE_PAREN, 0); }
		public Group_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterGroup_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitGroup_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitGroup_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_patternContext group_pattern() throws RecognitionException {
		Group_patternContext _localctx = new Group_patternContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_group_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(OPEN_PAREN);
			setState(932);
			pattern();
			setState(933);
			match(CLOSE_PAREN);
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
	public static class Sequence_patternContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(FlaskParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(FlaskParser.CLOSE_BRACK, 0); }
		public Maybe_sequence_patternContext maybe_sequence_pattern() {
			return getRuleContext(Maybe_sequence_patternContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(FlaskParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlaskParser.CLOSE_PAREN, 0); }
		public Open_sequence_patternContext open_sequence_pattern() {
			return getRuleContext(Open_sequence_patternContext.class,0);
		}
		public Sequence_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSequence_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSequence_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSequence_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_patternContext sequence_pattern() throws RecognitionException {
		Sequence_patternContext _localctx = new Sequence_patternContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_sequence_pattern);
		int _la;
		try {
			setState(945);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				match(OPEN_BRACK);
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3384635621376L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 134221909L) != 0)) {
					{
					setState(936);
					maybe_sequence_pattern();
					}
				}

				setState(939);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				match(OPEN_PAREN);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3384635621376L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 134221909L) != 0)) {
					{
					setState(941);
					open_sequence_pattern();
					}
				}

				setState(944);
				match(CLOSE_PAREN);
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
	public static class Open_sequence_patternContext extends ParserRuleContext {
		public Maybe_star_patternContext maybe_star_pattern() {
			return getRuleContext(Maybe_star_patternContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FlaskParser.COMMA, 0); }
		public Maybe_sequence_patternContext maybe_sequence_pattern() {
			return getRuleContext(Maybe_sequence_patternContext.class,0);
		}
		public Open_sequence_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_sequence_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterOpen_sequence_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitOpen_sequence_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitOpen_sequence_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_sequence_patternContext open_sequence_pattern() throws RecognitionException {
		Open_sequence_patternContext _localctx = new Open_sequence_patternContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_open_sequence_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			maybe_star_pattern();
			setState(948);
			match(COMMA);
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3384635621376L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 134221909L) != 0)) {
				{
				setState(949);
				maybe_sequence_pattern();
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
	public static class Maybe_sequence_patternContext extends ParserRuleContext {
		public List<Maybe_star_patternContext> maybe_star_pattern() {
			return getRuleContexts(Maybe_star_patternContext.class);
		}
		public Maybe_star_patternContext maybe_star_pattern(int i) {
			return getRuleContext(Maybe_star_patternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Maybe_sequence_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybe_sequence_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterMaybe_sequence_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitMaybe_sequence_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitMaybe_sequence_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maybe_sequence_patternContext maybe_sequence_pattern() throws RecognitionException {
		Maybe_sequence_patternContext _localctx = new Maybe_sequence_patternContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_maybe_sequence_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			maybe_star_pattern();
			setState(957);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(953);
					match(COMMA);
					setState(954);
					maybe_star_pattern();
					}
					} 
				}
				setState(959);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(960);
				match(COMMA);
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
	public static class Maybe_star_patternContext extends ParserRuleContext {
		public Star_patternContext star_pattern() {
			return getRuleContext(Star_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Maybe_star_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybe_star_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterMaybe_star_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitMaybe_star_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitMaybe_star_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maybe_star_patternContext maybe_star_pattern() throws RecognitionException {
		Maybe_star_patternContext _localctx = new Maybe_star_patternContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_maybe_star_pattern);
		try {
			setState(965);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				star_pattern();
				}
				break;
			case FALSE:
			case MATCH:
			case NONE:
			case TRUE:
			case UNDERSCORE:
			case NAME:
			case NUMBER:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case MINUS:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				pattern();
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
	public static class Star_patternContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(FlaskParser.STAR, 0); }
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Star_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterStar_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitStar_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitStar_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_patternContext star_pattern() throws RecognitionException {
		Star_patternContext _localctx = new Star_patternContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_star_pattern);
		try {
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				match(STAR);
				setState(968);
				pattern_capture_target();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				match(STAR);
				setState(970);
				wildcard_pattern();
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
	public static class Mapping_patternContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(FlaskParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlaskParser.CLOSE_BRACE, 0); }
		public Double_star_patternContext double_star_pattern() {
			return getRuleContext(Double_star_patternContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Items_patternContext items_pattern() {
			return getRuleContext(Items_patternContext.class,0);
		}
		public Mapping_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterMapping_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitMapping_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitMapping_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mapping_patternContext mapping_pattern() throws RecognitionException {
		Mapping_patternContext _localctx = new Mapping_patternContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_mapping_pattern);
		int _la;
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				match(OPEN_BRACE);
				setState(974);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				match(OPEN_BRACE);
				setState(976);
				double_star_pattern();
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(977);
					match(COMMA);
					}
				}

				setState(980);
				match(CLOSE_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(982);
				match(OPEN_BRACE);
				setState(983);
				items_pattern();
				setState(984);
				match(COMMA);
				setState(985);
				double_star_pattern();
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(986);
					match(COMMA);
					}
				}

				setState(989);
				match(CLOSE_BRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(991);
				match(OPEN_BRACE);
				setState(992);
				items_pattern();
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(993);
					match(COMMA);
					}
				}

				setState(996);
				match(CLOSE_BRACE);
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
	public static class Items_patternContext extends ParserRuleContext {
		public List<Key_value_patternContext> key_value_pattern() {
			return getRuleContexts(Key_value_patternContext.class);
		}
		public Key_value_patternContext key_value_pattern(int i) {
			return getRuleContext(Key_value_patternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Items_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterItems_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitItems_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitItems_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Items_patternContext items_pattern() throws RecognitionException {
		Items_patternContext _localctx = new Items_patternContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_items_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			key_value_pattern();
			setState(1005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1001);
					match(COMMA);
					setState(1002);
					key_value_pattern();
					}
					} 
				}
				setState(1007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
	public static class Key_value_patternContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Literal_exprContext literal_expr() {
			return getRuleContext(Literal_exprContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public Key_value_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterKey_value_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitKey_value_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitKey_value_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_value_patternContext key_value_pattern() throws RecognitionException {
		Key_value_patternContext _localctx = new Key_value_patternContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_key_value_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case NONE:
			case TRUE:
			case NUMBER:
			case MINUS:
			case STRING:
				{
				setState(1008);
				literal_expr();
				}
				break;
			case MATCH:
			case UNDERSCORE:
			case NAME:
				{
				setState(1009);
				attr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1012);
			match(COLON);
			setState(1013);
			pattern();
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
	public static class Double_star_patternContext extends ParserRuleContext {
		public TerminalNode POWER() { return getToken(FlaskParser.POWER, 0); }
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public Double_star_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_star_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDouble_star_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDouble_star_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDouble_star_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_star_patternContext double_star_pattern() throws RecognitionException {
		Double_star_patternContext _localctx = new Double_star_patternContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_double_star_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(POWER);
			setState(1016);
			pattern_capture_target();
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
	public static class Class_patternContext extends ParserRuleContext {
		public Name_or_attrContext name_or_attr() {
			return getRuleContext(Name_or_attrContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(FlaskParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlaskParser.CLOSE_PAREN, 0); }
		public Positional_patternsContext positional_patterns() {
			return getRuleContext(Positional_patternsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Keyword_patternsContext keyword_patterns() {
			return getRuleContext(Keyword_patternsContext.class,0);
		}
		public Class_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterClass_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitClass_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitClass_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_patternContext class_pattern() throws RecognitionException {
		Class_patternContext _localctx = new Class_patternContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_class_pattern);
		int _la;
		try {
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				name_or_attr();
				setState(1019);
				match(OPEN_PAREN);
				setState(1020);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				name_or_attr();
				setState(1023);
				match(OPEN_PAREN);
				setState(1024);
				positional_patterns();
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1025);
					match(COMMA);
					}
				}

				setState(1028);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1030);
				name_or_attr();
				setState(1031);
				match(OPEN_PAREN);
				setState(1032);
				keyword_patterns();
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1033);
					match(COMMA);
					}
				}

				setState(1036);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1038);
				name_or_attr();
				setState(1039);
				match(OPEN_PAREN);
				setState(1040);
				positional_patterns();
				setState(1041);
				match(COMMA);
				setState(1042);
				keyword_patterns();
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1043);
					match(COMMA);
					}
				}

				setState(1046);
				match(CLOSE_PAREN);
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
	public static class Positional_patternsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Positional_patternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positional_patterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterPositional_patterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitPositional_patterns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitPositional_patterns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Positional_patternsContext positional_patterns() throws RecognitionException {
		Positional_patternsContext _localctx = new Positional_patternsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_positional_patterns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			pattern();
			setState(1055);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1051);
					match(COMMA);
					setState(1052);
					pattern();
					}
					} 
				}
				setState(1057);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
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
	public static class Keyword_patternsContext extends ParserRuleContext {
		public List<Keyword_patternContext> keyword_pattern() {
			return getRuleContexts(Keyword_patternContext.class);
		}
		public Keyword_patternContext keyword_pattern(int i) {
			return getRuleContext(Keyword_patternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Keyword_patternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_patterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterKeyword_patterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitKeyword_patterns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitKeyword_patterns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_patternsContext keyword_patterns() throws RecognitionException {
		Keyword_patternsContext _localctx = new Keyword_patternsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_keyword_patterns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			keyword_pattern();
			setState(1063);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1059);
					match(COMMA);
					setState(1060);
					keyword_pattern();
					}
					} 
				}
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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
	public static class Keyword_patternContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FlaskParser.ASSIGN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Keyword_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterKeyword_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitKeyword_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitKeyword_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_patternContext keyword_pattern() throws RecognitionException {
		Keyword_patternContext _localctx = new Keyword_patternContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_keyword_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			name();
			setState(1067);
			match(ASSIGN);
			setState(1068);
			pattern();
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
	public static class TestContext extends ParserRuleContext {
		public List<Or_testContext> or_test() {
			return getRuleContexts(Or_testContext.class);
		}
		public Or_testContext or_test(int i) {
			return getRuleContext(Or_testContext.class,i);
		}
		public TerminalNode IF() { return getToken(FlaskParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(FlaskParser.ELSE, 0); }
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,0);
		}
		public LambdefContext lambdef() {
			return getRuleContext(LambdefContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_test);
		int _la;
		try {
			setState(1079);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
			case FALSE:
			case MATCH:
			case NONE:
			case NOT:
			case TRUE:
			case UNDERSCORE:
			case NAME:
			case NUMBER:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				or_test();
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1071);
					match(IF);
					setState(1072);
					or_test();
					setState(1073);
					match(ELSE);
					setState(1074);
					test();
					}
				}

				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				lambdef();
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
	public static class Test_nocondContext extends ParserRuleContext {
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public Lambdef_nocondContext lambdef_nocond() {
			return getRuleContext(Lambdef_nocondContext.class,0);
		}
		public Test_nocondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_nocond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTest_nocond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTest_nocond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTest_nocond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_nocondContext test_nocond() throws RecognitionException {
		Test_nocondContext _localctx = new Test_nocondContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_test_nocond);
		try {
			setState(1083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
			case FALSE:
			case MATCH:
			case NONE:
			case NOT:
			case TRUE:
			case UNDERSCORE:
			case NAME:
			case NUMBER:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				or_test();
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				lambdef_nocond();
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
	public static class LambdefContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(FlaskParser.LAMBDA, 0); }
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public VarargslistContext varargslist() {
			return getRuleContext(VarargslistContext.class,0);
		}
		public LambdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterLambdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitLambdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitLambdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdefContext lambdef() throws RecognitionException {
		LambdefContext _localctx = new LambdefContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lambdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			match(LAMBDA);
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 140737505149953L) != 0)) {
				{
				setState(1086);
				varargslist();
				}
			}

			setState(1089);
			match(COLON);
			setState(1090);
			test();
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
	public static class Lambdef_nocondContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(FlaskParser.LAMBDA, 0); }
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public Test_nocondContext test_nocond() {
			return getRuleContext(Test_nocondContext.class,0);
		}
		public VarargslistContext varargslist() {
			return getRuleContext(VarargslistContext.class,0);
		}
		public Lambdef_nocondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef_nocond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterLambdef_nocond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitLambdef_nocond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitLambdef_nocond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambdef_nocondContext lambdef_nocond() throws RecognitionException {
		Lambdef_nocondContext _localctx = new Lambdef_nocondContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_lambdef_nocond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			match(LAMBDA);
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 140737505149953L) != 0)) {
				{
				setState(1093);
				varargslist();
				}
			}

			setState(1096);
			match(COLON);
			setState(1097);
			test_nocond();
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
	public static class Or_testContext extends ParserRuleContext {
		public List<And_testContext> and_test() {
			return getRuleContexts(And_testContext.class);
		}
		public And_testContext and_test(int i) {
			return getRuleContext(And_testContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(FlaskParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FlaskParser.OR, i);
		}
		public Or_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterOr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitOr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitOr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			and_test();
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1100);
				match(OR);
				setState(1101);
				and_test();
				}
				}
				setState(1106);
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
	public static class And_testContext extends ParserRuleContext {
		public List<Not_testContext> not_test() {
			return getRuleContexts(Not_testContext.class);
		}
		public Not_testContext not_test(int i) {
			return getRuleContext(Not_testContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(FlaskParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FlaskParser.AND, i);
		}
		public And_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAnd_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAnd_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAnd_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			not_test();
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1108);
				match(AND);
				setState(1109);
				not_test();
				}
				}
				setState(1114);
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
	public static class Not_testContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FlaskParser.NOT, 0); }
		public Not_testContext not_test() {
			return getRuleContext(Not_testContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Not_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterNot_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitNot_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitNot_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_not_test);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				match(NOT);
				setState(1116);
				not_test();
				}
				break;
			case AWAIT:
			case FALSE:
			case MATCH:
			case NONE:
			case TRUE:
			case UNDERSCORE:
			case NAME:
			case NUMBER:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1117);
				comparison();
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
	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			expr(0);
			setState(1126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1121);
					comp_op();
					setState(1122);
					expr(0);
					}
					} 
				}
				setState(1128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
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
	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(FlaskParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(FlaskParser.GREATER_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(FlaskParser.EQUALS, 0); }
		public TerminalNode GT_EQ() { return getToken(FlaskParser.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(FlaskParser.LT_EQ, 0); }
		public TerminalNode NOT_EQ_1() { return getToken(FlaskParser.NOT_EQ_1, 0); }
		public TerminalNode NOT_EQ_2() { return getToken(FlaskParser.NOT_EQ_2, 0); }
		public TerminalNode IN() { return getToken(FlaskParser.IN, 0); }
		public TerminalNode NOT() { return getToken(FlaskParser.NOT, 0); }
		public TerminalNode IS() { return getToken(FlaskParser.IS, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_comp_op);
		try {
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				match(LESS_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				match(GREATER_THAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1131);
				match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1132);
				match(GT_EQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1133);
				match(LT_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1134);
				match(NOT_EQ_1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1135);
				match(NOT_EQ_2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1136);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1137);
				match(NOT);
				setState(1138);
				match(IN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1139);
				match(IS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1140);
				match(IS);
				setState(1141);
				match(NOT);
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
	public static class Star_exprContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(FlaskParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterStar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitStar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitStar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_star_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(STAR);
			setState(1145);
			expr(0);
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
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(FlaskParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(FlaskParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(FlaskParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(FlaskParser.MINUS, i);
		}
		public List<TerminalNode> NOT_OP() { return getTokens(FlaskParser.NOT_OP); }
		public TerminalNode NOT_OP(int i) {
			return getToken(FlaskParser.NOT_OP, i);
		}
		public TerminalNode POWER() { return getToken(FlaskParser.POWER, 0); }
		public TerminalNode STAR() { return getToken(FlaskParser.STAR, 0); }
		public TerminalNode AT() { return getToken(FlaskParser.AT, 0); }
		public TerminalNode DIV() { return getToken(FlaskParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FlaskParser.MOD, 0); }
		public TerminalNode IDIV() { return getToken(FlaskParser.IDIV, 0); }
		public TerminalNode LEFT_SHIFT() { return getToken(FlaskParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(FlaskParser.RIGHT_SHIFT, 0); }
		public TerminalNode AND_OP() { return getToken(FlaskParser.AND_OP, 0); }
		public TerminalNode XOR() { return getToken(FlaskParser.XOR, 0); }
		public TerminalNode OR_OP() { return getToken(FlaskParser.OR_OP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
			case FALSE:
			case MATCH:
			case NONE:
			case TRUE:
			case UNDERSCORE:
			case NAME:
			case NUMBER:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case STRING:
				{
				setState(1148);
				atom_expr();
				}
				break;
			case ADD:
			case MINUS:
			case NOT_OP:
				{
				setState(1150); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1149);
						_la = _input.LA(1);
						if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 2051L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1152); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1154);
				expr(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1157);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1158);
						match(POWER);
						setState(1159);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1160);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1161);
						_la = _input.LA(1);
						if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 240522362881L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1162);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1163);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1164);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1165);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1166);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1167);
						_la = _input.LA(1);
						if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1168);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1169);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1170);
						match(AND_OP);
						setState(1171);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1172);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1173);
						match(XOR);
						setState(1174);
						expr(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1175);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1176);
						match(OR_OP);
						setState(1177);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(1182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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
	public static class Atom_exprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode AWAIT() { return getToken(FlaskParser.AWAIT, 0); }
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAtom_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAtom_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAtom_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_atom_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(1183);
				match(AWAIT);
				}
			}

			setState(1186);
			atom();
			setState(1190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1187);
					trailer();
					}
					} 
				}
				setState(1192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
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
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(FlaskParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlaskParser.CLOSE_PAREN, 0); }
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Testlist_compContext testlist_comp() {
			return getRuleContext(Testlist_compContext.class,0);
		}
		public TerminalNode OPEN_BRACK() { return getToken(FlaskParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(FlaskParser.CLOSE_BRACK, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(FlaskParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlaskParser.CLOSE_BRACE, 0); }
		public DictorsetmakerContext dictorsetmaker() {
			return getRuleContext(DictorsetmakerContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(FlaskParser.NUMBER, 0); }
		public List<TerminalNode> STRING() { return getTokens(FlaskParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(FlaskParser.STRING, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(FlaskParser.ELLIPSIS, 0); }
		public TerminalNode NONE() { return getToken(FlaskParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(FlaskParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FlaskParser.FALSE, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_atom);
		int _la;
		try {
			int _alt;
			setState(1220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193);
				match(OPEN_PAREN);
				setState(1196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(1194);
					yield_expr();
					}
					break;
				case AWAIT:
				case FALSE:
				case LAMBDA:
				case MATCH:
				case NONE:
				case NOT:
				case TRUE:
				case UNDERSCORE:
				case NAME:
				case NUMBER:
				case ELLIPSIS:
				case STAR:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case OPEN_BRACE:
				case ADD:
				case MINUS:
				case NOT_OP:
				case STRING:
					{
					setState(1195);
					testlist_comp();
					}
					break;
				case CLOSE_PAREN:
					break;
				default:
					break;
				}
				setState(1198);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				match(OPEN_BRACK);
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566335159468160L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 138418261L) != 0)) {
					{
					setState(1200);
					testlist_comp();
					}
				}

				setState(1203);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1204);
				match(OPEN_BRACE);
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1692235066310784L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 138418261L) != 0)) {
					{
					setState(1205);
					dictorsetmaker();
					}
				}

				setState(1208);
				match(CLOSE_BRACE);
				}
				break;
			case MATCH:
			case UNDERSCORE:
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(1209);
				name();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1210);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(1212); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1211);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1214); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 7);
				{
				setState(1216);
				match(ELLIPSIS);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1217);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1218);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1219);
				match(FALSE);
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FlaskParser.NAME, 0); }
		public TerminalNode UNDERSCORE() { return getToken(FlaskParser.UNDERSCORE, 0); }
		public TerminalNode MATCH() { return getToken(FlaskParser.MATCH, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1168298213376L) != 0)) ) {
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
	public static class Testlist_compContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public Testlist_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTestlist_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTestlist_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTestlist_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_compContext testlist_comp() throws RecognitionException {
		Testlist_compContext _localctx = new Testlist_compContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_testlist_comp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
			case FALSE:
			case LAMBDA:
			case MATCH:
			case NONE:
			case NOT:
			case TRUE:
			case UNDERSCORE:
			case NAME:
			case NUMBER:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
				{
				setState(1224);
				test();
				}
				break;
			case STAR:
				{
				setState(1225);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASYNC:
			case FOR:
				{
				setState(1228);
				comp_for();
				}
				break;
			case CLOSE_PAREN:
			case CLOSE_BRACK:
			case COMMA:
				{
				setState(1236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1229);
						match(COMMA);
						setState(1232);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case AWAIT:
						case FALSE:
						case LAMBDA:
						case MATCH:
						case NONE:
						case NOT:
						case TRUE:
						case UNDERSCORE:
						case NAME:
						case NUMBER:
						case ELLIPSIS:
						case OPEN_PAREN:
						case OPEN_BRACK:
						case OPEN_BRACE:
						case ADD:
						case MINUS:
						case NOT_OP:
						case STRING:
							{
							setState(1230);
							test();
							}
							break;
						case STAR:
							{
							setState(1231);
							star_expr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(1238);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1239);
					match(COMMA);
					}
				}

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
	public static class TrailerContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(FlaskParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlaskParser.CLOSE_PAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode OPEN_BRACK() { return getToken(FlaskParser.OPEN_BRACK, 0); }
		public SubscriptlistContext subscriptlist() {
			return getRuleContext(SubscriptlistContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(FlaskParser.CLOSE_BRACK, 0); }
		public TerminalNode DOT() { return getToken(FlaskParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_trailer);
		int _la;
		try {
			setState(1255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1244);
				match(OPEN_PAREN);
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1692235066310784L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 138418261L) != 0)) {
					{
					setState(1245);
					arglist();
					}
				}

				setState(1248);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249);
				match(OPEN_BRACK);
				setState(1250);
				subscriptlist();
				setState(1251);
				match(CLOSE_BRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1253);
				match(DOT);
				setState(1254);
				name();
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
	public static class SubscriptlistContext extends ParserRuleContext {
		public List<Subscript_Context> subscript_() {
			return getRuleContexts(Subscript_Context.class);
		}
		public Subscript_Context subscript_(int i) {
			return getRuleContext(Subscript_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public SubscriptlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSubscriptlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSubscriptlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSubscriptlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptlistContext subscriptlist() throws RecognitionException {
		SubscriptlistContext _localctx = new SubscriptlistContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_subscriptlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			subscript_();
			setState(1262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1258);
					match(COMMA);
					setState(1259);
					subscript_();
					}
					} 
				}
				setState(1264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1265);
				match(COMMA);
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
	public static class Subscript_Context extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public SliceopContext sliceop() {
			return getRuleContext(SliceopContext.class,0);
		}
		public Subscript_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSubscript_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSubscript_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSubscript_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_Context subscript_() throws RecognitionException {
		Subscript_Context _localctx = new Subscript_Context(_ctx, getState());
		enterRule(_localctx, 208, RULE_subscript_);
		int _la;
		try {
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1268);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566335159468160L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 34604565L) != 0)) {
					{
					setState(1269);
					test();
					}
				}

				setState(1272);
				match(COLON);
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566335159468160L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 34604565L) != 0)) {
					{
					setState(1273);
					test();
					}
				}

				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1276);
					sliceop();
					}
				}

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
	public static class SliceopContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public SliceopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterSliceop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitSliceop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitSliceop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceopContext sliceop() throws RecognitionException {
		SliceopContext _localctx = new SliceopContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_sliceop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(COLON);
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566335159468160L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 34604565L) != 0)) {
				{
				setState(1282);
				test();
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
	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_exprlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
			case FALSE:
			case MATCH:
			case NONE:
			case TRUE:
			case UNDERSCORE:
			case NAME:
			case NUMBER:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
				{
				setState(1285);
				expr(0);
				}
				break;
			case STAR:
				{
				setState(1286);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1289);
					match(COMMA);
					setState(1292);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AWAIT:
					case FALSE:
					case MATCH:
					case NONE:
					case TRUE:
					case UNDERSCORE:
					case NAME:
					case NUMBER:
					case ELLIPSIS:
					case OPEN_PAREN:
					case OPEN_BRACK:
					case OPEN_BRACE:
					case ADD:
					case MINUS:
					case NOT_OP:
					case STRING:
						{
						setState(1290);
						expr(0);
						}
						break;
					case STAR:
						{
						setState(1291);
						star_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1299);
				match(COMMA);
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
	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterTestlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitTestlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitTestlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			test();
			setState(1307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1303);
					match(COMMA);
					setState(1304);
					test();
					}
					} 
				}
				setState(1309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1310);
				match(COMMA);
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
	public static class DictorsetmakerContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(FlaskParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FlaskParser.COLON, i);
		}
		public List<TerminalNode> POWER() { return getTokens(FlaskParser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(FlaskParser.POWER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public DictorsetmakerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictorsetmaker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterDictorsetmaker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitDictorsetmaker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitDictorsetmaker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictorsetmakerContext dictorsetmaker() throws RecognitionException {
		DictorsetmakerContext _localctx = new DictorsetmakerContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_dictorsetmaker);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				{
				setState(1319);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AWAIT:
				case FALSE:
				case LAMBDA:
				case MATCH:
				case NONE:
				case NOT:
				case TRUE:
				case UNDERSCORE:
				case NAME:
				case NUMBER:
				case ELLIPSIS:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case OPEN_BRACE:
				case ADD:
				case MINUS:
				case NOT_OP:
				case STRING:
					{
					setState(1313);
					test();
					setState(1314);
					match(COLON);
					setState(1315);
					test();
					}
					break;
				case POWER:
					{
					setState(1317);
					match(POWER);
					setState(1318);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASYNC:
				case FOR:
					{
					setState(1321);
					comp_for();
					}
					break;
				case CLOSE_BRACE:
				case COMMA:
					{
					setState(1333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1322);
							match(COMMA);
							setState(1329);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case AWAIT:
							case FALSE:
							case LAMBDA:
							case MATCH:
							case NONE:
							case NOT:
							case TRUE:
							case UNDERSCORE:
							case NAME:
							case NUMBER:
							case ELLIPSIS:
							case OPEN_PAREN:
							case OPEN_BRACK:
							case OPEN_BRACE:
							case ADD:
							case MINUS:
							case NOT_OP:
							case STRING:
								{
								setState(1323);
								test();
								setState(1324);
								match(COLON);
								setState(1325);
								test();
								}
								break;
							case POWER:
								{
								setState(1327);
								match(POWER);
								setState(1328);
								expr(0);
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							} 
						}
						setState(1335);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
					}
					setState(1337);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1336);
						match(COMMA);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(1343);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AWAIT:
				case FALSE:
				case LAMBDA:
				case MATCH:
				case NONE:
				case NOT:
				case TRUE:
				case UNDERSCORE:
				case NAME:
				case NUMBER:
				case ELLIPSIS:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case OPEN_BRACE:
				case ADD:
				case MINUS:
				case NOT_OP:
				case STRING:
					{
					setState(1341);
					test();
					}
					break;
				case STAR:
					{
					setState(1342);
					star_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1359);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASYNC:
				case FOR:
					{
					setState(1345);
					comp_for();
					}
					break;
				case CLOSE_BRACE:
				case COMMA:
					{
					setState(1353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1346);
							match(COMMA);
							setState(1349);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case AWAIT:
							case FALSE:
							case LAMBDA:
							case MATCH:
							case NONE:
							case NOT:
							case TRUE:
							case UNDERSCORE:
							case NAME:
							case NUMBER:
							case ELLIPSIS:
							case OPEN_PAREN:
							case OPEN_BRACK:
							case OPEN_BRACE:
							case ADD:
							case MINUS:
							case NOT_OP:
							case STRING:
								{
								setState(1347);
								test();
								}
								break;
							case STAR:
								{
								setState(1348);
								star_expr();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							} 
						}
						setState(1355);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
					}
					setState(1357);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1356);
						match(COMMA);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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
	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FlaskParser.CLASS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FlaskParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(FlaskParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlaskParser.CLOSE_PAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitClassdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(CLASS);
			setState(1364);
			name();
			setState(1370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(1365);
				match(OPEN_PAREN);
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1692235066310784L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 138418261L) != 0)) {
					{
					setState(1366);
					arglist();
					}
				}

				setState(1369);
				match(CLOSE_PAREN);
				}
			}

			setState(1372);
			match(COLON);
			setState(1373);
			block();
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
	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlaskParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			argument();
			setState(1380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1376);
					match(COMMA);
					setState(1377);
					argument();
					}
					} 
				}
				setState(1382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			}
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1383);
				match(COMMA);
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
	public static class ArgumentContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(FlaskParser.ASSIGN, 0); }
		public TerminalNode POWER() { return getToken(FlaskParser.POWER, 0); }
		public TerminalNode STAR() { return getToken(FlaskParser.STAR, 0); }
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1386);
				test();
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC || _la==FOR) {
					{
					setState(1387);
					comp_for();
					}
				}

				}
				break;
			case 2:
				{
				setState(1390);
				test();
				setState(1391);
				match(ASSIGN);
				setState(1392);
				test();
				}
				break;
			case 3:
				{
				setState(1394);
				match(POWER);
				setState(1395);
				test();
				}
				break;
			case 4:
				{
				setState(1396);
				match(STAR);
				setState(1397);
				test();
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
	public static class Comp_iterContext extends ParserRuleContext {
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public Comp_ifContext comp_if() {
			return getRuleContext(Comp_ifContext.class,0);
		}
		public Comp_iterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_iter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterComp_iter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitComp_iter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitComp_iter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_iterContext comp_iter() throws RecognitionException {
		Comp_iterContext _localctx = new Comp_iterContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_comp_iter);
		try {
			setState(1402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASYNC:
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1400);
				comp_for();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
				comp_if();
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
	public static class Comp_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FlaskParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(FlaskParser.IN, 0); }
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(FlaskParser.ASYNC, 0); }
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterComp_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitComp_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitComp_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(1404);
				match(ASYNC);
				}
			}

			setState(1407);
			match(FOR);
			setState(1408);
			exprlist();
			setState(1409);
			match(IN);
			setState(1410);
			or_test();
			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2359360L) != 0)) {
				{
				setState(1411);
				comp_iter();
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
	public static class Comp_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FlaskParser.IF, 0); }
		public Test_nocondContext test_nocond() {
			return getRuleContext(Test_nocondContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterComp_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitComp_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitComp_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_ifContext comp_if() throws RecognitionException {
		Comp_ifContext _localctx = new Comp_ifContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_comp_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			match(IF);
			setState(1415);
			test_nocond();
			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2359360L) != 0)) {
				{
				setState(1416);
				comp_iter();
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
	public static class Encoding_declContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Encoding_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encoding_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterEncoding_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitEncoding_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitEncoding_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Encoding_declContext encoding_decl() throws RecognitionException {
		Encoding_declContext _localctx = new Encoding_declContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_encoding_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			name();
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
	public static class Yield_exprContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(FlaskParser.YIELD, 0); }
		public Yield_argContext yield_arg() {
			return getRuleContext(Yield_argContext.class,0);
		}
		public Yield_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterYield_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitYield_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitYield_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_exprContext yield_expr() throws RecognitionException {
		Yield_exprContext _localctx = new Yield_exprContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_yield_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			match(YIELD);
			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566335159992448L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 34604565L) != 0)) {
				{
				setState(1422);
				yield_arg();
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
	public static class Yield_argContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(FlaskParser.FROM, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Yield_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterYield_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitYield_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitYield_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_argContext yield_arg() throws RecognitionException {
		Yield_argContext _localctx = new Yield_argContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_yield_arg);
		try {
			setState(1428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1425);
				match(FROM);
				setState(1426);
				test();
				}
				break;
			case AWAIT:
			case FALSE:
			case LAMBDA:
			case MATCH:
			case NONE:
			case NOT:
			case TRUE:
			case UNDERSCORE:
			case NAME:
			case NUMBER:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1427);
				testlist();
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
	public static class StringsContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(FlaskParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(FlaskParser.STRING, i);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).enterStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlaskParserListener ) ((FlaskParserListener)listener).exitStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlaskParserVisitor ) return ((FlaskParserVisitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_strings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1430);
				match(STRING);
				}
				}
				setState(1433); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
		case 60:
			return literal_pattern_sempred((Literal_patternContext)_localctx, predIndex);
		case 61:
			return literal_expr_sempred((Literal_exprContext)_localctx, predIndex);
		case 68:
			return pattern_capture_target_sempred((Pattern_capture_targetContext)_localctx, predIndex);
		case 70:
			return value_pattern_sempred((Value_patternContext)_localctx, predIndex);
		case 97:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean literal_pattern_sempred(Literal_patternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  this.CannotBePlusMinus() ;
		}
		return true;
	}
	private boolean literal_expr_sempred(Literal_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  this.CannotBePlusMinus() ;
		}
		return true;
	}
	private boolean pattern_capture_target_sempred(Pattern_capture_targetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return  this.CannotBeDotLpEq() ;
		}
		return true;
	}
	private boolean value_pattern_sempred(Value_patternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return  this.CannotBeDotLpEq() ;
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001d\u059c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002"+
		"n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007r\u0002"+
		"s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0001\u0000\u0003\u0000"+
		"\u00f0\b\u0000\u0001\u0000\u0003\u0000\u00f3\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u00f9\b\u0001\n\u0001\f\u0001"+
		"\u00fc\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u0102\b\u0002\n\u0002\f\u0002\u0105\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u010d\b\u0003\u0001"+
		"\u0003\u0003\u0003\u0110\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004"+
		"\u0004\u0115\b\u0004\u000b\u0004\f\u0004\u0116\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u011d\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0127\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0003\b\u012e\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0135\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u013b\b\t\u0005\t"+
		"\u013d\b\t\n\t\f\t\u0140\t\t\u0001\t\u0001\t\u0001\t\u0003\t\u0145\b\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u014b\b\t\u0005\t\u014d\b\t\n"+
		"\t\f\t\u0150\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0156\b\t\u0003"+
		"\t\u0158\b\t\u0003\t\u015a\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u015f\b"+
		"\t\u0003\t\u0161\b\t\u0003\t\u0163\b\t\u0001\t\u0001\t\u0003\t\u0167\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u016d\b\t\u0005\t\u016f\b\t"+
		"\n\t\f\t\u0172\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0178\b\t\u0003"+
		"\t\u017a\b\t\u0003\t\u017c\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0181\b"+
		"\t\u0003\t\u0183\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u0188\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u018d\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0193\b\u000b\u0005\u000b\u0195\b"+
		"\u000b\n\u000b\f\u000b\u0198\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u019d\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u01a3\b\u000b\u0005\u000b\u01a5\b\u000b\n\u000b\f\u000b\u01a8"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01ae"+
		"\b\u000b\u0003\u000b\u01b0\b\u000b\u0003\u000b\u01b2\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u01b7\b\u000b\u0003\u000b\u01b9\b"+
		"\u000b\u0003\u000b\u01bb\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01bf"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01c5"+
		"\b\u000b\u0005\u000b\u01c7\b\u000b\n\u000b\f\u000b\u01ca\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01d0\b\u000b\u0003"+
		"\u000b\u01d2\b\u000b\u0003\u000b\u01d4\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u01d9\b\u000b\u0003\u000b\u01db\b\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0003\r\u01e1\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u01e6\b\u000e\n\u000e\f\u000e\u01e9\t\u000e\u0001\u000e"+
		"\u0003\u000e\u01ec\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u01f8\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u01ff\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0204\b\u0010\u0005\u0010\u0206\b\u0010\n\u0010\f\u0010\u0209"+
		"\t\u0010\u0003\u0010\u020b\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0211\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0215\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u021a\b"+
		"\u0012\u0005\u0012\u021c\b\u0012\n\u0012\f\u0012\u021f\t\u0012\u0001\u0012"+
		"\u0003\u0012\u0222\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0230\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0238\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0240\b\u001b\u0003\u001b\u0242\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0246\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u024d\b\u001e\n\u001e\f\u001e\u0250\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0004\u001e\u0254\b\u001e\u000b\u001e\f\u001e"+
		"\u0255\u0003\u001e\u0258\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0261\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0266\b\u001f\u0001 \u0001"+
		" \u0001 \u0003 \u026b\b \u0001!\u0001!\u0001!\u0005!\u0270\b!\n!\f!\u0273"+
		"\t!\u0001!\u0003!\u0276\b!\u0001\"\u0001\"\u0001\"\u0005\"\u027b\b\"\n"+
		"\"\f\"\u027e\t\"\u0001#\u0001#\u0001#\u0005#\u0283\b#\n#\f#\u0286\t#\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u028c\b$\n$\f$\u028f\t$\u0001%\u0001%\u0001"+
		"%\u0001%\u0005%\u0295\b%\n%\f%\u0298\t%\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u029e\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u02aa\b\'\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u02b0\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u02bb\b)\n)\f)\u02be\t)\u0001)\u0001)\u0001)\u0003)\u02c3\b)"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02cc\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u02d7"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0004,\u02e0\b,\u000b"+
		",\f,\u02e1\u0001,\u0001,\u0001,\u0003,\u02e7\b,\u0001,\u0001,\u0001,\u0003"+
		",\u02ec\b,\u0001,\u0001,\u0001,\u0003,\u02f1\b,\u0001-\u0001-\u0001-\u0001"+
		"-\u0005-\u02f7\b-\n-\f-\u02fa\t-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0003.\u0302\b.\u0001/\u0001/\u0001/\u0001/\u0003/\u0308\b/\u0003/\u030a"+
		"\b/\u00010\u00010\u00010\u00010\u00040\u0310\b0\u000b0\f0\u0311\u0001"+
		"0\u00010\u00030\u0316\b0\u00011\u00011\u00011\u00011\u00011\u00011\u0004"+
		"1\u031e\b1\u000b1\f1\u031f\u00011\u00011\u00012\u00012\u00012\u00032\u0327"+
		"\b2\u00012\u00032\u032a\b2\u00013\u00013\u00043\u032e\b3\u000b3\f3\u032f"+
		"\u00013\u00033\u0333\b3\u00014\u00014\u00014\u00034\u0338\b4\u00015\u0001"+
		"5\u00015\u00035\u033d\b5\u00015\u00015\u00015\u00016\u00016\u00016\u0001"+
		"7\u00017\u00037\u0347\b7\u00018\u00018\u00038\u034b\b8\u00019\u00019\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0005:\u0354\b:\n:\f:\u0357\t:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0361\b;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u036b\b<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u0375\b=\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u037f\b>\u0001?\u0001"+
		"?\u0001?\u0003?\u0384\b?\u0001@\u0001@\u0001@\u0003@\u0389\b@\u0001A\u0001"+
		"A\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001D\u0001E\u0001E\u0001"+
		"F\u0001F\u0001F\u0001G\u0001G\u0001G\u0004G\u039c\bG\u000bG\fG\u039d\u0001"+
		"H\u0001H\u0003H\u03a2\bH\u0001I\u0001I\u0001I\u0001I\u0001J\u0001J\u0003"+
		"J\u03aa\bJ\u0001J\u0001J\u0001J\u0003J\u03af\bJ\u0001J\u0003J\u03b2\b"+
		"J\u0001K\u0001K\u0001K\u0003K\u03b7\bK\u0001L\u0001L\u0001L\u0005L\u03bc"+
		"\bL\nL\fL\u03bf\tL\u0001L\u0003L\u03c2\bL\u0001M\u0001M\u0003M\u03c6\b"+
		"M\u0001N\u0001N\u0001N\u0001N\u0003N\u03cc\bN\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0003O\u03d3\bO\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0003O\u03dc\bO\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u03e3\bO\u0001"+
		"O\u0001O\u0003O\u03e7\bO\u0001P\u0001P\u0001P\u0005P\u03ec\bP\nP\fP\u03ef"+
		"\tP\u0001Q\u0001Q\u0003Q\u03f3\bQ\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001"+
		"R\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u0403"+
		"\bS\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u040b\bS\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u0415\bS\u0001S\u0001"+
		"S\u0003S\u0419\bS\u0001T\u0001T\u0001T\u0005T\u041e\bT\nT\fT\u0421\tT"+
		"\u0001U\u0001U\u0001U\u0005U\u0426\bU\nU\fU\u0429\tU\u0001V\u0001V\u0001"+
		"V\u0001V\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0003W\u0435\bW\u0001"+
		"W\u0003W\u0438\bW\u0001X\u0001X\u0003X\u043c\bX\u0001Y\u0001Y\u0003Y\u0440"+
		"\bY\u0001Y\u0001Y\u0001Y\u0001Z\u0001Z\u0003Z\u0447\bZ\u0001Z\u0001Z\u0001"+
		"Z\u0001[\u0001[\u0001[\u0005[\u044f\b[\n[\f[\u0452\t[\u0001\\\u0001\\"+
		"\u0001\\\u0005\\\u0457\b\\\n\\\f\\\u045a\t\\\u0001]\u0001]\u0001]\u0003"+
		"]\u045f\b]\u0001^\u0001^\u0001^\u0001^\u0005^\u0465\b^\n^\f^\u0468\t^"+
		"\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0003_\u0477\b_\u0001`\u0001`\u0001`\u0001a\u0001"+
		"a\u0001a\u0004a\u047f\ba\u000ba\fa\u0480\u0001a\u0003a\u0484\ba\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0005a\u049b\ba\na\fa\u049e\ta\u0001b\u0003b\u04a1\bb\u0001b\u0001b"+
		"\u0005b\u04a5\bb\nb\fb\u04a8\tb\u0001c\u0001c\u0001c\u0003c\u04ad\bc\u0001"+
		"c\u0001c\u0001c\u0003c\u04b2\bc\u0001c\u0001c\u0001c\u0003c\u04b7\bc\u0001"+
		"c\u0001c\u0001c\u0001c\u0004c\u04bd\bc\u000bc\fc\u04be\u0001c\u0001c\u0001"+
		"c\u0001c\u0003c\u04c5\bc\u0001d\u0001d\u0001e\u0001e\u0003e\u04cb\be\u0001"+
		"e\u0001e\u0001e\u0001e\u0003e\u04d1\be\u0005e\u04d3\be\ne\fe\u04d6\te"+
		"\u0001e\u0003e\u04d9\be\u0003e\u04db\be\u0001f\u0001f\u0003f\u04df\bf"+
		"\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0003f\u04e8\bf\u0001"+
		"g\u0001g\u0001g\u0005g\u04ed\bg\ng\fg\u04f0\tg\u0001g\u0003g\u04f3\bg"+
		"\u0001h\u0001h\u0003h\u04f7\bh\u0001h\u0001h\u0003h\u04fb\bh\u0001h\u0003"+
		"h\u04fe\bh\u0003h\u0500\bh\u0001i\u0001i\u0003i\u0504\bi\u0001j\u0001"+
		"j\u0003j\u0508\bj\u0001j\u0001j\u0001j\u0003j\u050d\bj\u0005j\u050f\b"+
		"j\nj\fj\u0512\tj\u0001j\u0003j\u0515\bj\u0001k\u0001k\u0001k\u0005k\u051a"+
		"\bk\nk\fk\u051d\tk\u0001k\u0003k\u0520\bk\u0001l\u0001l\u0001l\u0001l"+
		"\u0001l\u0001l\u0003l\u0528\bl\u0001l\u0001l\u0001l\u0001l\u0001l\u0001"+
		"l\u0001l\u0001l\u0003l\u0532\bl\u0005l\u0534\bl\nl\fl\u0537\tl\u0001l"+
		"\u0003l\u053a\bl\u0003l\u053c\bl\u0001l\u0001l\u0003l\u0540\bl\u0001l"+
		"\u0001l\u0001l\u0001l\u0003l\u0546\bl\u0005l\u0548\bl\nl\fl\u054b\tl\u0001"+
		"l\u0003l\u054e\bl\u0003l\u0550\bl\u0003l\u0552\bl\u0001m\u0001m\u0001"+
		"m\u0001m\u0003m\u0558\bm\u0001m\u0003m\u055b\bm\u0001m\u0001m\u0001m\u0001"+
		"n\u0001n\u0001n\u0005n\u0563\bn\nn\fn\u0566\tn\u0001n\u0003n\u0569\bn"+
		"\u0001o\u0001o\u0003o\u056d\bo\u0001o\u0001o\u0001o\u0001o\u0001o\u0001"+
		"o\u0001o\u0001o\u0003o\u0577\bo\u0001p\u0001p\u0003p\u057b\bp\u0001q\u0003"+
		"q\u057e\bq\u0001q\u0001q\u0001q\u0001q\u0001q\u0003q\u0585\bq\u0001r\u0001"+
		"r\u0001r\u0003r\u058a\br\u0001s\u0001s\u0001t\u0001t\u0003t\u0590\bt\u0001"+
		"u\u0001u\u0001u\u0003u\u0595\bu\u0001v\u0004v\u0598\bv\u000bv\fv\u0599"+
		"\u0001v\u0000\u0001\u00c2w\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u0000\u0007"+
		"\u0001\u0000;G\u0002\u000011HH\u0002\u0000TU__\u0003\u000033IIVX\u0001"+
		"\u0000TU\u0001\u0000`a\u0003\u0000\u001a\u001a$$((\u0633\u0000\u00ef\u0001"+
		"\u0000\u0000\u0000\u0002\u00fa\u0001\u0000\u0000\u0000\u0004\u00ff\u0001"+
		"\u0000\u0000\u0000\u0006\u0108\u0001\u0000\u0000\u0000\b\u0114\u0001\u0000"+
		"\u0000\u0000\n\u0118\u0001\u0000\u0000\u0000\f\u011e\u0001\u0000\u0000"+
		"\u0000\u000e\u0121\u0001\u0000\u0000\u0000\u0010\u012b\u0001\u0000\u0000"+
		"\u0000\u0012\u0182\u0001\u0000\u0000\u0000\u0014\u0184\u0001\u0000\u0000"+
		"\u0000\u0016\u01da\u0001\u0000\u0000\u0000\u0018\u01dc\u0001\u0000\u0000"+
		"\u0000\u001a\u01e0\u0001\u0000\u0000\u0000\u001c\u01e2\u0001\u0000\u0000"+
		"\u0000\u001e\u01f7\u0001\u0000\u0000\u0000 \u01f9\u0001\u0000\u0000\u0000"+
		"\"\u020c\u0001\u0000\u0000\u0000$\u0214\u0001\u0000\u0000\u0000&\u0223"+
		"\u0001\u0000\u0000\u0000(\u0225\u0001\u0000\u0000\u0000*\u0228\u0001\u0000"+
		"\u0000\u0000,\u022f\u0001\u0000\u0000\u0000.\u0231\u0001\u0000\u0000\u0000"+
		"0\u0233\u0001\u0000\u0000\u00002\u0235\u0001\u0000\u0000\u00004\u0239"+
		"\u0001\u0000\u0000\u00006\u023b\u0001\u0000\u0000\u00008\u0245\u0001\u0000"+
		"\u0000\u0000:\u0247\u0001\u0000\u0000\u0000<\u024a\u0001\u0000\u0000\u0000"+
		">\u0262\u0001\u0000\u0000\u0000@\u0267\u0001\u0000\u0000\u0000B\u026c"+
		"\u0001\u0000\u0000\u0000D\u0277\u0001\u0000\u0000\u0000F\u027f\u0001\u0000"+
		"\u0000\u0000H\u0287\u0001\u0000\u0000\u0000J\u0290\u0001\u0000\u0000\u0000"+
		"L\u0299\u0001\u0000\u0000\u0000N\u02a9\u0001\u0000\u0000\u0000P\u02ab"+
		"\u0001\u0000\u0000\u0000R\u02b1\u0001\u0000\u0000\u0000T\u02c4\u0001\u0000"+
		"\u0000\u0000V\u02cd\u0001\u0000\u0000\u0000X\u02d8\u0001\u0000\u0000\u0000"+
		"Z\u02f2\u0001\u0000\u0000\u0000\\\u02fe\u0001\u0000\u0000\u0000^\u0303"+
		"\u0001\u0000\u0000\u0000`\u0315\u0001\u0000\u0000\u0000b\u0317\u0001\u0000"+
		"\u0000\u0000d\u0329\u0001\u0000\u0000\u0000f\u032b\u0001\u0000\u0000\u0000"+
		"h\u0337\u0001\u0000\u0000\u0000j\u0339\u0001\u0000\u0000\u0000l\u0341"+
		"\u0001\u0000\u0000\u0000n\u0346\u0001\u0000\u0000\u0000p\u034a\u0001\u0000"+
		"\u0000\u0000r\u034c\u0001\u0000\u0000\u0000t\u0350\u0001\u0000\u0000\u0000"+
		"v\u0360\u0001\u0000\u0000\u0000x\u036a\u0001\u0000\u0000\u0000z\u0374"+
		"\u0001\u0000\u0000\u0000|\u037e\u0001\u0000\u0000\u0000~\u0383\u0001\u0000"+
		"\u0000\u0000\u0080\u0388\u0001\u0000\u0000\u0000\u0082\u038a\u0001\u0000"+
		"\u0000\u0000\u0084\u038c\u0001\u0000\u0000\u0000\u0086\u038e\u0001\u0000"+
		"\u0000\u0000\u0088\u0390\u0001\u0000\u0000\u0000\u008a\u0393\u0001\u0000"+
		"\u0000\u0000\u008c\u0395\u0001\u0000\u0000\u0000\u008e\u0398\u0001\u0000"+
		"\u0000\u0000\u0090\u03a1\u0001\u0000\u0000\u0000\u0092\u03a3\u0001\u0000"+
		"\u0000\u0000\u0094\u03b1\u0001\u0000\u0000\u0000\u0096\u03b3\u0001\u0000"+
		"\u0000\u0000\u0098\u03b8\u0001\u0000\u0000\u0000\u009a\u03c5\u0001\u0000"+
		"\u0000\u0000\u009c\u03cb\u0001\u0000\u0000\u0000\u009e\u03e6\u0001\u0000"+
		"\u0000\u0000\u00a0\u03e8\u0001\u0000\u0000\u0000\u00a2\u03f2\u0001\u0000"+
		"\u0000\u0000\u00a4\u03f7\u0001\u0000\u0000\u0000\u00a6\u0418\u0001\u0000"+
		"\u0000\u0000\u00a8\u041a\u0001\u0000\u0000\u0000\u00aa\u0422\u0001\u0000"+
		"\u0000\u0000\u00ac\u042a\u0001\u0000\u0000\u0000\u00ae\u0437\u0001\u0000"+
		"\u0000\u0000\u00b0\u043b\u0001\u0000\u0000\u0000\u00b2\u043d\u0001\u0000"+
		"\u0000\u0000\u00b4\u0444\u0001\u0000\u0000\u0000\u00b6\u044b\u0001\u0000"+
		"\u0000\u0000\u00b8\u0453\u0001\u0000\u0000\u0000\u00ba\u045e\u0001\u0000"+
		"\u0000\u0000\u00bc\u0460\u0001\u0000\u0000\u0000\u00be\u0476\u0001\u0000"+
		"\u0000\u0000\u00c0\u0478\u0001\u0000\u0000\u0000\u00c2\u0483\u0001\u0000"+
		"\u0000\u0000\u00c4\u04a0\u0001\u0000\u0000\u0000\u00c6\u04c4\u0001\u0000"+
		"\u0000\u0000\u00c8\u04c6\u0001\u0000\u0000\u0000\u00ca\u04ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u04e7\u0001\u0000\u0000\u0000\u00ce\u04e9\u0001\u0000"+
		"\u0000\u0000\u00d0\u04ff\u0001\u0000\u0000\u0000\u00d2\u0501\u0001\u0000"+
		"\u0000\u0000\u00d4\u0507\u0001\u0000\u0000\u0000\u00d6\u0516\u0001\u0000"+
		"\u0000\u0000\u00d8\u0551\u0001\u0000\u0000\u0000\u00da\u0553\u0001\u0000"+
		"\u0000\u0000\u00dc\u055f\u0001\u0000\u0000\u0000\u00de\u0576\u0001\u0000"+
		"\u0000\u0000\u00e0\u057a\u0001\u0000\u0000\u0000\u00e2\u057d\u0001\u0000"+
		"\u0000\u0000\u00e4\u0586\u0001\u0000\u0000\u0000\u00e6\u058b\u0001\u0000"+
		"\u0000\u0000\u00e8\u058d\u0001\u0000\u0000\u0000\u00ea\u0594\u0001\u0000"+
		"\u0000\u0000\u00ec\u0597\u0001\u0000\u0000\u0000\u00ee\u00f0\u0003\u001c"+
		"\u000e\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00f3\u0003N\'"+
		"\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005Z\u0000\u0000"+
		"\u00f5\u0001\u0001\u0000\u0000\u0000\u00f6\u00f9\u0005Z\u0000\u0000\u00f7"+
		"\u00f9\u0003\u001a\r\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0005\u0000\u0000\u0001\u00fe\u0003\u0001\u0000\u0000\u0000\u00ff\u0103"+
		"\u0003\u00d6k\u0000\u0100\u0102\u0005Z\u0000\u0000\u0101\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0000"+
		"\u0000\u0001\u0107\u0005\u0001\u0000\u0000\u0000\u0108\u0109\u0005X\u0000"+
		"\u0000\u0109\u010f\u0003F#\u0000\u010a\u010c\u0005K\u0000\u0000\u010b"+
		"\u010d\u0003\u00dcn\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110"+
		"\u0005L\u0000\u0000\u010f\u010a\u0001\u0000\u0000\u0000\u010f\u0110\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"Z\u0000\u0000\u0112\u0007\u0001\u0000\u0000\u0000\u0113\u0115\u0003\u0006"+
		"\u0003\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000"+
		"\u0000\u0000\u0117\t\u0001\u0000\u0000\u0000\u0118\u011c\u0003\b\u0004"+
		"\u0000\u0119\u011d\u0003\u00dam\u0000\u011a\u011d\u0003\u000e\u0007\u0000"+
		"\u011b\u011d\u0003\f\u0006\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u000b\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0006\u0000\u0000\u011f"+
		"\u0120\u0003\u000e\u0007\u0000\u0120\r\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0005\u000b\u0000\u0000\u0122\u0123\u0003\u00c8d\u0000\u0123\u0126\u0003"+
		"\u0010\b\u0000\u0124\u0125\u0005Y\u0000\u0000\u0125\u0127\u0003\u00ae"+
		"W\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005R\u0000\u0000"+
		"\u0129\u012a\u0003`0\u0000\u012a\u000f\u0001\u0000\u0000\u0000\u012b\u012d"+
		"\u0005K\u0000\u0000\u012c\u012e\u0003\u0012\t\u0000\u012d\u012c\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0005L\u0000\u0000\u0130\u0011\u0001\u0000"+
		"\u0000\u0000\u0131\u0134\u0003\u0014\n\u0000\u0132\u0133\u0005J\u0000"+
		"\u0000\u0133\u0135\u0003\u00aeW\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u013e\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0005Q\u0000\u0000\u0137\u013a\u0003\u0014\n\u0000\u0138"+
		"\u0139\u0005J\u0000\u0000\u0139\u013b\u0003\u00aeW\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001"+
		"\u0000\u0000\u0000\u013c\u0136\u0001\u0000\u0000\u0000\u013d\u0140\u0001"+
		"\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f\u0162\u0001\u0000\u0000\u0000\u0140\u013e\u0001"+
		"\u0000\u0000\u0000\u0141\u0160\u0005Q\u0000\u0000\u0142\u0144\u0005I\u0000"+
		"\u0000\u0143\u0145\u0003\u0014\n\u0000\u0144\u0143\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u014e\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0005Q\u0000\u0000\u0147\u014a\u0003\u0014\n\u0000\u0148"+
		"\u0149\u0005J\u0000\u0000\u0149\u014b\u0003\u00aeW\u0000\u014a\u0148\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014d\u0001"+
		"\u0000\u0000\u0000\u014c\u0146\u0001\u0000\u0000\u0000\u014d\u0150\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u0159\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u0157\u0005Q\u0000\u0000\u0152\u0153\u00052\u0000"+
		"\u0000\u0153\u0155\u0003\u0014\n\u0000\u0154\u0156\u0005Q\u0000\u0000"+
		"\u0155\u0154\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0152\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000"+
		"\u0159\u0151\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u0161\u0001\u0000\u0000\u0000\u015b\u015c\u00052\u0000\u0000\u015c"+
		"\u015e\u0003\u0014\n\u0000\u015d\u015f\u0005Q\u0000\u0000\u015e\u015d"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161"+
		"\u0001\u0000\u0000\u0000\u0160\u0142\u0001\u0000\u0000\u0000\u0160\u015b"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0163"+
		"\u0001\u0000\u0000\u0000\u0162\u0141\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0001\u0000\u0000\u0000\u0163\u0183\u0001\u0000\u0000\u0000\u0164\u0166"+
		"\u0005I\u0000\u0000\u0165\u0167\u0003\u0014\n\u0000\u0166\u0165\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0170\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0005Q\u0000\u0000\u0169\u016c\u0003\u0014"+
		"\n\u0000\u016a\u016b\u0005J\u0000\u0000\u016b\u016d\u0003\u00aeW\u0000"+
		"\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000"+
		"\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u0168\u0001\u0000\u0000\u0000"+
		"\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u017b\u0001\u0000\u0000\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0179\u0005Q\u0000\u0000\u0174"+
		"\u0175\u00052\u0000\u0000\u0175\u0177\u0003\u0014\n\u0000\u0176\u0178"+
		"\u0005Q\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178\u0001"+
		"\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0174\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017c\u0001"+
		"\u0000\u0000\u0000\u017b\u0173\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u0183\u0001\u0000\u0000\u0000\u017d\u017e\u0005"+
		"2\u0000\u0000\u017e\u0180\u0003\u0014\n\u0000\u017f\u0181\u0005Q\u0000"+
		"\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000"+
		"\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0131\u0001\u0000\u0000"+
		"\u0000\u0182\u0164\u0001\u0000\u0000\u0000\u0182\u017d\u0001\u0000\u0000"+
		"\u0000\u0183\u0013\u0001\u0000\u0000\u0000\u0184\u0187\u0003\u00c8d\u0000"+
		"\u0185\u0186\u0005R\u0000\u0000\u0186\u0188\u0003\u00aeW\u0000\u0187\u0185"+
		"\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0015"+
		"\u0001\u0000\u0000\u0000\u0189\u018c\u0003\u0018\f\u0000\u018a\u018b\u0005"+
		"J\u0000\u0000\u018b\u018d\u0003\u00aeW\u0000\u018c\u018a\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0196\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0005Q\u0000\u0000\u018f\u0192\u0003\u0018\f\u0000"+
		"\u0190\u0191\u0005J\u0000\u0000\u0191\u0193\u0003\u00aeW\u0000\u0192\u0190"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0195"+
		"\u0001\u0000\u0000\u0000\u0194\u018e\u0001\u0000\u0000\u0000\u0195\u0198"+
		"\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u0001\u0000\u0000\u0000\u0197\u01ba\u0001\u0000\u0000\u0000\u0198\u0196"+
		"\u0001\u0000\u0000\u0000\u0199\u01b8\u0005Q\u0000\u0000\u019a\u019c\u0005"+
		"I\u0000\u0000\u019b\u019d\u0003\u0018\f\u0000\u019c\u019b\u0001\u0000"+
		"\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u01a6\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0005Q\u0000\u0000\u019f\u01a2\u0003\u0018\f"+
		"\u0000\u01a0\u01a1\u0005J\u0000\u0000\u01a1\u01a3\u0003\u00aeW\u0000\u01a2"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a4\u019e\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a7\u01b1\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a9\u01af\u0005Q\u0000\u0000\u01aa\u01ab"+
		"\u00052\u0000\u0000\u01ab\u01ad\u0003\u0018\f\u0000\u01ac\u01ae\u0005"+
		"Q\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u01aa\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b1\u01a9\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b9\u0001\u0000\u0000\u0000\u01b3\u01b4\u00052\u0000"+
		"\u0000\u01b4\u01b6\u0003\u0018\f\u0000\u01b5\u01b7\u0005Q\u0000\u0000"+
		"\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u019a\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b3\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba\u0199\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01db\u0001\u0000\u0000\u0000"+
		"\u01bc\u01be\u0005I\u0000\u0000\u01bd\u01bf\u0003\u0018\f\u0000\u01be"+
		"\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005Q\u0000\u0000\u01c1\u01c4"+
		"\u0003\u0018\f\u0000\u01c2\u01c3\u0005J\u0000\u0000\u01c3\u01c5\u0003"+
		"\u00aeW\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01d3\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01d1\u0005Q\u0000"+
		"\u0000\u01cc\u01cd\u00052\u0000\u0000\u01cd\u01cf\u0003\u0018\f\u0000"+
		"\u01ce\u01d0\u0005Q\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1"+
		"\u01cc\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d3\u01cb\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d4\u01db\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u00052\u0000\u0000\u01d6\u01d8\u0003\u0018\f\u0000\u01d7\u01d9"+
		"\u0005Q\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u0189\u0001"+
		"\u0000\u0000\u0000\u01da\u01bc\u0001\u0000\u0000\u0000\u01da\u01d5\u0001"+
		"\u0000\u0000\u0000\u01db\u0017\u0001\u0000\u0000\u0000\u01dc\u01dd\u0003"+
		"\u00c8d\u0000\u01dd\u0019\u0001\u0000\u0000\u0000\u01de\u01e1\u0003\u001c"+
		"\u000e\u0000\u01df\u01e1\u0003N\'\u0000\u01e0\u01de\u0001\u0000\u0000"+
		"\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u001b\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e7\u0003\u001e\u000f\u0000\u01e3\u01e4\u0005S\u0000\u0000"+
		"\u01e4\u01e6\u0003\u001e\u000f\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000\u0000"+
		"\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01ec\u0005S\u0000\u0000\u01eb"+
		"\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005Z\u0000\u0000\u01ee\u001d"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f8\u0003 \u0010\u0000\u01f0\u01f8\u0003"+
		"(\u0014\u0000\u01f1\u01f8\u0003*\u0015\u0000\u01f2\u01f8\u0003,\u0016"+
		"\u0000\u01f3\u01f8\u00038\u001c\u0000\u01f4\u01f8\u0003H$\u0000\u01f5"+
		"\u01f8\u0003J%\u0000\u01f6\u01f8\u0003L&\u0000\u01f7\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f0\u0001\u0000\u0000\u0000\u01f7\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f2\u0001\u0000\u0000\u0000\u01f7\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f4\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u001f\u0001\u0000"+
		"\u0000\u0000\u01f9\u020a\u0003$\u0012\u0000\u01fa\u020b\u0003\"\u0011"+
		"\u0000\u01fb\u01fe\u0003&\u0013\u0000\u01fc\u01ff\u0003\u00e8t\u0000\u01fd"+
		"\u01ff\u0003\u00d6k\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01fd"+
		"\u0001\u0000\u0000\u0000\u01ff\u020b\u0001\u0000\u0000\u0000\u0200\u0203"+
		"\u0005J\u0000\u0000\u0201\u0204\u0003\u00e8t\u0000\u0202\u0204\u0003$"+
		"\u0012\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0202\u0001\u0000"+
		"\u0000\u0000\u0204\u0206\u0001\u0000\u0000\u0000\u0205\u0200\u0001\u0000"+
		"\u0000\u0000\u0206\u0209\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000"+
		"\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u01fa\u0001\u0000"+
		"\u0000\u0000\u020a\u01fb\u0001\u0000\u0000\u0000\u020a\u0207\u0001\u0000"+
		"\u0000\u0000\u020b!\u0001\u0000\u0000\u0000\u020c\u020d\u0005R\u0000\u0000"+
		"\u020d\u0210\u0003\u00aeW\u0000\u020e\u020f\u0005J\u0000\u0000\u020f\u0211"+
		"\u0003\u00aeW\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001"+
		"\u0000\u0000\u0000\u0211#\u0001\u0000\u0000\u0000\u0212\u0215\u0003\u00ae"+
		"W\u0000\u0213\u0215\u0003\u00c0`\u0000\u0214\u0212\u0001\u0000\u0000\u0000"+
		"\u0214\u0213\u0001\u0000\u0000\u0000\u0215\u021d\u0001\u0000\u0000\u0000"+
		"\u0216\u0219\u0005Q\u0000\u0000\u0217\u021a\u0003\u00aeW\u0000\u0218\u021a"+
		"\u0003\u00c0`\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u0218\u0001"+
		"\u0000\u0000\u0000\u021a\u021c\u0001\u0000\u0000\u0000\u021b\u0216\u0001"+
		"\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0221\u0001"+
		"\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0222\u0005"+
		"Q\u0000\u0000\u0221\u0220\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000"+
		"\u0000\u0000\u0222%\u0001\u0000\u0000\u0000\u0223\u0224\u0007\u0000\u0000"+
		"\u0000\u0224\'\u0001\u0000\u0000\u0000\u0225\u0226\u0005\f\u0000\u0000"+
		"\u0226\u0227\u0003\u00d4j\u0000\u0227)\u0001\u0000\u0000\u0000\u0228\u0229"+
		"\u0005\u001f\u0000\u0000\u0229+\u0001\u0000\u0000\u0000\u022a\u0230\u0003"+
		".\u0017\u0000\u022b\u0230\u00030\u0018\u0000\u022c\u0230\u00032\u0019"+
		"\u0000\u022d\u0230\u00036\u001b\u0000\u022e\u0230\u00034\u001a\u0000\u022f"+
		"\u022a\u0001\u0000\u0000\u0000\u022f\u022b\u0001\u0000\u0000\u0000\u022f"+
		"\u022c\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f"+
		"\u022e\u0001\u0000\u0000\u0000\u0230-\u0001\u0000\u0000\u0000\u0231\u0232"+
		"\u0005\b\u0000\u0000\u0232/\u0001\u0000\u0000\u0000\u0233\u0234\u0005"+
		"\n\u0000\u0000\u02341\u0001\u0000\u0000\u0000\u0235\u0237\u0005!\u0000"+
		"\u0000\u0236\u0238\u0003\u00d6k\u0000\u0237\u0236\u0001\u0000\u0000\u0000"+
		"\u0237\u0238\u0001\u0000\u0000\u0000\u02383\u0001\u0000\u0000\u0000\u0239"+
		"\u023a\u0003\u00e8t\u0000\u023a5\u0001\u0000\u0000\u0000\u023b\u0241\u0005"+
		" \u0000\u0000\u023c\u023f\u0003\u00aeW\u0000\u023d\u023e\u0005\u0013\u0000"+
		"\u0000\u023e\u0240\u0003\u00aeW\u0000\u023f\u023d\u0001\u0000\u0000\u0000"+
		"\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0242\u0001\u0000\u0000\u0000"+
		"\u0241\u023c\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000"+
		"\u02427\u0001\u0000\u0000\u0000\u0243\u0246\u0003:\u001d\u0000\u0244\u0246"+
		"\u0003<\u001e\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0244\u0001"+
		"\u0000\u0000\u0000\u02469\u0001\u0000\u0000\u0000\u0247\u0248\u0005\u0016"+
		"\u0000\u0000\u0248\u0249\u0003D\"\u0000\u0249;\u0001\u0000\u0000\u0000"+
		"\u024a\u0257\u0005\u0013\u0000\u0000\u024b\u024d\u0007\u0001\u0000\u0000"+
		"\u024c\u024b\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000\u0000\u0000"+
		"\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000"+
		"\u024f\u0251\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000"+
		"\u0251\u0258\u0003F#\u0000\u0252\u0254\u0007\u0001\u0000\u0000\u0253\u0252"+
		"\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0253"+
		"\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0258"+
		"\u0001\u0000\u0000\u0000\u0257\u024e\u0001\u0000\u0000\u0000\u0257\u0253"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u0260"+
		"\u0005\u0016\u0000\u0000\u025a\u0261\u0005I\u0000\u0000\u025b\u025c\u0005"+
		"K\u0000\u0000\u025c\u025d\u0003B!\u0000\u025d\u025e\u0005L\u0000\u0000"+
		"\u025e\u0261\u0001\u0000\u0000\u0000\u025f\u0261\u0003B!\u0000\u0260\u025a"+
		"\u0001\u0000\u0000\u0000\u0260\u025b\u0001\u0000\u0000\u0000\u0260\u025f"+
		"\u0001\u0000\u0000\u0000\u0261=\u0001\u0000\u0000\u0000\u0262\u0265\u0003"+
		"\u00c8d\u0000\u0263\u0264\u0005\u0004\u0000\u0000\u0264\u0266\u0003\u00c8"+
		"d\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000"+
		"\u0000\u0266?\u0001\u0000\u0000\u0000\u0267\u026a\u0003F#\u0000\u0268"+
		"\u0269\u0005\u0004\u0000\u0000\u0269\u026b\u0003\u00c8d\u0000\u026a\u0268"+
		"\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026bA\u0001"+
		"\u0000\u0000\u0000\u026c\u0271\u0003>\u001f\u0000\u026d\u026e\u0005Q\u0000"+
		"\u0000\u026e\u0270\u0003>\u001f\u0000\u026f\u026d\u0001\u0000\u0000\u0000"+
		"\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000\u0000\u0000"+
		"\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0276\u0005Q\u0000\u0000\u0275"+
		"\u0274\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276"+
		"C\u0001\u0000\u0000\u0000\u0277\u027c\u0003@ \u0000\u0278\u0279\u0005"+
		"Q\u0000\u0000\u0279\u027b\u0003@ \u0000\u027a\u0278\u0001\u0000\u0000"+
		"\u0000\u027b\u027e\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000"+
		"\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027dE\u0001\u0000\u0000\u0000"+
		"\u027e\u027c\u0001\u0000\u0000\u0000\u027f\u0284\u0003\u00c8d\u0000\u0280"+
		"\u0281\u0005H\u0000\u0000\u0281\u0283\u0003\u00c8d\u0000\u0282\u0280\u0001"+
		"\u0000\u0000\u0000\u0283\u0286\u0001\u0000\u0000\u0000\u0284\u0282\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285G\u0001\u0000"+
		"\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0287\u0288\u0005\u0014"+
		"\u0000\u0000\u0288\u028d\u0003\u00c8d\u0000\u0289\u028a\u0005Q\u0000\u0000"+
		"\u028a\u028c\u0003\u00c8d\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028c"+
		"\u028f\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028d"+
		"\u028e\u0001\u0000\u0000\u0000\u028eI\u0001\u0000\u0000\u0000\u028f\u028d"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u0005\u001c\u0000\u0000\u0291\u0296"+
		"\u0003\u00c8d\u0000\u0292\u0293\u0005Q\u0000\u0000\u0293\u0295\u0003\u00c8"+
		"d\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0298\u0001\u0000\u0000"+
		"\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000"+
		"\u0000\u0297K\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0299\u029a\u0005\u0005\u0000\u0000\u029a\u029d\u0003\u00aeW\u0000\u029b"+
		"\u029c\u0005Q\u0000\u0000\u029c\u029e\u0003\u00aeW\u0000\u029d\u029b\u0001"+
		"\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029eM\u0001\u0000"+
		"\u0000\u0000\u029f\u02aa\u0003R)\u0000\u02a0\u02aa\u0003T*\u0000\u02a1"+
		"\u02aa\u0003V+\u0000\u02a2\u02aa\u0003X,\u0000\u02a3\u02aa\u0003Z-\u0000"+
		"\u02a4\u02aa\u0003\u000e\u0007\u0000\u02a5\u02aa\u0003\u00dam\u0000\u02a6"+
		"\u02aa\u0003\n\u0005\u0000\u02a7\u02aa\u0003P(\u0000\u02a8\u02aa\u0003"+
		"b1\u0000\u02a9\u029f\u0001\u0000\u0000\u0000\u02a9\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a9\u02a1\u0001\u0000\u0000\u0000\u02a9\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a9\u02a3\u0001\u0000\u0000\u0000\u02a9\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a9\u02a5\u0001\u0000\u0000\u0000\u02a9\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02a8\u0001\u0000\u0000"+
		"\u0000\u02aaO\u0001\u0000\u0000\u0000\u02ab\u02af\u0005\u0006\u0000\u0000"+
		"\u02ac\u02b0\u0003\u000e\u0007\u0000\u02ad\u02b0\u0003Z-\u0000\u02ae\u02b0"+
		"\u0003V+\u0000\u02af\u02ac\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000"+
		"\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02b0Q\u0001\u0000\u0000"+
		"\u0000\u02b1\u02b2\u0005\u0015\u0000\u0000\u02b2\u02b3\u0003\u00aeW\u0000"+
		"\u02b3\u02b4\u0005R\u0000\u0000\u02b4\u02bc\u0003`0\u0000\u02b5\u02b6"+
		"\u0005\r\u0000\u0000\u02b6\u02b7\u0003\u00aeW\u0000\u02b7\u02b8\u0005"+
		"R\u0000\u0000\u02b8\u02b9\u0003`0\u0000\u02b9\u02bb\u0001\u0000\u0000"+
		"\u0000\u02ba\u02b5\u0001\u0000\u0000\u0000\u02bb\u02be\u0001\u0000\u0000"+
		"\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000"+
		"\u0000\u02bd\u02c2\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000"+
		"\u0000\u02bf\u02c0\u0005\u000e\u0000\u0000\u02c0\u02c1\u0005R\u0000\u0000"+
		"\u02c1\u02c3\u0003`0\u0000\u02c2\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c3S\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005"+
		"%\u0000\u0000\u02c5\u02c6\u0003\u00aeW\u0000\u02c6\u02c7\u0005R\u0000"+
		"\u0000\u02c7\u02cb\u0003`0\u0000\u02c8\u02c9\u0005\u000e\u0000\u0000\u02c9"+
		"\u02ca\u0005R\u0000\u0000\u02ca\u02cc\u0003`0\u0000\u02cb\u02c8\u0001"+
		"\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02ccU\u0001\u0000"+
		"\u0000\u0000\u02cd\u02ce\u0005\u0012\u0000\u0000\u02ce\u02cf\u0003\u00d4"+
		"j\u0000\u02cf\u02d0\u0005\u0017\u0000\u0000\u02d0\u02d1\u0003\u00d6k\u0000"+
		"\u02d1\u02d2\u0005R\u0000\u0000\u02d2\u02d6\u0003`0\u0000\u02d3\u02d4"+
		"\u0005\u000e\u0000\u0000\u02d4\u02d5\u0005R\u0000\u0000\u02d5\u02d7\u0003"+
		"`0\u0000\u02d6\u02d3\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d7W\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005#\u0000\u0000\u02d9"+
		"\u02da\u0005R\u0000\u0000\u02da\u02f0\u0003`0\u0000\u02db\u02dc\u0003"+
		"^/\u0000\u02dc\u02dd\u0005R\u0000\u0000\u02dd\u02de\u0003`0\u0000\u02de"+
		"\u02e0\u0001\u0000\u0000\u0000\u02df\u02db\u0001\u0000\u0000\u0000\u02e0"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e6\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e4\u0005\u000e\u0000\u0000\u02e4\u02e5\u0005R\u0000\u0000\u02e5\u02e7"+
		"\u0003`0\u0000\u02e6\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000"+
		"\u0000\u0000\u02e7\u02eb\u0001\u0000\u0000\u0000\u02e8\u02e9\u0005\u0011"+
		"\u0000\u0000\u02e9\u02ea\u0005R\u0000\u0000\u02ea\u02ec\u0003`0\u0000"+
		"\u02eb\u02e8\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ec\u02f1\u0001\u0000\u0000\u0000\u02ed\u02ee\u0005\u0011\u0000\u0000"+
		"\u02ee\u02ef\u0005R\u0000\u0000\u02ef\u02f1\u0003`0\u0000\u02f0\u02df"+
		"\u0001\u0000\u0000\u0000\u02f0\u02ed\u0001\u0000\u0000\u0000\u02f1Y\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f3\u0005&\u0000\u0000\u02f3\u02f8\u0003\\"+
		".\u0000\u02f4\u02f5\u0005Q\u0000\u0000\u02f5\u02f7\u0003\\.\u0000\u02f6"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f7\u02fa\u0001\u0000\u0000\u0000\u02f8"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fb"+
		"\u02fc\u0005R\u0000\u0000\u02fc\u02fd\u0003`0\u0000\u02fd[\u0001\u0000"+
		"\u0000\u0000\u02fe\u0301\u0003\u00aeW\u0000\u02ff\u0300\u0005\u0004\u0000"+
		"\u0000\u0300\u0302\u0003\u00c2a\u0000\u0301\u02ff\u0001\u0000\u0000\u0000"+
		"\u0301\u0302\u0001\u0000\u0000\u0000\u0302]\u0001\u0000\u0000\u0000\u0303"+
		"\u0309\u0005\u000f\u0000\u0000\u0304\u0307\u0003\u00aeW\u0000\u0305\u0306"+
		"\u0005\u0004\u0000\u0000\u0306\u0308\u0003\u00c8d\u0000\u0307\u0305\u0001"+
		"\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u030a\u0001"+
		"\u0000\u0000\u0000\u0309\u0304\u0001\u0000\u0000\u0000\u0309\u030a\u0001"+
		"\u0000\u0000\u0000\u030a_\u0001\u0000\u0000\u0000\u030b\u0316\u0003\u001c"+
		"\u000e\u0000\u030c\u030d\u0005Z\u0000\u0000\u030d\u030f\u0005\u0001\u0000"+
		"\u0000\u030e\u0310\u0003\u001a\r\u0000\u030f\u030e\u0001\u0000\u0000\u0000"+
		"\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000"+
		"\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000"+
		"\u0313\u0314\u0005\u0002\u0000\u0000\u0314\u0316\u0001\u0000\u0000\u0000"+
		"\u0315\u030b\u0001\u0000\u0000\u0000\u0315\u030c\u0001\u0000\u0000\u0000"+
		"\u0316a\u0001\u0000\u0000\u0000\u0317\u0318\u0005\u001a\u0000\u0000\u0318"+
		"\u0319\u0003d2\u0000\u0319\u031a\u0005R\u0000\u0000\u031a\u031b\u0005"+
		"Z\u0000\u0000\u031b\u031d\u0005\u0001\u0000\u0000\u031c\u031e\u0003j5"+
		"\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000"+
		"\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0005\u0002\u0000"+
		"\u0000\u0322c\u0001\u0000\u0000\u0000\u0323\u0324\u0003h4\u0000\u0324"+
		"\u0326\u0005Q\u0000\u0000\u0325\u0327\u0003f3\u0000\u0326\u0325\u0001"+
		"\u0000\u0000\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u032a\u0001"+
		"\u0000\u0000\u0000\u0328\u032a\u0003\u00aeW\u0000\u0329\u0323\u0001\u0000"+
		"\u0000\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u032ae\u0001\u0000\u0000"+
		"\u0000\u032b\u032d\u0005Q\u0000\u0000\u032c\u032e\u0003h4\u0000\u032d"+
		"\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f"+
		"\u032d\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330"+
		"\u0332\u0001\u0000\u0000\u0000\u0331\u0333\u0005Q\u0000\u0000\u0332\u0331"+
		"\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333g\u0001"+
		"\u0000\u0000\u0000\u0334\u0335\u0005I\u0000\u0000\u0335\u0338\u0003\u00c2"+
		"a\u0000\u0336\u0338\u0003\u00aeW\u0000\u0337\u0334\u0001\u0000\u0000\u0000"+
		"\u0337\u0336\u0001\u0000\u0000\u0000\u0338i\u0001\u0000\u0000\u0000\u0339"+
		"\u033a\u0005]\u0000\u0000\u033a\u033c\u0003n7\u0000\u033b\u033d\u0003"+
		"l6\u0000\u033c\u033b\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000\u0000"+
		"\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e\u033f\u0005R\u0000\u0000"+
		"\u033f\u0340\u0003`0\u0000\u0340k\u0001\u0000\u0000\u0000\u0341\u0342"+
		"\u0005\u0015\u0000\u0000\u0342\u0343\u0003\u00aeW\u0000\u0343m\u0001\u0000"+
		"\u0000\u0000\u0344\u0347\u0003\u0096K\u0000\u0345\u0347\u0003p8\u0000"+
		"\u0346\u0344\u0001\u0000\u0000\u0000\u0346\u0345\u0001\u0000\u0000\u0000"+
		"\u0347o\u0001\u0000\u0000\u0000\u0348\u034b\u0003r9\u0000\u0349\u034b"+
		"\u0003t:\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034a\u0349\u0001\u0000"+
		"\u0000\u0000\u034bq\u0001\u0000\u0000\u0000\u034c\u034d\u0003t:\u0000"+
		"\u034d\u034e\u0005\u0004\u0000\u0000\u034e\u034f\u0003\u0088D\u0000\u034f"+
		"s\u0001\u0000\u0000\u0000\u0350\u0355\u0003v;\u0000\u0351\u0352\u0005"+
		"^\u0000\u0000\u0352\u0354\u0003v;\u0000\u0353\u0351\u0001\u0000\u0000"+
		"\u0000\u0354\u0357\u0001\u0000\u0000\u0000\u0355\u0353\u0001\u0000\u0000"+
		"\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356u\u0001\u0000\u0000\u0000"+
		"\u0357\u0355\u0001\u0000\u0000\u0000\u0358\u0361\u0003x<\u0000\u0359\u0361"+
		"\u0003\u0086C\u0000\u035a\u0361\u0003\u008aE\u0000\u035b\u0361\u0003\u008c"+
		"F\u0000\u035c\u0361\u0003\u0092I\u0000\u035d\u0361\u0003\u0094J\u0000"+
		"\u035e\u0361\u0003\u009eO\u0000\u035f\u0361\u0003\u00a6S\u0000\u0360\u0358"+
		"\u0001\u0000\u0000\u0000\u0360\u0359\u0001\u0000\u0000\u0000\u0360\u035a"+
		"\u0001\u0000\u0000\u0000\u0360\u035b\u0001\u0000\u0000\u0000\u0360\u035c"+
		"\u0001\u0000\u0000\u0000\u0360\u035d\u0001\u0000\u0000\u0000\u0360\u035e"+
		"\u0001\u0000\u0000\u0000\u0360\u035f\u0001\u0000\u0000\u0000\u0361w\u0001"+
		"\u0000\u0000\u0000\u0362\u0363\u0003~?\u0000\u0363\u0364\u0004<\u0000"+
		"\u0000\u0364\u036b\u0001\u0000\u0000\u0000\u0365\u036b\u0003|>\u0000\u0366"+
		"\u036b\u0003\u00ecv\u0000\u0367\u036b\u0005\u001b\u0000\u0000\u0368\u036b"+
		"\u0005\"\u0000\u0000\u0369\u036b\u0005\u0010\u0000\u0000\u036a\u0362\u0001"+
		"\u0000\u0000\u0000\u036a\u0365\u0001\u0000\u0000\u0000\u036a\u0366\u0001"+
		"\u0000\u0000\u0000\u036a\u0367\u0001\u0000\u0000\u0000\u036a\u0368\u0001"+
		"\u0000\u0000\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036by\u0001\u0000"+
		"\u0000\u0000\u036c\u036d\u0003~?\u0000\u036d\u036e\u0004=\u0001\u0000"+
		"\u036e\u0375\u0001\u0000\u0000\u0000\u036f\u0375\u0003|>\u0000\u0370\u0375"+
		"\u0003\u00ecv\u0000\u0371\u0375\u0005\u001b\u0000\u0000\u0372\u0375\u0005"+
		"\"\u0000\u0000\u0373\u0375\u0005\u0010\u0000\u0000\u0374\u036c\u0001\u0000"+
		"\u0000\u0000\u0374\u036f\u0001\u0000\u0000\u0000\u0374\u0370\u0001\u0000"+
		"\u0000\u0000\u0374\u0371\u0001\u0000\u0000\u0000\u0374\u0372\u0001\u0000"+
		"\u0000\u0000\u0374\u0373\u0001\u0000\u0000\u0000\u0375{\u0001\u0000\u0000"+
		"\u0000\u0376\u0377\u0003\u0080@\u0000\u0377\u0378\u0005T\u0000\u0000\u0378"+
		"\u0379\u0003\u0084B\u0000\u0379\u037f\u0001\u0000\u0000\u0000\u037a\u037b"+
		"\u0003\u0080@\u0000\u037b\u037c\u0005U\u0000\u0000\u037c\u037d\u0003\u0084"+
		"B\u0000\u037d\u037f\u0001\u0000\u0000\u0000\u037e\u0376\u0001\u0000\u0000"+
		"\u0000\u037e\u037a\u0001\u0000\u0000\u0000\u037f}\u0001\u0000\u0000\u0000"+
		"\u0380\u0384\u0005)\u0000\u0000\u0381\u0382\u0005U\u0000\u0000\u0382\u0384"+
		"\u0005)\u0000\u0000\u0383\u0380\u0001\u0000\u0000\u0000\u0383\u0381\u0001"+
		"\u0000\u0000\u0000\u0384\u007f\u0001\u0000\u0000\u0000\u0385\u0389\u0003"+
		"\u0082A\u0000\u0386\u0387\u0005U\u0000\u0000\u0387\u0389\u0003\u0082A"+
		"\u0000\u0388\u0385\u0001\u0000\u0000\u0000\u0388\u0386\u0001\u0000\u0000"+
		"\u0000\u0389\u0081\u0001\u0000\u0000\u0000\u038a\u038b\u0005)\u0000\u0000"+
		"\u038b\u0083\u0001\u0000\u0000\u0000\u038c\u038d\u0005)\u0000\u0000\u038d"+
		"\u0085\u0001\u0000\u0000\u0000\u038e\u038f\u0003\u0088D\u0000\u038f\u0087"+
		"\u0001\u0000\u0000\u0000\u0390\u0391\u0003\u00c8d\u0000\u0391\u0392\u0004"+
		"D\u0002\u0000\u0392\u0089\u0001\u0000\u0000\u0000\u0393\u0394\u0005$\u0000"+
		"\u0000\u0394\u008b\u0001\u0000\u0000\u0000\u0395\u0396\u0003\u008eG\u0000"+
		"\u0396\u0397\u0004F\u0003\u0000\u0397\u008d\u0001\u0000\u0000\u0000\u0398"+
		"\u039b\u0003\u00c8d\u0000\u0399\u039a\u0005H\u0000\u0000\u039a\u039c\u0003"+
		"\u00c8d\u0000\u039b\u0399\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000"+
		"\u0000\u0000\u039d\u039b\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000"+
		"\u0000\u0000\u039e\u008f\u0001\u0000\u0000\u0000\u039f\u03a2\u0003\u008e"+
		"G\u0000\u03a0\u03a2\u0003\u00c8d\u0000\u03a1\u039f\u0001\u0000\u0000\u0000"+
		"\u03a1\u03a0\u0001\u0000\u0000\u0000\u03a2\u0091\u0001\u0000\u0000\u0000"+
		"\u03a3\u03a4\u0005K\u0000\u0000\u03a4\u03a5\u0003p8\u0000\u03a5\u03a6"+
		"\u0005L\u0000\u0000\u03a6\u0093\u0001\u0000\u0000\u0000\u03a7\u03a9\u0005"+
		"M\u0000\u0000\u03a8\u03aa\u0003\u0098L\u0000\u03a9\u03a8\u0001\u0000\u0000"+
		"\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000\u0000"+
		"\u0000\u03ab\u03b2\u0005N\u0000\u0000\u03ac\u03ae\u0005K\u0000\u0000\u03ad"+
		"\u03af\u0003\u0096K\u0000\u03ae\u03ad\u0001\u0000\u0000\u0000\u03ae\u03af"+
		"\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b2"+
		"\u0005L\u0000\u0000\u03b1\u03a7\u0001\u0000\u0000\u0000\u03b1\u03ac\u0001"+
		"\u0000\u0000\u0000\u03b2\u0095\u0001\u0000\u0000\u0000\u03b3\u03b4\u0003"+
		"\u009aM\u0000\u03b4\u03b6\u0005Q\u0000\u0000\u03b5\u03b7\u0003\u0098L"+
		"\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b7\u0097\u0001\u0000\u0000\u0000\u03b8\u03bd\u0003\u009aM\u0000"+
		"\u03b9\u03ba\u0005Q\u0000\u0000\u03ba\u03bc\u0003\u009aM\u0000\u03bb\u03b9"+
		"\u0001\u0000\u0000\u0000\u03bc\u03bf\u0001\u0000\u0000\u0000\u03bd\u03bb"+
		"\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03c1"+
		"\u0001\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03c2"+
		"\u0005Q\u0000\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001"+
		"\u0000\u0000\u0000\u03c2\u0099\u0001\u0000\u0000\u0000\u03c3\u03c6\u0003"+
		"\u009cN\u0000\u03c4\u03c6\u0003p8\u0000\u03c5\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c5\u03c4\u0001\u0000\u0000\u0000\u03c6\u009b\u0001\u0000\u0000"+
		"\u0000\u03c7\u03c8\u0005I\u0000\u0000\u03c8\u03cc\u0003\u0088D\u0000\u03c9"+
		"\u03ca\u0005I\u0000\u0000\u03ca\u03cc\u0003\u008aE\u0000\u03cb\u03c7\u0001"+
		"\u0000\u0000\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cc\u009d\u0001"+
		"\u0000\u0000\u0000\u03cd\u03ce\u0005O\u0000\u0000\u03ce\u03e7\u0005P\u0000"+
		"\u0000\u03cf\u03d0\u0005O\u0000\u0000\u03d0\u03d2\u0003\u00a4R\u0000\u03d1"+
		"\u03d3\u0005Q\u0000\u0000\u03d2\u03d1\u0001\u0000\u0000\u0000\u03d2\u03d3"+
		"\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d5"+
		"\u0005P\u0000\u0000\u03d5\u03e7\u0001\u0000\u0000\u0000\u03d6\u03d7\u0005"+
		"O\u0000\u0000\u03d7\u03d8\u0003\u00a0P\u0000\u03d8\u03d9\u0005Q\u0000"+
		"\u0000\u03d9\u03db\u0003\u00a4R\u0000\u03da\u03dc\u0005Q\u0000\u0000\u03db"+
		"\u03da\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc"+
		"\u03dd\u0001\u0000\u0000\u0000\u03dd\u03de\u0005P\u0000\u0000\u03de\u03e7"+
		"\u0001\u0000\u0000\u0000\u03df\u03e0\u0005O\u0000\u0000\u03e0\u03e2\u0003"+
		"\u00a0P\u0000\u03e1\u03e3\u0005Q\u0000\u0000\u03e2\u03e1\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000"+
		"\u0000\u03e4\u03e5\u0005P\u0000\u0000\u03e5\u03e7\u0001\u0000\u0000\u0000"+
		"\u03e6\u03cd\u0001\u0000\u0000\u0000\u03e6\u03cf\u0001\u0000\u0000\u0000"+
		"\u03e6\u03d6\u0001\u0000\u0000\u0000\u03e6\u03df\u0001\u0000\u0000\u0000"+
		"\u03e7\u009f\u0001\u0000\u0000\u0000\u03e8\u03ed\u0003\u00a2Q\u0000\u03e9"+
		"\u03ea\u0005Q\u0000\u0000\u03ea\u03ec\u0003\u00a2Q\u0000\u03eb\u03e9\u0001"+
		"\u0000\u0000\u0000\u03ec\u03ef\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001"+
		"\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u00a1\u0001"+
		"\u0000\u0000\u0000\u03ef\u03ed\u0001\u0000\u0000\u0000\u03f0\u03f3\u0003"+
		"z=\u0000\u03f1\u03f3\u0003\u008eG\u0000\u03f2\u03f0\u0001\u0000\u0000"+
		"\u0000\u03f2\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f5\u0005R\u0000\u0000\u03f5\u03f6\u0003p8\u0000\u03f6"+
		"\u00a3\u0001\u0000\u0000\u0000\u03f7\u03f8\u00052\u0000\u0000\u03f8\u03f9"+
		"\u0003\u0088D\u0000\u03f9\u00a5\u0001\u0000\u0000\u0000\u03fa\u03fb\u0003"+
		"\u0090H\u0000\u03fb\u03fc\u0005K\u0000\u0000\u03fc\u03fd\u0005L\u0000"+
		"\u0000\u03fd\u0419\u0001\u0000\u0000\u0000\u03fe\u03ff\u0003\u0090H\u0000"+
		"\u03ff\u0400\u0005K\u0000\u0000\u0400\u0402\u0003\u00a8T\u0000\u0401\u0403"+
		"\u0005Q\u0000\u0000\u0402\u0401\u0001\u0000\u0000\u0000\u0402\u0403\u0001"+
		"\u0000\u0000\u0000\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0405\u0005"+
		"L\u0000\u0000\u0405\u0419\u0001\u0000\u0000\u0000\u0406\u0407\u0003\u0090"+
		"H\u0000\u0407\u0408\u0005K\u0000\u0000\u0408\u040a\u0003\u00aaU\u0000"+
		"\u0409\u040b\u0005Q\u0000\u0000\u040a\u0409\u0001\u0000\u0000\u0000\u040a"+
		"\u040b\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000\u040c"+
		"\u040d\u0005L\u0000\u0000\u040d\u0419\u0001\u0000\u0000\u0000\u040e\u040f"+
		"\u0003\u0090H\u0000\u040f\u0410\u0005K\u0000\u0000\u0410\u0411\u0003\u00a8"+
		"T\u0000\u0411\u0412\u0005Q\u0000\u0000\u0412\u0414\u0003\u00aaU\u0000"+
		"\u0413\u0415\u0005Q\u0000\u0000\u0414\u0413\u0001\u0000\u0000\u0000\u0414"+
		"\u0415\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000\u0000\u0000\u0416"+
		"\u0417\u0005L\u0000\u0000\u0417\u0419\u0001\u0000\u0000\u0000\u0418\u03fa"+
		"\u0001\u0000\u0000\u0000\u0418\u03fe\u0001\u0000\u0000\u0000\u0418\u0406"+
		"\u0001\u0000\u0000\u0000\u0418\u040e\u0001\u0000\u0000\u0000\u0419\u00a7"+
		"\u0001\u0000\u0000\u0000\u041a\u041f\u0003p8\u0000\u041b\u041c\u0005Q"+
		"\u0000\u0000\u041c\u041e\u0003p8\u0000\u041d\u041b\u0001\u0000\u0000\u0000"+
		"\u041e\u0421\u0001\u0000\u0000\u0000\u041f\u041d\u0001\u0000\u0000\u0000"+
		"\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u00a9\u0001\u0000\u0000\u0000"+
		"\u0421\u041f\u0001\u0000\u0000\u0000\u0422\u0427\u0003\u00acV\u0000\u0423"+
		"\u0424\u0005Q\u0000\u0000\u0424\u0426\u0003\u00acV\u0000\u0425\u0423\u0001"+
		"\u0000\u0000\u0000\u0426\u0429\u0001\u0000\u0000\u0000\u0427\u0425\u0001"+
		"\u0000\u0000\u0000\u0427\u0428\u0001\u0000\u0000\u0000\u0428\u00ab\u0001"+
		"\u0000\u0000\u0000\u0429\u0427\u0001\u0000\u0000\u0000\u042a\u042b\u0003"+
		"\u00c8d\u0000\u042b\u042c\u0005J\u0000\u0000\u042c\u042d\u0003p8\u0000"+
		"\u042d\u00ad\u0001\u0000\u0000\u0000\u042e\u0434\u0003\u00b6[\u0000\u042f"+
		"\u0430\u0005\u0015\u0000\u0000\u0430\u0431\u0003\u00b6[\u0000\u0431\u0432"+
		"\u0005\u000e\u0000\u0000\u0432\u0433\u0003\u00aeW\u0000\u0433\u0435\u0001"+
		"\u0000\u0000\u0000\u0434\u042f\u0001\u0000\u0000\u0000\u0434\u0435\u0001"+
		"\u0000\u0000\u0000\u0435\u0438\u0001\u0000\u0000\u0000\u0436\u0438\u0003"+
		"\u00b2Y\u0000\u0437\u042e\u0001\u0000\u0000\u0000\u0437\u0436\u0001\u0000"+
		"\u0000\u0000\u0438\u00af\u0001\u0000\u0000\u0000\u0439\u043c\u0003\u00b6"+
		"[\u0000\u043a\u043c\u0003\u00b4Z\u0000\u043b\u0439\u0001\u0000\u0000\u0000"+
		"\u043b\u043a\u0001\u0000\u0000\u0000\u043c\u00b1\u0001\u0000\u0000\u0000"+
		"\u043d\u043f\u0005\u0019\u0000\u0000\u043e\u0440\u0003\u0016\u000b\u0000"+
		"\u043f\u043e\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000"+
		"\u0440\u0441\u0001\u0000\u0000\u0000\u0441\u0442\u0005R\u0000\u0000\u0442"+
		"\u0443\u0003\u00aeW\u0000\u0443\u00b3\u0001\u0000\u0000\u0000\u0444\u0446"+
		"\u0005\u0019\u0000\u0000\u0445\u0447\u0003\u0016\u000b\u0000\u0446\u0445"+
		"\u0001\u0000\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u0448"+
		"\u0001\u0000\u0000\u0000\u0448\u0449\u0005R\u0000\u0000\u0449\u044a\u0003"+
		"\u00b0X\u0000\u044a\u00b5\u0001\u0000\u0000\u0000\u044b\u0450\u0003\u00b8"+
		"\\\u0000\u044c\u044d\u0005\u001e\u0000\u0000\u044d\u044f\u0003\u00b8\\"+
		"\u0000\u044e\u044c\u0001\u0000\u0000\u0000\u044f\u0452\u0001\u0000\u0000"+
		"\u0000\u0450\u044e\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000"+
		"\u0000\u0451\u00b7\u0001\u0000\u0000\u0000\u0452\u0450\u0001\u0000\u0000"+
		"\u0000\u0453\u0458\u0003\u00ba]\u0000\u0454\u0455\u0005\u0003\u0000\u0000"+
		"\u0455\u0457\u0003\u00ba]\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0457"+
		"\u045a\u0001\u0000\u0000\u0000\u0458\u0456\u0001\u0000\u0000\u0000\u0458"+
		"\u0459\u0001\u0000\u0000\u0000\u0459\u00b9\u0001\u0000\u0000\u0000\u045a"+
		"\u0458\u0001\u0000\u0000\u0000\u045b\u045c\u0005\u001d\u0000\u0000\u045c"+
		"\u045f\u0003\u00ba]\u0000\u045d\u045f\u0003\u00bc^\u0000\u045e\u045b\u0001"+
		"\u0000\u0000\u0000\u045e\u045d\u0001\u0000\u0000\u0000\u045f\u00bb\u0001"+
		"\u0000\u0000\u0000\u0460\u0466\u0003\u00c2a\u0000\u0461\u0462\u0003\u00be"+
		"_\u0000\u0462\u0463\u0003\u00c2a\u0000\u0463\u0465\u0001\u0000\u0000\u0000"+
		"\u0464\u0461\u0001\u0000\u0000\u0000\u0465\u0468\u0001\u0000\u0000\u0000"+
		"\u0466\u0464\u0001\u0000\u0000\u0000\u0466\u0467\u0001\u0000\u0000\u0000"+
		"\u0467\u00bd\u0001\u0000\u0000\u0000\u0468\u0466\u0001\u0000\u0000\u0000"+
		"\u0469\u0477\u00054\u0000\u0000\u046a\u0477\u00055\u0000\u0000\u046b\u0477"+
		"\u00058\u0000\u0000\u046c\u0477\u00057\u0000\u0000\u046d\u0477\u00056"+
		"\u0000\u0000\u046e\u0477\u00059\u0000\u0000\u046f\u0477\u0005:\u0000\u0000"+
		"\u0470\u0477\u0005\u0017\u0000\u0000\u0471\u0472\u0005\u001d\u0000\u0000"+
		"\u0472\u0477\u0005\u0017\u0000\u0000\u0473\u0477\u0005\u0018\u0000\u0000"+
		"\u0474\u0475\u0005\u0018\u0000\u0000\u0475\u0477\u0005\u001d\u0000\u0000"+
		"\u0476\u0469\u0001\u0000\u0000\u0000\u0476\u046a\u0001\u0000\u0000\u0000"+
		"\u0476\u046b\u0001\u0000\u0000\u0000\u0476\u046c\u0001\u0000\u0000\u0000"+
		"\u0476\u046d\u0001\u0000\u0000\u0000\u0476\u046e\u0001\u0000\u0000\u0000"+
		"\u0476\u046f\u0001\u0000\u0000\u0000\u0476\u0470\u0001\u0000\u0000\u0000"+
		"\u0476\u0471\u0001\u0000\u0000\u0000\u0476\u0473\u0001\u0000\u0000\u0000"+
		"\u0476\u0474\u0001\u0000\u0000\u0000\u0477\u00bf\u0001\u0000\u0000\u0000"+
		"\u0478\u0479\u0005I\u0000\u0000\u0479\u047a\u0003\u00c2a\u0000\u047a\u00c1"+
		"\u0001\u0000\u0000\u0000\u047b\u047c\u0006a\uffff\uffff\u0000\u047c\u0484"+
		"\u0003\u00c4b\u0000\u047d\u047f\u0007\u0002\u0000\u0000\u047e\u047d\u0001"+
		"\u0000\u0000\u0000\u047f\u0480\u0001\u0000\u0000\u0000\u0480\u047e\u0001"+
		"\u0000\u0000\u0000\u0480\u0481\u0001\u0000\u0000\u0000\u0481\u0482\u0001"+
		"\u0000\u0000\u0000\u0482\u0484\u0003\u00c2a\u0007\u0483\u047b\u0001\u0000"+
		"\u0000\u0000\u0483\u047e\u0001\u0000\u0000\u0000\u0484\u049c\u0001\u0000"+
		"\u0000\u0000\u0485\u0486\n\b\u0000\u0000\u0486\u0487\u00052\u0000\u0000"+
		"\u0487\u049b\u0003\u00c2a\t\u0488\u0489\n\u0006\u0000\u0000\u0489\u048a"+
		"\u0007\u0003\u0000\u0000\u048a\u049b\u0003\u00c2a\u0007\u048b\u048c\n"+
		"\u0005\u0000\u0000\u048c\u048d\u0007\u0004\u0000\u0000\u048d\u049b\u0003"+
		"\u00c2a\u0006\u048e\u048f\n\u0004\u0000\u0000\u048f\u0490\u0007\u0005"+
		"\u0000\u0000\u0490\u049b\u0003\u00c2a\u0005\u0491\u0492\n\u0003\u0000"+
		"\u0000\u0492\u0493\u0005b\u0000\u0000\u0493\u049b\u0003\u00c2a\u0004\u0494"+
		"\u0495\n\u0002\u0000\u0000\u0495\u0496\u0005c\u0000\u0000\u0496\u049b"+
		"\u0003\u00c2a\u0003\u0497\u0498\n\u0001\u0000\u0000\u0498\u0499\u0005"+
		"^\u0000\u0000\u0499\u049b\u0003\u00c2a\u0002\u049a\u0485\u0001\u0000\u0000"+
		"\u0000\u049a\u0488\u0001\u0000\u0000\u0000\u049a\u048b\u0001\u0000\u0000"+
		"\u0000\u049a\u048e\u0001\u0000\u0000\u0000\u049a\u0491\u0001\u0000\u0000"+
		"\u0000\u049a\u0494\u0001\u0000\u0000\u0000\u049a\u0497\u0001\u0000\u0000"+
		"\u0000\u049b\u049e\u0001\u0000\u0000\u0000\u049c\u049a\u0001\u0000\u0000"+
		"\u0000\u049c\u049d\u0001\u0000\u0000\u0000\u049d\u00c3\u0001\u0000\u0000"+
		"\u0000\u049e\u049c\u0001\u0000\u0000\u0000\u049f\u04a1\u0005\u0007\u0000"+
		"\u0000\u04a0\u049f\u0001\u0000\u0000\u0000\u04a0\u04a1\u0001\u0000\u0000"+
		"\u0000\u04a1\u04a2\u0001\u0000\u0000\u0000\u04a2\u04a6\u0003\u00c6c\u0000"+
		"\u04a3\u04a5\u0003\u00ccf\u0000\u04a4\u04a3\u0001\u0000\u0000\u0000\u04a5"+
		"\u04a8\u0001\u0000\u0000\u0000\u04a6\u04a4\u0001\u0000\u0000\u0000\u04a6"+
		"\u04a7\u0001\u0000\u0000\u0000\u04a7\u00c5\u0001\u0000\u0000\u0000\u04a8"+
		"\u04a6\u0001\u0000\u0000\u0000\u04a9\u04ac\u0005K\u0000\u0000\u04aa\u04ad"+
		"\u0003\u00e8t\u0000\u04ab\u04ad\u0003\u00cae\u0000\u04ac\u04aa\u0001\u0000"+
		"\u0000\u0000\u04ac\u04ab\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000"+
		"\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000\u0000\u04ae\u04c5\u0005L\u0000"+
		"\u0000\u04af\u04b1\u0005M\u0000\u0000\u04b0\u04b2\u0003\u00cae\u0000\u04b1"+
		"\u04b0\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2"+
		"\u04b3\u0001\u0000\u0000\u0000\u04b3\u04c5\u0005N\u0000\u0000\u04b4\u04b6"+
		"\u0005O\u0000\u0000\u04b5\u04b7\u0003\u00d8l\u0000\u04b6\u04b5\u0001\u0000"+
		"\u0000\u0000\u04b6\u04b7\u0001\u0000\u0000\u0000\u04b7\u04b8\u0001\u0000"+
		"\u0000\u0000\u04b8\u04c5\u0005P\u0000\u0000\u04b9\u04c5\u0003\u00c8d\u0000"+
		"\u04ba\u04c5\u0005)\u0000\u0000\u04bb\u04bd\u0005d\u0000\u0000\u04bc\u04bb"+
		"\u0001\u0000\u0000\u0000\u04bd\u04be\u0001\u0000\u0000\u0000\u04be\u04bc"+
		"\u0001\u0000\u0000\u0000\u04be\u04bf\u0001\u0000\u0000\u0000\u04bf\u04c5"+
		"\u0001\u0000\u0000\u0000\u04c0\u04c5\u00051\u0000\u0000\u04c1\u04c5\u0005"+
		"\u001b\u0000\u0000\u04c2\u04c5\u0005\"\u0000\u0000\u04c3\u04c5\u0005\u0010"+
		"\u0000\u0000\u04c4\u04a9\u0001\u0000\u0000\u0000\u04c4\u04af\u0001\u0000"+
		"\u0000\u0000\u04c4\u04b4\u0001\u0000\u0000\u0000\u04c4\u04b9\u0001\u0000"+
		"\u0000\u0000\u04c4\u04ba\u0001\u0000\u0000\u0000\u04c4\u04bc\u0001\u0000"+
		"\u0000\u0000\u04c4\u04c0\u0001\u0000\u0000\u0000\u04c4\u04c1\u0001\u0000"+
		"\u0000\u0000\u04c4\u04c2\u0001\u0000\u0000\u0000\u04c4\u04c3\u0001\u0000"+
		"\u0000\u0000\u04c5\u00c7\u0001\u0000\u0000\u0000\u04c6\u04c7\u0007\u0006"+
		"\u0000\u0000\u04c7\u00c9\u0001\u0000\u0000\u0000\u04c8\u04cb\u0003\u00ae"+
		"W\u0000\u04c9\u04cb\u0003\u00c0`\u0000\u04ca\u04c8\u0001\u0000\u0000\u0000"+
		"\u04ca\u04c9\u0001\u0000\u0000\u0000\u04cb\u04da\u0001\u0000\u0000\u0000"+
		"\u04cc\u04db\u0003\u00e2q\u0000\u04cd\u04d0\u0005Q\u0000\u0000\u04ce\u04d1"+
		"\u0003\u00aeW\u0000\u04cf\u04d1\u0003\u00c0`\u0000\u04d0\u04ce\u0001\u0000"+
		"\u0000\u0000\u04d0\u04cf\u0001\u0000\u0000\u0000\u04d1\u04d3\u0001\u0000"+
		"\u0000\u0000\u04d2\u04cd\u0001\u0000\u0000\u0000\u04d3\u04d6\u0001\u0000"+
		"\u0000\u0000\u04d4\u04d2\u0001\u0000\u0000\u0000\u04d4\u04d5\u0001\u0000"+
		"\u0000\u0000\u04d5\u04d8\u0001\u0000\u0000\u0000\u04d6\u04d4\u0001\u0000"+
		"\u0000\u0000\u04d7\u04d9\u0005Q\u0000\u0000\u04d8\u04d7\u0001\u0000\u0000"+
		"\u0000\u04d8\u04d9\u0001\u0000\u0000\u0000\u04d9\u04db\u0001\u0000\u0000"+
		"\u0000\u04da\u04cc\u0001\u0000\u0000\u0000\u04da\u04d4\u0001\u0000\u0000"+
		"\u0000\u04db\u00cb\u0001\u0000\u0000\u0000\u04dc\u04de\u0005K\u0000\u0000"+
		"\u04dd\u04df\u0003\u00dcn\u0000\u04de\u04dd\u0001\u0000\u0000\u0000\u04de"+
		"\u04df\u0001\u0000\u0000\u0000\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0"+
		"\u04e8\u0005L\u0000\u0000\u04e1\u04e2\u0005M\u0000\u0000\u04e2\u04e3\u0003"+
		"\u00ceg\u0000\u04e3\u04e4\u0005N\u0000\u0000\u04e4\u04e8\u0001\u0000\u0000"+
		"\u0000\u04e5\u04e6\u0005H\u0000\u0000\u04e6\u04e8\u0003\u00c8d\u0000\u04e7"+
		"\u04dc\u0001\u0000\u0000\u0000\u04e7\u04e1\u0001\u0000\u0000\u0000\u04e7"+
		"\u04e5\u0001\u0000\u0000\u0000\u04e8\u00cd\u0001\u0000\u0000\u0000\u04e9"+
		"\u04ee\u0003\u00d0h\u0000\u04ea\u04eb\u0005Q\u0000\u0000\u04eb\u04ed\u0003"+
		"\u00d0h\u0000\u04ec\u04ea\u0001\u0000\u0000\u0000\u04ed\u04f0\u0001\u0000"+
		"\u0000\u0000\u04ee\u04ec\u0001\u0000\u0000\u0000\u04ee\u04ef\u0001\u0000"+
		"\u0000\u0000\u04ef\u04f2\u0001\u0000\u0000\u0000\u04f0\u04ee\u0001\u0000"+
		"\u0000\u0000\u04f1\u04f3\u0005Q\u0000\u0000\u04f2\u04f1\u0001\u0000\u0000"+
		"\u0000\u04f2\u04f3\u0001\u0000\u0000\u0000\u04f3\u00cf\u0001\u0000\u0000"+
		"\u0000\u04f4\u0500\u0003\u00aeW\u0000\u04f5\u04f7\u0003\u00aeW\u0000\u04f6"+
		"\u04f5\u0001\u0000\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7"+
		"\u04f8\u0001\u0000\u0000\u0000\u04f8\u04fa\u0005R\u0000\u0000\u04f9\u04fb"+
		"\u0003\u00aeW\u0000\u04fa\u04f9\u0001\u0000\u0000\u0000\u04fa\u04fb\u0001"+
		"\u0000\u0000\u0000\u04fb\u04fd\u0001\u0000\u0000\u0000\u04fc\u04fe\u0003"+
		"\u00d2i\u0000\u04fd\u04fc\u0001\u0000\u0000\u0000\u04fd\u04fe\u0001\u0000"+
		"\u0000\u0000\u04fe\u0500\u0001\u0000\u0000\u0000\u04ff\u04f4\u0001\u0000"+
		"\u0000\u0000\u04ff\u04f6\u0001\u0000\u0000\u0000\u0500\u00d1\u0001\u0000"+
		"\u0000\u0000\u0501\u0503\u0005R\u0000\u0000\u0502\u0504\u0003\u00aeW\u0000"+
		"\u0503\u0502\u0001\u0000\u0000\u0000\u0503\u0504\u0001\u0000\u0000\u0000"+
		"\u0504\u00d3\u0001\u0000\u0000\u0000\u0505\u0508\u0003\u00c2a\u0000\u0506"+
		"\u0508\u0003\u00c0`\u0000\u0507\u0505\u0001\u0000\u0000\u0000\u0507\u0506"+
		"\u0001\u0000\u0000\u0000\u0508\u0510\u0001\u0000\u0000\u0000\u0509\u050c"+
		"\u0005Q\u0000\u0000\u050a\u050d\u0003\u00c2a\u0000\u050b\u050d\u0003\u00c0"+
		"`\u0000\u050c\u050a\u0001\u0000\u0000\u0000\u050c\u050b\u0001\u0000\u0000"+
		"\u0000\u050d\u050f\u0001\u0000\u0000\u0000\u050e\u0509\u0001\u0000\u0000"+
		"\u0000\u050f\u0512\u0001\u0000\u0000\u0000\u0510\u050e\u0001\u0000\u0000"+
		"\u0000\u0510\u0511\u0001\u0000\u0000\u0000\u0511\u0514\u0001\u0000\u0000"+
		"\u0000\u0512\u0510\u0001\u0000\u0000\u0000\u0513\u0515\u0005Q\u0000\u0000"+
		"\u0514\u0513\u0001\u0000\u0000\u0000\u0514\u0515\u0001\u0000\u0000\u0000"+
		"\u0515\u00d5\u0001\u0000\u0000\u0000\u0516\u051b\u0003\u00aeW\u0000\u0517"+
		"\u0518\u0005Q\u0000\u0000\u0518\u051a\u0003\u00aeW\u0000\u0519\u0517\u0001"+
		"\u0000\u0000\u0000\u051a\u051d\u0001\u0000\u0000\u0000\u051b\u0519\u0001"+
		"\u0000\u0000\u0000\u051b\u051c\u0001\u0000\u0000\u0000\u051c\u051f\u0001"+
		"\u0000\u0000\u0000\u051d\u051b\u0001\u0000\u0000\u0000\u051e\u0520\u0005"+
		"Q\u0000\u0000\u051f\u051e\u0001\u0000\u0000\u0000\u051f\u0520\u0001\u0000"+
		"\u0000\u0000\u0520\u00d7\u0001\u0000\u0000\u0000\u0521\u0522\u0003\u00ae"+
		"W\u0000\u0522\u0523\u0005R\u0000\u0000\u0523\u0524\u0003\u00aeW\u0000"+
		"\u0524\u0528\u0001\u0000\u0000\u0000\u0525\u0526\u00052\u0000\u0000\u0526"+
		"\u0528\u0003\u00c2a\u0000\u0527\u0521\u0001\u0000\u0000\u0000\u0527\u0525"+
		"\u0001\u0000\u0000\u0000\u0528\u053b\u0001\u0000\u0000\u0000\u0529\u053c"+
		"\u0003\u00e2q\u0000\u052a\u0531\u0005Q\u0000\u0000\u052b\u052c\u0003\u00ae"+
		"W\u0000\u052c\u052d\u0005R\u0000\u0000\u052d\u052e\u0003\u00aeW\u0000"+
		"\u052e\u0532\u0001\u0000\u0000\u0000\u052f\u0530\u00052\u0000\u0000\u0530"+
		"\u0532\u0003\u00c2a\u0000\u0531\u052b\u0001\u0000\u0000\u0000\u0531\u052f"+
		"\u0001\u0000\u0000\u0000\u0532\u0534\u0001\u0000\u0000\u0000\u0533\u052a"+
		"\u0001\u0000\u0000\u0000\u0534\u0537\u0001\u0000\u0000\u0000\u0535\u0533"+
		"\u0001\u0000\u0000\u0000\u0535\u0536\u0001\u0000\u0000\u0000\u0536\u0539"+
		"\u0001\u0000\u0000\u0000\u0537\u0535\u0001\u0000\u0000\u0000\u0538\u053a"+
		"\u0005Q\u0000\u0000\u0539\u0538\u0001\u0000\u0000\u0000\u0539\u053a\u0001"+
		"\u0000\u0000\u0000\u053a\u053c\u0001\u0000\u0000\u0000\u053b\u0529\u0001"+
		"\u0000\u0000\u0000\u053b\u0535\u0001\u0000\u0000\u0000\u053c\u0552\u0001"+
		"\u0000\u0000\u0000\u053d\u0540\u0003\u00aeW\u0000\u053e\u0540\u0003\u00c0"+
		"`\u0000\u053f\u053d\u0001\u0000\u0000\u0000\u053f\u053e\u0001\u0000\u0000"+
		"\u0000\u0540\u054f\u0001\u0000\u0000\u0000\u0541\u0550\u0003\u00e2q\u0000"+
		"\u0542\u0545\u0005Q\u0000\u0000\u0543\u0546\u0003\u00aeW\u0000\u0544\u0546"+
		"\u0003\u00c0`\u0000\u0545\u0543\u0001\u0000\u0000\u0000\u0545\u0544\u0001"+
		"\u0000\u0000\u0000\u0546\u0548\u0001\u0000\u0000\u0000\u0547\u0542\u0001"+
		"\u0000\u0000\u0000\u0548\u054b\u0001\u0000\u0000\u0000\u0549\u0547\u0001"+
		"\u0000\u0000\u0000\u0549\u054a\u0001\u0000\u0000\u0000\u054a\u054d\u0001"+
		"\u0000\u0000\u0000\u054b\u0549\u0001\u0000\u0000\u0000\u054c\u054e\u0005"+
		"Q\u0000\u0000\u054d\u054c\u0001\u0000\u0000\u0000\u054d\u054e\u0001\u0000"+
		"\u0000\u0000\u054e\u0550\u0001\u0000\u0000\u0000\u054f\u0541\u0001\u0000"+
		"\u0000\u0000\u054f\u0549\u0001\u0000\u0000\u0000\u0550\u0552\u0001\u0000"+
		"\u0000\u0000\u0551\u0527\u0001\u0000\u0000\u0000\u0551\u053f\u0001\u0000"+
		"\u0000\u0000\u0552\u00d9\u0001\u0000\u0000\u0000\u0553\u0554\u0005\t\u0000"+
		"\u0000\u0554\u055a\u0003\u00c8d\u0000\u0555\u0557\u0005K\u0000\u0000\u0556"+
		"\u0558\u0003\u00dcn\u0000\u0557\u0556\u0001\u0000\u0000\u0000\u0557\u0558"+
		"\u0001\u0000\u0000\u0000\u0558\u0559\u0001\u0000\u0000\u0000\u0559\u055b"+
		"\u0005L\u0000\u0000\u055a\u0555\u0001\u0000\u0000\u0000\u055a\u055b\u0001"+
		"\u0000\u0000\u0000\u055b\u055c\u0001\u0000\u0000\u0000\u055c\u055d\u0005"+
		"R\u0000\u0000\u055d\u055e\u0003`0\u0000\u055e\u00db\u0001\u0000\u0000"+
		"\u0000\u055f\u0564\u0003\u00deo\u0000\u0560\u0561\u0005Q\u0000\u0000\u0561"+
		"\u0563\u0003\u00deo\u0000\u0562\u0560\u0001\u0000\u0000\u0000\u0563\u0566"+
		"\u0001\u0000\u0000\u0000\u0564\u0562\u0001\u0000\u0000\u0000\u0564\u0565"+
		"\u0001\u0000\u0000\u0000\u0565\u0568\u0001\u0000\u0000\u0000\u0566\u0564"+
		"\u0001\u0000\u0000\u0000\u0567\u0569\u0005Q\u0000\u0000\u0568\u0567\u0001"+
		"\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000\u0569\u00dd\u0001"+
		"\u0000\u0000\u0000\u056a\u056c\u0003\u00aeW\u0000\u056b\u056d\u0003\u00e2"+
		"q\u0000\u056c\u056b\u0001\u0000\u0000\u0000\u056c\u056d\u0001\u0000\u0000"+
		"\u0000\u056d\u0577\u0001\u0000\u0000\u0000\u056e\u056f\u0003\u00aeW\u0000"+
		"\u056f\u0570\u0005J\u0000\u0000\u0570\u0571\u0003\u00aeW\u0000\u0571\u0577"+
		"\u0001\u0000\u0000\u0000\u0572\u0573\u00052\u0000\u0000\u0573\u0577\u0003"+
		"\u00aeW\u0000\u0574\u0575\u0005I\u0000\u0000\u0575\u0577\u0003\u00aeW"+
		"\u0000\u0576\u056a\u0001\u0000\u0000\u0000\u0576\u056e\u0001\u0000\u0000"+
		"\u0000\u0576\u0572\u0001\u0000\u0000\u0000\u0576\u0574\u0001\u0000\u0000"+
		"\u0000\u0577\u00df\u0001\u0000\u0000\u0000\u0578\u057b\u0003\u00e2q\u0000"+
		"\u0579\u057b\u0003\u00e4r\u0000\u057a\u0578\u0001\u0000\u0000\u0000\u057a"+
		"\u0579\u0001\u0000\u0000\u0000\u057b\u00e1\u0001\u0000\u0000\u0000\u057c"+
		"\u057e\u0005\u0006\u0000\u0000\u057d\u057c\u0001\u0000\u0000\u0000\u057d"+
		"\u057e\u0001\u0000\u0000\u0000\u057e\u057f\u0001\u0000\u0000\u0000\u057f"+
		"\u0580\u0005\u0012\u0000\u0000\u0580\u0581\u0003\u00d4j\u0000\u0581\u0582"+
		"\u0005\u0017\u0000\u0000\u0582\u0584\u0003\u00b6[\u0000\u0583\u0585\u0003"+
		"\u00e0p\u0000\u0584\u0583\u0001\u0000\u0000\u0000\u0584\u0585\u0001\u0000"+
		"\u0000\u0000\u0585\u00e3\u0001\u0000\u0000\u0000\u0586\u0587\u0005\u0015"+
		"\u0000\u0000\u0587\u0589\u0003\u00b0X\u0000\u0588\u058a\u0003\u00e0p\u0000"+
		"\u0589\u0588\u0001\u0000\u0000\u0000\u0589\u058a\u0001\u0000\u0000\u0000"+
		"\u058a\u00e5\u0001\u0000\u0000\u0000\u058b\u058c\u0003\u00c8d\u0000\u058c"+
		"\u00e7\u0001\u0000\u0000\u0000\u058d\u058f\u0005\'\u0000\u0000\u058e\u0590"+
		"\u0003\u00eau\u0000\u058f\u058e\u0001\u0000\u0000\u0000\u058f\u0590\u0001"+
		"\u0000\u0000\u0000\u0590\u00e9\u0001\u0000\u0000\u0000\u0591\u0592\u0005"+
		"\u0013\u0000\u0000\u0592\u0595\u0003\u00aeW\u0000\u0593\u0595\u0003\u00d6"+
		"k\u0000\u0594\u0591\u0001\u0000\u0000\u0000\u0594\u0593\u0001\u0000\u0000"+
		"\u0000\u0595\u00eb\u0001\u0000\u0000\u0000\u0596\u0598\u0005d\u0000\u0000"+
		"\u0597\u0596\u0001\u0000\u0000\u0000\u0598\u0599\u0001\u0000\u0000\u0000"+
		"\u0599\u0597\u0001\u0000\u0000\u0000\u0599\u059a\u0001\u0000\u0000\u0000"+
		"\u059a\u00ed\u0001\u0000\u0000\u0000\u00ca\u00ef\u00f2\u00f8\u00fa\u0103"+
		"\u010c\u010f\u0116\u011c\u0126\u012d\u0134\u013a\u013e\u0144\u014a\u014e"+
		"\u0155\u0157\u0159\u015e\u0160\u0162\u0166\u016c\u0170\u0177\u0179\u017b"+
		"\u0180\u0182\u0187\u018c\u0192\u0196\u019c\u01a2\u01a6\u01ad\u01af\u01b1"+
		"\u01b6\u01b8\u01ba\u01be\u01c4\u01c8\u01cf\u01d1\u01d3\u01d8\u01da\u01e0"+
		"\u01e7\u01eb\u01f7\u01fe\u0203\u0207\u020a\u0210\u0214\u0219\u021d\u0221"+
		"\u022f\u0237\u023f\u0241\u0245\u024e\u0255\u0257\u0260\u0265\u026a\u0271"+
		"\u0275\u027c\u0284\u028d\u0296\u029d\u02a9\u02af\u02bc\u02c2\u02cb\u02d6"+
		"\u02e1\u02e6\u02eb\u02f0\u02f8\u0301\u0307\u0309\u0311\u0315\u031f\u0326"+
		"\u0329\u032f\u0332\u0337\u033c\u0346\u034a\u0355\u0360\u036a\u0374\u037e"+
		"\u0383\u0388\u039d\u03a1\u03a9\u03ae\u03b1\u03b6\u03bd\u03c1\u03c5\u03cb"+
		"\u03d2\u03db\u03e2\u03e6\u03ed\u03f2\u0402\u040a\u0414\u0418\u041f\u0427"+
		"\u0434\u0437\u043b\u043f\u0446\u0450\u0458\u045e\u0466\u0476\u0480\u0483"+
		"\u049a\u049c\u04a0\u04a6\u04ac\u04b1\u04b6\u04be\u04c4\u04ca\u04d0\u04d4"+
		"\u04d8\u04da\u04de\u04e7\u04ee\u04f2\u04f6\u04fa\u04fd\u04ff\u0503\u0507"+
		"\u050c\u0510\u0514\u051b\u051f\u0527\u0531\u0535\u0539\u053b\u053f\u0545"+
		"\u0549\u054d\u054f\u0551\u0557\u055a\u0564\u0568\u056c\u0576\u057a\u057d"+
		"\u0584\u0589\u058f\u0594\u0599";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}