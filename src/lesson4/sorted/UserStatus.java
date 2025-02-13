package lesson4.sorted;

public enum UserStatus {
    NEW(1),
    ORDINARY(2),
    REGULAR(3);

    Integer number;

    UserStatus(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
