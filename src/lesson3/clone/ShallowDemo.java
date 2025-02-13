package lesson3.clone;

public class ShallowDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        CarShallow car = new CarShallow(101,"BMW", new Driver("Bob", 45));
        CarShallow cloneCar = car.clone();

        System.out.println(car == cloneCar);

        System.out.println("Origin: " + car);
        System.out.println("Clone: " + cloneCar);

        Driver clonedCarDriver = cloneCar.getDriver();
        clonedCarDriver.setName("Joe");

        System.out.println("Origin after set new name: " + car);
        System.out.println("Clone after set new name: " + cloneCar);

        //Вложенный объект мы не клонировали
    }
}
