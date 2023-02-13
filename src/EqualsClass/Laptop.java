package EqualsClass;

import java.util.Objects;

public class Laptop {
    private int id;
    private String brand;

    public Laptop(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "id: " + id + " brand: " + brand;
    }


    // User generator to override equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id && Objects.equals(brand, laptop.brand);
    }

    @Override
    // this is used to create class specific hash id
    // you can see this if you print the object without toString method
    // EqualsClass.Laptop@1a92f
    public int hashCode() {
        return Objects.hash(id, brand);
    }
}
