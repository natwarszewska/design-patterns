package patterns.structural.adapter;

import patterns.structural.adapter.impl.BuilderImplementation;

/**
 * The Adapter pattern, as the name implies, adapts one interface to another.
 * It acts as a bridge between two unrelated, and sometimes even completely incompatible interfaces.
 */

public class App {

    public static void main(String[] args) {

        BuilderImplementation builderImpl = new BuilderImplementation();
        builderImpl.build("house", "Downtown");
        builderImpl.build("Skyscrapper", "City Center");
        builderImpl.build("Skyscrapper", "Outskirts");
        builderImpl.build("Hotel", "City Center");

    }

}
