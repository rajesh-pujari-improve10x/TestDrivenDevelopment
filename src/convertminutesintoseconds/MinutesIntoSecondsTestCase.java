package convertminutesintoseconds;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MinutesIntoSecondsTestCase {

    @Test
    public void nothing() {}

    @Test
    public void givenZeroMinute_returnsZeroSecond() {
        MinutesIntoSeconds minutesIntoSeconds = new MinutesIntoSeconds();
        int minsIntoSeconds = minutesIntoSeconds.convertMinutesIntoSeconds(0);
        assertEquals(0, minsIntoSeconds);
    }

    @Test
    public void givenAnyNegativeNumberMinutes_returnsNegativeNumberSeconds() {
        MinutesIntoSeconds minutesIntoSeconds = new MinutesIntoSeconds();
        int minsIntoSeconds = minutesIntoSeconds.convertMinutesIntoSeconds(-10);
        assertEquals(-600, minsIntoSeconds);
    }

    @Test
    public void givenMinutes_returnsSeconds() {
        MinutesIntoSeconds minutesIntoSeconds = new MinutesIntoSeconds();
        int minsIntoSeconds = minutesIntoSeconds.convertMinutesIntoSeconds(10);
        assertEquals(600, minsIntoSeconds);
    }
}
