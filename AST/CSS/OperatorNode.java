package AST.CSS;

import AST.ASTnode;

// Operator
public class OperatorNode extends ASTnode {
    public String op;
    public boolean good;

    public OperatorNode(int lineNumber, String op, boolean good) {
        super(good ? "goodOperator" : "badOperator", lineNumber);
        this.op = op;
        this.good = good;
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": " + op);
    }
}
