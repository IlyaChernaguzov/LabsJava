package Laba4;

import java.util.Arrays;

public class Task6 {

    public static int[] arrayMethod(int[] intArray) {
        boolean f = true;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 1 || intArray[i] == 3) {
                System.out.println("true");
                f = false;
                break;
            }
        } if (f) {System.out.println("false");}
        return intArray;
    }
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 4;
        intArray[1] = -3;
        intArray[2] = 7;
        intArray[3] = 77;
        intArray[4] = 1;
        intArray[5] = 33;
        intArray[6] = 5;

        System.out.println("array = " + Arrays.toString(intArray));
        arrayMethod(intArray);


    }
}

//Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
