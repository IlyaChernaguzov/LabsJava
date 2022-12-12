package Laba9;

import java.util.*;

public class Task1 {


    public static Set<Integer> CollectionsMethod(List<Integer> list){

        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);

        return set;
    }




    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);

        System.out.println(list);

        CollectionsMethod(list);

    }

}
