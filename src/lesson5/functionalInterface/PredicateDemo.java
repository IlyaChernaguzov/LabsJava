package lesson5.functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };

        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));
    }
}
