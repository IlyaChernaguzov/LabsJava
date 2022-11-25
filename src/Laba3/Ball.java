package Laba3;//laba3-2

public class Ball {
    private String color;
    private String name;
    private Integer weight;

    public Ball(String color, String name, Integer weight) {

        this.color = color;
        this.name = name;
        this.weight = weight;

    }

    public Ball(String color) {

        this.color = color;

    }

    public Ball(String color, Integer weight) {

        this.color = color;
        this.weight = weight;

    }

    public Ball() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;

    }
}

class Main2 {
    public static void main(String[] args) {

        Ball ball1 = new Ball("orange", "basketball", 3);
        ball1.setColor("orange");
        ball1.setName("basketball");
        ball1.setWeight(3);
        System.out.println(ball1.getColor());
        System.out.println(ball1.getName());
        System.out.println(ball1.getWeight());

        Ball ball2 = new Ball("white", "volleyball", 2);
        ball2.setColor("white");
        ball2.setName("volleyball");
        ball2.setWeight(2);
        System.out.println(ball2.getColor());
        System.out.println(ball2.getName());
        System.out.println(ball2.getWeight());

    }

}
