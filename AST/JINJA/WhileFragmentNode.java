package AST.JINJA;

import AST.ASTnode;

public class WhileFragmentNode extends ASTnode {
    public BooleanExpressionNode condition;

    public WhileFragmentNode(BooleanExpressionNode condition, int line) {
        super("WhileFragment", line);
        this.condition = condition;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("WhileFragment");
        condition.print(indent + 1);
    }
}
