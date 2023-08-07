package arraysorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySortedTestCase {

    @Test
    public void givenNull_returnsFalse() {
        ArraySorted arraySorted = new ArraySorted();
        boolean nullValue = arraySorted.isArraySorted(null);
        assertEquals(false, nullValue);
    }

    @Test
    public void givenEmpty_returnsFalse() {
        ArraySorted arraySorted = new ArraySorted();
        boolean emptyValue = arraySorted.isArraySorted(new int[] {});
        assertEquals(false, emptyValue);
    }
}
