package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Codes.Prime;

public class PrimeTest {
    Prime prime = new Prime();
    @Test
    public void testIsPrime() {
        assertEquals(prime.isPrime(5), true);
        assertEquals(prime.isPrime(4), false);
    }
}
