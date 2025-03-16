package lesson4.sorted;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        var user3 = new User(18, "Ivanov", "Ivan", UserStatus.NEW);
        var user2 = new User(25, "Petrov", "Petr", UserStatus.ORDINARY);
        var user1 = new User(30, "Semenov", "Semen", UserStatus.REGULAR);

        List<User> allUsers = Arrays.asList(user1, user2, user3);

        System.out.println("Before sorting: " + allUsers);
        Collections.sort(allUsers);
        System.out.println("After sorted: " + allUsers);


        Comparator<User> comparator = new UserComparator();
        System.out.println("Before sorting: " + allUsers);
//        allUsers.sort(comparator.reversed().thenComparing());
//        allUsers.sort(comparator.thenComparing());
        System.out.println("After sorted: " + allUsers);

//        allUsers.stream()
//                .sorted()
//                .forEach(System.out::println);
    }
}
