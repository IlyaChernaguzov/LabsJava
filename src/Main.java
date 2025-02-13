import Test2.A;
import Test2.B;
import Test2.D;
import Test21.C;

import java.util.*;
import java.util.stream.Stream;

import static Test2.A.FINAL;
import static Test2.A.publicStaticMethod;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Класс A");
//        A a = new A("name", "surname", "email");
//        System.out.println("_______________________________________________________________________");
//        System.out.println("Класс В созданный через переменную А");
//        A ab = new B("nameB", "surnameB", "emailB");
//        System.out.println("_______________________________________________________________________");
//        System.out.println("Класс В созданный через переменную B");
//        A bb = new B("nameB", "surnameB", "emailB", 26,"nameChaild");
//        System.out.println("_______________________________________________________________________");
//        System.out.println("Класс C созданный через переменную А");
//        A ac = new C("nameC", "surnameC", "emailC");
//        System.out.println("_______________________________________________________________________");
//        System.out.println("Класс C созданный через переменную B");
//        B bc = new C("nameC", "surnameC", "emailC", 30, "nameB");
//        System.out.println("_______________________________________________________________________");
//        System.out.println("Класс C созданный через переменную С");
//        C cc = new C("nameC", "surnameC", "emailC", "nameC");
//        System.out.println("_______________________________________________________________________");
//        System.out.println("Класс D");
//        D d = new D();
//        System.out.println("_______________________________________________________________________");
//        System.out.println("Метод класса А");
//        cc.method();
//        cc.publicMethod();
//        a.publicMethod();
//        bb.publicMethod();
//        publicStaticMethod();
//        System.out.println(FINAL);

        Stream.of(10,2,3,4,5,6)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .peek(System.out::println)
                .map(x -> x*2)
                .limit(2)
                .forEach(System.out::println);
//
        Set<String> hs = new HashSet<>();
        Set<String> lhs = new LinkedHashSet<>();
        Set<String> ts = new TreeSet<>();
        Map<String, String> lhm = new LinkedHashMap<>();

        int b = 0 & (16-1);
        System.out.println(b);



    }
}
