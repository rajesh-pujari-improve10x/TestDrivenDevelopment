package majorityelement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTestCase {

    private MajorityElement majorityElement;

    @BeforeEach
    public void setup() {
        majorityElement = new MajorityElement();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnMinusOne() {
        int majorityValue = majorityElement.findMajorityElement(null);
        assertEquals(-1, majorityValue);
    }

    @Test
    public void givenEmpty_returnMinusOne() {
        int majorityValue = majorityElement.findMajorityElement(new int[] {});
        assertEquals(-1, majorityValue);
    }

    @Test
    public void givenZeroValue_returnZero() {
        int majorityValue = majorityElement.findMajorityElement(new int[] {0});
        assertEquals(0, majorityValue);
    }

    @Test
    public void givenOneValue_returnOne() {
        int majorityValue = majorityElement.findMajorityElement(new int[] {1});
        assertEquals(1, majorityValue);
    }

    @Test
    public void givenTwoZeros_returnZero() {
        int majorityValue = majorityElement.findMajorityElement(new int[] {0, 0});
        assertEquals(0, majorityValue);
    }

    @Test
    public void givenZeroOne_returnMinusOne() {
        int majorityValue = majorityElement.findMajorityElement(new int[] {0, 1});
        assertEquals(-1, majorityValue);
    }

    @Test
    public void givenTwoOnes_returnOne() {
        int majorityValue = majorityElement.findMajorityElement(new int[] {1, 1});
        assertEquals(1, majorityValue);
    }

    @Test
    public void givenOneZero_returnZero() {
        int majorityValue = majorityElement.findMajorityElement(new int[] {1, 0});
        assertEquals(-1, majorityValue);
    }

    @Test
    public void givenZeroTwoOnes_returnOne() {
        int majorityValue = majorityElement.findMajorityElement(new int[] {0, 1, 1});
        assertEquals(1, majorityValue);
    }

    @Test
    public void givenTwoZerosOne_returnZero() {
        int majorityValue = majorityElement.findMajorityElement(new int[] {0, 0, 1});
        assertEquals(0, majorityValue);
    }

    @Test
    public void givenTwoZerosTwoOnes_returnMinusOne() {
        int majorityValue = majorityElement.findMajorityElement(new int[] {0, 0, 1, 1});
        assertEquals(-1, majorityValue);
    }

    @Test
    public void given2211122_returnTwo() {
        int majorityValue = majorityElement.findMajorityElement(new int[] {2, 2, 1, 1, 1, 2, 2});
        assertEquals(2, majorityValue);
    }
}
