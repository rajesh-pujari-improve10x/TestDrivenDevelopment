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

    @Test
    public void givenZeroValue_returnEmpty() {
        LargestOddNumber largestOddNumber = new LargestOddNumber();
        String zeroValue = largestOddNumber.largestOddNumberInStr("0");
        assertEquals("", zeroValue);
    }

    @Test
    public void givenOneValue_returnOne() {
        LargestOddNumber largestOddNumber = new LargestOddNumber();
        String oneValue = largestOddNumber.largestOddNumberInStr("1");
        assertEquals("1", oneValue);
    }

    @Test
    public void givenTwoValue_returnEmpty() {
        LargestOddNumber largestOddNumber = new LargestOddNumber();
        String oneValue = largestOddNumber.largestOddNumberInStr("2");
        assertEquals("", oneValue);
    }
}
