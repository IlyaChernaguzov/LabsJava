package lesson5.functionalInterface;

public class Demo {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public int getSum() {
                return 2 + 3;
            }
        };

        int sum = myInterface.getSum();

        System.out.println(sum);

    }
}
