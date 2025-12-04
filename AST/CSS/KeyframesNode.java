package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

public class KeyframesNode extends ASTnode implements NeastedStatementNode {
    public String name;
    public List<KeyframeBlockNode> blocks = new ArrayList<>();

    public KeyframesNode(int line, String n) {
        super("keyframesRule", line);
        name = n;
    }

    public void addBlock(KeyframeBlockNode b) {
        blocks.add(b);
        addChild(b);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + " " + name);
        blocks.forEach(b -> b.print(indent + 2));
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }
}
