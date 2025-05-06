package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Codes.Strlength;

public class StrlengthTest {
    Strlength strlength = new Strlength();
    @Test
    public void testStrlength() {
        assertEquals(strlength.getStringLength("Hello"), 5);
        assertEquals(strlength.getStringLength(""), 0);
    }

}
