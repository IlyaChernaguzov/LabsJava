package Laba4;

import java.util.Arrays;

public class Task21 {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 2;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 55;
        intArray[6] = 1;

        System.out.println("array = " + Arrays.toString(intArray));

        for (int i = 0; i < intArray.length-1; i++) {

            if (intArray[i] > intArray[i+1]){
                System.out.println("Please, try again");
                break;
            } if (i == intArray.length-2) {System.out.println("OK");}


        }
    }
}

// Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
// Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”