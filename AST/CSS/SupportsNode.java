package AST.CSS;

import AST.ASTnode;

public class SupportsNode extends ASTnode implements NeastedStatementNode {
    public String condition;
    public GroupRuleBodyNode body;

    public SupportsNode(int line, String c, GroupRuleBodyNode b) {
        super("supportsRule", line);
        condition = c;
        body = b;
        if (b != null) addChild(b);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + " " + condition);
        if (body != null) body.print(indent + 2);
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }
}
