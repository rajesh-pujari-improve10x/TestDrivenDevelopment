package findbomb;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindBombTest {

    private FindBomb findBomb;
    @Before
    public void setup() {
        findBomb = new FindBomb();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenThereIsABomb_returnsDuck() {
        String resultThereIsABomb = findBomb.findTheBomb("There is a bomb");
        assertEquals("DUCK!", resultThereIsABomb);
    }

    @Test
    public void givenHeyDidYouThinkThereIsABOMB_returnsDuck() {
        String resultHeyDidYouThinkThereIsABOMB = findBomb.findTheBomb("Hey, did you think there is a BOMB");
        assertEquals("DUCK!", resultHeyDidYouThinkThereIsABOMB);
    }

    @Test
    public void givenThisGoesBoom_returnsRelaxThereIsNoBomb() {
        String resultThisGoesBoom = findBomb.findTheBomb("This goes boom");
        assertEquals("Relax, there’s no bomb.", resultThisGoesBoom);
    }

    @Test
    public void givenEmpty_returnsRelaxThereIsNoBomb() {
        String resultThisGoesBoom = findBomb.findTheBomb("");
        assertEquals("Relax, there’s no bomb.", resultThisGoesBoom);
    }
}
