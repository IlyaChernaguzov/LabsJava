package lesson9.solid.d.bad;

import java.math.BigDecimal;

public class Shop {
    private Cash cash;

    public Shop(Cash cash) {
        this.cash = cash;
    }/*А если потребуется ещё инжектить другие варианты оплаты.
       Магазин не должен заботиться от том как будет проходить оплата. Его заботит только то,
       чтобы транзакция была проведена любым удобным способом */

    public void doPayment(Cash cash, BigDecimal amount) {
        cash.doTransaction(amount);
    }
}
