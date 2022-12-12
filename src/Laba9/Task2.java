package Laba9;

import java.math.BigDecimal;
import java.util.*;

public class Task2 {


    public static List<Integer> ListAddMethod(List<Integer> list) {

        for (int i = 0; i < 1000000L; i++) {
            list.add(i);
        }

        System.out.println(list);
        return list;
    }

    public static void ListGetMethod(List<Integer> list) {

        final Random random = new Random();
        int count = 0;

        while (count <= 100000) {

            int i = list.get(random.nextInt(list.size()));
            System.out.println(i);
            count++;

        }

    }


    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

        ListAddMethod(list);
        ListGetMethod(list);

    }
}
