package Serialization;

import java.io.Serializable;

public class Vehicle implements Serializable {
    // transient values are initialized with default value
    // this field is not serialized
    private transient int id;
    private String brand;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Vehicle(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
