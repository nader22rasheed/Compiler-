// Generated from C:/Users/asus/Desktop/com/grammer/FlaskParser.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlaskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlaskParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlaskParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(FlaskParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(FlaskParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#eval_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_input(FlaskParser.Eval_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(FlaskParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(FlaskParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(FlaskParser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#async_funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_funcdef(FlaskParser.Async_funcdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(FlaskParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(FlaskParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(FlaskParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(FlaskParser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargslist(FlaskParser.VarargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#vfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVfpdef(FlaskParser.VfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(FlaskParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#simple_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmts(FlaskParser.Simple_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(FlaskParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(FlaskParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#annassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnassign(FlaskParser.AnnassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(FlaskParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(FlaskParser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(FlaskParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(FlaskParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(FlaskParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(FlaskParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(FlaskParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(FlaskParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#yield_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(FlaskParser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(FlaskParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(FlaskParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(FlaskParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(FlaskParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(FlaskParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(FlaskParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(FlaskParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(FlaskParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(FlaskParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(FlaskParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(FlaskParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#assert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(FlaskParser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(FlaskParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#async_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_stmt(FlaskParser.Async_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(FlaskParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(FlaskParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(FlaskParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(FlaskParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(FlaskParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(FlaskParser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(FlaskParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FlaskParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#match_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_stmt(FlaskParser.Match_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#subject_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject_expr(FlaskParser.Subject_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#star_named_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_named_expressions(FlaskParser.Star_named_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#star_named_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_named_expression(FlaskParser.Star_named_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#case_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_block(FlaskParser.Case_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(FlaskParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#patterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatterns(FlaskParser.PatternsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FlaskParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#as_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_pattern(FlaskParser.As_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#or_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_pattern(FlaskParser.Or_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#closed_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosed_pattern(FlaskParser.Closed_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#literal_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_pattern(FlaskParser.Literal_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#literal_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_expr(FlaskParser.Literal_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#complex_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_number(FlaskParser.Complex_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(FlaskParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#signed_real_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_real_number(FlaskParser.Signed_real_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#real_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_number(FlaskParser.Real_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#imaginary_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImaginary_number(FlaskParser.Imaginary_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#capture_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_pattern(FlaskParser.Capture_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#pattern_capture_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_capture_target(FlaskParser.Pattern_capture_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_pattern(FlaskParser.Wildcard_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#value_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_pattern(FlaskParser.Value_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(FlaskParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#name_or_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_or_attr(FlaskParser.Name_or_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#group_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_pattern(FlaskParser.Group_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#sequence_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_pattern(FlaskParser.Sequence_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#open_sequence_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_sequence_pattern(FlaskParser.Open_sequence_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#maybe_sequence_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybe_sequence_pattern(FlaskParser.Maybe_sequence_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#maybe_star_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybe_star_pattern(FlaskParser.Maybe_star_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#star_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_pattern(FlaskParser.Star_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#mapping_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping_pattern(FlaskParser.Mapping_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#items_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems_pattern(FlaskParser.Items_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#key_value_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_value_pattern(FlaskParser.Key_value_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#double_star_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_star_pattern(FlaskParser.Double_star_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#class_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_pattern(FlaskParser.Class_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#positional_patterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositional_patterns(FlaskParser.Positional_patternsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#keyword_patterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_patterns(FlaskParser.Keyword_patternsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#keyword_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_pattern(FlaskParser.Keyword_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(FlaskParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#test_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_nocond(FlaskParser.Test_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(FlaskParser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef_nocond(FlaskParser.Lambdef_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(FlaskParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(FlaskParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(FlaskParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(FlaskParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(FlaskParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(FlaskParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FlaskParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(FlaskParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(FlaskParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(FlaskParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(FlaskParser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(FlaskParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(FlaskParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#subscript_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_(FlaskParser.Subscript_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(FlaskParser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(FlaskParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(FlaskParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(FlaskParser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(FlaskParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(FlaskParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(FlaskParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_iter(FlaskParser.Comp_iterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(FlaskParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(FlaskParser.Comp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#encoding_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncoding_decl(FlaskParser.Encoding_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(FlaskParser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_arg(FlaskParser.Yield_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlaskParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrings(FlaskParser.StringsContext ctx);
}