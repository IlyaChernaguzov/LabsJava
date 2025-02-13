package lesson4.sorted;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getStatus().getNumber(), o2.getStatus().getNumber());
    }
}
