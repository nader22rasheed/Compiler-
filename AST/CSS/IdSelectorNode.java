package AST.CSS;

public class IdSelectorNode extends SimpleSelectorNode {
    public String id;

    public IdSelectorNode(int line, String i) {
        super("idSelector", line);
        id = i;
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": #" + id);
    }
}
