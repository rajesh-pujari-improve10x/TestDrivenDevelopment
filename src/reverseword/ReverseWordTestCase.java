package reverseword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordTestCase {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnEmpty() {
        ReverseWord reverseWord = new ReverseWord();
        String strReverseWords = reverseWord.reverseWordsInAString(null);
        assertEquals("", strReverseWords);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        ReverseWord reverseWord = new ReverseWord();
        String strReverseWords = reverseWord.reverseWordsInAString("");
        assertEquals("", strReverseWords);
    }

    @Test
    public void givenRChar_returnR() {
        ReverseWord reverseWord = new ReverseWord();
        String strReverseWords = reverseWord.reverseWordsInAString("R");
        assertEquals("R", strReverseWords);
    }

    @Test
    public void givenRCharWithSpaces_returnR() {
        ReverseWord reverseWord = new ReverseWord();
        String strReverseWords = reverseWord.reverseWordsInAString("   R  ");
        assertEquals("R", strReverseWords);
    }

    @Test
    public void givenRajWithSpacesLeftSide_returnRaj() {
        ReverseWord reverseWord = new ReverseWord();
        String strReverseWords = reverseWord.reverseWordsInAString("   Raj");
        assertEquals("Raj", strReverseWords);
    }

    @Test
    public void givenRajWithSpacesRightSide_returnRaj() {
        ReverseWord reverseWord = new ReverseWord();
        String strReverseWords = reverseWord.reverseWordsInAString("Raj    ");
        assertEquals("Raj", strReverseWords);
    }

    @Test
    public void givenRajesh_returnRajesh() {
        ReverseWord reverseWord = new ReverseWord();
        String strReverseWords = reverseWord.reverseWordsInAString("Rajesh");
        assertEquals("Rajesh", strReverseWords);
    }

    @Test
    public void givenRajeshSpacePujari_returnPujariSpaceRajesh() {
        ReverseWord reverseWord = new ReverseWord();
        String strReverseWords = reverseWord.reverseWordsInAString("Rajesh Pujari");
        assertEquals("Pujari Rajesh", strReverseWords);
    }
}
