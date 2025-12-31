// Generated from C:/Users/asus/Desktop/com/grammer/FlaskParser.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlaskParser}.
 */
public interface FlaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlaskParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(FlaskParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(FlaskParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(FlaskParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(FlaskParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(FlaskParser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(FlaskParser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(FlaskParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(FlaskParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(FlaskParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(FlaskParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(FlaskParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(FlaskParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void enterAsync_funcdef(FlaskParser.Async_funcdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void exitAsync_funcdef(FlaskParser.Async_funcdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(FlaskParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(FlaskParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FlaskParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FlaskParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(FlaskParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(FlaskParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(FlaskParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(FlaskParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(FlaskParser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(FlaskParser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(FlaskParser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(FlaskParser.VfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(FlaskParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(FlaskParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#simple_stmts}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmts(FlaskParser.Simple_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#simple_stmts}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmts(FlaskParser.Simple_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(FlaskParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(FlaskParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(FlaskParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(FlaskParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#annassign}.
	 * @param ctx the parse tree
	 */
	void enterAnnassign(FlaskParser.AnnassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#annassign}.
	 * @param ctx the parse tree
	 */
	void exitAnnassign(FlaskParser.AnnassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(FlaskParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(FlaskParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(FlaskParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(FlaskParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(FlaskParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(FlaskParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(FlaskParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(FlaskParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(FlaskParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(FlaskParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(FlaskParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(FlaskParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(FlaskParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(FlaskParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(FlaskParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(FlaskParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(FlaskParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(FlaskParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(FlaskParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(FlaskParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(FlaskParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(FlaskParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(FlaskParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(FlaskParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(FlaskParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(FlaskParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(FlaskParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(FlaskParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(FlaskParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(FlaskParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(FlaskParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(FlaskParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(FlaskParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(FlaskParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(FlaskParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(FlaskParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(FlaskParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(FlaskParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(FlaskParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(FlaskParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(FlaskParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(FlaskParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(FlaskParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(FlaskParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsync_stmt(FlaskParser.Async_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsync_stmt(FlaskParser.Async_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(FlaskParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(FlaskParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(FlaskParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(FlaskParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(FlaskParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(FlaskParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(FlaskParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(FlaskParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(FlaskParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(FlaskParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(FlaskParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(FlaskParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(FlaskParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(FlaskParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FlaskParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FlaskParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#match_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMatch_stmt(FlaskParser.Match_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#match_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMatch_stmt(FlaskParser.Match_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#subject_expr}.
	 * @param ctx the parse tree
	 */
	void enterSubject_expr(FlaskParser.Subject_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#subject_expr}.
	 * @param ctx the parse tree
	 */
	void exitSubject_expr(FlaskParser.Subject_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#star_named_expressions}.
	 * @param ctx the parse tree
	 */
	void enterStar_named_expressions(FlaskParser.Star_named_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#star_named_expressions}.
	 * @param ctx the parse tree
	 */
	void exitStar_named_expressions(FlaskParser.Star_named_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#star_named_expression}.
	 * @param ctx the parse tree
	 */
	void enterStar_named_expression(FlaskParser.Star_named_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#star_named_expression}.
	 * @param ctx the parse tree
	 */
	void exitStar_named_expression(FlaskParser.Star_named_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#case_block}.
	 * @param ctx the parse tree
	 */
	void enterCase_block(FlaskParser.Case_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#case_block}.
	 * @param ctx the parse tree
	 */
	void exitCase_block(FlaskParser.Case_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(FlaskParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(FlaskParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#patterns}.
	 * @param ctx the parse tree
	 */
	void enterPatterns(FlaskParser.PatternsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#patterns}.
	 * @param ctx the parse tree
	 */
	void exitPatterns(FlaskParser.PatternsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FlaskParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FlaskParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#as_pattern}.
	 * @param ctx the parse tree
	 */
	void enterAs_pattern(FlaskParser.As_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#as_pattern}.
	 * @param ctx the parse tree
	 */
	void exitAs_pattern(FlaskParser.As_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#or_pattern}.
	 * @param ctx the parse tree
	 */
	void enterOr_pattern(FlaskParser.Or_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#or_pattern}.
	 * @param ctx the parse tree
	 */
	void exitOr_pattern(FlaskParser.Or_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void enterClosed_pattern(FlaskParser.Closed_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#closed_pattern}.
	 * @param ctx the parse tree
	 */
	void exitClosed_pattern(FlaskParser.Closed_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_pattern(FlaskParser.Literal_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_pattern(FlaskParser.Literal_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#literal_expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expr(FlaskParser.Literal_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#literal_expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expr(FlaskParser.Literal_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#complex_number}.
	 * @param ctx the parse tree
	 */
	void enterComplex_number(FlaskParser.Complex_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#complex_number}.
	 * @param ctx the parse tree
	 */
	void exitComplex_number(FlaskParser.Complex_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(FlaskParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(FlaskParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#signed_real_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_real_number(FlaskParser.Signed_real_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#signed_real_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_real_number(FlaskParser.Signed_real_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#real_number}.
	 * @param ctx the parse tree
	 */
	void enterReal_number(FlaskParser.Real_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#real_number}.
	 * @param ctx the parse tree
	 */
	void exitReal_number(FlaskParser.Real_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#imaginary_number}.
	 * @param ctx the parse tree
	 */
	void enterImaginary_number(FlaskParser.Imaginary_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#imaginary_number}.
	 * @param ctx the parse tree
	 */
	void exitImaginary_number(FlaskParser.Imaginary_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#capture_pattern}.
	 * @param ctx the parse tree
	 */
	void enterCapture_pattern(FlaskParser.Capture_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#capture_pattern}.
	 * @param ctx the parse tree
	 */
	void exitCapture_pattern(FlaskParser.Capture_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#pattern_capture_target}.
	 * @param ctx the parse tree
	 */
	void enterPattern_capture_target(FlaskParser.Pattern_capture_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#pattern_capture_target}.
	 * @param ctx the parse tree
	 */
	void exitPattern_capture_target(FlaskParser.Pattern_capture_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_pattern(FlaskParser.Wildcard_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_pattern(FlaskParser.Wildcard_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#value_pattern}.
	 * @param ctx the parse tree
	 */
	void enterValue_pattern(FlaskParser.Value_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#value_pattern}.
	 * @param ctx the parse tree
	 */
	void exitValue_pattern(FlaskParser.Value_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(FlaskParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(FlaskParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#name_or_attr}.
	 * @param ctx the parse tree
	 */
	void enterName_or_attr(FlaskParser.Name_or_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#name_or_attr}.
	 * @param ctx the parse tree
	 */
	void exitName_or_attr(FlaskParser.Name_or_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#group_pattern}.
	 * @param ctx the parse tree
	 */
	void enterGroup_pattern(FlaskParser.Group_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#group_pattern}.
	 * @param ctx the parse tree
	 */
	void exitGroup_pattern(FlaskParser.Group_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#sequence_pattern}.
	 * @param ctx the parse tree
	 */
	void enterSequence_pattern(FlaskParser.Sequence_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#sequence_pattern}.
	 * @param ctx the parse tree
	 */
	void exitSequence_pattern(FlaskParser.Sequence_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#open_sequence_pattern}.
	 * @param ctx the parse tree
	 */
	void enterOpen_sequence_pattern(FlaskParser.Open_sequence_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#open_sequence_pattern}.
	 * @param ctx the parse tree
	 */
	void exitOpen_sequence_pattern(FlaskParser.Open_sequence_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#maybe_sequence_pattern}.
	 * @param ctx the parse tree
	 */
	void enterMaybe_sequence_pattern(FlaskParser.Maybe_sequence_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#maybe_sequence_pattern}.
	 * @param ctx the parse tree
	 */
	void exitMaybe_sequence_pattern(FlaskParser.Maybe_sequence_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#maybe_star_pattern}.
	 * @param ctx the parse tree
	 */
	void enterMaybe_star_pattern(FlaskParser.Maybe_star_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#maybe_star_pattern}.
	 * @param ctx the parse tree
	 */
	void exitMaybe_star_pattern(FlaskParser.Maybe_star_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#star_pattern}.
	 * @param ctx the parse tree
	 */
	void enterStar_pattern(FlaskParser.Star_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#star_pattern}.
	 * @param ctx the parse tree
	 */
	void exitStar_pattern(FlaskParser.Star_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#mapping_pattern}.
	 * @param ctx the parse tree
	 */
	void enterMapping_pattern(FlaskParser.Mapping_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#mapping_pattern}.
	 * @param ctx the parse tree
	 */
	void exitMapping_pattern(FlaskParser.Mapping_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#items_pattern}.
	 * @param ctx the parse tree
	 */
	void enterItems_pattern(FlaskParser.Items_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#items_pattern}.
	 * @param ctx the parse tree
	 */
	void exitItems_pattern(FlaskParser.Items_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#key_value_pattern}.
	 * @param ctx the parse tree
	 */
	void enterKey_value_pattern(FlaskParser.Key_value_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#key_value_pattern}.
	 * @param ctx the parse tree
	 */
	void exitKey_value_pattern(FlaskParser.Key_value_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#double_star_pattern}.
	 * @param ctx the parse tree
	 */
	void enterDouble_star_pattern(FlaskParser.Double_star_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#double_star_pattern}.
	 * @param ctx the parse tree
	 */
	void exitDouble_star_pattern(FlaskParser.Double_star_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#class_pattern}.
	 * @param ctx the parse tree
	 */
	void enterClass_pattern(FlaskParser.Class_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#class_pattern}.
	 * @param ctx the parse tree
	 */
	void exitClass_pattern(FlaskParser.Class_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#positional_patterns}.
	 * @param ctx the parse tree
	 */
	void enterPositional_patterns(FlaskParser.Positional_patternsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#positional_patterns}.
	 * @param ctx the parse tree
	 */
	void exitPositional_patterns(FlaskParser.Positional_patternsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#keyword_patterns}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_patterns(FlaskParser.Keyword_patternsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#keyword_patterns}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_patterns(FlaskParser.Keyword_patternsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#keyword_pattern}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_pattern(FlaskParser.Keyword_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#keyword_pattern}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_pattern(FlaskParser.Keyword_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(FlaskParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(FlaskParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(FlaskParser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(FlaskParser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(FlaskParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(FlaskParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(FlaskParser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(FlaskParser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(FlaskParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(FlaskParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(FlaskParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(FlaskParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(FlaskParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(FlaskParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(FlaskParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(FlaskParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(FlaskParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(FlaskParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(FlaskParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(FlaskParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FlaskParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FlaskParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(FlaskParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(FlaskParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(FlaskParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(FlaskParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(FlaskParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(FlaskParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(FlaskParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(FlaskParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(FlaskParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(FlaskParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(FlaskParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(FlaskParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#subscript_}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_(FlaskParser.Subscript_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#subscript_}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_(FlaskParser.Subscript_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(FlaskParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(FlaskParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(FlaskParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(FlaskParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(FlaskParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(FlaskParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(FlaskParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(FlaskParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(FlaskParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(FlaskParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(FlaskParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(FlaskParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(FlaskParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(FlaskParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(FlaskParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(FlaskParser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(FlaskParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(FlaskParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(FlaskParser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(FlaskParser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void enterEncoding_decl(FlaskParser.Encoding_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void exitEncoding_decl(FlaskParser.Encoding_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(FlaskParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(FlaskParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(FlaskParser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(FlaskParser.Yield_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlaskParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(FlaskParser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlaskParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(FlaskParser.StringsContext ctx);
}