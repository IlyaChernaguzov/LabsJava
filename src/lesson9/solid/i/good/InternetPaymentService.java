package lesson9.solid.i.good;

public class InternetPaymentService implements CreditCardPayment, PhoneNumberPayment, WebMoneyPayment{
    @Override
    public void payCreditCard() {
        //logic
    }

    @Override
    public void payPhoneNumber() {
        //logic
    }

    @Override
    public void payWebMoney() {
        //logic
    }
}
