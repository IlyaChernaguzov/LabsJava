package Laba6.Task5;

public class Child extends Parent{

    @Override
    public String getInfo() {

        this.setAge();
        this.setName();

        String rez = "Ваше имя " + this.getName();
        System.out.println(rez);

        return rez;
    }
}
