package patterns.structural.facade;

import patterns.structural.facade.impl.ZooKeeper;

/**
 * The Facade pattern provides a simple and top-level interface for the client and allows it to access the system,
 * without knowing any of the system logic and inner-workings.
 */

public class App {

    public static void main(String[] args) {
        ZooKeeper zookeeper = new ZooKeeper();

        zookeeper.feedLion();
        zookeeper.feedWolf();
        zookeeper.feedBear();
    }

}
