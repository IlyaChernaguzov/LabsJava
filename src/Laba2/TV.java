package Laba2;

public class TV {
    private String brand;
    private MatrixType matrixType;
    private Integer dioganal;
    private Long price;
    private Double hdmi;
    private Integer hz;

//    public TV() { //конструктор без параметров
//
//    }

    public TV(String brand, MatrixType matrixType, Integer dioganal, Long price, Double hdmi, Integer hz) {
        this.brand = brand;
        this.matrixType = matrixType;
        this.dioganal = dioganal;
        this.price = price;
        this.hdmi = hdmi;
        this.hz = hz;

    }
}
