package reverseword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordTestCase {

    private final ReverseWord reverseWord = new ReverseWord();

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnEmpty() {
        String strReverseWords = reverseWord.reverseWordsInAString(null);
        assertEquals("", strReverseWords);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        String strReverseWords = reverseWord.reverseWordsInAString("");
        assertEquals("", strReverseWords);
    }

    @Test
    public void givenRChar_returnR() {
        String strReverseWords = reverseWord.reverseWordsInAString("R");
        assertEquals("R", strReverseWords);
    }

    @Test
    public void givenRCharWithSpaces_returnR() {
        String strReverseWords = reverseWord.reverseWordsInAString("   R  ");
        assertEquals("R", strReverseWords);
    }

    @Test
    public void givenRajWithSpacesLeftSide_returnRaj() {
        String strReverseWords = reverseWord.reverseWordsInAString("   Raj");
        assertEquals("Raj", strReverseWords);
    }

    @Test
    public void givenRajWithSpacesRightSide_returnRaj() {
        String strReverseWords = reverseWord.reverseWordsInAString("Raj    ");
        assertEquals("Raj", strReverseWords);
    }

    @Test
    public void givenRajesh_returnRajesh() {
        String strReverseWords = reverseWord.reverseWordsInAString("Rajesh");
        assertEquals("Rajesh", strReverseWords);
    }

    @Test
    public void givenRajeshSpacePujari_returnPujariSpaceRajesh() {
        String strReverseWords = reverseWord.reverseWordsInAString("Rajesh Pujari");
        assertEquals("Pujari Rajesh", strReverseWords);
    }

    @Test
    public void givenThisIsAnAmazingProgram_returnProgramAmazingAnIsThis() {
        String strReverseWords = reverseWord.reverseWordsInAString("this is an amazing program");
        assertEquals("program amazing an is this", strReverseWords);
    }

    @Test
    public void givenThisIsAnSpacesAmazingProgram_returnProgramAmazingAnIsThis() {
        String strReverseWords = reverseWord.reverseWordsInAString("this is an      amazing program");
        assertEquals("program amazing an is this", strReverseWords);
    }
}
