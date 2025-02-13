package lesson3.oop.inheritance;

public class Demo {

    public static void main(String[] args) {
        AbstractPhone mtc = new SmartPhone(2012, 4, "Android");
        mtc.call(89995456664L);

        mtc = new CellPhone(1980, 10);
        mtc.call(89995456664L);

        //mtc полиморфная переменная
    }
}
