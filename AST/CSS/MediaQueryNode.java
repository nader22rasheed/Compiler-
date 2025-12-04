package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;


public class MediaQueryNode extends ASTnode {
    public String type;
    public List<MediaExpressionNode> expressions = new ArrayList<>();
    public String mediaPrefix; // "only", "not", null

    public MediaQueryNode(int line, String type, String prefix) {
        super("mediaQuery", line);
        this.type = type;
        this.mediaPrefix = prefix;
    }

    public void addExpression(MediaExpressionNode expr) {
        expressions.add(expr);
        addChild(expr);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + " Type: " + type + " Prefix: " + mediaPrefix);
        for(MediaExpressionNode expr : expressions) expr.print(indent + 2);
    }
}

