package AST.JINJA;

import AST.ASTnode;

public class JinjaExpressionNode extends ASTnode {
    public ASTnode inner;
    public JinjaExpressionNode(ASTnode inner, int line) {
        super("JinjaExpression", line);
        this.inner = inner;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("JinjaExpression");
        if (inner != null) inner.print(indent + 1);
    }
}
