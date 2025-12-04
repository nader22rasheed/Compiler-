package AST.CSS;

import AST.ASTnode;

// Charset
public class CharsetNode extends ASTnode implements NeastedStatementNode {
    public String charset;
    public boolean isGood;

    public CharsetNode(int lineNumber, String charset, boolean isGood) {
        super(isGood ? "goodCharset" : "badCharset", lineNumber);
        this.charset = charset;
        this.isGood = isGood;
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + ": " + charset);
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }
}