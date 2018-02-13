package jp.topse.agile.tdd;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by doi on 2018/02/13.
 */
public class StockManager {

    private Map<String, Integer> stocks = new HashMap();

    public int getStocks(String item) {
        Integer amount = stocks.get(item);
        if (amount == null) {
            return 0;
        }
        return amount;
    }

    public void add(String item, int amount) {
        stocks.put(item, amount);
    }
}
