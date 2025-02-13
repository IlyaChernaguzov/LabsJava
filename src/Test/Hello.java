package Test;

public class Hello {
    public static void main(String[] args) {
        String msg = "Hello";
        change(msg);
        System.out.println(msg);
        msg = change(msg);
        System.out.println(msg);
    }

    public static String change(String msg){
        msg = msg + " world";
        return " java";    }
}
