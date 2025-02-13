package lesson3.oop.encapsulation;

import java.time.LocalDate;

public class Demo {

    public static void main(String[] args) {
        SomePhone mtc = new SomePhone(2024, "MTC");
        mtc.ring();
        mtc.call();

    }

}
