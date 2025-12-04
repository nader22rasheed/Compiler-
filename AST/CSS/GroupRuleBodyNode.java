package AST.CSS;


import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

// GroupRuleBody
public class GroupRuleBodyNode extends ASTnode {
    public List<NeastedStatementNode> rules = new ArrayList<>();
    public GroupRuleBodyNode(int line) { super("groupRuleBody", line); }
    public void addRule(NeastedStatementNode r) { rules.add(r); addChild((ASTnode)r); }
    @Override public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        rules.forEach(r -> r.print(indent+2));
    }
}

