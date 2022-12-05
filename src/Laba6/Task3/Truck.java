package Laba6.Task3;

public class Truck extends Car{

    public Integer wheels;
    public Integer maxWeight;

    public Integer getWheels() {

        return wheels;
    }

    public void newWheels(Integer wheels) {

        this.wheels = wheels;
        System.out.println("Новое значение количества колес " + this.getWheels());

    }

    public Truck(int w, String m, char c, float s, Integer wheels, Integer maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public void outPut() {
        super.outPut();
    }

    public Truck() {
    }
}
