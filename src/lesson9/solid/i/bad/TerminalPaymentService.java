package lesson9.solid.i.bad;

public class TerminalPaymentService implements Payments {
    @Override
    public void payWebMoney() {
        //logic
    }

    @Override
    public void payCreditCard() {
        //logic
    }

    @Override
    public void payPhoneNumber() {
        throw new RuntimeException();
    }
}
