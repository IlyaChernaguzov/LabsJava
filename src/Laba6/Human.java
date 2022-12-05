package Laba6;

public abstract class Human {

    protected static String name;
    protected static String surname;

    public Human(String name, String surname) {

        this.name = name;
        this.surname = surname;

    }

    abstract void getFullInfo();

    public static String getName() {

        return name;
    }

    public static String getSurname() {

        return surname;
    }
}