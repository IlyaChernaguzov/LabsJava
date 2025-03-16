package lesson9.solid.i.good;

public class TerminalPaymentService implements CreditCardPayment, WebMoneyPayment{
    @Override
    public void payCreditCard() {
        //logic
    }

    @Override
    public void payWebMoney() {
        //logic
    }
}
