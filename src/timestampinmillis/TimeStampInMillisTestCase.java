package timestampinmillis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeStampInMillisTestCase {

    @Test
    public void givenTodayTimeMillis() {
        long timeMillis = System.currentTimeMillis();
        DateUtils dateUtils = new DateUtils();
        String currentTimeAndMillis = dateUtils.getDisplayDate(timeMillis);
        assertEquals("Today", currentTimeAndMillis);
    }
}
