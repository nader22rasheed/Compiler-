package AST.HTML;

import AST.ASTnode;

public class CDataNode extends ASTnode {
    public String content;

    public CDataNode(String content, int line) {
        super("CDATA", line);
        this.content = content;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("CDATA: <![CDATA[" + content.substring(0, Math.min(50, content.length())) + "...]]>");
    }
}

