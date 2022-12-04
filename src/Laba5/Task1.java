package Laba5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void stringMethod(String text) {

        String [] textArr = text.split("\\b\\W+\\b");
//        System.out.println(Arrays.toString(textArr));

        String max = "";
        for(int i = 0; i < textArr.length; i++){
            if(textArr[i].length() >= max.length()){
                max = textArr[i];
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {

        String text = "A Java Developer is a programmer who designs, develops, and manages Java-based applications and software. With most large organizations using Java to implement software systems and backend services, a Java developer is one of the most sought-after jobs today.";
        stringMethod(text);
    }
}
