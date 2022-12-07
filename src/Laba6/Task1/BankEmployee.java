package Laba6.Task1;

public class BankEmployee extends Human{

    protected String bank;

    public BankEmployee(String name, String surname, String bank) {

        super(name, surname);
        this.bank = bank;

    }

    public String getBank() {

        return bank;
    }

    @Override
    void getFullInfo() {

        System.out.println(this.getName());
        System.out.println(this.getSurname());
        System.out.println(this.getBank());

    }
}
