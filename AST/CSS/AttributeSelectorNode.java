package AST.CSS;

public class AttributeSelectorNode extends SimpleSelectorNode {
    public String namespace, attrName, operator, value;
    public char flag;

    public AttributeSelectorNode(int line, String ns, String name, String op, String val, char f) {
        super("attributeSelector", line);
        namespace = ns;
        attrName = name;
        operator = op;
        value = val;
        flag = f;
    }

    @Override
    public void print(int indent) {
        String s = "[" + (namespace == null ? "" : namespace + "|") + attrName;
        if (operator != null) s += operator + "\"" + value + "\"" + (flag != 0 ? flag : "");
        s += "]";
        System.out.println(" ".repeat(indent) + nodeName + ": " + s);
    }
}
