package Laba6.Task2;

public interface Interface {

    void getFullInfo();

    default String getName() {

        return null;
    }

    default String getSurname() {

        return null;
    }

}
