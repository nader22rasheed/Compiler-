package AST.Flask;

import AST.ASTnode;

public class LiteralNode extends ASTnode {
    private Object value;  // القيمة (رقم، نص، إلخ)

    public LiteralNode(Object value, int lineNumber) {
        super("Literal", lineNumber);
        this.value = value;
    }

    @Override
    public void print(int indent) {
        String spaces = " ".repeat(indent * 2);
        System.out.println(spaces + nodeName + " - Value: " + value + " (Line: " + lineNumber + ")");
    }
}