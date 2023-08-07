package arraysorted;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySortedTestCase {

    private ArraySorted arraySorted;

    @BeforeEach
    private void setup() {
        arraySorted = new ArraySorted();
    }

    @Test
    public void givenNull_returnsFalse() {
        boolean nullValue = arraySorted.isArraySorted(null);
        assertEquals(false, nullValue);
    }

    @Test
    public void givenEmpty_returnsFalse() {
        boolean emptyValue = arraySorted.isArraySorted(new int[] {});
        assertEquals(false, emptyValue);
    }

    @Test
    public void givenZero_returnsTrue() {
        boolean zeroValue = arraySorted.isArraySorted(new int[] {0});
        assertEquals(true, zeroValue);
    }

    @Test
    public void givenOne_returnsTrue() {
        boolean oneValue = arraySorted.isArraySorted(new int[] {1});
        assertEquals(true, oneValue);
    }

    @Test
    public void givenZeroAndOne_returnsTrue() {
        boolean zeroAndOneValue = arraySorted.isArraySorted(new int[] {-5,-4,-3,-2});
        assertEquals(true, zeroAndOneValue);
    }

    @Test
    public void givenOneAndZero_returnsFalse() {
        boolean zeroAndOneValue = arraySorted.isArraySorted(new int[] {-0, -1});
        assertEquals(false, zeroAndOneValue);
    }
}
