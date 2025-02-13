package lesson5.srteam;

import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        final List<String> list = List.of("one", "two", "three");

        lazy(list);

//        list.stream()
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.length() <= 3;
//                })
//                .sorted()
//                .map(s1 -> {
//                    System.out.println("map: " + s1);
//                    return s1.toUpperCase();
//                })
//                .forEach(x -> {
//                    System.out.println("forEach: " + x);
//                });



    }


    public static void lazy(List<String> list) {
        System.out.println("Starting print element to stream");
        Stream<String> peek = list.stream().peek(System.out::println); //Промежуточная операция
        System.out.println("Finish print element to stream");
        peek.toList(); //Терминальная операция
    }
}
