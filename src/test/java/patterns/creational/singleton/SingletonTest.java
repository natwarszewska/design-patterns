package patterns.creational.singleton;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SingletonTest {

    @Test(testName = "EagerInitializedSingletonTest")
    public void should_test_eager_initialized_singleton(){

        System.out.println("EagerInitializedSingleton");
        // Developer cannot create instance using default constructor
        // EagerInitializedSingleton first = new EagerInitializedSingleton();

        EagerInitializedSingleton first = EagerInitializedSingleton.getInstance();
        System.out.println("1: " + first.toString());

        EagerInitializedSingleton second = EagerInitializedSingleton.getInstance();
        System.out.println("2: " + second.toString());

        assertEquals(first, second);
        assertTrue(first == second);

        // Developer is not able to override the instance, because there is no constructor
        // second = new EagerInitializedSingleton();
        System.out.println();
    }

    @Test(testName = "StaticBlockSingletonTest")
    public void should_test_static_block_singleton(){

        System.out.println("StaticBlockSingleton");
        // Developer cannot create instance using default constructor
        // StaticBlockSingleton first = new StaticBlockSingleton();

        StaticBlockSingleton first = StaticBlockSingleton.getInstance();
        System.out.println("1: " + first.toString());

        StaticBlockSingleton second = StaticBlockSingleton.getInstance();
        System.out.println("2: " + second.toString());

        assertEquals(first, second);
        assertTrue(first == second);

        // Developer is not able to override the instance, because there is no constructor
        // second = new StaticBlockSingleton();
        System.out.println();
    }

    @Test(testName = "LazyInitializedSingletonTest")
    public void should_test_lazy_initialized_singleton(){

        System.out.println("LazyInitializedSingleton");
        // Developer cannot create instance using default constructor
        // LazyInitializedSingleton first = new LazyInitializedSingleton();

        LazyInitializedSingleton first = LazyInitializedSingleton.getInstance();
        System.out.println("1: " + first.toString());

        LazyInitializedSingleton second = LazyInitializedSingleton.getInstance();
        System.out.println("2: " + second.toString());

        assertEquals(first, second);
        assertTrue(first == second);

        // Developer is not able to override the instance, because there is no constructor
        // second = new LazyInitializedSingleton();
        System.out.println();
    }

    @Test(testName = "ThreadSafeSingletonTest")
    public void should_test_thread_safe_singleton(){

        System.out.println("ThreadSafeSingleton");
        // Developer cannot create instance using default constructor
        // ThreadSafeSingleton first = new ThreadSafeSingleton();

        ThreadSafeSingleton first = ThreadSafeSingleton.getInstance();
        System.out.println("1: " + first.toString());

        ThreadSafeSingleton second = ThreadSafeSingleton.getInstance();
        System.out.println("2: " + second.toString());

        assertEquals(first, second);
        assertTrue(first == second);

        // Developer is not able to override the instance, because there is no constructor
        // second = new ThreadSafeSingleton();
        System.out.println();
    }

    @Test
    public void should_test_bill_pugh_singleton(){

        System.out.println("BillPughSingleton");
        // Developer cannot create instance using default constructor
        // BillPughSingleton first = new BillPughSingleton();

        BillPughSingleton first = BillPughSingleton.getInstance();
        System.out.println("1: " + first.toString());

        BillPughSingleton second = BillPughSingleton.getInstance();
        System.out.println("2: " + second.toString());

        assertEquals(first, second);
        assertTrue(first == second);

        // Developer is not able to override the instance, because there is no constructor
        // second = new BillPughSingleton();
        System.out.println();
    }

    @Test
    public void should_test_enum_singleton(){

        System.out.println("EnumSingleton (hashCode)");
        // Developer cannot create instance using default constructor
        // EnumSingleton first = new EnumSingleton();

        EnumSingleton first = EnumSingleton.INSTANCE;
        System.out.println("1: " + first.hashCode());

        EnumSingleton second = EnumSingleton.INSTANCE;
        System.out.println("2: " + second.hashCode());

        assertEquals(first, second);
        assertTrue(first == second);

        // Developer is not able to override the instance, because there is no constructor
        // second = new EnumSingleton();
        System.out.println();
    }

    @Test
    public void should_test_serialized_singleton(){

        System.out.println("SerializedSingleton");
        // Developer cannot create instance using default constructor
        // SerializedSingleton first = new SerializedSingleton();

        SerializedSingleton first = SerializedSingleton.getInstance();
        System.out.println("1: " + first.toString());

        SerializedSingleton second = SerializedSingleton.getInstance();
        System.out.println("2: " + second.toString());

        assertEquals(first, second);
        assertTrue(first == second);

        // Developer is not able to override the instance, because there is no constructor
        // second = new SerializedSingleton();
        System.out.println();
    }

}
