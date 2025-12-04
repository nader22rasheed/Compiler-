package AST.CSS;

public class ClassSelectorNode extends SimpleSelectorNode {
    public String className;

    public ClassSelectorNode(int line, String c) {
        super("classSelector", line);
        className = c;
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": ." + className);
    }
}
