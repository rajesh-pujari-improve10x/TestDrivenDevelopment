package leftrotatearraybyone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftRotateArrayTestCase {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnZero() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] result = leftRotateArray.leftRotateArrayByOne(null);
        assertArrayEquals(new int[] {}, result);
    }
}
