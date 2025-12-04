package AST.CSS;

import AST.ASTnode;

// Var
public class VarNode extends ASTnode {
    public String name;

    public VarNode(int lineNumber, String name) {
        super("varRule", lineNumber);
        this.name = name;
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": " + name);
    }
}
