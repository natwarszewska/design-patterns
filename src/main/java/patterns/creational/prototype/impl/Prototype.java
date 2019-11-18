package patterns.creational.prototype.impl;

public interface Prototype {

    Prototype clone();
    String getName();
    void execute();

}