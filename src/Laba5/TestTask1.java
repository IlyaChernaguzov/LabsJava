package Laba5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTask1 {

    public static void stringMethod(String text) {

        Pattern p = Pattern.compile("\\b\\w+\\b");
        Matcher m = p.matcher(text);


        StringBuilder builder = new StringBuilder();
        while (m.find()) {

            String s = m.group();
            int num = s.length();
            builder.append(num).append(" ");

        }
        String string = builder.toString();
        System.out.println(string);

        String[] str = string.split(" ");
        System.out.println(Arrays.toString(str));
        Integer[] intarray = new Integer[str.length];
        int i = 0;
        for (String s : str) {
            intarray[i++] = Integer.parseInt(s);
        }

        System.out.println(Arrays.toString(intarray));
        Arrays.sort(intarray);
        System.out.println(intarray[intarray.length - 1]);

        int r = intarray[intarray.length - 1];


        Pattern x = Pattern.compile("\\b\\w+\\b");
        Matcher y = x.matcher(text);

            while (y.find()) {
                if (y.group().length() == r) {
                System.out.println(y.group());
                }
            }
        }





    public static void main(String[] args) {

        String text = "A Java Developer is a programmer who designs, develops, and manages Java-based applications and software. With most large organizations using Java to implement software systems and backend services, a Java developer is one of the most sought-after jobs today.";
        stringMethod(text);

    }

}