package lesson3.wrapper;

public class BoxingNumbersDemo {
    public static void main(String[] args) {
//        Double num = 8.0;
        Double num = Double.valueOf("8.0");

//        Double mum1 =  new Double("8.0");
        num += 5.0;

        System.out.println("Number: " + num);

        int i = 1;
        Integer j = i;
        int k = j.intValue();
    }
}
