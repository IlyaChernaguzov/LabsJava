package Test;

public class Test2 {
    public static void main(String[] args) {
        Integer value = 1;
        change(value);
        System.out.println(value);

    }

    public static void change(Integer value){
        ++value;
    }
}
