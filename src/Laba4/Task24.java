package Laba4;

import java.util.Arrays;

public class Task24 {

    public static void arrayMethod(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            boolean isTrue = true;
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[i] == intArray[j] && i != j) {
                    isTrue = false;
                }
            }
            if(isTrue) {
                System.out.print("Первое уникальное число " + intArray[i]);
                break;
            }
        }
    }



    public static void main(String[] args) {
        int[] intArray = new int[6];

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 1;
        intArray[4] = 2;
        intArray[5] = 4;

        System.out.println("Array: " + Arrays.toString(intArray));

        arrayMethod(intArray);
    }
}



// Дан массив чисел. Найдите первое уникальное в этом массиве число.
// Например, для массива [1, 2, 3, 1, 2, 4] это число 3.

