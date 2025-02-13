package Test2;

import Test21.C;

public class D {

    {
        System.out.println("Не статическое поле класса D. Который ничей наследник");
        A.staticMethod();
        B.staticMethod();
        C.staticMethod();
    }
}
