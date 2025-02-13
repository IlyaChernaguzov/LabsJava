package lesson5.functionalInterface;

import lesson3.oop.polymorphism.User;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<User> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            if (name.length() > 12) {
                return new User(name.substring(0, 12));
            }
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());
    }

    static class User {
        static String name;

        public User(String name) {
            User.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
