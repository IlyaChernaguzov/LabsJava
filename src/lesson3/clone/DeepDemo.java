package lesson3.clone;

public class DeepDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        CarDeep car = new CarDeep(101,"BMW", new Driver("Bob", 45));
        CarDeep cloneCar = car.clone();

        System.out.println(car == cloneCar);

        System.out.println("Origin: " + car);
        System.out.println("Clone: " + cloneCar);

        Driver clonedCarDriver = cloneCar.getDriver();
        clonedCarDriver.setName("Joe");

        System.out.println("Origin after set new name: " + car);
        System.out.println("Clone after set new name: " + cloneCar);
    }
}
