package Laba6;

public class Client extends Human{

    public static String bank;

    public Client(String name, String surname, String bank) {

        super(name, surname);
        this.bank = bank;

    }

    public static String getBank() {

        return bank;
    }


    @Override
    void getFullInfo() {

        System.out.println(Client.getName());
        System.out.println(Client.getSurname());
        System.out.println(Client.getBank());

    }
}
