package Laba3; //laba3-4

public class Tree {
    private Integer age;
    private Boolean alive;
    private String name;

    public Tree(Integer age, Boolean alive, String name) {

        this.age = age;
        this.alive = alive;
        this.name = name;

    }

    public Tree(Integer age, String name) {

        this.age = age;
        this.name = name;

    }

    public Tree() {

        System.out.println("Пустой конструктор без параметров сработал");

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;

    }
}

class Main {
    public static void main(String[] args) {

        Tree tree1 = new Tree(100, true, "Oak");

        Tree tree2 = new Tree(20,"Fir");

        Tree tree3 = new Tree();

        tree3.setAge(50);

        System.out.println(tree1.getAlive());
        System.out.println(tree2.getName());
        System.out.println(tree3.getAge());

    }

}

