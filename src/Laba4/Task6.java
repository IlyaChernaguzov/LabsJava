package Laba4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 4;
        intArray[1] = -3;
        intArray[2] = 7;
        intArray[3] = 77;
        intArray[4] = 5;
        intArray[5] = 4;
        intArray[6] = 5;

        System.out.println("array = " + Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 1 || intArray[i] == 3){
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }
        }
    }
}

//Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
