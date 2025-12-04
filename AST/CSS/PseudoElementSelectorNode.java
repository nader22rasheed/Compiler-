package AST.CSS;

public class PseudoElementSelectorNode extends SimpleSelectorNode {
    public String name;

    public PseudoElementSelectorNode(int line, String n) {
        super("pseudoElement", line);
        name = n;
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": ::" + name);
    }
}
