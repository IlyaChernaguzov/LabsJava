package lesson5.functionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> printer = integer -> System.out.println(integer + " рублей");

        printer.accept(600);
    }
}
