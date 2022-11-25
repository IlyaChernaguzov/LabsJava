package Laba3; //laba3-3

public class House {
    public Integer floors;
    public Integer year;
    public String name;


    public House() {
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;

    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Integer oldHouse() {
        int old;
        old = 2022 - year;
        return old;
    }

}




class Main2 {
    public static void main(String[] args) {
        House house = new House();

        house.setFloors(4);
        house.setYear(1994);
        house.setName("Cottage");

        System.out.println(house.getFloors());
        System.out.println(house.getYear());
        System.out.println(house.getName());

        System.out.println(house.oldHouse());

        House house2 = new House();

        house2.setFloors(2);
        house2.setYear(1969);
        house2.setName("Townhouse");

        System.out.println(house2.getFloors());
        System.out.println(house2.getYear());
        System.out.println(house2.getName());

        System.out.println(house2.oldHouse());

    }
}





