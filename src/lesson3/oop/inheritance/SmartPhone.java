package lesson3.oop.inheritance;

public class SmartPhone extends CellPhone {

    private String operationSystem;

    public SmartPhone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }

    @Override
    public void call(long outputNumber) {
        System.out.println("Вызов номера со смартфона: " + outputNumber);
    }

    @Override
    public void ring(long inputNumber) {
        super.ring(inputNumber);
    }

    public void install(String program) {
        System.out.println("Устанавливаю " + program + " для " + operationSystem);
    }
}
