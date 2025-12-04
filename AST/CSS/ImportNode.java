package AST.CSS;

import AST.ASTnode;
public class ImportNode extends ASTnode implements NeastedStatementNode {
    private String urlOrString;
    private MediaQueryListNode mediaQueryList;
    private boolean isGood;

    public ImportNode(int line, String url, MediaQueryListNode media, boolean isGood) {
        super("Import", line);
        this.urlOrString = url;
        this.mediaQueryList = media;
        this.isGood = isGood;
        if(media != null) addChild(media);
    }

    public String getUrlOrString() { return urlOrString; }
    public MediaQueryListNode getMediaQueryList() { return mediaQueryList; }
    public boolean isGood() { return isGood; }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName + " URL/String: " + urlOrString + " Good: " + isGood);
        if(mediaQueryList != null) mediaQueryList.print(indent + 2);
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }
}