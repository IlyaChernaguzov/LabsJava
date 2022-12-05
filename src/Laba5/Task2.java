package Laba5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task2 {

    public static void stringMethod(String text) {

//        char[] chars = text.toCharArray();
//        System.out.println(Arrays.toString(chars));
//        char[] newChars = new char[chars.length];
//
//        for (int i = 0; i < chars.length; i++) {
//
//            newChars[chars.length - 1 - i] = chars[i];
//
//        } System.out.println(Arrays.toString(newChars));



        StringBuilder bulder = new StringBuilder(text);
        System.out.println(bulder);
        StringBuilder reverse = bulder.reverse();
        System.out.println(reverse);
        if (text.equalsIgnoreCase(reverse.toString())) {
            System.out.println("true");
        } else System.out.println("false");

    }




    public static void main(String[] args) {
        String text = "Level";
        stringMethod(text);

    }
}
