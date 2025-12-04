package AST.CSS;

import AST.ASTnode;

// SupportsRule
public class SupportsRuleNode extends ASTnode {
    public ASTnode condition;
    public GroupRuleBodyNode body;

    public SupportsRuleNode(int lineNumber, ASTnode condition, GroupRuleBodyNode body) {
        super("supportsRuleLabel", lineNumber);
        this.condition = condition;
        this.body = body;
        addChild(condition);
        addChild(body);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        if (condition != null) condition.print(indent + 2);
        if (body != null) body.print(indent + 2);
    }
}
