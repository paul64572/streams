import org.junit.Test;

import static org.junit.Assert.*;

public class TestMain {


    @Test
    public void testAdd()
    {
        System.out.println("Hello I am being tested");
        assertEquals(2, Main.add(1, 1));


    }
}