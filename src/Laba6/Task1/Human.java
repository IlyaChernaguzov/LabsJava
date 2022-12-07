package Laba6.Task1;

public abstract class Human {

    String name;
    String surname;

    public Human(String name, String surname) {

        this.name = name;
        this.surname = surname;

    }

    abstract void getFullInfo();

    public String getName() {

        return name;
    }

    public String getSurname() {

        return surname;
    }
}