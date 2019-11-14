package patterns.creational.prototype;

interface Prototype {

    Prototype clone();
    String getName();
    void execute();

}