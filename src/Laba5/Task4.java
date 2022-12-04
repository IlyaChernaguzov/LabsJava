package Laba5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void stringMethod(String text1, String text2) {

        Pattern p = Pattern.compile(text2);
        Matcher m = p.matcher(text1);
        int count = 0;

        while (m.find()) {

            count++;

        } System.out.println(count);
    }





    public static void main(String[] args) {
        String text1 = "A Java Developer is a programmer who designs, develops, and manages Java-based applications and software. With most large organizations using Java to implement software systems and backend services, a Java developer is one of the most sought-after jobs today.";
        String text2 = "Java";
        stringMethod(text1, text2);
    }
}
