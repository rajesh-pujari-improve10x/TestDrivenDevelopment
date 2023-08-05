package findlargestnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindLargestNumberTestCase {

    private FindLargestNumber findLargestNumber;

    @BeforeEach
    public void setup() {
        findLargestNumber = new FindLargestNumber();
    }

    @Test
    public void givenEmpty_returnsZero() {
        int empty = findLargestNumber.findLargestElement(new int[] {});
        assertEquals(0, empty);
    }

    @Test
    public void givenNull_returnsZero() {
        int nullValue = findLargestNumber.findLargestElement(null);
        assertEquals(0, nullValue);
    }

    @Test
    public void givenZero_returnsZero() {
        int zeroValue = findLargestNumber.findLargestElement(new int[] {0});
        assertEquals(0, zeroValue);
    }
}