package nthevennumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class NthEvenNumberTestcase {

    private NthEvenNumber nthEvenNumber;

    @BeforeEach
    public void setup() {
        nthEvenNumber = new NthEvenNumber();
    }
    @Test
    public void nothing() {}

    @Test
    public void givenZero_returnsZero() {
        int zero = nthEvenNumber.findNthEvenNumber(0);
        assertEquals(0, zero);
    }

    @Test
    public void givenAnyNegativeNumber_returnsNegativeNumber() {
        int negativeNumber = nthEvenNumber.findNthEvenNumber(-10);
        assertEquals(-1, negativeNumber);
    }

    @Test
    public void givenOne_returnsZero() {
        int one = nthEvenNumber.findNthEvenNumber(1);
        assertEquals(0, one);
    }

    @Test
    public void givenTwenty_returnsThirtyEight() {
        int twenty = nthEvenNumber.findNthEvenNumber(20);
        assertEquals(38, twenty);
    }
}
