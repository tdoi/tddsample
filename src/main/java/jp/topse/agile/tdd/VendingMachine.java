package jp.topse.agile.tdd;

/**
 * Created by doi on 2018/02/13.
 */
public class VendingMachine {

    private StockManager stockManager;

    public VendingMachine(StockManager stockManager) {
        this.stockManager = stockManager;
    }

    public int getInsertedMoney() {
        return 0;
    }

    public boolean isEnabled(String item) {
        return stockManager.getStocks(item) > 0;
    }
}
