package jp.topse.agile.tdd;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by doi on 2018/02/13.
 */
public class StockManagerTest {

    @Test
    public void testGetStocksReturnsZeroIfStockIsEmpty() {
        StockManager stockManager = new StockManager();

        assertThat(stockManager.getStocks("Tea"), is(0));
    }

    @Test
    public void testGetStocksReturnsTheStocks() {
        StockManager stockManager = new StockManager();

        stockManager.add("Tea", 10);

        assertThat(stockManager.getStocks("Tea"), is(10));
    }

}
