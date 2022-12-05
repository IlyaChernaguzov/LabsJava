package Laba6.Task5;

import java.util.Scanner;

public class Parent {

    Scanner getAge = new Scanner(System.in);
    Scanner getName = new Scanner(System.in);

    public static Integer age;
    public String name;

//    public Scanner getGetInfo() {
//        return getInfo;
//    }

    public Parent (){}

    public Integer getAge() {
        return age;
    }

    public void setAge() {
        this.age = getAge.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = getName.nextLine();;
    }

    public String getInfo() {

        this.setAge();
        this.setName();

        String rez = "Ваш возраст " + this.getAge();
        System.out.println(rez);


        return rez;


    }



//    public Integer getInfo(){
//
//        return age;
//    }

}
