package lesson9.solid.d.good;

import java.math.BigDecimal;

public class Shop {
    private Payments payments;

    public Shop(Payments payments) {
        this.payments = payments;
    }

    public void doPayment(BigDecimal amount) {
        payments.doTransaction(amount);
    }
}
