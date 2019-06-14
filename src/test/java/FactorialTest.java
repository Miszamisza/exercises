import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    private Factorial factorial = new Factorial();

    @Test
    void factorial() {
        assertEquals(BigInteger.valueOf(6), factorial.factorial(BigInteger.valueOf(3)));
        assertEquals(BigInteger.ONE, factorial.factorial(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(362880), factorial.factorial(BigInteger.valueOf(9)));
        assertEquals(BigInteger.valueOf(-1), factorial.factorial(BigInteger.valueOf(-1)));
    }
}