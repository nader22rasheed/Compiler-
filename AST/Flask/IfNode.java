package AST.Flask;

import AST.ASTnode;

public class IfNode extends ASTnode {
    public IfNode(int lineNumber) {
        super("IfStatement", lineNumber);
    }

    @Override
    public void print(int indent) {
        String spaces = " ".repeat(indent * 2);
        System.out.println(spaces + nodeName + " (Line: " + lineNumber + ")");
        for (ASTnode child : children) {  // condition, body, elifs, else
            child.print(indent + 1);
        }
    }
}