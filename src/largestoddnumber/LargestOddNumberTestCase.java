package largestoddnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestOddNumberTestCase {

    private LargestOddNumber largestOddNumber;

    @BeforeEach
    public void setup() {
        largestOddNumber = new LargestOddNumber();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnEmpty() {
        String nullValue = largestOddNumber.largestOddNumberInStr(null);
        assertEquals("", nullValue);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        String emptyValue = largestOddNumber.largestOddNumberInStr("");
        assertEquals("", emptyValue);
    }

    @Test
    public void givenZeroValue_returnEmpty() {
        String zeroValue = largestOddNumber.largestOddNumberInStr("0");
        assertEquals("", zeroValue);
    }

    @Test
    public void givenOneValue_returnOne() {
        String oneValue = largestOddNumber.largestOddNumberInStr("1");
        assertEquals("1", oneValue);
    }

    @Test
    public void givenTwoValue_returnEmpty() {
        String twoValue = largestOddNumber.largestOddNumberInStr("2");
        assertEquals("", twoValue);
    }

    @Test
    public void givenFiveTwo_returnFive() {
        String fiveTwoValue = largestOddNumber.largestOddNumberInStr("52");
        assertEquals("5", fiveTwoValue);
    }

    @Test
    public void given4206_returnEmpty() {
        String result = largestOddNumber.largestOddNumberInStr("4206");
        assertEquals("", result);
    }

    @Test
    public void given35427_return35427() {
        String result = largestOddNumber.largestOddNumberInStr("35427");
        assertEquals("35427", result);
    }

    @Test
    public void givenSpacesWith35427_return35427() {
        String result = largestOddNumber.largestOddNumberInStr("   35427  ");
        assertEquals("35427", result);
    }
}
