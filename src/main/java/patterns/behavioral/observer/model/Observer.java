package patterns.behavioral.observer.model;

public abstract class Observer {
    protected Programmer programmer;
    public abstract void update();
}