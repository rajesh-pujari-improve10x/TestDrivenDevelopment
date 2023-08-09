package leftrotatearraybyone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeftRotateArrayTestCase {

    private LeftRotateArray leftRotateArray;

    @BeforeEach
    public void setup() {
        leftRotateArray = new LeftRotateArray();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnEmpty() {
        int[] result = leftRotateArray.leftRotateArrayByOne(null);
        assertArrayEquals(new int[] {}, result);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        int[] result = leftRotateArray.leftRotateArrayByOne(new int[] {});
        assertArrayEquals(new int[] {}, result);
    }

    @Test
    public void givenZeroValue_returnZero() {
        int[] result = leftRotateArray.leftRotateArrayByOne(new int[] {0});
        assertArrayEquals(new int[] {0}, result);
    }

    @Test
    public void givenOneValue_returnOne() {
        int[] result = leftRotateArray.leftRotateArrayByOne(new int[] {1});
        assertArrayEquals(new int[] {1}, result);
    }

    @Test
    public void given12345_return23451() {
        int[] result = leftRotateArray.leftRotateArrayByOne(new int[] {1, 2, 3, 4, 5});
        assertArrayEquals(new int[] {2, 3, 4, 5, 1}, result);
    }

    @Test
    public void given345_return453() {
        int[] result = leftRotateArray.leftRotateArrayByOne(new int[] {3, 4, 5});
        assertArrayEquals(new int[] {4, 5, 3}, result);
    }

    @Test
    public void givenMinusValues452_returnMinus524() {
        int[] result = leftRotateArray.leftRotateArrayByOne(new int[] {-4, -5, -2});
        assertArrayEquals(new int[] {-5, -2, -4}, result);
    }
}
