package AST.CSS;

public class TypeSelectorNode extends SimpleSelectorNode {
    public String namespace, name;

    public TypeSelectorNode(int line, String ns, String n) {
        super("typeSelector", line);
        namespace = ns;
        name = n;
    }

    @Override
    public void print(int indent) {
        String full = (namespace == null ? "" : namespace + "|") + name;
        System.out.println(" ".repeat(indent) + nodeName + ": " + full);
    }
}
