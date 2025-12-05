package AST.HTML;

import AST.ASTnode;

import java.util.List;

public class DoubleQuotedAttrNode extends AttributeValueNode {
    public List<ASTnode> parts; // نصوص + Jinja expressions + Jinja blocks

    public DoubleQuotedAttrNode(List<ASTnode> parts, int line) {
        super("DoubleQuotedAttr", line);
        this.parts = parts;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("DoubleQuotedAttr");
        for (ASTnode p : parts) p.print(indent + 1);
    }
}
