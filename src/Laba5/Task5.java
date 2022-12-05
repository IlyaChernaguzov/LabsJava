package Laba5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

    public static void stringMethod(String text) {
        String [] textArr = text.split("\\n");
        System.out.println(Arrays.toString(textArr));
        String pText = textArr[textArr.length-1];
        System.out.println(pText);

        StringBuilder builder = new StringBuilder();
        String [] split = pText.split(" ");
        for (int i = split.length - 1; i >= 0; i--) {

            builder.append(split[i])
                    .append(" ");

        }
        System.out.println(builder);

        StringBuilder builder2 = new StringBuilder(builder);
        builder2.reverse();
//        System.out.println(builder2);
        String text2 = builder2.toString().trim();
        System.out.println(text2);

    }



    public static void main(String[] args) {
        String text = "Sample Output:\n" +
                "The given string is: This is a test string\n" +
                "The string reversed word by word is:\n" +
                "sihT si a tset gnirts\n";
        stringMethod(text);

    }
}
