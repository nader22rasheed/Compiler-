package AST.JINJA;

import AST.ASTnode;

public class ElifFragmentNode extends ASTnode {
    public BooleanExpressionNode condition;

    public ElifFragmentNode(BooleanExpressionNode condition, int line) {
        super("ElifFragment", line);
        this.condition = condition;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("ElifFragment");
        condition.print(indent + 1);
    }
}
