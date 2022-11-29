package Laba4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = console.nextInt();
        System.out.println("Введите второе число: ");
        int b = console.nextInt();
        System.out.println("Введите третье число: ");
        int c = console.nextInt();


        if (a < b && b < c) {

            System.out.println("Результат: true");
        }
        else {
            System.out.println("Результат: false");
        }

    }
}


//	Напишите программу, которая принимает от пользователя три целых числа и возвращает true,
//	если второе число больше первого числа, а третье число больше второго числа. Пример вывода:
//
//        Введите первое число: 5
//        Введите второе число: 10
//        Введите третье число: 15
//        Результат: true

