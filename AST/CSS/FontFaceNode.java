package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

// FontFace
public class FontFaceNode extends ASTnode implements NeastedStatementNode {
    public List<FontFaceDeclarationNode> declarations = new ArrayList<>();

    public FontFaceNode(int lineNumber) {
        super("fontFaceRuleLabel", lineNumber);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        declarations.forEach(d -> d.print(indent + 2));
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }
}
