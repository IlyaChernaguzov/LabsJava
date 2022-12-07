package Laba6.Task2;

public class Client extends Human {

    public String bank;

    public Client(String name, String surname, String bank) {

        super(name, surname);
        this.bank = bank;

    }

    public String getBank() {

        return bank;
    }


    @Override
    public void getFullInfo() {

        System.out.println(this.getName());
        System.out.println(this.getSurname());
        System.out.println(this.getBank());

    }
}
