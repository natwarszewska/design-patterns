package patterns.structural.bridge;

import patterns.structural.bridge.impl.Animal;
import patterns.structural.bridge.impl.BigDog;
import patterns.structural.bridge.impl.Dog;
import patterns.structural.bridge.impl.SmallDog;

/**
 * The Bridge pattern is used to segregate abstract classes from their implementations and act as a bridge between them.
 * This way, both the abstract class and the implementation can change structurally without affecting the other.
 */

public class App {

    public static void main(String[] args) {
        Animal bigDog = new Dog(3, 500, "Meat", new BigDog());
        Animal smallDog = new Dog(2, 250, "Granules", new SmallDog());

        bigDog.feed();
        smallDog.feed();
    }

}
