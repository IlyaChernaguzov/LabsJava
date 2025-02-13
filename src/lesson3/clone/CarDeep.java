package lesson3.clone;

public class CarDeep implements Cloneable {
    private int vin;
    private String name;
    private Driver driver;

    public CarDeep(int vin, String name, Driver driver) {
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
    public CarDeep clone() throws CloneNotSupportedException {
        CarDeep newCar = (CarDeep) super.clone();
        Driver driver =  this.getDriver().clone();
        newCar.setDriver(driver);
        return newCar;
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
