package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

public class SimpleSelectorSequenceNode extends ASTnode {
    public List<SimpleSelectorNode> selectors = new ArrayList<>();

    public SimpleSelectorSequenceNode(int line) {
        super("simpleSelectorSequence", line);
    }

    public void add(SimpleSelectorNode s) {
        selectors.add(s);
        addChild(s);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        selectors.forEach(x -> x.print(indent + 2));
    }
}
