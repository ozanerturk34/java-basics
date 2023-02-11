package Interfaces;

// Class can extend only one class while can implement any number of interfaces
public class Vehicle implements Information,SecondInterface {

    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void drive() {
        System.out.println("Driving the vehicle");
    }

    public void display() {
        System.out.println("Display");
    }
}
