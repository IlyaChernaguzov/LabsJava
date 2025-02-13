package Laba1;

public final class Main {

    private  static String string;
    private static int a;
    private static boolean b;
    private static Integer integer;
    private static Boolean aBoolean;

    static {
        System.out.println("Hello from static");
    }

    public Main(String string) {
        this.string = string;
        System.out.println("Hello from constructor");
    }

    public static void main(String[] args) {
//        int a = 7;
//        System.out.println(string);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(integer);
//        System.out.println(aBoolean);

        Main main = new Main("String");
//        main.nonStaticMethod();
//        Main.staticMethod();

        System.out.println(main.getClass().getClassLoader());
//        System.out.println(MyCustomEnum.NEW.getName());
//        System.out.println(MyCustomEnum.NEW.name());
//        System.out.println(MyCustomEnum.NEW.ordinal());

    }

//    private abstract void nonStaticMethod() {
//        System.out.println("Hello from nonStatic");
//    }

    public int staticMethod(int value) {

        System.out.println("Hello from static");
        return value;
    }

    public int staticMethod(long value) {

        System.out.println("Hello from static");
        return (byte) value;
    }
}