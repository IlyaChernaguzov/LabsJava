package lesson3.oop.polymorphism;

import lesson3.oop.inheritance.AbstractPhone;
import lesson3.oop.inheritance.CellPhone;
import lesson3.oop.inheritance.SmartPhone;

public class Demo {

    public static void main(String args[]) {

//        Calculator.Sum sum = new Calculator.Sum();
//        Calculator.Sub sub = new Calculator.Sub();
//        Calculator.Mult mult = new Calculator.Mult();
//        Calculator.Div div = new Calculator.Div();
//
//        System.out.println(sum.sum(3, 2));
//        System.out.println(sub.sub(3.2, 3.0));
//        System.out.println(mult.mult(4L, 5L));
//        System.out.println(div.div(1.5, 0.5));


        AbstractPhone callPhone = new CellPhone(1980, 4);
        AbstractPhone smartPhone = new SmartPhone(2012, 10, "Android");

        User user = new User("Max");
        user.callAnotherUser(89995456664L, callPhone);
        user.callAnotherUser(89995456664L, smartPhone);

    }
}
