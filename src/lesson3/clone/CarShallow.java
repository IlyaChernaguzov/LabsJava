package lesson3.clone;

public class CarShallow implements Cloneable {

    private int vin;
    private String name;
    private Driver driver;

    public CarShallow(int vin, String name, Driver driver) {
        this.vin = vin;
        this.name = name;
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public CarShallow clone() throws CloneNotSupportedException {
        return (CarShallow) super.clone();
    }

    @Override
    public String toString() {
        return "CarShallow{" +
                "vin=" + vin +
                ", name='" + name + '\'' +
                ", driver=" + driver +
                '}';
    }
}
