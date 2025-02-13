package lesson2.nested;

public class AnonymousClassHowLocalMethodDemo {
    public void displayMessage(Message m) {
        System.out.println(m.greet() +
                " - это пример анонимного внутреннего класса в качестве аргумента");
    }

    public static void main(String[] args) {
        AnonymousClassHowLocalMethodDemo anonymousClassHowLocalMethodDemo = new AnonymousClassHowLocalMethodDemo();

        //передача анонимного внутреннего класса в качестве аргумента
        Message m = () -> "Hello";

        anonymousClassHowLocalMethodDemo.displayMessage(() -> "Hello");
    }
}
