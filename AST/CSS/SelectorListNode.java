package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

public class SelectorListNode extends ASTnode {
    public List<SelectorNode> selectors = new ArrayList<>();

    public SelectorListNode(int line) {
        super("selectorList", line);
    }

    public void addSelector(SelectorNode s) {
        selectors.add(s);
        addChild(s);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        selectors.forEach(s -> s.print(indent + 2));
    }
}
