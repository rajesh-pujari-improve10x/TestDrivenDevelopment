package hoursandminutesintiseconds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HoursAndMinutesIntoSecondsTestCase {

    private HoursAndMinutesIntoSeconds hoursAndMinutesIntoSeconds;

    @BeforeEach
    public void setup() {
        hoursAndMinutesIntoSeconds = new HoursAndMinutesIntoSeconds();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenZeroHrsZeroMinutes_returnsZero() {
        int zeroHrsZeroMins = hoursAndMinutesIntoSeconds.convertHrsAndMinsIntoSeconds(0, 0);
        assertEquals(0, zeroHrsZeroMins);
    }

    @Test
    public void givenZeroHrsNegativeOneMinute_returnsZero() {
        int zeroHrsOneMins = hoursAndMinutesIntoSeconds.convertHrsAndMinsIntoSeconds(0, -1);
        assertEquals(0, zeroHrsOneMins);
    }

    @Test
    public void givenNegativeOneHrZeroMinutes_returnsZero() {
        int negativeOneHrZeroMins = hoursAndMinutesIntoSeconds.convertHrsAndMinsIntoSeconds(-1, 0);
        assertEquals(0, negativeOneHrZeroMins);
    }

    @Test
    public void givenAnyNegativeHrsAndMinutes_returnsZeroSeconds() {
        int anyNegativeHrsAndMins = hoursAndMinutesIntoSeconds.convertHrsAndMinsIntoSeconds(-1, -1);
        assertEquals(0, anyNegativeHrsAndMins);
    }

    @Test
    public void givenZeroHrsOneMinute_returnsSixtySeconds() {
        int zeroHrsANdOneMint = hoursAndMinutesIntoSeconds.convertHrsAndMinsIntoSeconds(0, 1);
        assertEquals(60, zeroHrsANdOneMint);
    }

    @Test
    public void givenOneHrZeroMinutes_returnsThreeThousandSixHundredSeconds() {
        int OneHrZeroMins = hoursAndMinutesIntoSeconds.convertHrsAndMinsIntoSeconds(1, 0);
        assertEquals(3600, OneHrZeroMins);
    }

    @Test
    public void givenOneHrOneMinute_returnsThreeThousandSixHundredSixtySeconds() {
        int OneHrZeroMins = hoursAndMinutesIntoSeconds.convertHrsAndMinsIntoSeconds(1, 1);
        assertEquals(3660, OneHrZeroMins);
    }

    @Test
    public void givenAnyHrsAndMinutes_returnsSeconds() {
        int anyHrsAndMins = hoursAndMinutesIntoSeconds.convertHrsAndMinsIntoSeconds(2, 2);
        assertEquals(7320, anyHrsAndMins);
    }
}
