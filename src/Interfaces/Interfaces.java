package Interfaces;

public class Interfaces {
    public void print() {
        Computer computer1 = new Computer();
        computer1.start();
        computer1.display();

        Vehicle vehicle1 = new Vehicle("car");
        vehicle1.drive();
        vehicle1.shout();
        vehicle1.display();

        Information info = new Computer(); // since Computer implements information, we can call it like this
        info.display();

        Information info1 = vehicle1;
        info1.display();

        showInfo(info1);
    }

    private void showInfo(Information info) {
        info.display();
    }
}
