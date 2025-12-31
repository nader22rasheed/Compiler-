package Visitor;



import AST.ASTnode;
import AST.CSS.*;
import antlr.HTMLCSSJinjaParser;
import antlr.HTMLCSSJinjaParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;


public class CSSASTVisitor extends HTMLCSSJinjaParserBaseVisitor<ASTnode> {


//    @Override
//    public ASTnode visitStylesheetRule(HTMLCSSJinjaParser.StylesheetRuleContext ctx) {
//        StylesheetNode node = new StylesheetNode(ctx.getStart().getLine());
//
//        for (var c : ctx.children) {
//            ASTnode child = (ASTnode) visit(c);
//            if (child != null)
//                node.addChild(child);
//        }
//        return node;
//    }

    @Override
    public ASTnode visitGoodCharset(HTMLCSSJinjaParser.GoodCharsetContext ctx) {
        return new CharsetNode(
                ctx.getStart().getLine(),
                ctx.getText(),
                true
        );
    }

    @Override
    public ASTnode visitBadCharset(HTMLCSSJinjaParser.BadCharsetContext ctx) {
        return new CharsetNode(
                ctx.getStart().getLine(),
                ctx.getText(),
                false
        );
    }

    @Override
    public ASTnode visitAnyIdent(HTMLCSSJinjaParser.AnyIdentContext ctx) {
        return new AnyNode(
                ctx.getStart().getLine(),
                ctx.getText(),
                "AnyNode"
        );
    }

    @Override
    public ASTnode visitAnyNumber(HTMLCSSJinjaParser.AnyNumberContext ctx) {
        return new AnyNode(
                ctx.getStart().getLine(),
                ctx.getText(),
                "AnyNode"
        );
    }

    @Override
    public ASTnode visitCalcRule(HTMLCSSJinjaParser.CalcRuleContext ctx) {
        CalcSumNode sum = null;

        if (ctx.calcSum() != null) {
            sum = (CalcSumNode) visit(ctx.calcSum());
        }

        return new CalcNode(
                ctx.getStart().getLine(),
                sum
        );
    }
    @Override
    public ASTnode visitCalcProdRule(HTMLCSSJinjaParser.CalcProdRuleContext ctx) {
        CalcProductNode node = new CalcProductNode(ctx.getStart().getLine());

        CalcValueNode firstVal = (CalcValueNode) visit(ctx.calcValue(0));
        node.addValue(firstVal, null);

        int valueIndex = 1;

        for (var child : ctx.children) {
            String text = child.getText();

            if (text.equals("*") || text.equals("/")) {
                CalcValueNode val = (CalcValueNode) visit(ctx.calcValue(valueIndex));
                node.addValue(val, text);
                valueIndex++;
            }
        }

        return node;
    }

    @Override
    public ASTnode visitCalcSumRule(HTMLCSSJinjaParser.CalcSumRuleContext ctx) {
        CalcSumNode node = new CalcSumNode(ctx.getStart().getLine());

        CalcProductNode firstProd = (CalcProductNode) visit(ctx.calcProduct(0));
        node.addProduct(firstProd, null);

        int prodIndex = 1;

        for (var child : ctx.children) {
            String text = child.getText();

            if (text.equals("+") || text.equals("-")) {
                CalcProductNode prod = (CalcProductNode) visit(ctx.calcProduct(prodIndex));
                node.addProduct(prod, text);
                prodIndex++;
            }
        }

        return node;
    }

    @Override
    public ASTnode visitCalcValNum(HTMLCSSJinjaParser.CalcValNumContext ctx) {
        return new CalcValueNode(
                ctx.getStart().getLine(),
                ctx.getText().trim()
        );
    }
    @Override
    public ASTnode visitCalcValDim(HTMLCSSJinjaParser.CalcValDimContext ctx) {
        return new CalcValueNode(
                ctx.getStart().getLine(),
                ctx.getText().trim()
        );
    }
    @Override
    public ASTnode visitCalcValPercent(HTMLCSSJinjaParser.CalcValPercentContext ctx) {
        return new CalcValueNode(
                ctx.getStart().getLine(),
                ctx.getText().trim()
        );
    }
    @Override
    public ASTnode visitCalcValParen(HTMLCSSJinjaParser.CalcValParenContext ctx) {
        CalcSumNode inner = (CalcSumNode) visit(ctx.calcSum());

        return new CalcValueNode(
                ctx.getStart().getLine(),
                inner
        );
    }
//    @Override
//    public ASTnode visitClassSelectorRule(HTMLCSSJinjaParser.ClassSelectorRuleContext ctx) {
//        String className = ctx.getText().substring(1); // نشيل '.'
//
//        return new ClassSelectorNode(
//                ctx.getStart().getLine(),
//                className
//        );
//    }
//@Override
//public ASTnode visitClassSelectorRule(HTMLCSSJinjaParser.ClassSelectorRuleContext ctx) {
//    return new ClassSelectorNode(
//            ctx.getStart().getLine(),
//            ctx.css_ident().getText()
//    );
//}
//@Override
//public ASTnode visitCombinator(HTMLCSSJinjaParser.CombinatorContext ctx) {
//
//    CombinatorNode.Type type;
//
//    if (ctx.CSS_Greater() != null) {
//        type = CombinatorNode.Type.CHILD;                 // >
//    } else if (ctx.CSS_Plus() != null) {
//        type = CombinatorNode.Type.ADJACENT_SIBLING;       // +
//    } else if (ctx.CSS_Tilde() != null) {
//        type = CombinatorNode.Type.GENERAL_SIBLING;        // ~
//    } else if (ctx.CSS_Pipe() != null) {
//        type = CombinatorNode.Type.COLUMN;                 // ||
//    } else {
//        type = CombinatorNode.Type.DESCENDANT;             // space
//    }
//
//    return new CombinatorNode(
//            ctx.getStart().getLine(),
//            type
//    );
//}

//    @Override
//    public ASTnode visitDeclList(HTMLCSSJinjaParser.DeclListContext ctx) {
//        DeclarationListNode node =
//                new DeclarationListNode(ctx.getStart().getLine());
//
//        for (var declCtx : ctx.declaration()) {
//            DeclarationNode decl = (DeclarationNode) visit(declCtx);
//            if (decl != null) {
//                node.addDeclaration(decl);
//            }
//        }
//
//        return node;
//    }
//@Override
//public ASTnode visitKnownDeclaration(HTMLCSSJinjaParser.KnownDeclarationContext ctx) {
//    String prop = ctx.property_().getText();
//    ExprNode expr = (ExprNode) visit(ctx.expr());
//    boolean important = ctx.prio() != null;
//
//    return new DeclarationNode(
//            ctx.getStart().getLine(),
//            prop,
//            expr,
//            important
//    );
//}
//@Override
//public ASTnode visitUnknownDeclaration(HTMLCSSJinjaParser.UnknownDeclarationContext ctx) {
//    String prop = ctx.property_().getText();
//    ExprNode expr = (ExprNode) visit(ctx.value());
//    boolean important = false;
//
//    return new DeclarationNode(
//            ctx.getStart().getLine(),
//            prop,
//            expr,
//            important
//    );
//}
//@Override
//public ASTnode visitExprRule(HTMLCSSJinjaParser.ExprRuleContext ctx) {
//    ExprNode node = new ExprNode(ctx.getStart().getLine());
//
//    TermNode firstTerm = (TermNode) visit(ctx.term(0));
//    node.terms.add(firstTerm);
//    node.addChild(firstTerm);
//
//    int termIndex = 1;
//
//    for (var child : ctx.children) {
//        String text = child.getText();
//
//        if (text.equals("+") || text.equals("-") || text.equals("/") || text.equals("*")) {
//            OperatorNode op = new OperatorNode(ctx.getStart().getLine(), text);
//            node.operators.add(op);
//            node.addChild(op);
//
//            if (termIndex < ctx.term().size()) {
//                TermNode t = (TermNode) visit(ctx.term(termIndex));
//                node.terms.add(t);
//                node.addChild(t);
//                termIndex++;
//            }
//        }
//    }
//
//    return node;
//}
@Override
public ASTnode visitKnownFontFaceDeclaration(HTMLCSSJinjaParser.KnownFontFaceDeclarationContext ctx) {
    String prop = ctx.property_().getText();
    ASTnode val = (ASTnode) visit(ctx.expr());

    return new FontFaceDeclarationNode(
            ctx.getStart().getLine(),
            prop,
            val,
            true
    );
}
    @Override
    public ASTnode visitUnknownFontFaceDeclaration(HTMLCSSJinjaParser.UnknownFontFaceDeclarationContext ctx) {
        String prop = ctx.property_().getText();
        ASTnode val = (ASTnode) visit(ctx.value());

        return new FontFaceDeclarationNode(
                ctx.getStart().getLine(),
                prop,
                val,
                false
        );
    }
    @Override
    public ASTnode visitFontFaceRuleLabel(
            HTMLCSSJinjaParser.FontFaceRuleLabelContext ctx) {

        FontFaceNode node = new FontFaceNode(ctx.getStart().getLine());

        for (var declCtx : ctx.fontFaceDeclaration()) {
            FontFaceDeclarationNode decl =
                    (FontFaceDeclarationNode) visit(declCtx);

            if (decl != null) {
                node.declarations.add(decl);
                node.addChild(decl);
            }
        }

        return node;
    }
    @Override
    public ASTnode visitFuncRule(HTMLCSSJinjaParser.FuncRuleContext ctx) {
        String name = ctx.CSS_Function_().getText();

        // إزالة "(" من اسم الدالة إذا موجود
        if (name.endsWith("(")) {
            name = name.substring(0, name.length() - 1);
        }

        ASTnode args = (ASTnode) visit(ctx.expr());

        return new FunctionNode(
                ctx.getStart().getLine(),
                name,
                args
        );
    }
    @Override
    public ASTnode visitGroupBody(HTMLCSSJinjaParser.GroupBodyContext ctx) {
        GroupRuleBodyNode node =
                new GroupRuleBodyNode(ctx.getStart().getLine());

        for (var nestedCtx : ctx.nestedStatement()) {
            NeastedStatementNode stmt =
                    (NeastedStatementNode) visit(nestedCtx);

            if (stmt != null) {
                node.addRule(stmt);
            }
        }

        return node;
    }
    @Override
    public ASTnode visitSimpleSeq2(HTMLCSSJinjaParser.SimpleSeq2Context ctx) {
        SimpleSelectorSequenceNode node =
                new SimpleSelectorSequenceNode(ctx.getStart().getLine());

        for (var child : ctx.children) {

            // ID selector
            if (child instanceof TerminalNode t &&
                    t.getSymbol().getType() == HTMLCSSJinjaParser.CSS_Hash) {

                String id = t.getText().substring(1); // إزالة #
                node.addChild(new IdSelectorNode(
                        ctx.getStart().getLine(),
                        id
                ));
            }

            // باقي الأنواع
            else {
                ASTnode sel = (ASTnode) visit(child);
                if (sel != null) {
                    node.addChild(sel);
                }
            }
        }

        return node;
    }
    @Override
    public ASTnode visitGoodImport(HTMLCSSJinjaParser.GoodImportContext ctx) {

        String url = null;
        MediaQueryListNode media = null;

        // URL أو String
        if (ctx.CSS_String_() != null) {
            url = ctx.CSS_String_().getText();
        } else if (ctx.css_url() != null) {
            url = ctx.css_url().getText();
        }

        // mediaQueryList (اختياري)
        if (ctx.mediaQueryList() != null) {
            media = (MediaQueryListNode) visit(ctx.mediaQueryList());
        }

        return new ImportNode(
                ctx.getStart().getLine(),
                url,
                media,
                true
        );
    }
    @Override
    public ASTnode visitBadImport(HTMLCSSJinjaParser.BadImportContext ctx) {

        String url = null;
        MediaQueryListNode media = null;

        if (ctx.CSS_String_() != null) {
            url = ctx.CSS_String_().getText();
        } else if (ctx.css_url() != null) {
            url = ctx.css_url().getText();
        }

        if (ctx.mediaQueryList() != null) {
            media = (MediaQueryListNode) visit(ctx.mediaQueryList());
        }

        return new ImportNode(
                ctx.getStart().getLine(),
                url,
                media,
                false
        );
    }
    @Override
    public ASTnode visitKeyframeBlock(
            HTMLCSSJinjaParser.KeyframeBlockContext ctx) {

        DeclarationListNode decls = null;
        if (ctx.declarationList() != null) {
            decls = (DeclarationListNode) visit(ctx.declarationList());
        }

        KeyframeBlockNode node =
                new KeyframeBlockNode(ctx.getStart().getLine(), decls);

        // جمع المفاتيح: from / to / percentage
        for (var child : ctx.keyframeSelector().children) {

            if (child instanceof TerminalNode t) {
                int type = t.getSymbol().getType();

                if (type == HTMLCSSJinjaParser.CSS_From ||
                        type == HTMLCSSJinjaParser.CSS_To ||
                        type == HTMLCSSJinjaParser.CSS_Percentage) {

                    node.addKey(t.getText());
                }
            }
        }

        return node;
    }
    @Override
    public ASTnode visitKeyframesRule(
            HTMLCSSJinjaParser.KeyframesRuleContext ctx) {

        String name = ctx.css_ident().getText();

        KeyframesNode node =
                new KeyframesNode(ctx.getStart().getLine(), name);

        for (var blockCtx : ctx.keyframeBlock()) {
            KeyframeBlockNode block =
                    (KeyframeBlockNode) visit(blockCtx);

            if (block != null) {
                node.addBlock(block);
            }
        }

        return node;
    }
//    @Override
//    public ASTnode visitLayerRuleLabel(
//            HTMLCSSJinjaParser.LayerRuleLabelContext ctx) {
//
//        LayerNode node =
//                new LayerNode(ctx.getStart().getLine());
//
//        // أسماء layers
//        for (var id : ctx.css_ident()) {
//            node.names.add(id.getText());
//        }
//
//        // body اختياري
//        if (ctx.groupRuleBody() != null) {
//            GroupRuleBodyNode body =
//                    (GroupRuleBodyNode) visit(ctx.groupRuleBody());
//            node.body = body;
//            node.addChild(body);
//        }
//
//        return node;
//    }

    @Override
    public ASTnode visitMediaExpression(
            HTMLCSSJinjaParser.MediaExpressionContext ctx) {

        String feature = ctx.mediaFeature().getText();
        String expr = null;

        if (ctx.expr() != null) {
            expr = ctx.expr().getText();
        }

        return new MediaExpressionNode(
                ctx.getStart().getLine(),
                feature,
                expr
        );
    }
    @Override
    public ASTnode visitMediaRule(HTMLCSSJinjaParser.MediaRuleContext ctx) {

        MediaQueryListNode queries = null;
        GroupRuleBodyNode body = null;

        if (ctx.mediaQueryList() != null) {
            queries = (MediaQueryListNode) visit(ctx.mediaQueryList());
        }

        if (ctx.groupRuleBody() != null) {
            body = (GroupRuleBodyNode) visit(ctx.groupRuleBody());
        }

        return new MediaNode(
                ctx.getStart().getLine(),
                queries,
                body
        );
    }

//    @Override
//    public ASTnode visitMedia(
//            HTMLCSSJinjaParser.MediaContext ctx) {
//
//        MediaQueryListNode node =
//                new MediaQueryListNode(ctx.getStart().getLine());
//
//        for (var child : ctx.children) {
//            ASTnode q = (ASTnode) visit(child);
//            if (q instanceof MediaQueryNode) {
//                node.addQuery((MediaQueryNode) q);
//            }
//        }
//
//        return node;
//    }

//    @Override
//    public ASTnode visitMedia(
//            HTMLCSSJinjaParser.MediaContext ctx) {
//
//        MediaQueryListNode node =
//                new MediaQueryListNode(ctx.getStart().getLine());
//
//        for (var child : ctx.children) {
//            Object v = visit(child);
//
//            if (v instanceof MediaQueryNode) {
//                node.addQuery((MediaQueryNode) v);
//            }
//        }
//
//        return node;
//    }

    @Override
    public ASTnode visitGoodNamespace(
            HTMLCSSJinjaParser.GoodNamespaceContext ctx) {

        String prefix = null;
        String url = null;

        for (var child : ctx.children) {

            if (child instanceof HTMLCSSJinjaParser.NamespacePrefixContext) {
                prefix = child.getText();
            }

            if (child instanceof org.antlr.v4.runtime.tree.TerminalNode t) {
                int type = t.getSymbol().getType();

                if (type == HTMLCSSJinjaParser.CSS_String_
                        || type == HTMLCSSJinjaParser.CSS_Url_) {
                    url = t.getText();
                }
            }
        }

        return new NamespaceNode(
                ctx.getStart().getLine(),
                prefix,
                url,
                true
        );
    }


//    @Override
//    public ASTnode visitBadNamespace(
//            HTMLCSSJinjaParser.BadNamespaceContext ctx) {
//
//        return new NamespaceNode(
//                ctx.getStart().getLine(),
//                null,
//                ctx.getText(),
//                false
//        );
//    }
//
//
//    public ASTnode visitGoodNamespace(
//            HTMLCSSJinjaParser.GoodNamespaceContext ctx) {
//
//        String prefix = null;
//        String url = null;
//
//        if (ctx.css_ident() != null) {
//            prefix = ctx.css_ident().getText();
//        }
//
//        if (ctx.CSS_String() != null) {
//            url = ctx.CSS_String().getText();
//        } else if (ctx.CSS_Url() != null) {
//            url = ctx.CSS_Url().getText();
//        }
//
//        return new NamespaceNode(
//                ctx.getStart().getLine(),
//                prefix,
//                url,
//                true
//        );
//    }
@Override
public ASTnode visitPseudoPage(HTMLCSSJinjaParser.PseudoPageContext ctx) {

    String name = ctx.css_ident().getText();

    return new PseudoPageNode(
            ctx.getStart().getLine(),
            name
    );
}


    @Override
    public ASTnode visitKnownRuleset(HTMLCSSJinjaParser.KnownRulesetContext ctx) {

        SelectorListNode selectors =
                (SelectorListNode) visit(ctx.selectorGroup());

        DeclarationListNode declarations = null;
        if (ctx.declarationList() != null) {
            declarations = (DeclarationListNode) visit(ctx.declarationList());
        }

        return new RulesetNode(
                ctx.getStart().getLine(),
                selectors,
                declarations
        );
    }

    @Override
    public ASTnode visitUnknownRuleset(HTMLCSSJinjaParser.UnknownRulesetContext ctx) {

        DeclarationListNode declarations = null;
        if (ctx.declarationList() != null) {
            declarations = (DeclarationListNode) visit(ctx.declarationList());
        }

        return new RulesetNode(
                ctx.getStart().getLine(),
                null,   // ما عندو selectors معروفين
                declarations
        );
    }
    @Override
    public ASTnode visitSelectorGroupRule(HTMLCSSJinjaParser.SelectorGroupRuleContext ctx) {

        SelectorListNode list =
                new SelectorListNode(ctx.getStart().getLine());

        // أول selector
        list.addSelector(
                (SelectorNode) visit(ctx.selector(0))
        );

        // باقي selectors بعد الفواصل
        for (int i = 1; i < ctx.selector().size(); i++) {
            list.addSelector(
                    (SelectorNode) visit(ctx.selector(i))
            );
        }

        return list;
    }
    @Override
    public ASTnode visitSelectorRule(HTMLCSSJinjaParser.SelectorRuleContext ctx) {

        SelectorNode selector =
                new SelectorNode(ctx.getStart().getLine());

        // أول simpleSelectorSequence (بدون combinator)
        SimpleSelectorSequenceNode firstSeq =
                (SimpleSelectorSequenceNode) visit(ctx.simpleSelectorSequence(0));

        selector.addSequence(firstSeq, null);

        // باقي sequences مع combinators
        int seqIndex = 1;
        for (int i = 0; i < ctx.combinator().size(); i++) {

            CombinatorNode comb =
                    (CombinatorNode) visit(ctx.combinator(i));

            SimpleSelectorSequenceNode seq =
                    (SimpleSelectorSequenceNode) visit(
                            ctx.simpleSelectorSequence(seqIndex)
                    );

            selector.addSequence(seq, comb);
            seqIndex++;
        }

        return selector;
    }

    @Override
    public ASTnode visitSimpleSeq1(HTMLCSSJinjaParser.SimpleSeq1Context ctx) {

        SimpleSelectorSequenceNode seq =
                new SimpleSelectorSequenceNode(ctx.getStart().getLine());

        // typeSelector أو universal
        if (ctx.typeSelector() != null) {
            seq.add((SimpleSelectorNode) visit(ctx.typeSelector()));
        } else if (ctx.universal() != null) {
            seq.add((SimpleSelectorNode) visit(ctx.universal()));
        }

        // باقي الـ selectors
        for (var child : ctx.children) {
            ASTnode n = (ASTnode) visit(child);
            if (n instanceof SimpleSelectorNode) {
                seq.add((SimpleSelectorNode) n);
            }
        }

        return seq;
    }
//    @Override
//    public ASTnode visitSimpleSeq2(HTMLCSSJinjaParser.SimpleSeq2Context ctx) {
//
//        SimpleSelectorSequenceNode seq =
//                new SimpleSelectorSequenceNode(ctx.getStart().getLine());
//
//        for (var child : ctx.children) {
//            ASTnode n = (ASTnode) visit(child);
//            if (n instanceof SimpleSelectorNode) {
//                seq.add((SimpleSelectorNode) n);
//            }
//        }
//
//        return seq;
//    }


    @Override
    public ASTnode visitStylesheetRule(HTMLCSSJinjaParser.StylesheetRuleContext ctx) {

        StylesheetNode sheet =
                new StylesheetNode(ctx.getStart().getLine());

        for (var child : ctx.children) {

            ASTnode n = (ASTnode) visit(child);

            if (n == null) continue;

            if (n instanceof CharsetNode) {
                sheet.setCharset((CharsetNode) n);
            }
            else if (n instanceof ImportNode) {
                sheet.addImport((ImportNode) n);
            }
            else if (n instanceof NamespaceNode) {
                sheet.addNamespace((NamespaceNode) n);
            }
            else if (n instanceof NeastedStatementNode) {
                sheet.addRule((NeastedStatementNode) n);
            }
        }

        return sheet;
    }


// -------------------- TERM --------------------

    @Override
    public ASTnode visitKnownTerm(HTMLCSSJinjaParser.KnownTermContext ctx) {
        String value = ctx.getText();
        int line = ctx.getStart().getLine();
        return new TermNode(line, value, true);
    }

    @Override
    public ASTnode visitUnknownTerm(HTMLCSSJinjaParser.UnknownTermContext ctx) {
        String value = ctx.getText();
        int line = ctx.getStart().getLine();
        return new TermNode(line, value, false);
    }

    @Override
    public ASTnode visitBadTerm(HTMLCSSJinjaParser.BadTermContext ctx) {
        String value = ctx.getText();
        int line = ctx.getStart().getLine();
        return new TermNode(line, value, false);
    }
// -------------------- TYPE SELECTOR --------------------

    @Override
    public ASTnode visitTypeSelector(HTMLCSSJinjaParser.TypeSelectorContext ctx) {
        int line = ctx.getStart().getLine();

        String namespace = null;
        String name;

        // element name (إجباري)
        name = ctx.elementName().getText();

        // namespace (اختياري)
        if (ctx.typeNamespacePrefix() != null) {
            String nsText = ctx.typeNamespacePrefix().getText();

            // نشيل الـ |
            namespace = nsText.substring(0, nsText.length() - 1);
        }

        return new TypeSelectorNode(line, namespace, name);
    }
// -------------------- UNUSED --------------------

    @Override
    public ASTnode visitUnusedBlock(HTMLCSSJinjaParser.UnusedBlockContext ctx) {
        int line = ctx.getStart().getLine();
        ASTnode block = (ASTnode) visit(ctx.block());
        return new UnusedNode(line, block);
    }

    @Override
    public ASTnode visitUnusedAt(HTMLCSSJinjaParser.UnusedAtContext ctx) {
        int line = ctx.getStart().getLine();
        String text = ctx.CSS_AtKeyword().getText();
        return new UnusedNode(line, new ASTnode("atKeyword", line) {
            @Override
            public void print(int indent) {
                System.out.println(" ".repeat(indent) + nodeName + ": " + text);
            }
        });
    }

    @Override
    public ASTnode visitUnusedSemi(HTMLCSSJinjaParser.UnusedSemiContext ctx) {
        int line = ctx.getStart().getLine();
        return new UnusedNode(line, new ASTnode("semicolon", line) {
            @Override
            public void print(int indent) {
                System.out.println(" ".repeat(indent) + nodeName + ";");
            }
        });
    }

    @Override
    public ASTnode visitUnusedCdo(HTMLCSSJinjaParser.UnusedCdoContext ctx) {
        int line = ctx.getStart().getLine();
        return new UnusedNode(line, new ASTnode("cdo", line) {
            @Override
            public void print(int indent) {
                System.out.println(" ".repeat(indent) + nodeName + ": <!--");
            }
        });
    }

    @Override
    public ASTnode visitUnusedCdc(HTMLCSSJinjaParser.UnusedCdcContext ctx) {
        int line = ctx.getStart().getLine();
        return new UnusedNode(line, new ASTnode("cdc", line) {
            @Override
            public void print(int indent) {
                System.out.println(" ".repeat(indent) + nodeName + ": -->");
            }
        });
    }

// -------------------- VAR --------------------

    @Override
    public ASTnode visitVarRule(HTMLCSSJinjaParser.VarRuleContext ctx) {
        int line = ctx.getStart().getLine();

        // اسم المتغير (مثل --main-color)
        String name = ctx.CSS_Variable().getText();

        return new VarNode(line, name);
    }

}

