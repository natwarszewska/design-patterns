package patterns.creational.singleton;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SingletonTest {

    @Test
    public void should_test_singleton_pattern(){

        // Developer cannot create instance using default constructor
        // Singleton first = new Singleton();

        Singleton first = Singleton.getInstance();
        System.out.println("1: " + first.toString());

        Singleton second = Singleton.getInstance();
        System.out.println("2: " + second.toString());

        assertEquals(first, second);
        assertTrue(first == second);

        // Developer is not able to override the instance, because there is no constructor
        // second = new Singleton();

    }

}
