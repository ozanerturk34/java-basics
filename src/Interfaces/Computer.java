package Interfaces;

public class Computer implements Information {
    private int serialNumber = 1;

    public void start() {
        System.out.println("Computer Started");
    }

    public void display() {
        System.out.println("display");
    }
}
