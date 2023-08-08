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
}
