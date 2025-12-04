package AST.CSS;

import AST.ASTnode;

import java.util.ArrayList;
import java.util.List;

public class SelectorNode extends ASTnode {
    public List<SimpleSelectorSequenceNode> sequences = new ArrayList<>();
    public List<CombinatorNode> combinators = new ArrayList<>();

    public SelectorNode(int line) {
        super("selector", line);
    }

    public void addSequence(SimpleSelectorSequenceNode seq, CombinatorNode comb) {
        sequences.add(seq);
        if (comb != null) combinators.add(comb);
        addChild(seq);
        if (comb != null) addChild(comb);
    }

    @Override
    public void print(int indent) {
        System.out.println(" ".repeat(indent) + nodeName);
        for (int i = 0; i < sequences.size(); i++) {
            if (i > 0 && i - 1 < combinators.size()) combinators.get(i - 1).print(indent + 2);
            sequences.get(i).print(indent + 2);
        }
    }
}
