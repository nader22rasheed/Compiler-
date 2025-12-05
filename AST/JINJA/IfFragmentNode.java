package AST.JINJA;

import AST.ASTnode;

public class IfFragmentNode extends ASTnode {
    public BooleanExpressionNode condition;

    public IfFragmentNode(BooleanExpressionNode condition, int line) {
        super("IfFragment", line);
        this.condition = condition;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("IfFragment");
        condition.print(indent + 1);
    }
}
