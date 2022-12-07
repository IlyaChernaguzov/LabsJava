package Laba6.Task5;

public class Child extends Parent{

    public String name;

    @Override
    public void getInfo() {
        System.out.print("Введите ваше имя:");
        if(getInfo.hasNextInt()) {
            System.out.println("Вы ввели неверное имя");

        } else {

            String name = getInfo.nextLine();
            System.out.println("Ваше имя: " + name);

        }
    }
}
