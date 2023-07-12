package scoring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ScoringTest {

    private Scoring scoring;

    @Before
    public void setup() {
        scoring = new Scoring();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnsAllZeros() {
        int[] allZeros = scoring.calculateScores(null);
        assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenEmpty_returnsAllZeros() {
        int[] allZeros = scoring.calculateScores("");
        assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenA_returnsOneZeroZero() {
        int[] onlyAScores = scoring.calculateScores("A");
        assertArrayEquals(new int[] {1, 0, 0}, onlyAScores);
    }

    @Test
    public void givenB_returnsZeroOneZero() {
        int[] onlyBScores = scoring.calculateScores("B");
        assertArrayEquals(new int[] {0, 1, 0}, onlyBScores);
    }

    @Test
    public void givenC_returnsZeroZeroOne() {
        int[] onlyCScores = scoring.calculateScores("C");
        assertArrayEquals(new int[] {0, 0, 1}, onlyCScores);
    }

    @Test
    public void givenABC_returnsOneOneOne() {
        int[] abcScores = scoring.calculateScores("ABC");
        assertArrayEquals(new int[] {1, 1, 1}, abcScores);
    }

    @Test
    public void givenAABACCCCBC_returnsThreeTwoFive() {
        int[] aabaccccbcScores = scoring.calculateScores("AABACCCCBC");
        assertArrayEquals(new int[] {3, 2, 5}, aabaccccbcScores);
    }

}
