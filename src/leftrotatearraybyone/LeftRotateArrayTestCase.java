package leftrotatearraybyone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftRotateArrayTestCase {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnEmpty() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] result = leftRotateArray.leftRotateArrayByOne(null);
        assertArrayEquals(new int[] {}, result);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] result = leftRotateArray.leftRotateArrayByOne(new int[] {});
        assertArrayEquals(new int[] {}, result);
    }

    @Test
    public void givenZeroValue_returnZero() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] result = leftRotateArray.leftRotateArrayByOne(new int[] {0});
        assertArrayEquals(new int[] {0}, result);
    }

    @Test
    public void givenOneValue_returnOne() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] result = leftRotateArray.leftRotateArrayByOne(new int[] {1});
        assertArrayEquals(new int[] {1}, result);
    }

    @Test
    public void given12345_return23451() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] result = leftRotateArray.leftRotateArrayByOne(new int[] {1, 2, 3, 4, 5});
        assertArrayEquals(new int[] {2, 3, 4, 5, 1}, result);
    }
}
