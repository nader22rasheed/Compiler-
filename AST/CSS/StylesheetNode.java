

package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

public class StylesheetNode extends ASTnode {
    public CharsetNode charset;
    public List<ImportNode> imports = new ArrayList<>();
    public List<NamespaceNode> namespaces = new ArrayList<>();
    public List<NeastedStatementNode> rules = new ArrayList<>();

    public StylesheetNode(int line) {
        super("stylesheet", line);
    }

    public void setCharset(CharsetNode c) { this.charset = c; if(c!=null) addChild(c); }
    public void addImport(ImportNode i) { imports.add(i); addChild(i); }
    public void addNamespace(NamespaceNode n) { namespaces.add(n); addChild(n); }
    public void addRule(NeastedStatementNode r) { rules.add(r); addChild((ASTnode)r); }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        if(charset!=null) charset.print(indent+2);
        imports.forEach(x -> x.print(indent+2));
        namespaces.forEach(x -> x.print(indent+2));
        rules.forEach(x -> x.print(indent+2));
    }
}


