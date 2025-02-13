package lesson5.functionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        System.out.println(multiply.apply(5, 7));
        System.out.println(multiply.apply(8, 10));
    }
}
