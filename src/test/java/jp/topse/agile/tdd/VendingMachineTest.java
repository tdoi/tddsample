package jp.topse.agile.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by doi on 2018/02/13.
 */
public class VendingMachineTest {

    private StockManager stockManager = null;
    private VendingMachine vendingMachine = null;

    @Before
    public void setup()
    {
         stockManager = mock(StockManager.class);
         vendingMachine = new VendingMachine(stockManager);
    }

    @Test
    public void testAmountOfInsertedMoneyShouldBeZeroAtFirst()
    {
        int insertedMoney = vendingMachine.getInsertedMoney();

        assertThat(insertedMoney, is(0));
    }

    @Test
    public void testColaButtonIsEnabledIfColaIsNotOutOfStocks()
    {
        when(stockManager.getStocks("Cola")).thenReturn(10);

        boolean isColaEnabled = vendingMachine.isEnabled("Cola");

        assertThat(isColaEnabled, is(true));
        verify(stockManager, times(1)).getStocks("Cola");
    }

}
