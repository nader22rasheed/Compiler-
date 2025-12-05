package AST.HTML;

import AST.ASTnode;

import java.util.List;

public class SingleQuotedAttrNode extends AttributeValueNode {
    public List<ASTnode> parts;

    public SingleQuotedAttrNode(List<ASTnode> parts, int line) {
        super("SingleQuotedAttr", line);
        this.parts = parts;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("SingleQuotedAttr");
        for (ASTnode p : parts) p.print(indent + 1);
    }
}
