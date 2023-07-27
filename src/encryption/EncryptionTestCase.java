package encryption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionTestCase {

    private Encryption encryption;

    @BeforeEach
    public void setup() {
        encryption = new Encryption();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnaca() {
        String empty = encryption.encrypt(null);
        assertEquals("aca", empty);
    }

    @Test
    public void givenEmpty_returnaca() {
        String empty = encryption.encrypt("");
        assertEquals("aca", empty);
    }

    @Test
    public void givenb_returnbaca() {
        String bValue = encryption.encrypt("b");
        assertEquals("baca", bValue);
    }

    @Test
    public void givenc_returnbaca() {
        String bValue = encryption.encrypt("c");
        assertEquals("caca", bValue);
    }

    @Test
    public void givena_return0aca() {
        String aValue = encryption.encrypt("a");
        assertEquals("0aca", aValue);
    }

    @Test
    public void givene_return1aca() {
        String eValue = encryption.encrypt("e");
        assertEquals("1aca", eValue);
    }

    @Test
    public void giveni_return2aca() {
        String iValue = encryption.encrypt("i");
        assertEquals("2aca", iValue);
    }

    @Test
    public void giveno_return3aca() {
        String oValue = encryption.encrypt("o");
        assertEquals("3aca", oValue);
    }

    @Test
    public void givenu_return4aca() {
        String uValue = encryption.encrypt("u");
        assertEquals("4aca", uValue);
    }

    @Test
    public void givenbc_returncbaca() {
        String bcValue = encryption.encrypt("bc");
        assertEquals("cbaca", bcValue);
    }

    @Test
    public void givenzyx_returnxyzaca() {
        String zyxValue = encryption.encrypt("zyx");
        assertEquals("xyzaca", zyxValue);
    }

    @Test
    public void givenab_returnb0aca() {
        String abValue = encryption.encrypt("ab");
        assertEquals("b0aca", abValue);
    }

    @Test
    public void givenAB_returnb0aca() {
        String aBValue = encryption.encrypt("AB");
        assertEquals("B0aca", aBValue);
    }

    @Test
    public void givenAE_returnb10ca() {
        String aEValue = encryption.encrypt("AE");
        assertEquals("10aca", aEValue);
    }

    @Test
    public void givenAEI_returnb210ca() {
        String aEIValue = encryption.encrypt("AEI");
        assertEquals("210aca", aEIValue);
    }

    @Test
    public void givenAEIO_returnb3210ca() {
        String aEIOValue = encryption.encrypt("AEIO");
        assertEquals("3210aca", aEIOValue);
    }

    @Test
    public void givenAEIOU_returnb43210ca() {
        String aEIOUValue = encryption.encrypt("AEIOU");
        assertEquals("43210aca", aEIOUValue);
    }
}
