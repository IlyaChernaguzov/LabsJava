package Laba5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void stringMethod(String text) {
        Pattern p = Pattern.compile("\\b(\\б|\\Б)\\я\\к\\а\\b");
        Matcher m = p.matcher(text);
        System.out.println(text);
        while (m.find()) {
            String s = m.group();
//            System.out.println(m.group());
            String newText = m.replaceAll("[вырезано цензурой]");
            System.out.println(newText);
        }
    }





    public static void main(String[] args) {
        String text = "A Бяка Developer is a programmer who designs, develops, and manages бяка-based applications and software.";
        stringMethod(text);
    }
}
