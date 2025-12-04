package AST.Flask;

import AST.ASTnode;

public class ForNode extends ASTnode {
    public ForNode(int lineNumber) {
        super("ForStatement", lineNumber);
    }

    @Override
    public void print(int indent) {
        String spaces = " ".repeat(indent * 2);
        System.out.println(spaces + nodeName + " (Line: " + lineNumber + ")");
        for (ASTnode child : children) {  // vars, iterable, body
            child.print(indent + 1);
        }
    }
}