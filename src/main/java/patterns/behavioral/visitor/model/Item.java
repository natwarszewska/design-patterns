package patterns.behavioral.visitor.model;

public interface Item {
    public int accept(Visitor visitor);
}
