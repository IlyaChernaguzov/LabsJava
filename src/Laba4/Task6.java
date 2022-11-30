package Laba4;

import java.util.Arrays;

public class Task6 {

    public static void arrayMethod(int[] intArray) {
        boolean isTrue = true;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 1 || intArray[i] == 3) {
                System.out.println("true");
                isTrue = false;
                break;
            }
        } if (isTrue) {System.out.println("false");}
    }
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 4;
        intArray[1] = -3;
        intArray[2] = 1;
        intArray[3] = 77;
        intArray[4] = 2;
        intArray[5] = 3;
        intArray[6] = 5;

        System.out.println("array = " + Arrays.toString(intArray));

        arrayMethod(intArray);

    }
}

//Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
