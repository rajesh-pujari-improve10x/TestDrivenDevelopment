package integerinrange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LowerBoundUpperBoundTestCase {

    private LowerBoundUpperBound lowerBoundUpperBound;

    @BeforeEach
    public void setup() {
        lowerBoundUpperBound = new LowerBoundUpperBound();

    }

    @Test
    public void nothing() {}

    @Test
    public void givenAnyNegativeNumbers_returnsFalse() {
        boolean negativeNumbers = lowerBoundUpperBound.isNValueWIthInBounds(-3, -3, -2);
        assertEquals(true, negativeNumbers);
    }

    @Test
    public void givenAllZeros_returnsFalse() {
        boolean allZeros = lowerBoundUpperBound.isNValueWIthInBounds(0, 0, 0);
        assertEquals(false, allZeros);
    }

    @Test
    public void givenAllOnes_returnsFalse() {
        boolean allOnes = lowerBoundUpperBound.isNValueWIthInBounds(1, 1, 1);
        assertEquals(false, allOnes);
    }

    @Test
    public void givenZeroNegativeTwoSix_returnsTrue() {
        boolean zeroNegativeTwoSix = lowerBoundUpperBound.isNValueWIthInBounds(0, -2, 6);
        assertEquals(true, zeroNegativeTwoSix);
    }

    @Test
    public void givenThreeThreeEight_returnsTrue() {
        boolean  threeThreeEight= lowerBoundUpperBound.isNValueWIthInBounds(3, 3, 8);
        assertEquals(true, threeThreeEight);
    }

    @Test
    public void givenThreeFourEight_returnsFalse() {
        boolean  threeFourEight= lowerBoundUpperBound.isNValueWIthInBounds(3, 4, 8);
        assertEquals(false, threeFourEight);
    }

    @Test
    public void givenSixOneSix_returnsFalse() {
        boolean  sixOneSix= lowerBoundUpperBound.isNValueWIthInBounds(6, 1, 6);
        assertEquals(false, sixOneSix);
    }
}
