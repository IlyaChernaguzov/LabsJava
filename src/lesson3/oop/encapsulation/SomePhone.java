package lesson3.oop.encapsulation;

import java.time.LocalDate;

public class SomePhone {

    private int year;
    private String company;

    public SomePhone(int year, String company) {
        this.year = year;
        this.company = company;
    }

    private void openConnection() {
        //findComutator
        //openNewConnection
    }

    public void call() {
        openConnection();
        System.out.println("Вызываю номер");
    }

    public void ring() {
        System.out.println("Дзынь-дзынь");
    }

}
