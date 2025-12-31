package Visitor;

import AST.ASTnode;
import AST.Flask.*;
import antlr.FlaskParser;
import antlr.FlaskParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

public class FlaskASTVisitor extends FlaskParserBaseVisitor<ASTnode> {

    @Override
    public ASTnode visitFile_input(FlaskParser.File_inputContext ctx) {
        ProgramNode node = new ProgramNode(ctx.getStart().getLine());
        for (var stmtCtx : ctx.stmt()) {
            ASTnode stmtNode = visit(stmtCtx);
            if (stmtNode != null) node.addChild(stmtNode);
        }
        return node;
    }

    @Override
    public ASTnode visitExpr_stmt(FlaskParser.Expr_stmtContext ctx) {
        AssignNode node = new AssignNode(ctx.getStart().getLine());
        ASTnode target = visit(ctx.testlist_star_expr(0));
        node.addChild(target);
        if (ctx.testlist_star_expr().size() > 1) {
            ASTnode value = visit(ctx.testlist_star_expr(1));
            node.addChild(value);
        }
        return node;
    }

    @Override
    public ASTnode visitReturn_stmt(FlaskParser.Return_stmtContext ctx) {
        ReturnNode node = new ReturnNode(ctx.getStart().getLine());
        if (ctx.testlist() != null) node.addChild(visit(ctx.testlist()));
        return node;
    }

    @Override
    public ASTnode visitPass_stmt(FlaskParser.Pass_stmtContext ctx) {
        return new ASTnode("Pass", ctx.getStart().getLine()) {
            @Override
            public void print(int indent) {

            }
        };
    }

    @Override
    public ASTnode visitBreak_stmt(FlaskParser.Break_stmtContext ctx) {
        return new ASTnode("Break", ctx.getStart().getLine()) {
            @Override
            public void print(int indent) {

            }
        };
    }

    @Override
    public ASTnode visitContinue_stmt(FlaskParser.Continue_stmtContext ctx) {
        return new ASTnode("Continue", ctx.getStart().getLine()) {
            @Override
            public void print(int indent) {

            }
        };
    }

    @Override
    public ASTnode visitIf_stmt(FlaskParser.If_stmtContext ctx) {
        IfNode node = new IfNode(ctx.getStart().getLine());
        node.addChild(visit(ctx.test(0)));
        node.addChild(visit(ctx.block(0)));
        for (int i = 1; i < ctx.test().size(); i++) {
            node.addChild(visit(ctx.test(i)));
            node.addChild(visit(ctx.block(i)));
        }
        if (ctx.ELSE() != null) {
            node.addChild(visit(ctx.block(ctx.block().size() - 1)));
        }
        return node;
    }

    @Override
    public ASTnode visitWhile_stmt(FlaskParser.While_stmtContext ctx) {
        WhileNode node = new WhileNode(ctx.getStart().getLine());
        node.addChild(visit(ctx.test()));
        node.addChild(visit((ParseTree) ctx.block()));
        return node;
    }

    @Override
    public ASTnode visitFor_stmt(FlaskParser.For_stmtContext ctx) {
        ForNode node = new ForNode(ctx.getStart().getLine());
        node.addChild(visit(ctx.exprlist()));
        node.addChild(visit(ctx.testlist()));
        node.addChild(visit((ParseTree) ctx.block()));
        return node;
    }

    @Override
    public ASTnode visitFuncdef(FlaskParser.FuncdefContext ctx) {
        FunctionDefNode node = new FunctionDefNode(ctx.name().getText(), false, ctx.getStart().getLine());
        node.addChild(visit(ctx.parameters()));
        if (ctx.test() != null) node.addChild(visit(ctx.test()));
        node.addChild(visit(ctx.block()));
        return node;
    }

    @Override
    public ASTnode visitAsync_funcdef(FlaskParser.Async_funcdefContext ctx) {
        FunctionDefNode node = new FunctionDefNode(ctx.funcdef().name().getText(), true, ctx.getStart().getLine());
        node.addChild(visit(ctx.funcdef().parameters()));
        if (ctx.funcdef().test() != null) node.addChild(visit(ctx.funcdef().test()));
        node.addChild(visit(ctx.funcdef().block()));
        return node;
    }

    @Override
    public ASTnode visitParameters(FlaskParser.ParametersContext ctx) {
        ASTnode node = new ASTnode("Parameters", ctx.getStart().getLine()) {
            @Override
            public void print(int indent) {

            }
        };
        if (ctx.typedargslist() != null) node.addChild(visit(ctx.typedargslist()));
        return node;
    }

    @Override
    public ASTnode visitTypedargslist(FlaskParser.TypedargslistContext ctx) {
        ASTnode node = new ASTnode("TypedArgsList", ctx.getStart().getLine()) {
            @Override
            public void print(int indent) {

            }
        };
        for (var t : ctx.tfpdef()) node.addChild(visit(t));
        return node;
    }

    @Override
    public ASTnode visitTfpdef(FlaskParser.TfpdefContext ctx) {
        ASTnode node = new ASTnode("Arg", ctx.getStart().getLine()) {
            @Override
            public void print(int indent) {

            }
        };
        node.addChild(new LiteralNode(ctx.name().getText(), ctx.getStart().getLine()));
        if (ctx.test() != null) node.addChild(visit(ctx.test()));
        return node;
    }

    // -------------------- Expressions --------------------
    @Override
    public ASTnode visitTest(FlaskParser.TestContext ctx) {
        if (ctx.IF() != null) {
            ASTnode node = new ASTnode("IfExpr", ctx.getStart().getLine()) {
                @Override
                public void print(int indent) {

                }
            };
            node.addChild(visit(ctx.or_test(0)));
            node.addChild(visit(ctx.test(0)));
            node.addChild(visit(ctx.test(1)));
            return node;
        } else if (ctx.lambdef() != null) {
            return visit(ctx.lambdef());
        } else {
            return visit(ctx.or_test(0));
        }
    }

    @Override
    public ASTnode visitOr_test(FlaskParser.Or_testContext ctx) {
        if (ctx.and_test().size() == 1) return visit(ctx.and_test(0));
        ASTnode node = new ASTnode("Or", ctx.getStart().getLine()) {
            @Override
            public void print(int indent) {

            }
        };
        for (var child : ctx.and_test()) node.addChild(visit(child));
        return node;
    }

    @Override
    public ASTnode visitAnd_test(FlaskParser.And_testContext ctx) {
        if (ctx.not_test().size() == 1) return visit(ctx.not_test(0));
        ASTnode node = new ASTnode("And", ctx.getStart().getLine()) {
            @Override
            public void print(int indent) {

            }
        };
        for (var child : ctx.not_test()) node.addChild(visit(child));
        return node;
    }

    @Override
    public ASTnode visitNot_test(FlaskParser.Not_testContext ctx) {
        if (ctx.NOT() != null) {
            ASTnode node = new ASTnode("Not", ctx.getStart().getLine()) {
                @Override
                public void print(int indent) {

                }
            };
            node.addChild(visit(ctx.not_test()));
            return node;
        } else {
            return visit(ctx.comparison());
        }
    }

    @Override
    public ASTnode visitComparison(FlaskParser.ComparisonContext ctx) {
        if (ctx.comp_op().isEmpty()) return visit(ctx.expr(0));
        ASTnode node = new ASTnode("Compare", ctx.getStart().getLine()) {
            @Override
            public void print(int indent) {

            }
        };
        node.addChild(visit(ctx.expr(0)));
        for (int i = 0; i < ctx.comp_op().size(); i++) {
            ASTnode opNode = new LiteralNode(ctx.comp_op(i).getText(), ctx.getStart().getLine());
            node.addChild(opNode);
            node.addChild(visit(ctx.expr(i + 1)));
        }
        return node;
    }

    @Override
    public ASTnode visitExpr(FlaskParser.ExprContext ctx) {
        if (ctx.atom_expr() != null) return visit(ctx.atom_expr());
        ASTnode node = new ASTnode("Expr", ctx.getStart().getLine()) {
            @Override
            public void print(int indent) {

            }
        };
        for (var child : ctx.children) {
            ASTnode n = visit(child);
            if (n != null) node.addChild(n);
        }
        return node;
    }

    @Override
    public ASTnode visitAtom_expr(FlaskParser.Atom_exprContext ctx) {
        ASTnode base = visit(ctx.atom());
        for (var t : ctx.trailer()) base.addChild(visit(t));
        if (ctx.AWAIT() != null) {
            ASTnode awaitNode = new ASTnode("Await", ctx.getStart().getLine()) {
                @Override
                public void print(int indent) {

                }
            };
            awaitNode.addChild(base);
            return awaitNode;
        }
        return base;
    }

    @Override
    public ASTnode visitAtom(FlaskParser.AtomContext ctx) {
        if (ctx.NUMBER() != null) return new LiteralNode(ctx.NUMBER().getText(), ctx.getStart().getLine());
        if (ctx.STRING() != null) return new LiteralNode(ctx.getText(), ctx.getStart().getLine());
        if (ctx.NONE() != null) return new LiteralNode("None", ctx.getStart().getLine());
        if (ctx.TRUE() != null) return new LiteralNode(true, ctx.getStart().getLine());
        if (ctx.FALSE() != null) return new LiteralNode(false, ctx.getStart().getLine());
        if (ctx.name() != null) return new LiteralNode(ctx.name().getText(), ctx.getStart().getLine());
        return new ASTnode("Atom", ctx.getStart().getLine()) {
            @Override
            public void print(int indent) {

            }
        };
    }

    @Override
    public ASTnode visitName(FlaskParser.NameContext ctx) {
        return new LiteralNode(ctx.getText(), ctx.getStart().getLine());
    }

}
