package Laba6.Task2;

public abstract class Human implements Interface{

    String name;
    String surname;

    public Human(String name, String surname) {

        this.name = name;
        this.surname = surname;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }
}