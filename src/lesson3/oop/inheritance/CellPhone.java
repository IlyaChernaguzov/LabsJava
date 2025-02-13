package lesson3.oop.inheritance;

public class CellPhone extends WirelessPhone {

    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(long outputNumber) {
        System.out.println("Вызов номера: " + outputNumber);
    }

    @Override
    public void ring(long inputNumber) {
        System.out.println("Вам звонит абонент: " + inputNumber);
    }
}
