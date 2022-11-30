package Laba4;

import java.util.Scanner;

public class Task3 {
    public static void intMethod (int a, int b, int c) {
        if (c == a + b) {

            System.out.println("Результат: true");
        }
        else {
            System.out.println("Результат: false");
        }
    }
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = console.nextInt();
        System.out.println("Введите второе число: ");
        int b = console.nextInt();
        System.out.println("Введите третье число: ");
        int c = console.nextInt();

        intMethod (a, b, c);

    }

}


//    Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу.
//    Пример вывода:
//
//        Введите первое число: 5
//        Введите второе число: 10
//        Введите третье число: 15
//        Результат: true
