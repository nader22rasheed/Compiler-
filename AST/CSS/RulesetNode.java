package AST.CSS;

import AST.ASTnode;

public class RulesetNode extends ASTnode implements NeastedStatementNode {
    public SelectorListNode selectors;
    public DeclarationListNode declarations;

    public RulesetNode(int line, SelectorListNode selectors, DeclarationListNode declarations) {
        super("ruleset", line);
        this.selectors = selectors;
        this.declarations = declarations;
        if (selectors != null) addChild(selectors);
        if (declarations != null) addChild(declarations);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        if (selectors != null) selectors.print(indent + 2);
        if (declarations != null) declarations.print(indent + 2);
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }
}