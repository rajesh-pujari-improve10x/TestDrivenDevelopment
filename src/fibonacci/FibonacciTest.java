package fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void nothing() {}

    @Test
    public void givenAnyNegativeInteger_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthNumber(-5);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void givenZero_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int zeroFibonacci = fibonacci.findNthNumber(0);
        assertEquals(-1, zeroFibonacci);
    }

    @Test
    public void givenOne_returnsZero() {
        Fibonacci fibonacci = new Fibonacci();
        int firstFibonacci = fibonacci.findNthNumber(1);
        assertEquals(0, firstFibonacci);
    }

    @Test
    public void givenTwo_returnsOne() {
        Fibonacci fibonacci = new Fibonacci();
        int secondFibonacci = fibonacci.findNthNumber(2);
        assertEquals(1, secondFibonacci);
    }

    @Test
    public void givenThree_returnsOne() {
        Fibonacci fibonacci = new Fibonacci();
        int threeFibonacci = fibonacci.findNthNumber(3);
        assertEquals(1, threeFibonacci);
    }

    @Test
    public void givenFive_returnsThree() {
        Fibonacci fibonacci = new Fibonacci();
        int fifthFibonacci = fibonacci.findNthNumber(5);
        assertEquals(3, fifthFibonacci);
    }
}

