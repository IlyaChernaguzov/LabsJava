package lesson5.functionalInterface;

public class OperationableGenericDemo {

    public static void main(String[] args) {
        OperationableGeneric<Integer> operation1 = (x, y) -> x + y;
        OperationableGeneric<String> operation2 = (x, y) -> x + y;

        System.out.println(operation1.operation(1, 2));
        System.out.println(operation2.operation("Hello", "Java"));

    }
}
