package lesson3.oop.link;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.makeSound();
//        animal.makeSound(3);
//
//        AnimalActivity.eat(animal);

        Animal dogAnimal = new Dog();
//
//        dogAnimal.makeSound();//Динамическое связывание. Компилятор не знает на что будет ссылаться метод
//        AnimalActivity.eat(dogAnimal);
//
//        Dog dogAnimal2 = (Dog) dogAnimal;
//        AnimalActivity.eat(dogAnimal2);
//
        Dog dog = new Dog();
//        AnimalActivity.eat(dog);

        if (animal instanceof Dog) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
