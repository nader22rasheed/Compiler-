package AST.Flask;

import AST.ASTnode;

public class ExpressionNode extends ASTnode {
    private String operator;  // مثل + , == , >

    public ExpressionNode(String operator, int lineNumber) {
        super("Expression", lineNumber);
        this.operator = operator;
    }

    @Override
    public void print(int indent) {
        String spaces = " ".repeat(indent * 2);
        System.out.println(spaces + nodeName + " - Operator: " + (operator != null ? operator : "N/A") + " (Line: " + lineNumber + ")");
        for (ASTnode child : children) {  // left, right
            child.print(indent + 1);
        }
    }
}