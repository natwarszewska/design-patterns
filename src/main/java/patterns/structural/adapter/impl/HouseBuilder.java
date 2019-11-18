package patterns.structural.adapter.impl;

public class HouseBuilder implements AdvancedBuilder {
    @Override
    public void buildHouse(String location) {
        System.out.println("Building a house located in the " + location + "area!");
    }

    @Override
    public void buildSkyscrapper(String location) {
        //don't implement
    }
}