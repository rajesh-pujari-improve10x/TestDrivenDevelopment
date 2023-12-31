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
    public void givenNull_returnsZero() {
        int nullValue = findLargestNumber.findLargestElement(null);
        assertEquals(0, nullValue);
    }

    @Test
    public void givenEmpty_returnsZero() {
        int empty = findLargestNumber.findLargestElement(new int[] {});
        assertEquals(0, empty);
    }

    @Test
    public void givenZero_returnsZero() {
        int zeroValue = findLargestNumber.findLargestElement(new int[] {0});
        assertEquals(0, zeroValue);
    }

    @Test
    public void givenOne_returnsOne() {
        int oneValue = findLargestNumber.findLargestElement(new int[] {1});
        assertEquals(1, oneValue);
    }

    @Test
    public void givenMinusOne_returnsMinusOne() {
        int minusOneValue = findLargestNumber.findLargestElement(new int[] {-1});
        assertEquals(-1, minusOneValue);
    }

    @Test
    public void givenTwoOne_returnsTwo() {
        int twoOneValue = findLargestNumber.findLargestElement(new int[] {2, 1});
        assertEquals(2, twoOneValue);
    }

    @Test
    public void givenOneTwo_returnsTwo() {
        int twoOneValue = findLargestNumber.findLargestElement(new int[] {1, 2});
        assertEquals(2, twoOneValue);
    }

    @Test
    public void givenMinusOneMinusTwo_returnsMinusOne() {
        int minusTwoMinusOneValue = findLargestNumber.findLargestElement(new int[] {-1, -2});
        assertEquals(-1, minusTwoMinusOneValue);
    }

    @Test
    public void givenAllMinusValues_returnsLargestValue() {
        int allMinusValues = findLargestNumber.findLargestElement(new int[] {-8, -2, -5, 0, -1, -2});
        assertEquals(-0, allMinusValues);
    }

    @Test
    public void givenAllPositiveValues_returnsLargestValue() {
        int allPositiveValues = findLargestNumber.findLargestElement(new int[] {8, 2, 5, 10, 1, 2});
        assertEquals(10, allPositiveValues);
    }
}
