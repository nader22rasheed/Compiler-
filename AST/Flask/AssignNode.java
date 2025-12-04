package AST.Flask;

import AST.ASTnode;

public class AssignNode extends ASTnode {
    public AssignNode(int lineNumber) {
        super("Assignment", lineNumber);
    }

    @Override
    public void print(int indent) {
        String spaces = " ".repeat(indent * 2);
        System.out.println(spaces + nodeName + " (Line: " + lineNumber + ")");
        for (ASTnode child : children) {  // target, value
            child.print(indent + 1);
        }
    }
}