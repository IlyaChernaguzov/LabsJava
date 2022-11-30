package Laba4;

import java.util.Arrays;

public class Task5 {

    public static void arrayMethod(int[] intArray) {
        for (int i: intArray) {
            if(intArray[0]  == 3 || intArray[intArray.length-1] == 3){
                System.out.println("true");
                break;

            } else {
                System.out.println("false");
                break;
            }
        }
    }
    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 3;
        intArray[1] = -3;
        intArray[2] = 7;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 4;
        intArray[6] = 0;

        System.out.println("array = " + Arrays.toString(intArray));
//        System.out.println("длинна массива = " + intArray.length);
        arrayMethod(intArray);


    }
}

// Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел.
// Длина массива должна быть больше или равна двум. Пример вывода:
//        array = 3, -3, 7, 4, 5, 4, 3
//        true
