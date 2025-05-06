package Test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import Codes.Numberutils;

public class NumberutilsTest {
    Numberutils numberutils = new Numberutils();
    @Test
    public void testIsEven() {
        assertEquals(numberutils.isEven(4), true);
        assertEquals(numberutils.isEven(5), false);
        assertEquals(numberutils.isEven(0), true);
    }
}
