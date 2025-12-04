package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

// ================== MediaQueryList ==================
public class MediaQueryListNode extends ASTnode {
    public List<MediaQueryNode> queries = new ArrayList<>();

    public MediaQueryListNode(int line) {
        super("mediaQueryList", line);
    }

    public void addQuery(MediaQueryNode query) {
        queries.add(query);
        addChild(query);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        for (MediaQueryNode q : queries) q.print(indent + 2);
    }
}
