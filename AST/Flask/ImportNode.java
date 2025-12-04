package AST.Flask;

import AST.ASTnode;

public class ImportNode extends ASTnode {
    public ImportNode(int lineNumber) {
        super("Import", lineNumber);
    }

    @Override
    public void print(int indent) {
        String spaces = " ".repeat(indent * 2);
        System.out.println(spaces + nodeName + " (Line: " + lineNumber + ")");
        for (ASTnode child : children) {  // modules
            child.print(indent + 1);
        }
    }
}