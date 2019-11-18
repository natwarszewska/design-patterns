package patterns.structural.facade.impl;

public class Bear implements Animal {
    @Override
    public void feed() {
        System.out.println("The bear if being fed!");
    }
}