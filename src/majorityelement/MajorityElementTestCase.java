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
}