package lesson5.functionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> convert = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer + " рублей";
            }
        };

        String result = convert.apply(500);
        System.out.println(result);

    }
}
