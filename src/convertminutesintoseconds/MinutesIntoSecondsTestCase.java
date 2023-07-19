package convertminutesintoseconds;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MinutesIntoSecondsTestCase {

    @Test
    public void nothing() {}

    @Test
    public void givenZero_returnsZero() {
        MinutesIntoSeconds minutesIntoSeconds = new MinutesIntoSeconds();
        int minsIntoSeconds = minutesIntoSeconds.convertMinutesIntoSeconds(0);
        assertEquals(0, minsIntoSeconds);
    }
}
