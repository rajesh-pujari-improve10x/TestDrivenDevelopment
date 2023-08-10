package stockbuyandsell;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockBuyAndSellTestCase {

    private StockBuyAndSell stockBuyAndSell;

    @BeforeEach
    public void setup() {
        stockBuyAndSell = new StockBuyAndSell();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnMinusOne() {
        int result = stockBuyAndSell.buyAndSellMaxProfit(null);
        assertEquals(-1, result);
    }

    @Test
    public void givenEmpty_returnMinusOne() {
        int result = stockBuyAndSell.buyAndSellMaxProfit(new int[] {});
        assertEquals(-1, result);
    }

    @Test
    public void givenZeroValue_returnZero() {
        int result = stockBuyAndSell.buyAndSellMaxProfit(new int[] {0});
        assertEquals(0, result);
    }

    @Test
    public void givenOneValue_returnZero() {
        int result = stockBuyAndSell.buyAndSellMaxProfit(new int[] {1});
        assertEquals(0, result);
    }

    @Test
    public void givenOneZeroValue_returnZero() {
        int result = stockBuyAndSell.buyAndSellMaxProfit(new int[] {1, 0});
        assertEquals(0, result);
    }

    @Test
    public void givenZeroOneValue_returnOne() {
        int result = stockBuyAndSell.buyAndSellMaxProfit(new int[] {0, 1});
        assertEquals(1, result);
    }

    @Test
    public void given715364_returnFive() {
        int result = stockBuyAndSell.buyAndSellMaxProfit(new int[] {7,1,5,3,6,4});
        assertEquals(5, result);
    }

    @Test
    public void given7654321_returnZero() {
        int result = stockBuyAndSell.buyAndSellMaxProfit(new int[] {7,6,5,4,3,2,1});
        assertEquals(0, result);
    }
}
