package largestoddnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestOddNumberTestCase {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnEmpty() {
        LargestOddNumber largestOddNumber = new LargestOddNumber();
        String nullValue = largestOddNumber.largestOddNumberInStr(null);
        assertEquals("", nullValue);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        LargestOddNumber largestOddNumber = new LargestOddNumber();
        String emptyValue = largestOddNumber.largestOddNumberInStr("");
        assertEquals("", emptyValue);
    }
}
