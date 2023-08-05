package findlargestnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindLargestNumberTestCase {

    @Test
    public void givenEmpty_returnsZero() {
        FindLargestNumber findLargestNumber = new FindLargestNumber();
        int empty = findLargestNumber.findLargestElement(new int[] {});
        assertEquals(0, empty);
    }
}
