package templerun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpikePitTestCase {

    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void givenNegativeOne_thenThrowsInvalidSpikePitWidthException() {
        assertThrows(SpikePit.InvalidSpikePitException.class,
                () -> new SpikePit(-1),
                "Spike Pit Width should be between 0 to 20");
    }

    @Test
    public void givenWidth21_thenThrowsInvalidSpikePitWidthException() {
        assertThrows(SpikePit.InvalidSpikePitException.class,
                () -> new SpikePit(21),
                "Spike Pit Width should be between 0 to20");
    }

    @Test
    public void givenWidth10_whenTrapMethodCalled_thenDisplayTrapMessage() {
        SpikePit spikePit = new SpikePit(10);
        spikePit.trap();
        assertEquals("Spike Pit is trapped with " + 10 + " meters width!", outputStream.toString().trim());
    }

    @Test
    public void givenWidth20_whenTrapMethodCalled_thenDisplayTrapMessage() {
        SpikePit spikePit = new SpikePit(20);
        spikePit.trap();
        assertEquals("Spike Pit is trapped with " + 20 + " meters width!", outputStream.toString().trim());
    }
}
