// Generated from C:/Users/asus/Desktop/com/grammer/HTMLCSSJinjaParser.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLCSSJinjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLCSSJinjaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code htmlDoc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDoc(HTMLCSSJinjaParser.HtmlDocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScr(HTMLCSSJinjaParser.ScrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ws}
	 * labeled alternative in {@link HTMLCSSJinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWs(HTMLCSSJinjaParser.WsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlElems}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElems(HTMLCSSJinjaParser.HtmlElemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlNormalTag}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNormalTag(HTMLCSSJinjaParser.HtmlNormalTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlSelfClosing}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfClosing(HTMLCSSJinjaParser.HtmlSelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlScriptlet}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlScriptlet(HTMLCSSJinjaParser.HtmlScriptletContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlScript}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlScript(HTMLCSSJinjaParser.HtmlScriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlStyle}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStyle(HTMLCSSJinjaParser.HtmlStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlContentRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentRule(HTMLCSSJinjaParser.HtmlContentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttr(HTMLCSSJinjaParser.HtmlAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrDouble}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrDouble(HTMLCSSJinjaParser.AttrDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrSingle}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrSingle(HTMLCSSJinjaParser.AttrSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrChars}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrChars(HTMLCSSJinjaParser.AttrCharsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrHex}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrHex(HTMLCSSJinjaParser.AttrHexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrDec}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrDec(HTMLCSSJinjaParser.AttrDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlText}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlText(HTMLCSSJinjaParser.HtmlTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlWs}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlWs(HTMLCSSJinjaParser.HtmlWsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlCommentMisc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentMisc(HTMLCSSJinjaParser.HtmlCommentMiscContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlMiscWs}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMiscWs(HTMLCSSJinjaParser.HtmlMiscWsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlCommentNormal}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentNormal(HTMLCSSJinjaParser.HtmlCommentNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlCommentConditional}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentConditional(HTMLCSSJinjaParser.HtmlCommentConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scriptTag}
	 * labeled alternative in {@link HTMLCSSJinjaParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptTag(HTMLCSSJinjaParser.ScriptTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleTag}
	 * labeled alternative in {@link HTMLCSSJinjaParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleTag(HTMLCSSJinjaParser.StyleTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExpr(HTMLCSSJinjaParser.StmtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtBlock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBlock(HTMLCSSJinjaParser.StmtBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(HTMLCSSJinjaParser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(HTMLCSSJinjaParser.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWhile(HTMLCSSJinjaParser.StmtWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaBlock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlock(HTMLCSSJinjaParser.JinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blkIf}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlkIf(HTMLCSSJinjaParser.BlkIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blkElif}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlkElif(HTMLCSSJinjaParser.BlkElifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blkElse}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlkElse(HTMLCSSJinjaParser.BlkElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blkEndIf}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlkEndIf(HTMLCSSJinjaParser.BlkEndIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blkWhile}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlkWhile(HTMLCSSJinjaParser.BlkWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blkEndWhile}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlkEndWhile(HTMLCSSJinjaParser.BlkEndWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blkAssign}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlkAssign(HTMLCSSJinjaParser.BlkAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(HTMLCSSJinjaParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpr(HTMLCSSJinjaParser.JinjaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqInt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqInt(HTMLCSSJinjaParser.EqIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqDbl}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqDbl(HTMLCSSJinjaParser.EqDblContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqPar}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqPar(HTMLCSSJinjaParser.EqParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqStr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqStr(HTMLCSSJinjaParser.EqStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqAdd}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqAdd(HTMLCSSJinjaParser.EqAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqVar}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqVar(HTMLCSSJinjaParser.EqVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqMUL}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqMUL(HTMLCSSJinjaParser.EqMULContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqBoolPar}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqBoolPar(HTMLCSSJinjaParser.EqBoolParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(HTMLCSSJinjaParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolEq}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolEq(HTMLCSSJinjaParser.BoolEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqBool}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqBool(HTMLCSSJinjaParser.EqBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(HTMLCSSJinjaParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elifStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#elif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStmt(HTMLCSSJinjaParser.ElifStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(HTMLCSSJinjaParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#if_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfFrg(HTMLCSSJinjaParser.IfFrgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elifFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#elif_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifFrg(HTMLCSSJinjaParser.ElifFrgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#else_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseFrg(HTMLCSSJinjaParser.ElseFrgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code endifFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#endif_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndifFrg(HTMLCSSJinjaParser.EndifFrgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeblock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(HTMLCSSJinjaParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(HTMLCSSJinjaParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#while_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileFrg(HTMLCSSJinjaParser.WhileFrgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code endwhileFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#endwhile_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndwhileFrg(HTMLCSSJinjaParser.EndwhileFrgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stylesheetRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheetRule(HTMLCSSJinjaParser.StylesheetRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodCharset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodCharset(HTMLCSSJinjaParser.GoodCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badCharset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadCharset(HTMLCSSJinjaParser.BadCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodImport}
	 * labeled alternative in {@link HTMLCSSJinjaParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodImport(HTMLCSSJinjaParser.GoodImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badImport}
	 * labeled alternative in {@link HTMLCSSJinjaParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadImport(HTMLCSSJinjaParser.BadImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodNamespace}
	 * labeled alternative in {@link HTMLCSSJinjaParser#namespace_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodNamespace(HTMLCSSJinjaParser.GoodNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badNamespace}
	 * labeled alternative in {@link HTMLCSSJinjaParser#namespace_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadNamespace(HTMLCSSJinjaParser.BadNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#namespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacePrefix(HTMLCSSJinjaParser.NamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mediaRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#media}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaRule(HTMLCSSJinjaParser.MediaRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mediaQueryListRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#mediaQueryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQueryListRule(HTMLCSSJinjaParser.MediaQueryListRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mediaTypeQuery}
	 * labeled alternative in {@link HTMLCSSJinjaParser#mediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaTypeQuery(HTMLCSSJinjaParser.MediaTypeQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mediaExprQuery}
	 * labeled alternative in {@link HTMLCSSJinjaParser#mediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaExprQuery(HTMLCSSJinjaParser.MediaExprQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#mediaType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaType(HTMLCSSJinjaParser.MediaTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#mediaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaExpression(HTMLCSSJinjaParser.MediaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#mediaFeature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaFeature(HTMLCSSJinjaParser.MediaFeatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pageRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageRule(HTMLCSSJinjaParser.PageRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#pseudoPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoPage(HTMLCSSJinjaParser.PseudoPageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectorGroupRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroupRule(HTMLCSSJinjaParser.SelectorGroupRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectorRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorRule(HTMLCSSJinjaParser.SelectorRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinator(HTMLCSSJinjaParser.CombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleSeq1}
	 * labeled alternative in {@link HTMLCSSJinjaParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSeq1(HTMLCSSJinjaParser.SimpleSeq1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleSeq2}
	 * labeled alternative in {@link HTMLCSSJinjaParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSeq2(HTMLCSSJinjaParser.SimpleSeq2Context ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelector(HTMLCSSJinjaParser.TypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNamespacePrefix(HTMLCSSJinjaParser.TypeNamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#elementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementName(HTMLCSSJinjaParser.ElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversal(HTMLCSSJinjaParser.UniversalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(HTMLCSSJinjaParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrib(HTMLCSSJinjaParser.AttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo(HTMLCSSJinjaParser.PseudoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcPseudo}
	 * labeled alternative in {@link HTMLCSSJinjaParser#functionalPseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncPseudo(HTMLCSSJinjaParser.FuncPseudoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssExpr(HTMLCSSJinjaParser.CssExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(HTMLCSSJinjaParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#negationArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationArg(HTMLCSSJinjaParser.NegationArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link HTMLCSSJinjaParser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodOperator(HTMLCSSJinjaParser.GoodOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link HTMLCSSJinjaParser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadOperator(HTMLCSSJinjaParser.BadOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link HTMLCSSJinjaParser#property_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodProperty(HTMLCSSJinjaParser.GoodPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link HTMLCSSJinjaParser#property_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadProperty(HTMLCSSJinjaParser.BadPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownRuleset(HTMLCSSJinjaParser.KnownRulesetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownRuleset(HTMLCSSJinjaParser.UnknownRulesetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declList}
	 * labeled alternative in {@link HTMLCSSJinjaParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclList(HTMLCSSJinjaParser.DeclListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownDeclaration(HTMLCSSJinjaParser.KnownDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownDeclaration(HTMLCSSJinjaParser.UnknownDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prioRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#prio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrioRule(HTMLCSSJinjaParser.PrioRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueRule(HTMLCSSJinjaParser.ValueRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRule(HTMLCSSJinjaParser.ExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link HTMLCSSJinjaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownTerm(HTMLCSSJinjaParser.KnownTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link HTMLCSSJinjaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownTerm(HTMLCSSJinjaParser.UnknownTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link HTMLCSSJinjaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadTerm(HTMLCSSJinjaParser.BadTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#function_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRule(HTMLCSSJinjaParser.FuncRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dxTransform}
	 * labeled alternative in {@link HTMLCSSJinjaParser#dxImageTransform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDxTransform(HTMLCSSJinjaParser.DxTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#hexcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexcolor(HTMLCSSJinjaParser.HexcolorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssNum}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNum(HTMLCSSJinjaParser.CssNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssPercent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_percentage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPercent(HTMLCSSJinjaParser.CssPercentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssDim}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDim(HTMLCSSJinjaParser.CssDimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyIdent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyIdent(HTMLCSSJinjaParser.AnyIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyNumber}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyNumber(HTMLCSSJinjaParser.AnyNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyPercent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyPercent(HTMLCSSJinjaParser.AnyPercentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyDim}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyDim(HTMLCSSJinjaParser.AnyDimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyString}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyString(HTMLCSSJinjaParser.AnyStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyUrl}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyUrl(HTMLCSSJinjaParser.AnyUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyHash}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyHash(HTMLCSSJinjaParser.AnyHashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyUnicode}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyUnicode(HTMLCSSJinjaParser.AnyUnicodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyInclude}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyInclude(HTMLCSSJinjaParser.AnyIncludeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyDashMatch}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyDashMatch(HTMLCSSJinjaParser.AnyDashMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyColon}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyColon(HTMLCSSJinjaParser.AnyColonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyFunc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyFunc(HTMLCSSJinjaParser.AnyFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyParen}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyParen(HTMLCSSJinjaParser.AnyParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyBrackets}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyBrackets(HTMLCSSJinjaParser.AnyBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atRuleUnknown}
	 * labeled alternative in {@link HTMLCSSJinjaParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRuleUnknown(HTMLCSSJinjaParser.AtRuleUnknownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unusedBlock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnusedBlock(HTMLCSSJinjaParser.UnusedBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unusedAt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnusedAt(HTMLCSSJinjaParser.UnusedAtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unusedSemi}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnusedSemi(HTMLCSSJinjaParser.UnusedSemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unusedCdo}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnusedCdo(HTMLCSSJinjaParser.UnusedCdoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unusedCdc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnusedCdc(HTMLCSSJinjaParser.UnusedCdcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockRule(HTMLCSSJinjaParser.BlockRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestRuleset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestRuleset(HTMLCSSJinjaParser.NestRulesetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestMedia}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestMedia(HTMLCSSJinjaParser.NestMediaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestPage}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestPage(HTMLCSSJinjaParser.NestPageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestFontFace}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestFontFace(HTMLCSSJinjaParser.NestFontFaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestKeyframes}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestKeyframes(HTMLCSSJinjaParser.NestKeyframesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestSupports}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestSupports(HTMLCSSJinjaParser.NestSupportsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestViewport}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestViewport(HTMLCSSJinjaParser.NestViewportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestCounter}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestCounter(HTMLCSSJinjaParser.NestCounterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestFontFeature}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestFontFeature(HTMLCSSJinjaParser.NestFontFeatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestAtRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestAtRule(HTMLCSSJinjaParser.NestAtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupBody}
	 * labeled alternative in {@link HTMLCSSJinjaParser#groupRuleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBody(HTMLCSSJinjaParser.GroupBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code supportsRuleLabel}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsRuleLabel(HTMLCSSJinjaParser.SupportsRuleLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#supportsCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsCondition(HTMLCSSJinjaParser.SupportsConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code supportParen}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportParen(HTMLCSSJinjaParser.SupportParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code supportDeclCond}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportDeclCond(HTMLCSSJinjaParser.SupportDeclCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code supportGeneral}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportGeneral(HTMLCSSJinjaParser.SupportGeneralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#supportsNegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsNegation(HTMLCSSJinjaParser.SupportsNegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#supportsConjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsConjunction(HTMLCSSJinjaParser.SupportsConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#supportsDisjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsDisjunction(HTMLCSSJinjaParser.SupportsDisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsDeclarationCondition(HTMLCSSJinjaParser.SupportsDeclarationConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generalEnclosedRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#generalEnclosed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralEnclosedRule(HTMLCSSJinjaParser.GeneralEnclosedRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#var_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRule(HTMLCSSJinjaParser.VarRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcRule(HTMLCSSJinjaParser.CalcRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcSumRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcSum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcSumRule(HTMLCSSJinjaParser.CalcSumRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcProdRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcProdRule(HTMLCSSJinjaParser.CalcProdRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcValNum}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcValNum(HTMLCSSJinjaParser.CalcValNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcValDim}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcValDim(HTMLCSSJinjaParser.CalcValDimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcValPercent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcValPercent(HTMLCSSJinjaParser.CalcValPercentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcValParen}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcValParen(HTMLCSSJinjaParser.CalcValParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fontFaceRuleLabel}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFaceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFaceRuleLabel(HTMLCSSJinjaParser.FontFaceRuleLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownFontFaceDeclaration(HTMLCSSJinjaParser.KnownFontFaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownFontFaceDeclaration(HTMLCSSJinjaParser.UnknownFontFaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#keyframesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframesRule(HTMLCSSJinjaParser.KeyframesRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#keyframeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframeBlock(HTMLCSSJinjaParser.KeyframeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#keyframeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframeSelector(HTMLCSSJinjaParser.KeyframeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#viewport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewport(HTMLCSSJinjaParser.ViewportContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#counterStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCounterStyle(HTMLCSSJinjaParser.CounterStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFeatureValuesRule(HTMLCSSJinjaParser.FontFeatureValuesRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ffNameList}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFfNameList(HTMLCSSJinjaParser.FfNameListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ffNameStr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFamilyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFfNameStr(HTMLCSSJinjaParser.FfNameStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ffNameIdent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFamilyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFfNameIdent(HTMLCSSJinjaParser.FfNameIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#featureValueBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureValueBlock(HTMLCSSJinjaParser.FeatureValueBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#featureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureType(HTMLCSSJinjaParser.FeatureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#featureValueDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureValueDefinition(HTMLCSSJinjaParser.FeatureValueDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#css_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_ident(HTMLCSSJinjaParser.Css_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#css_ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_ws(HTMLCSSJinjaParser.Css_wsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLCSSJinjaParser#css_url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_url(HTMLCSSJinjaParser.Css_urlContext ctx);
}