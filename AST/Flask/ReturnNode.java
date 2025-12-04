package AST.Flask;

import AST.ASTnode;

public class ReturnNode extends ASTnode {
    public ReturnNode(int lineNumber) {
        super("Return", lineNumber);
    }

    @Override
    public void print(int indent) {
        String spaces = " ".repeat(indent * 2);
        System.out.println(spaces + nodeName + " (Line: " + lineNumber + ")");
        for (ASTnode child : children) {  // value
            child.print(indent + 1);
        }
    }
}