package nameinverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {

    private NameInverter nameInverter;

    @BeforeEach
    public void setup() {
        nameInverter = new NameInverter();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenEmpty_returnsEmpty() {
        String inverterName = nameInverter.inverterName("");
        assertEquals("", inverterName);
    }

    @Test
    public void givenSingleWord_returnsSingleWord() {
        String inverterName = nameInverter.inverterName("name");
        assertEquals("name", inverterName);
    }

    @Test
    public void givenSingleWordWithTrailingSpaces_returnsSingleWord() {
        String inverterName = nameInverter.inverterName("name    ");
        assertEquals("name", inverterName);
    }

    @Test
    public void givenSingleWordBeginningSpaces_returnsSingleWord() {
        String inverterName = nameInverter.inverterName("       name   ");
        assertEquals("name", inverterName);
    }

    @Test
    public void givenFirstLast_returnsInvertedName() {
        String inverterName = nameInverter.inverterName("first last");
        assertEquals("last, first", inverterName);
    }

    @Test
    public void givenHonorifics_ignoreHonorifics() {
        String inverterName = nameInverter.inverterName("Mrs. first last");
        assertEquals("last, first", inverterName);
    }

    @Test
    public void givenPostNominals_statAtEnd() {
        String inverterName = nameInverter.inverterName("first last Msc.");
        assertEquals("last, first Msc.", inverterName);
    }
}
