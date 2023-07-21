package lessthanhundred;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LessThanHundredTestCase {

    @Test
    public void nothing() {}

    @Test
    public void givenZeroZero_returnsTrue() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.findLessThanHundred(0, 0);
        assertEquals(true, result);
    }

    @Test
    public void givenZeroNegativeOne_returnsTrue() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.findLessThanHundred(0, -1);
        assertEquals(true, result);
    }

    @Test
    public void givenNegativeOneZero_returnsTrue() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.findLessThanHundred(-1, 0);
        assertEquals(true, result);
    }

    @Test
    public void givenTwoNegativeOnes_returnsTrue() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.findLessThanHundred(-1, -1);
        assertEquals(true, result);
    }

    @Test
    public void givenZeroOne_returnsTrue() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.findLessThanHundred(0, 1);
        assertEquals(true, result);
    }

    @Test
    public void givenOneZero_returnsTrue() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.findLessThanHundred(1, 0);
        assertEquals(true, result);
    }

    @Test
    public void givenOneOne_returnsTrue() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.findLessThanHundred(1, 1);
        assertEquals(true, result);
    }

    @Test
    public void givenBelowSumOfTwoValuesLessThanOrEqualsToHundred_returnsTrue() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.findLessThanHundred(77, 23);
        assertEquals(true, result);
    }

    @Test
    public void givenBelowSumOfTwoValuesGraterThanHundred_returnsFalse() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.findLessThanHundred(78, 23);
        assertEquals(false, result);
    }
}
