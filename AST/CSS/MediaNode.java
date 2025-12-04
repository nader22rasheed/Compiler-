package AST.CSS;


import AST.ASTnode;

// Media
public class MediaNode extends ASTnode implements NeastedStatementNode {
    public MediaQueryListNode queryList;
    public GroupRuleBodyNode body;

    public MediaNode(int line, MediaQueryListNode queries, GroupRuleBodyNode body) {
        super("mediaRule", line);
        this.queryList = queries;
        this.body = body;
        if(queries != null) addChild(queries);
        if(body != null) addChild(body);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        if(queryList != null) queryList.print(indent + 2);
        if(body != null) body.print(indent + 2);
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }
}

