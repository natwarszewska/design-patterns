package patterns.behavioral.visitor.model;

public interface Visitor {
    int visit(Pen pen);
    int visit(Notebook notebook);
}
