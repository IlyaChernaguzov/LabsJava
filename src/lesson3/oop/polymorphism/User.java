package lesson3.oop.polymorphism;

import lesson3.oop.inheritance.AbstractPhone;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(long number, AbstractPhone phone) {
        //вот и полиморфизм - использование в коде абстрактоного типа AbstractPhone phone
        //Полиморфная функция, которая принимает полиморфную переменную
        phone.call(number);

    }
}
