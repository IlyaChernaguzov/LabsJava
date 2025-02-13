package lesson3.oop.link;

public class AnimalActivity {

    //ad hoc ведет по разному в зависимости от типа
    public static void eat(Animal animal) {
        System.out.println("Animal is eating");
        animal.makeSound();
    }

    public static void eat(Dog dog) {
        System.out.println("Dog is eating");
    }

}
