// Generated from C:/Users/asus/Desktop/com/grammer/HTMLCSSJinjaParser.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLCSSJinjaParser}.
 */
public interface HTMLCSSJinjaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code htmlDoc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDoc(HTMLCSSJinjaParser.HtmlDocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlDoc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDoc(HTMLCSSJinjaParser.HtmlDocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScr(HTMLCSSJinjaParser.ScrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScr(HTMLCSSJinjaParser.ScrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ws}
	 * labeled alternative in {@link HTMLCSSJinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterWs(HTMLCSSJinjaParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ws}
	 * labeled alternative in {@link HTMLCSSJinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitWs(HTMLCSSJinjaParser.WsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlElems}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElems(HTMLCSSJinjaParser.HtmlElemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlElems}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElems(HTMLCSSJinjaParser.HtmlElemsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlNormalTag}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNormalTag(HTMLCSSJinjaParser.HtmlNormalTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlNormalTag}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNormalTag(HTMLCSSJinjaParser.HtmlNormalTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlSelfClosing}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelfClosing(HTMLCSSJinjaParser.HtmlSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlSelfClosing}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelfClosing(HTMLCSSJinjaParser.HtmlSelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlScriptlet}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlScriptlet(HTMLCSSJinjaParser.HtmlScriptletContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlScriptlet}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlScriptlet(HTMLCSSJinjaParser.HtmlScriptletContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlScript}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlScript(HTMLCSSJinjaParser.HtmlScriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlScript}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlScript(HTMLCSSJinjaParser.HtmlScriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlStyle}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStyle(HTMLCSSJinjaParser.HtmlStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlStyle}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStyle(HTMLCSSJinjaParser.HtmlStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlContentRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentRule(HTMLCSSJinjaParser.HtmlContentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlContentRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentRule(HTMLCSSJinjaParser.HtmlContentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttr(HTMLCSSJinjaParser.HtmlAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttr(HTMLCSSJinjaParser.HtmlAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrDouble}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrDouble(HTMLCSSJinjaParser.AttrDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrDouble}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrDouble(HTMLCSSJinjaParser.AttrDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrSingle}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrSingle(HTMLCSSJinjaParser.AttrSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrSingle}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrSingle(HTMLCSSJinjaParser.AttrSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrChars}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrChars(HTMLCSSJinjaParser.AttrCharsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrChars}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrChars(HTMLCSSJinjaParser.AttrCharsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrHex}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrHex(HTMLCSSJinjaParser.AttrHexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrHex}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrHex(HTMLCSSJinjaParser.AttrHexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrDec}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrDec(HTMLCSSJinjaParser.AttrDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrDec}
	 * labeled alternative in {@link HTMLCSSJinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrDec(HTMLCSSJinjaParser.AttrDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlText}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlText(HTMLCSSJinjaParser.HtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlText}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlText(HTMLCSSJinjaParser.HtmlTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlWs}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlWs(HTMLCSSJinjaParser.HtmlWsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlWs}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlWs(HTMLCSSJinjaParser.HtmlWsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlCommentMisc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentMisc(HTMLCSSJinjaParser.HtmlCommentMiscContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlCommentMisc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentMisc(HTMLCSSJinjaParser.HtmlCommentMiscContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlMiscWs}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMiscWs(HTMLCSSJinjaParser.HtmlMiscWsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlMiscWs}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMiscWs(HTMLCSSJinjaParser.HtmlMiscWsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlCommentNormal}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentNormal(HTMLCSSJinjaParser.HtmlCommentNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlCommentNormal}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentNormal(HTMLCSSJinjaParser.HtmlCommentNormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlCommentConditional}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentConditional(HTMLCSSJinjaParser.HtmlCommentConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlCommentConditional}
	 * labeled alternative in {@link HTMLCSSJinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentConditional(HTMLCSSJinjaParser.HtmlCommentConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scriptTag}
	 * labeled alternative in {@link HTMLCSSJinjaParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScriptTag(HTMLCSSJinjaParser.ScriptTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scriptTag}
	 * labeled alternative in {@link HTMLCSSJinjaParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScriptTag(HTMLCSSJinjaParser.ScriptTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleTag}
	 * labeled alternative in {@link HTMLCSSJinjaParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyleTag(HTMLCSSJinjaParser.StyleTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleTag}
	 * labeled alternative in {@link HTMLCSSJinjaParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyleTag(HTMLCSSJinjaParser.StyleTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtExpr(HTMLCSSJinjaParser.StmtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtExpr(HTMLCSSJinjaParser.StmtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtBlock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(HTMLCSSJinjaParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtBlock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(HTMLCSSJinjaParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(HTMLCSSJinjaParser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(HTMLCSSJinjaParser.StmtAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(HTMLCSSJinjaParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(HTMLCSSJinjaParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhile(HTMLCSSJinjaParser.StmtWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link HTMLCSSJinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhile(HTMLCSSJinjaParser.StmtWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaBlock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(HTMLCSSJinjaParser.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaBlock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(HTMLCSSJinjaParser.JinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blkIf}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void enterBlkIf(HTMLCSSJinjaParser.BlkIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blkIf}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void exitBlkIf(HTMLCSSJinjaParser.BlkIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blkElif}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void enterBlkElif(HTMLCSSJinjaParser.BlkElifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blkElif}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void exitBlkElif(HTMLCSSJinjaParser.BlkElifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blkElse}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void enterBlkElse(HTMLCSSJinjaParser.BlkElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blkElse}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void exitBlkElse(HTMLCSSJinjaParser.BlkElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blkEndIf}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void enterBlkEndIf(HTMLCSSJinjaParser.BlkEndIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blkEndIf}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void exitBlkEndIf(HTMLCSSJinjaParser.BlkEndIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blkWhile}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void enterBlkWhile(HTMLCSSJinjaParser.BlkWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blkWhile}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void exitBlkWhile(HTMLCSSJinjaParser.BlkWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blkEndWhile}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void enterBlkEndWhile(HTMLCSSJinjaParser.BlkEndWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blkEndWhile}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void exitBlkEndWhile(HTMLCSSJinjaParser.BlkEndWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blkAssign}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void enterBlkAssign(HTMLCSSJinjaParser.BlkAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blkAssign}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_block_content}.
	 * @param ctx the parse tree
	 */
	void exitBlkAssign(HTMLCSSJinjaParser.BlkAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(HTMLCSSJinjaParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(HTMLCSSJinjaParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpr(HTMLCSSJinjaParser.JinjaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpr(HTMLCSSJinjaParser.JinjaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqInt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void enterEqInt(HTMLCSSJinjaParser.EqIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqInt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void exitEqInt(HTMLCSSJinjaParser.EqIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqDbl}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void enterEqDbl(HTMLCSSJinjaParser.EqDblContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqDbl}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void exitEqDbl(HTMLCSSJinjaParser.EqDblContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqPar}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void enterEqPar(HTMLCSSJinjaParser.EqParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqPar}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void exitEqPar(HTMLCSSJinjaParser.EqParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqStr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void enterEqStr(HTMLCSSJinjaParser.EqStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqStr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void exitEqStr(HTMLCSSJinjaParser.EqStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqAdd}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void enterEqAdd(HTMLCSSJinjaParser.EqAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqAdd}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void exitEqAdd(HTMLCSSJinjaParser.EqAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqVar}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void enterEqVar(HTMLCSSJinjaParser.EqVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqVar}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void exitEqVar(HTMLCSSJinjaParser.EqVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqMUL}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void enterEqMUL(HTMLCSSJinjaParser.EqMULContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqMUL}
	 * labeled alternative in {@link HTMLCSSJinjaParser#jinja_expression_inner}.
	 * @param ctx the parse tree
	 */
	void exitEqMUL(HTMLCSSJinjaParser.EqMULContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqBoolPar}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterEqBoolPar(HTMLCSSJinjaParser.EqBoolParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqBoolPar}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitEqBoolPar(HTMLCSSJinjaParser.EqBoolParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(HTMLCSSJinjaParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(HTMLCSSJinjaParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolEq}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolEq(HTMLCSSJinjaParser.BoolEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolEq}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolEq(HTMLCSSJinjaParser.BoolEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqBool}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterEqBool(HTMLCSSJinjaParser.EqBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqBool}
	 * labeled alternative in {@link HTMLCSSJinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitEqBool(HTMLCSSJinjaParser.EqBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(HTMLCSSJinjaParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(HTMLCSSJinjaParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elifStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElifStmt(HTMLCSSJinjaParser.ElifStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elifStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElifStmt(HTMLCSSJinjaParser.ElifStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(HTMLCSSJinjaParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(HTMLCSSJinjaParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#if_fragment}.
	 * @param ctx the parse tree
	 */
	void enterIfFrg(HTMLCSSJinjaParser.IfFrgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#if_fragment}.
	 * @param ctx the parse tree
	 */
	void exitIfFrg(HTMLCSSJinjaParser.IfFrgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elifFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#elif_fragment}.
	 * @param ctx the parse tree
	 */
	void enterElifFrg(HTMLCSSJinjaParser.ElifFrgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elifFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#elif_fragment}.
	 * @param ctx the parse tree
	 */
	void exitElifFrg(HTMLCSSJinjaParser.ElifFrgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#else_fragment}.
	 * @param ctx the parse tree
	 */
	void enterElseFrg(HTMLCSSJinjaParser.ElseFrgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#else_fragment}.
	 * @param ctx the parse tree
	 */
	void exitElseFrg(HTMLCSSJinjaParser.ElseFrgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code endifFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#endif_fragment}.
	 * @param ctx the parse tree
	 */
	void enterEndifFrg(HTMLCSSJinjaParser.EndifFrgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endifFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#endif_fragment}.
	 * @param ctx the parse tree
	 */
	void exitEndifFrg(HTMLCSSJinjaParser.EndifFrgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeblock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(HTMLCSSJinjaParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeblock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(HTMLCSSJinjaParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(HTMLCSSJinjaParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(HTMLCSSJinjaParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#while_fragment}.
	 * @param ctx the parse tree
	 */
	void enterWhileFrg(HTMLCSSJinjaParser.WhileFrgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#while_fragment}.
	 * @param ctx the parse tree
	 */
	void exitWhileFrg(HTMLCSSJinjaParser.WhileFrgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code endwhileFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#endwhile_fragment}.
	 * @param ctx the parse tree
	 */
	void enterEndwhileFrg(HTMLCSSJinjaParser.EndwhileFrgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endwhileFrg}
	 * labeled alternative in {@link HTMLCSSJinjaParser#endwhile_fragment}.
	 * @param ctx the parse tree
	 */
	void exitEndwhileFrg(HTMLCSSJinjaParser.EndwhileFrgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stylesheetRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheetRule(HTMLCSSJinjaParser.StylesheetRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stylesheetRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheetRule(HTMLCSSJinjaParser.StylesheetRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodCharset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterGoodCharset(HTMLCSSJinjaParser.GoodCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodCharset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitGoodCharset(HTMLCSSJinjaParser.GoodCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badCharset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterBadCharset(HTMLCSSJinjaParser.BadCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badCharset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitBadCharset(HTMLCSSJinjaParser.BadCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodImport}
	 * labeled alternative in {@link HTMLCSSJinjaParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterGoodImport(HTMLCSSJinjaParser.GoodImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodImport}
	 * labeled alternative in {@link HTMLCSSJinjaParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitGoodImport(HTMLCSSJinjaParser.GoodImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badImport}
	 * labeled alternative in {@link HTMLCSSJinjaParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterBadImport(HTMLCSSJinjaParser.BadImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badImport}
	 * labeled alternative in {@link HTMLCSSJinjaParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitBadImport(HTMLCSSJinjaParser.BadImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodNamespace}
	 * labeled alternative in {@link HTMLCSSJinjaParser#namespace_}.
	 * @param ctx the parse tree
	 */
	void enterGoodNamespace(HTMLCSSJinjaParser.GoodNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodNamespace}
	 * labeled alternative in {@link HTMLCSSJinjaParser#namespace_}.
	 * @param ctx the parse tree
	 */
	void exitGoodNamespace(HTMLCSSJinjaParser.GoodNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badNamespace}
	 * labeled alternative in {@link HTMLCSSJinjaParser#namespace_}.
	 * @param ctx the parse tree
	 */
	void enterBadNamespace(HTMLCSSJinjaParser.BadNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badNamespace}
	 * labeled alternative in {@link HTMLCSSJinjaParser#namespace_}.
	 * @param ctx the parse tree
	 */
	void exitBadNamespace(HTMLCSSJinjaParser.BadNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	void enterNamespacePrefix(HTMLCSSJinjaParser.NamespacePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	void exitNamespacePrefix(HTMLCSSJinjaParser.NamespacePrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mediaRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#media}.
	 * @param ctx the parse tree
	 */
	void enterMediaRule(HTMLCSSJinjaParser.MediaRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mediaRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#media}.
	 * @param ctx the parse tree
	 */
	void exitMediaRule(HTMLCSSJinjaParser.MediaRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mediaQueryListRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void enterMediaQueryListRule(HTMLCSSJinjaParser.MediaQueryListRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mediaQueryListRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void exitMediaQueryListRule(HTMLCSSJinjaParser.MediaQueryListRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mediaTypeQuery}
	 * labeled alternative in {@link HTMLCSSJinjaParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterMediaTypeQuery(HTMLCSSJinjaParser.MediaTypeQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mediaTypeQuery}
	 * labeled alternative in {@link HTMLCSSJinjaParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitMediaTypeQuery(HTMLCSSJinjaParser.MediaTypeQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mediaExprQuery}
	 * labeled alternative in {@link HTMLCSSJinjaParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterMediaExprQuery(HTMLCSSJinjaParser.MediaExprQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mediaExprQuery}
	 * labeled alternative in {@link HTMLCSSJinjaParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitMediaExprQuery(HTMLCSSJinjaParser.MediaExprQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#mediaType}.
	 * @param ctx the parse tree
	 */
	void enterMediaType(HTMLCSSJinjaParser.MediaTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#mediaType}.
	 * @param ctx the parse tree
	 */
	void exitMediaType(HTMLCSSJinjaParser.MediaTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	void enterMediaExpression(HTMLCSSJinjaParser.MediaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	void exitMediaExpression(HTMLCSSJinjaParser.MediaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#mediaFeature}.
	 * @param ctx the parse tree
	 */
	void enterMediaFeature(HTMLCSSJinjaParser.MediaFeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#mediaFeature}.
	 * @param ctx the parse tree
	 */
	void exitMediaFeature(HTMLCSSJinjaParser.MediaFeatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pageRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPageRule(HTMLCSSJinjaParser.PageRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pageRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPageRule(HTMLCSSJinjaParser.PageRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#pseudoPage}.
	 * @param ctx the parse tree
	 */
	void enterPseudoPage(HTMLCSSJinjaParser.PseudoPageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#pseudoPage}.
	 * @param ctx the parse tree
	 */
	void exitPseudoPage(HTMLCSSJinjaParser.PseudoPageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectorGroupRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroupRule(HTMLCSSJinjaParser.SelectorGroupRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectorGroupRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroupRule(HTMLCSSJinjaParser.SelectorGroupRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectorRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelectorRule(HTMLCSSJinjaParser.SelectorRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectorRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelectorRule(HTMLCSSJinjaParser.SelectorRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinator(HTMLCSSJinjaParser.CombinatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinator(HTMLCSSJinjaParser.CombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSeq1}
	 * labeled alternative in {@link HTMLCSSJinjaParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSeq1(HTMLCSSJinjaParser.SimpleSeq1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSeq1}
	 * labeled alternative in {@link HTMLCSSJinjaParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSeq1(HTMLCSSJinjaParser.SimpleSeq1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSeq2}
	 * labeled alternative in {@link HTMLCSSJinjaParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSeq2(HTMLCSSJinjaParser.SimpleSeq2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSeq2}
	 * labeled alternative in {@link HTMLCSSJinjaParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSeq2(HTMLCSSJinjaParser.SimpleSeq2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelector(HTMLCSSJinjaParser.TypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelector(HTMLCSSJinjaParser.TypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	void enterTypeNamespacePrefix(HTMLCSSJinjaParser.TypeNamespacePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	void exitTypeNamespacePrefix(HTMLCSSJinjaParser.TypeNamespacePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#elementName}.
	 * @param ctx the parse tree
	 */
	void enterElementName(HTMLCSSJinjaParser.ElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#elementName}.
	 * @param ctx the parse tree
	 */
	void exitElementName(HTMLCSSJinjaParser.ElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#universal}.
	 * @param ctx the parse tree
	 */
	void enterUniversal(HTMLCSSJinjaParser.UniversalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#universal}.
	 * @param ctx the parse tree
	 */
	void exitUniversal(HTMLCSSJinjaParser.UniversalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(HTMLCSSJinjaParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(HTMLCSSJinjaParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttrib(HTMLCSSJinjaParser.AttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttrib(HTMLCSSJinjaParser.AttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudo(HTMLCSSJinjaParser.PseudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudo(HTMLCSSJinjaParser.PseudoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcPseudo}
	 * labeled alternative in {@link HTMLCSSJinjaParser#functionalPseudo}.
	 * @param ctx the parse tree
	 */
	void enterFuncPseudo(HTMLCSSJinjaParser.FuncPseudoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcPseudo}
	 * labeled alternative in {@link HTMLCSSJinjaParser#functionalPseudo}.
	 * @param ctx the parse tree
	 */
	void exitFuncPseudo(HTMLCSSJinjaParser.FuncPseudoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_expression}.
	 * @param ctx the parse tree
	 */
	void enterCssExpr(HTMLCSSJinjaParser.CssExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssExpr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_expression}.
	 * @param ctx the parse tree
	 */
	void exitCssExpr(HTMLCSSJinjaParser.CssExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(HTMLCSSJinjaParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(HTMLCSSJinjaParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#negationArg}.
	 * @param ctx the parse tree
	 */
	void enterNegationArg(HTMLCSSJinjaParser.NegationArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#negationArg}.
	 * @param ctx the parse tree
	 */
	void exitNegationArg(HTMLCSSJinjaParser.NegationArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link HTMLCSSJinjaParser#operator_}.
	 * @param ctx the parse tree
	 */
	void enterGoodOperator(HTMLCSSJinjaParser.GoodOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link HTMLCSSJinjaParser#operator_}.
	 * @param ctx the parse tree
	 */
	void exitGoodOperator(HTMLCSSJinjaParser.GoodOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link HTMLCSSJinjaParser#operator_}.
	 * @param ctx the parse tree
	 */
	void enterBadOperator(HTMLCSSJinjaParser.BadOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link HTMLCSSJinjaParser#operator_}.
	 * @param ctx the parse tree
	 */
	void exitBadOperator(HTMLCSSJinjaParser.BadOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link HTMLCSSJinjaParser#property_}.
	 * @param ctx the parse tree
	 */
	void enterGoodProperty(HTMLCSSJinjaParser.GoodPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link HTMLCSSJinjaParser#property_}.
	 * @param ctx the parse tree
	 */
	void exitGoodProperty(HTMLCSSJinjaParser.GoodPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link HTMLCSSJinjaParser#property_}.
	 * @param ctx the parse tree
	 */
	void enterBadProperty(HTMLCSSJinjaParser.BadPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link HTMLCSSJinjaParser#property_}.
	 * @param ctx the parse tree
	 */
	void exitBadProperty(HTMLCSSJinjaParser.BadPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterKnownRuleset(HTMLCSSJinjaParser.KnownRulesetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitKnownRuleset(HTMLCSSJinjaParser.KnownRulesetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterUnknownRuleset(HTMLCSSJinjaParser.UnknownRulesetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitUnknownRuleset(HTMLCSSJinjaParser.UnknownRulesetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declList}
	 * labeled alternative in {@link HTMLCSSJinjaParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclList(HTMLCSSJinjaParser.DeclListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declList}
	 * labeled alternative in {@link HTMLCSSJinjaParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclList(HTMLCSSJinjaParser.DeclListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterKnownDeclaration(HTMLCSSJinjaParser.KnownDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitKnownDeclaration(HTMLCSSJinjaParser.KnownDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterUnknownDeclaration(HTMLCSSJinjaParser.UnknownDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitUnknownDeclaration(HTMLCSSJinjaParser.UnknownDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prioRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#prio}.
	 * @param ctx the parse tree
	 */
	void enterPrioRule(HTMLCSSJinjaParser.PrioRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prioRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#prio}.
	 * @param ctx the parse tree
	 */
	void exitPrioRule(HTMLCSSJinjaParser.PrioRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueRule(HTMLCSSJinjaParser.ValueRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueRule(HTMLCSSJinjaParser.ValueRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRule(HTMLCSSJinjaParser.ExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRule(HTMLCSSJinjaParser.ExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link HTMLCSSJinjaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterKnownTerm(HTMLCSSJinjaParser.KnownTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link HTMLCSSJinjaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitKnownTerm(HTMLCSSJinjaParser.KnownTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link HTMLCSSJinjaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterUnknownTerm(HTMLCSSJinjaParser.UnknownTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link HTMLCSSJinjaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitUnknownTerm(HTMLCSSJinjaParser.UnknownTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link HTMLCSSJinjaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBadTerm(HTMLCSSJinjaParser.BadTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link HTMLCSSJinjaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBadTerm(HTMLCSSJinjaParser.BadTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#function_}.
	 * @param ctx the parse tree
	 */
	void enterFuncRule(HTMLCSSJinjaParser.FuncRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#function_}.
	 * @param ctx the parse tree
	 */
	void exitFuncRule(HTMLCSSJinjaParser.FuncRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dxTransform}
	 * labeled alternative in {@link HTMLCSSJinjaParser#dxImageTransform}.
	 * @param ctx the parse tree
	 */
	void enterDxTransform(HTMLCSSJinjaParser.DxTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dxTransform}
	 * labeled alternative in {@link HTMLCSSJinjaParser#dxImageTransform}.
	 * @param ctx the parse tree
	 */
	void exitDxTransform(HTMLCSSJinjaParser.DxTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#hexcolor}.
	 * @param ctx the parse tree
	 */
	void enterHexcolor(HTMLCSSJinjaParser.HexcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#hexcolor}.
	 * @param ctx the parse tree
	 */
	void exitHexcolor(HTMLCSSJinjaParser.HexcolorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssNum}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_number}.
	 * @param ctx the parse tree
	 */
	void enterCssNum(HTMLCSSJinjaParser.CssNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssNum}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_number}.
	 * @param ctx the parse tree
	 */
	void exitCssNum(HTMLCSSJinjaParser.CssNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssPercent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_percentage}.
	 * @param ctx the parse tree
	 */
	void enterCssPercent(HTMLCSSJinjaParser.CssPercentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssPercent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_percentage}.
	 * @param ctx the parse tree
	 */
	void exitCssPercent(HTMLCSSJinjaParser.CssPercentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssDim}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_dimension}.
	 * @param ctx the parse tree
	 */
	void enterCssDim(HTMLCSSJinjaParser.CssDimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssDim}
	 * labeled alternative in {@link HTMLCSSJinjaParser#css_dimension}.
	 * @param ctx the parse tree
	 */
	void exitCssDim(HTMLCSSJinjaParser.CssDimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyIdent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyIdent(HTMLCSSJinjaParser.AnyIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyIdent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyIdent(HTMLCSSJinjaParser.AnyIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyNumber}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyNumber(HTMLCSSJinjaParser.AnyNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyNumber}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyNumber(HTMLCSSJinjaParser.AnyNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyPercent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyPercent(HTMLCSSJinjaParser.AnyPercentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyPercent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyPercent(HTMLCSSJinjaParser.AnyPercentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyDim}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyDim(HTMLCSSJinjaParser.AnyDimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyDim}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyDim(HTMLCSSJinjaParser.AnyDimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyString}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyString(HTMLCSSJinjaParser.AnyStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyString}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyString(HTMLCSSJinjaParser.AnyStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyUrl}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyUrl(HTMLCSSJinjaParser.AnyUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyUrl}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyUrl(HTMLCSSJinjaParser.AnyUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyHash}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyHash(HTMLCSSJinjaParser.AnyHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyHash}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyHash(HTMLCSSJinjaParser.AnyHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyUnicode}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyUnicode(HTMLCSSJinjaParser.AnyUnicodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyUnicode}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyUnicode(HTMLCSSJinjaParser.AnyUnicodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyInclude}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyInclude(HTMLCSSJinjaParser.AnyIncludeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyInclude}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyInclude(HTMLCSSJinjaParser.AnyIncludeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyDashMatch}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyDashMatch(HTMLCSSJinjaParser.AnyDashMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyDashMatch}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyDashMatch(HTMLCSSJinjaParser.AnyDashMatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyColon}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyColon(HTMLCSSJinjaParser.AnyColonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyColon}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyColon(HTMLCSSJinjaParser.AnyColonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyFunc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyFunc(HTMLCSSJinjaParser.AnyFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyFunc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyFunc(HTMLCSSJinjaParser.AnyFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyParen}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyParen(HTMLCSSJinjaParser.AnyParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyParen}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyParen(HTMLCSSJinjaParser.AnyParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyBrackets}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAnyBrackets(HTMLCSSJinjaParser.AnyBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyBrackets}
	 * labeled alternative in {@link HTMLCSSJinjaParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAnyBrackets(HTMLCSSJinjaParser.AnyBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleUnknown}
	 * labeled alternative in {@link HTMLCSSJinjaParser#atRule}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleUnknown(HTMLCSSJinjaParser.AtRuleUnknownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleUnknown}
	 * labeled alternative in {@link HTMLCSSJinjaParser#atRule}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleUnknown(HTMLCSSJinjaParser.AtRuleUnknownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unusedBlock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 */
	void enterUnusedBlock(HTMLCSSJinjaParser.UnusedBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unusedBlock}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 */
	void exitUnusedBlock(HTMLCSSJinjaParser.UnusedBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unusedAt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 */
	void enterUnusedAt(HTMLCSSJinjaParser.UnusedAtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unusedAt}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 */
	void exitUnusedAt(HTMLCSSJinjaParser.UnusedAtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unusedSemi}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 */
	void enterUnusedSemi(HTMLCSSJinjaParser.UnusedSemiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unusedSemi}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 */
	void exitUnusedSemi(HTMLCSSJinjaParser.UnusedSemiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unusedCdo}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 */
	void enterUnusedCdo(HTMLCSSJinjaParser.UnusedCdoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unusedCdo}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 */
	void exitUnusedCdo(HTMLCSSJinjaParser.UnusedCdoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unusedCdc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 */
	void enterUnusedCdc(HTMLCSSJinjaParser.UnusedCdcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unusedCdc}
	 * labeled alternative in {@link HTMLCSSJinjaParser#unused}.
	 * @param ctx the parse tree
	 */
	void exitUnusedCdc(HTMLCSSJinjaParser.UnusedCdcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockRule(HTMLCSSJinjaParser.BlockRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockRule(HTMLCSSJinjaParser.BlockRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestRuleset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestRuleset(HTMLCSSJinjaParser.NestRulesetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestRuleset}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestRuleset(HTMLCSSJinjaParser.NestRulesetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestMedia}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestMedia(HTMLCSSJinjaParser.NestMediaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestMedia}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestMedia(HTMLCSSJinjaParser.NestMediaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestPage}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestPage(HTMLCSSJinjaParser.NestPageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestPage}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestPage(HTMLCSSJinjaParser.NestPageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestFontFace}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestFontFace(HTMLCSSJinjaParser.NestFontFaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestFontFace}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestFontFace(HTMLCSSJinjaParser.NestFontFaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestKeyframes}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestKeyframes(HTMLCSSJinjaParser.NestKeyframesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestKeyframes}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestKeyframes(HTMLCSSJinjaParser.NestKeyframesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestSupports}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestSupports(HTMLCSSJinjaParser.NestSupportsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestSupports}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestSupports(HTMLCSSJinjaParser.NestSupportsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestViewport}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestViewport(HTMLCSSJinjaParser.NestViewportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestViewport}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestViewport(HTMLCSSJinjaParser.NestViewportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestCounter}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestCounter(HTMLCSSJinjaParser.NestCounterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestCounter}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestCounter(HTMLCSSJinjaParser.NestCounterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestFontFeature}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestFontFeature(HTMLCSSJinjaParser.NestFontFeatureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestFontFeature}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestFontFeature(HTMLCSSJinjaParser.NestFontFeatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestAtRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestAtRule(HTMLCSSJinjaParser.NestAtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestAtRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestAtRule(HTMLCSSJinjaParser.NestAtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupBody}
	 * labeled alternative in {@link HTMLCSSJinjaParser#groupRuleBody}.
	 * @param ctx the parse tree
	 */
	void enterGroupBody(HTMLCSSJinjaParser.GroupBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupBody}
	 * labeled alternative in {@link HTMLCSSJinjaParser#groupRuleBody}.
	 * @param ctx the parse tree
	 */
	void exitGroupBody(HTMLCSSJinjaParser.GroupBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code supportsRuleLabel}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsRule}.
	 * @param ctx the parse tree
	 */
	void enterSupportsRuleLabel(HTMLCSSJinjaParser.SupportsRuleLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code supportsRuleLabel}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsRule}.
	 * @param ctx the parse tree
	 */
	void exitSupportsRuleLabel(HTMLCSSJinjaParser.SupportsRuleLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#supportsCondition}.
	 * @param ctx the parse tree
	 */
	void enterSupportsCondition(HTMLCSSJinjaParser.SupportsConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#supportsCondition}.
	 * @param ctx the parse tree
	 */
	void exitSupportsCondition(HTMLCSSJinjaParser.SupportsConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code supportParen}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	void enterSupportParen(HTMLCSSJinjaParser.SupportParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code supportParen}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	void exitSupportParen(HTMLCSSJinjaParser.SupportParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code supportDeclCond}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	void enterSupportDeclCond(HTMLCSSJinjaParser.SupportDeclCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code supportDeclCond}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	void exitSupportDeclCond(HTMLCSSJinjaParser.SupportDeclCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code supportGeneral}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	void enterSupportGeneral(HTMLCSSJinjaParser.SupportGeneralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code supportGeneral}
	 * labeled alternative in {@link HTMLCSSJinjaParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	void exitSupportGeneral(HTMLCSSJinjaParser.SupportGeneralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#supportsNegation}.
	 * @param ctx the parse tree
	 */
	void enterSupportsNegation(HTMLCSSJinjaParser.SupportsNegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#supportsNegation}.
	 * @param ctx the parse tree
	 */
	void exitSupportsNegation(HTMLCSSJinjaParser.SupportsNegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#supportsConjunction}.
	 * @param ctx the parse tree
	 */
	void enterSupportsConjunction(HTMLCSSJinjaParser.SupportsConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#supportsConjunction}.
	 * @param ctx the parse tree
	 */
	void exitSupportsConjunction(HTMLCSSJinjaParser.SupportsConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#supportsDisjunction}.
	 * @param ctx the parse tree
	 */
	void enterSupportsDisjunction(HTMLCSSJinjaParser.SupportsDisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#supportsDisjunction}.
	 * @param ctx the parse tree
	 */
	void exitSupportsDisjunction(HTMLCSSJinjaParser.SupportsDisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 */
	void enterSupportsDeclarationCondition(HTMLCSSJinjaParser.SupportsDeclarationConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 */
	void exitSupportsDeclarationCondition(HTMLCSSJinjaParser.SupportsDeclarationConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generalEnclosedRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#generalEnclosed}.
	 * @param ctx the parse tree
	 */
	void enterGeneralEnclosedRule(HTMLCSSJinjaParser.GeneralEnclosedRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generalEnclosedRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#generalEnclosed}.
	 * @param ctx the parse tree
	 */
	void exitGeneralEnclosedRule(HTMLCSSJinjaParser.GeneralEnclosedRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#var_}.
	 * @param ctx the parse tree
	 */
	void enterVarRule(HTMLCSSJinjaParser.VarRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#var_}.
	 * @param ctx the parse tree
	 */
	void exitVarRule(HTMLCSSJinjaParser.VarRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalcRule(HTMLCSSJinjaParser.CalcRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalcRule(HTMLCSSJinjaParser.CalcRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcSumRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcSum}.
	 * @param ctx the parse tree
	 */
	void enterCalcSumRule(HTMLCSSJinjaParser.CalcSumRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcSumRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcSum}.
	 * @param ctx the parse tree
	 */
	void exitCalcSumRule(HTMLCSSJinjaParser.CalcSumRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcProdRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcProduct}.
	 * @param ctx the parse tree
	 */
	void enterCalcProdRule(HTMLCSSJinjaParser.CalcProdRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcProdRule}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcProduct}.
	 * @param ctx the parse tree
	 */
	void exitCalcProdRule(HTMLCSSJinjaParser.CalcProdRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcValNum}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void enterCalcValNum(HTMLCSSJinjaParser.CalcValNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcValNum}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void exitCalcValNum(HTMLCSSJinjaParser.CalcValNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcValDim}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void enterCalcValDim(HTMLCSSJinjaParser.CalcValDimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcValDim}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void exitCalcValDim(HTMLCSSJinjaParser.CalcValDimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcValPercent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void enterCalcValPercent(HTMLCSSJinjaParser.CalcValPercentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcValPercent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void exitCalcValPercent(HTMLCSSJinjaParser.CalcValPercentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcValParen}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void enterCalcValParen(HTMLCSSJinjaParser.CalcValParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcValParen}
	 * labeled alternative in {@link HTMLCSSJinjaParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void exitCalcValParen(HTMLCSSJinjaParser.CalcValParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fontFaceRuleLabel}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFaceRule}.
	 * @param ctx the parse tree
	 */
	void enterFontFaceRuleLabel(HTMLCSSJinjaParser.FontFaceRuleLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fontFaceRuleLabel}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFaceRule}.
	 * @param ctx the parse tree
	 */
	void exitFontFaceRuleLabel(HTMLCSSJinjaParser.FontFaceRuleLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterKnownFontFaceDeclaration(HTMLCSSJinjaParser.KnownFontFaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitKnownFontFaceDeclaration(HTMLCSSJinjaParser.KnownFontFaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUnknownFontFaceDeclaration(HTMLCSSJinjaParser.UnknownFontFaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUnknownFontFaceDeclaration(HTMLCSSJinjaParser.UnknownFontFaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	void enterKeyframesRule(HTMLCSSJinjaParser.KeyframesRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	void exitKeyframesRule(HTMLCSSJinjaParser.KeyframesRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#keyframeBlock}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeBlock(HTMLCSSJinjaParser.KeyframeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#keyframeBlock}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeBlock(HTMLCSSJinjaParser.KeyframeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeSelector(HTMLCSSJinjaParser.KeyframeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeSelector(HTMLCSSJinjaParser.KeyframeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#viewport}.
	 * @param ctx the parse tree
	 */
	void enterViewport(HTMLCSSJinjaParser.ViewportContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#viewport}.
	 * @param ctx the parse tree
	 */
	void exitViewport(HTMLCSSJinjaParser.ViewportContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#counterStyle}.
	 * @param ctx the parse tree
	 */
	void enterCounterStyle(HTMLCSSJinjaParser.CounterStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#counterStyle}.
	 * @param ctx the parse tree
	 */
	void exitCounterStyle(HTMLCSSJinjaParser.CounterStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 */
	void enterFontFeatureValuesRule(HTMLCSSJinjaParser.FontFeatureValuesRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 */
	void exitFontFeatureValuesRule(HTMLCSSJinjaParser.FontFeatureValuesRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ffNameList}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 */
	void enterFfNameList(HTMLCSSJinjaParser.FfNameListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ffNameList}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 */
	void exitFfNameList(HTMLCSSJinjaParser.FfNameListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ffNameStr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFamilyName}.
	 * @param ctx the parse tree
	 */
	void enterFfNameStr(HTMLCSSJinjaParser.FfNameStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ffNameStr}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFamilyName}.
	 * @param ctx the parse tree
	 */
	void exitFfNameStr(HTMLCSSJinjaParser.FfNameStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ffNameIdent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFamilyName}.
	 * @param ctx the parse tree
	 */
	void enterFfNameIdent(HTMLCSSJinjaParser.FfNameIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ffNameIdent}
	 * labeled alternative in {@link HTMLCSSJinjaParser#fontFamilyName}.
	 * @param ctx the parse tree
	 */
	void exitFfNameIdent(HTMLCSSJinjaParser.FfNameIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#featureValueBlock}.
	 * @param ctx the parse tree
	 */
	void enterFeatureValueBlock(HTMLCSSJinjaParser.FeatureValueBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#featureValueBlock}.
	 * @param ctx the parse tree
	 */
	void exitFeatureValueBlock(HTMLCSSJinjaParser.FeatureValueBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#featureType}.
	 * @param ctx the parse tree
	 */
	void enterFeatureType(HTMLCSSJinjaParser.FeatureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#featureType}.
	 * @param ctx the parse tree
	 */
	void exitFeatureType(HTMLCSSJinjaParser.FeatureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#featureValueDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFeatureValueDefinition(HTMLCSSJinjaParser.FeatureValueDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#featureValueDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFeatureValueDefinition(HTMLCSSJinjaParser.FeatureValueDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#css_ident}.
	 * @param ctx the parse tree
	 */
	void enterCss_ident(HTMLCSSJinjaParser.Css_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#css_ident}.
	 * @param ctx the parse tree
	 */
	void exitCss_ident(HTMLCSSJinjaParser.Css_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#css_ws}.
	 * @param ctx the parse tree
	 */
	void enterCss_ws(HTMLCSSJinjaParser.Css_wsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#css_ws}.
	 * @param ctx the parse tree
	 */
	void exitCss_ws(HTMLCSSJinjaParser.Css_wsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLCSSJinjaParser#css_url}.
	 * @param ctx the parse tree
	 */
	void enterCss_url(HTMLCSSJinjaParser.Css_urlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLCSSJinjaParser#css_url}.
	 * @param ctx the parse tree
	 */
	void exitCss_url(HTMLCSSJinjaParser.Css_urlContext ctx);
}