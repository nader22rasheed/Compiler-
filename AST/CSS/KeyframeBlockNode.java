package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

public class KeyframeBlockNode extends ASTnode {
    public List<String> keys = new ArrayList<>(); // "0%", "from", "to", ...
    public DeclarationListNode declarations;

    public KeyframeBlockNode(int line, DeclarationListNode d) {
        super("keyframeBlock", line);
        declarations = d;
        if (d != null) addChild(d);
    }

    public void addKey(String k) {
        keys.add(k);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": " + String.join(", ", keys));
        if (declarations != null) declarations.print(indent + 2);
    }
}
