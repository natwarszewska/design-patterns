package patterns.structural.bridge.impl;

public class SmallDog implements FeedingAPI {
    @Override
    public void feed(int timesADay, int amount, String typeOfFood) {
        System.out.println("Feeding a small dog, " + timesADay + " times a day with " +
                amount + " g of " + typeOfFood);
    }
}
