package Laba4;

import java.util.Arrays;

public class Task23 {

    public static void rePlaceArray(int[] intArray) {
        int j = intArray[0];

        if (intArray[0] != intArray[intArray.length - 1]) {
            intArray[0] = intArray[intArray.length - 1];
            intArray[intArray.length - 1] = j;
        }
    }

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 90;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 55;
        intArray[6] = 9;

        System.out.println("Array 1: " + Arrays.toString(intArray));

        rePlaceArray(intArray);

        System.out.println("Array 2: " + Arrays.toString(intArray));

    }

}


//Напишите метод, который меняет местами первый и последний элемент массива. Пример вывода:
//
//        Array 1: [5, 6, 7, 2]
//        Array 2: [2, 6, 7, 5]

