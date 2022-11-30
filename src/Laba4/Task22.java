package Laba4;

import java.util.Arrays;
import java.util.Scanner;

public class Task22 {

    public static void arrayMethod(int number, int number1, int number2, int number3, int number4) {

        int[] intArray = new int[number];

        intArray[0] = number1;
        intArray[1] = number2;
        intArray[2] = number3;
        intArray[3] = number4;

        System.out.println("Result: " + Arrays.toString(intArray));

    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Array length: ");

        int number = console.nextInt();

        System.out.println("Numbers of array: ");

        int number1 = console.nextInt();
        int number2 = console.nextInt();
        int number3 = console.nextInt();
        int number4 = console.nextInt();

        arrayMethod(number, number1, number2, number3, number4);

    }
}

//Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4),
// затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов. Пример вывода:
//
//        Array length: 4
//        Numbers of array:
//        5
//        6
//        7
//        2
//        Result: [5, 6, 7, 2]
