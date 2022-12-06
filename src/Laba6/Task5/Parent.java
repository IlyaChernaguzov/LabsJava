package Laba6.Task5;

import java.util.Scanner;

public class Parent {

    public Integer age;

    Scanner getInfo = new Scanner(System.in);



    public void getInfo() {

        System.out.print("Введите ваш возрас:");

        if(getInfo.hasNextInt()) {

            int age = getInfo.nextInt();
            System.out.println("Ваш возраст: " + age);

        } else {

            System.out.println("Вы ввели неверный возраст");
        }

    }

}
