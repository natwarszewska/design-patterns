package patterns.structural.decorator;

import patterns.structural.decorator.model.*;

/**
 * The Decorator pattern is used to alter an individual instance of a class at runtime, by creating a decorator class
 * which wraps the original class. This way, changing or adding functionalities of the decorator object won't affect
 * the structure or the functionalities of the original object. It differs from classic inheritance in the fact that
 * it's done at runtime, and applies only to an individual instance, whereas inheritance will affect all instances,
 * and is done at compile time.
 */

public class App {

    public static void main(String[] args) {
        Computer gamingComputer = new GamingComputer(new BasicComputer());
        gamingComputer.assemble();
        System.out.println("\n");

        Computer workComputer = new WorkComputer(new GamingComputer(new
                BasicComputer()));
        workComputer.assemble();
    }

}
