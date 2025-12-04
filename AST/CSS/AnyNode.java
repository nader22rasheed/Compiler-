package AST.CSS;

import AST.ASTnode;

// AnyNode
public class AnyNode extends ASTnode {
    public String value;
    public String typeLabel;

    public AnyNode(int lineNumber, String value, String typeLabel) {
        super(typeLabel, lineNumber);
        this.value = value;
        this.typeLabel = typeLabel;
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": " + value);
    }
}
