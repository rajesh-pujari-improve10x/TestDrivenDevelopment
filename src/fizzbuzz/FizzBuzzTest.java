package fizzbuzz;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fIzzBuzz;

    @BeforeEach
    public void setup() {
        fIzzBuzz = new FizzBuzz();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenNegativeNumber_returnsNegativeNumber() {
        String result = fIzzBuzz.findFizzBuzz(-5);
        assertEquals("-1", result);
    }

    @Test
    public void givenNotDivisibleNumber_returnsNumber() {
        String result = fIzzBuzz.findFizzBuzz(100);
        assertEquals("100", result);
    }

    @Test
    public void givenThreeAndFiveDivisibleNumber_returnsFizzBuzz() {
        String result = fIzzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void givenThreeDivisibleNumber_returnsFizz() {
        String result = fIzzBuzz.findFizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void givenFiveDivisibleNumber_returnsBuzz() {
        String result = fIzzBuzz.findFizzBuzz(5);
        assertEquals("Buzz", result);
    }
}
