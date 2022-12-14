package Laba9;

import java.util.*;

public class Task3 {

    public static void GetValueMethod (Map<User, Integer> map){

        Scanner console = new Scanner(System.in);

        String name = console.nextLine();
        boolean isName = true;

        for (User user : map.keySet()) {
//            System.out.println(user.getName());
            if (name.equalsIgnoreCase(user.getName())) {
//                System.out.println(user);
//                System.out.println(user.getName());
                Integer num = map.get(user);
                System.out.println(num);
                isName = false;

            }

        } if (isName) {
            System.out.println("Name not founded");
        }
    }


    public static void main(String[] args) {

        User user1 = new User("Ivan");
        User user2 = new User("Petr");
        User user3 = new User("Alex");
        User user4 = new User("Vadim");

        Map<User, Integer> map = new HashMap<>();
        map.put(user1, 2);
        map.put(user2, 6);
        map.put(user3, 1);
        map.put(user4, 5);

        GetValueMethod(map);

    }
}
