package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

public class LayerNode extends ASTnode implements NeastedStatementNode {
    public List<String> names = new ArrayList<>();
    public GroupRuleBodyNode body;

    public LayerNode(int line) {
        super("layerRule", line);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName +
                (body == null ? " (declaration)" : "") + ": " + String.join(", ", names));
        if (body != null) body.print(indent + 2);
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }
}
