package majorityelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTestCase {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnMinusOne() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(null);
        assertEquals(-1, majorityValue);
    }

    @Test
    public void givenEmpty_returnMinusOne() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(new int[] {});
        assertEquals(-1, majorityValue);
    }

    @Test
    public void givenZeroValue_returnZero() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(new int[] {0});
        assertEquals(0, majorityValue);
    }

    @Test
    public void givenOneValue_returnOne() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(new int[] {1});
        assertEquals(1, majorityValue);
    }

    @Test
    public void givenTwoZeros_returnZero() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(new int[] {0, 0});
        assertEquals(0, majorityValue);
    }

    @Test
    public void givenZeroOne_returnMinusOne() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(new int[] {0, 1});
        assertEquals(-1, majorityValue);
    }

    @Test
    public void givenTwoOnes_returnOne() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(new int[] {1, 1});
        assertEquals(1, majorityValue);
    }

    @Test
    public void givenOneZero_returnZero() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(new int[] {1, 0});
        assertEquals(-1, majorityValue);
    }

    @Test
    public void givenZeroTwoOnes_returnOne() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(new int[] {0, 1, 1});
        assertEquals(1, majorityValue);
    }

    @Test
    public void givenTwoZerosOne_returnZero() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(new int[] {0, 0, 1});
        assertEquals(0, majorityValue);
    }

    @Test
    public void givenTwoZerosTwoOnes_returnMinusOne() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(new int[] {0, 0, 1, 1});
        assertEquals(-1, majorityValue);
    }

    @Test
    public void given2211122_returnTwo() {
        MajorityElement majorityElement = new MajorityElement();
        int majorityValue = majorityElement.findMajorityElement(new int[] {2, 2, 1, 1, 1, 2, 2});
        assertEquals(2, majorityValue);
    }
}
