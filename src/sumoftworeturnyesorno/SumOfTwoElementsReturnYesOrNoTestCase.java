package sumoftworeturnyesorno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfTwoElementsReturnYesOrNoTestCase {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnNo() {
        SumOfTwoElements sumOfTwoElementsReturnYesOrNo = new SumOfTwoElements();
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(null, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenEmpty_returnNo() {
        SumOfTwoElements sumOfTwoElementsReturnYesOrNo = new SumOfTwoElements();
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {}, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenZeroValue_returnNo() {
        SumOfTwoElements sumOfTwoElementsReturnYesOrNo = new SumOfTwoElements();
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {0}, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenOneValue_returnNo() {
        SumOfTwoElements sumOfTwoElementsReturnYesOrNo = new SumOfTwoElements();
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {1}, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenZeroOne_returnYes() {
        SumOfTwoElements sumOfTwoElementsReturnYesOrNo = new SumOfTwoElements();
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {0, 1}, 1);
        assertEquals("Yes", result);
    }

    @Test
    public void givenOneZero_returnNo() {
        SumOfTwoElements sumOfTwoElementsReturnYesOrNo = new SumOfTwoElements();
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {1, 0}, 0);
        assertEquals("No", result);
    }

    @Test
    public void given265811Values_returnYes() {
        SumOfTwoElements sumOfTwoElementsReturnYesOrNo = new SumOfTwoElements();
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {2,6,5,8,11}, 14);
        assertEquals("Yes", result);
    }

    @Test
    public void given265811Values_returnYNo() {
        SumOfTwoElements sumOfTwoElementsReturnYesOrNo = new SumOfTwoElements();
        String result = sumOfTwoElementsReturnYesOrNo.sumOfTwoElementsReturnYesOrNo(new int[] {2,6,5,8,11}, 15);
        assertEquals("No", result);
    }
}
