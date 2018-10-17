import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStringMethodsTest {

    private TwoStringMethods methods = new TwoStringMethods();

    @Test
    public void abcTest() {
        boolean result = methods.abcTest("123abc");
        assertTrue(result);
    }

    @Test
    public void abcTest2() {
        boolean result = methods.abcTest("123.abc");
        assertFalse(result);

    }

    @Test
    public void abcTest3() {
        boolean result = methods.abcTest("abc.123");
        assertTrue(result);

    }

    @Test
    public void alternateStringTest() {

        String expected = "hgeololdobye";
        String result = methods.alternateString("hello", "goodbye");
        assertEquals(expected, result);
    }
}