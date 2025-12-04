package AST.CSS;

import AST.ASTnode;

public class CombinatorNode extends ASTnode {
    public enum Type {DESCENDANT, CHILD, ADJACENT_SIBLING, GENERAL_SIBLING, COLUMN}

    public Type type;

    public CombinatorNode(int line, Type t) {
        super("combinator", line);
        this.type = t;
    }

    @Override
    public void print(int indent) {
        String s = switch (type) {
            case CHILD -> ">";
            case ADJACENT_SIBLING -> "+";
            case GENERAL_SIBLING -> "~";
            case COLUMN -> "||";
            default -> " " + "(descendant)";
        };
        System.out.println(" ".repeat(indent) + nodeName + ": " + s);
    }
}
