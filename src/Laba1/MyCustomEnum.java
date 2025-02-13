package Laba1;

public enum MyCustomEnum {
    NEW("name"),
    MEDIUM("Medium"),
    PRO("Pro");

    private String name;

    MyCustomEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
