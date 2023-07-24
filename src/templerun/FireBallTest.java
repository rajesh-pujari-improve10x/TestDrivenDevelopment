package templerun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FireBallTest {

    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }
    @Test
    public void givenSpeedMinusOne_thenThrowsInvalidForeBallSpeedException() {
        assertThrows(FireBall.InvalidFireBallSpeedException.class,
                () -> new FireBall(-1),
                "Fireball speed should be between 0 to 100");
    }

    @Test
    public void givenSpeed101_thenThrowsInvalidForeBallSpeedException() {
        assertThrows(FireBall.InvalidFireBallSpeedException.class,
                () -> new FireBall(101),
                "Fireball speed should be between 0 to 100");
    }

    @Test
    public void givenSpeed10_whenRollMethodCalled_displayRollingMessage() {
        FireBall fireBall = new FireBall(10);
        fireBall.roll();
        assertEquals("FireBall is rolled with " + 10 + " Kmh speed!", outputStream.toString().trim());
    }

    @Test
    public void givenSpeed100_whenRollMethodCalled_displayRollingMessage() {
        FireBall fireBall = new FireBall(100);
        fireBall.roll();
        assertEquals("FireBall is rolled with " + 100 + " Kmh speed!", outputStream.toString().trim());
    }
}
