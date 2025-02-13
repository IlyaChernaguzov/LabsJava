package Laba6.Task1;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Human human1 = new BankEmployee("Petr", "Petrov", "Sber");
        Human human2 = new Client("Ivan", "Ivanov", "Alfa");

        human1.getFullInfo();
        human2.getFullInfo();

        Field field = human1.getClass().getDeclaredField("bank");
        field.setAccessible(true);
        field.set(human1, "T");

        human1.getFullInfo();


    }
}
