package AST.HTML;

import AST.ASTnode;

// ====================== 2. scriptletOrSeaWs ======================
public class ScriptletNode extends ASTnode {
    public String content;

    public ScriptletNode(String content, int line) {
        super("Scriptlet", line);
        this.content = content;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Scriptlet: <% ... %>");
    }
}
