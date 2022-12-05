package Laba6;

public class BankEmployee extends Human{

    protected static String bank;

    public BankEmployee(String name, String surname, String bank) {

        super(name, surname);
        this.bank = bank;

    }

    public static String getBank() {

        return bank;
    }

    @Override
    void getFullInfo() {

        System.out.println(BankEmployee.getName());
        System.out.println(BankEmployee.getSurname());
        System.out.println(BankEmployee.getBank());

    }
}
