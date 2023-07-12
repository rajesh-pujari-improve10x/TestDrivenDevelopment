package findbomb;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindBombTest {

    @Test
    public void nothing() {}

    @Test
    public void givenThereIsABomb_returnsTrue() {
        FindBomb findBomb = new FindBomb();
        boolean result = findBomb.findTheBomb("There is a bomb");
        assertEquals(true, result);
    }
}
