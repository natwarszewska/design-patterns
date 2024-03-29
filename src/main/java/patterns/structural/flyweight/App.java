package patterns.structural.flyweight;

import patterns.structural.flyweight.impl.*;

import java.util.Random;

/**
 * The Flyweight pattern is concerned with reducing the strain on the JVM and its memory. This is crucial for devices
 * without much memory, as well as optimization of the application.
 *
 * When a certain application needs to create many instances of the same class, a common pool is created so that similar
 * ones can be reused, instead of created each time.
 *
 * The most well-known implementation of this design pattern is the String Pool in Java. Strings are used perhaps more
 * often than any other object in the language and thus, they consumed a large portion of the resources. By creating
 * a pool of common Strings and assigning multiple reference variables to the ones with the same content, and only
 * creating new Strings when no match is found made a huge impact on the performance of Java.
 */

public class App {

    private static final String[] names = {"David", "Scott", "Andrew", "Rhett"};

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            AttendeeImpl attendeeImpl = (AttendeeImpl) AttendeeFactory.getAttendee(getRandomName());
            attendeeImpl.setAge(getRandomAge());
            attendeeImpl.listenToConcert();
        }
    }

    private static String getRandomName() {
        int randomName = new Random().nextInt(names.length);
        return names[randomName];
    }

    private static int getRandomAge() {
        return (int)(Math.random()*80);
    }

}
