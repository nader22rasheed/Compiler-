package AST.Flask;

import AST.ASTnode;

public class WhileNode extends ASTnode {

    public WhileNode(int lineNumber) {
        super("WhileStatement", lineNumber);
    }

    @Override
    public void print(int indent) {
        String spaces = " ".repeat(indent * 2);
        System.out.println(spaces + nodeName + " (Line: " + lineNumber + ")");
        for (ASTnode child : children) {  // condition, body
            child.print(indent + 1);
        }
    }
}