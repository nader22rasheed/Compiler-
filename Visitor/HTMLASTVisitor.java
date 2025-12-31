package Visitor;

import AST.ASTnode;
import AST.HTML.*;


public class HTMLASTVisitor {

    // =============== HtmlDocument =================
    public ASTnode visit(HtmlDocumentNode node) {
        for (ASTnode n : node.prelude) {
            visit(n);
        }
        for (HtmlElementNode e : node.elements) {
            visit(e);
        }
        return node;
    }

    // =============== HtmlElements =================
    public ASTnode visit(HtmlElementsNode node) {
        for (HtmlMiscNode m : node.leadingMisc) visit(m);
        visit(node.mainElement);
        for (HtmlMiscNode m : node.trailingMisc) visit(m);
        return node;
    }

    // =============== HtmlElement variants =================
    public ASTnode visit(NormalTagNode node) {
        for (HtmlAttributeNode a : node.attributes) visit(a);
        if (node.content != null) visit(node.content);
        return node;
    }

    public ASTnode visit(SelfClosingTagNode node) {
        for (HtmlAttributeNode a : node.attributes) visit(a);
        return node;
    }

    public ASTnode visit(ScriptTagNode node) {
        return node;
    }

    public ASTnode visit(ScriptletTagNode node) {
        return node;
    }

    public ASTnode visit(StyleTagNode node) {
        if (node.stylesheet != null) node.stylesheet.print(1); // أو visit على StylesheetNode
        return node;
    }

    // =============== HtmlContent =================
    public ASTnode visit(HtmlContentNode node) {
        for (ASTnode c : node.children) visit(c);
        return node;
    }

    // =============== HtmlText =================
    public ASTnode visit(HtmlTextNode node) {
        return node;
    }

    // =============== HtmlWs =================
    public ASTnode visit(HtmlWsNode node) {
        return node;
    }

    // =============== HtmlMisc =================
    public ASTnode visit(HtmlCommentNode node) {
        return node;
    }

    public ASTnode visit(HtmlCommentMiscNode node) {
        return node;
    }

    public ASTnode visit(HtmlMiscWsNode node) {
        return node;
    }

    // =============== HtmlAttribute =================
    public ASTnode visit(AttrNoValueNode node) {
        return node;
    }

    public ASTnode visit(AttrWithValueNode node) {
        if (node.value != null) visit(node.value);
        return node;
    }

    public ASTnode visit(DoubleQuotedAttrNode node) {
        for (ASTnode p : node.parts) visit(p);
        return node;
    }

    public ASTnode visit(SingleQuotedAttrNode node) {
        for (ASTnode p : node.parts) visit(p);
        return node;
    }

    public ASTnode visit(UnquotedAttrNode node) {
        return node;
    }

    // =============== AttributeValue =================

    // =============== CData =================
    public ASTnode visit(CDataNode node) {
        return node;
    }

    // =============== Scriptlet =================
    public ASTnode visit(ScriptletNode node) {
        return node;
    }

    // =============== SeaWs =================
    public ASTnode visit(SeaWsNode node) {
        return node;
    }

    // =============== Dtd =================
    public ASTnode visit(DtdNode node) {
        return node;
    }

    // =============== XmlDeclaration =================
    public ASTnode visit(XmlDeclarationNode node) {
        return node;
    }

    // =============== Accept method for polymorphism =================
    public ASTnode visit(ASTnode node) {
        if (node instanceof HtmlDocumentNode doc) return visit(doc);
        if (node instanceof HtmlElementsNode elems) return visit(elems);
        if (node instanceof NormalTagNode nt) return visit(nt);
        if (node instanceof SelfClosingTagNode st) return visit(st);
        if (node instanceof ScriptTagNode sc) return visit(sc);
        if (node instanceof ScriptletTagNode sl) return visit(sl);
        if (node instanceof StyleTagNode style) return visit(style);
        if (node instanceof HtmlContentNode hc) return visit(hc);
        if (node instanceof HtmlTextNode text) return visit(text);
        if (node instanceof HtmlWsNode ws) return visit(ws);
        if (node instanceof HtmlCommentNode com) return visit(com);
        if (node instanceof HtmlCommentMiscNode comMisc) return visit(comMisc);
        if (node instanceof HtmlMiscWsNode wsMisc) return visit(wsMisc);
        if (node instanceof AttrNoValueNode an) return visit(an);
        if (node instanceof AttrWithValueNode aw) return visit(aw);
        if (node instanceof DoubleQuotedAttrNode dq) return visit(dq);
        if (node instanceof SingleQuotedAttrNode sq) return visit(sq);
        if (node instanceof UnquotedAttrNode uq) return visit(uq);
        if (node instanceof CDataNode cd) return visit(cd);
        if (node instanceof ScriptletNode s) return visit(s);
        if (node instanceof SeaWsNode sea) return visit(sea);
        if (node instanceof DtdNode dtd) return visit(dtd);
        if (node instanceof XmlDeclarationNode xml) return visit(xml);
        return node;
    }
}
