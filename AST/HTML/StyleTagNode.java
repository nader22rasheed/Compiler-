package AST.HTML;

import AST.CSS.StylesheetNode;

public class StyleTagNode extends HtmlElementNode {
    public StylesheetNode stylesheet;

    public StyleTagNode(StylesheetNode stylesheet, int line) {
        super("StyleTag", line);
        this.stylesheet = stylesheet;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("StyleTag <style>");
        if (stylesheet != null) {
            printIndent(indent + 1);
            System.out.println("├─ Parsed CSS Stylesheet:");
            // استدعِ print إذا كان موجود، أو اكتب ملخص
            // stylesheet.print(indent + 2);
        }
    }
}
