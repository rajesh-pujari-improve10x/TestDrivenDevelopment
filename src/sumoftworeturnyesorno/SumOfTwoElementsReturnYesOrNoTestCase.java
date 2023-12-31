package sumoftworeturnyesorno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfTwoElementsReturnYesOrNoTestCase {

    private SumOfTwoElements sumOfTwoElementsReturnYesOrNo;

    @BeforeEach
    public void setup() {
        sumOfTwoElementsReturnYesOrNo = new SumOfTwoElements();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnNo() {
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(null, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenEmpty_returnNo() {
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {}, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenZeroValue_returnNo() {
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {0}, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenOneValue_returnNo() {
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {1}, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenZeroOne_returnYes() {
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {0, 1}, 1);
        assertEquals("Yes", result);
    }

    @Test
    public void givenOneZero_returnNo() {
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {1, 0}, 0);
        assertEquals("No", result);
    }

    @Test
    public void given265811Values_returnYes() {
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {2,6,5,8,11}, 14);
        assertEquals("Yes", result);
    }

    @Test
    public void given265811Values_returnYNo() {
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {2,6,5,8,11}, 15);
        assertEquals("No", result);
    }

    @Test
    public void givenMinus265811Values_returnYNo() {
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {-2,-6,-5,-8,-11}, -20);
        assertEquals("No", result);
    }

    @Test
    public void givenMinusValues_returnYNo() {
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {-5, 2, -4, 6, 1}, -2);
        assertEquals("Yes", result);
    }
}
