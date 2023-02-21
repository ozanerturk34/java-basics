package Serialization;

public class Serialization {
    public void print() {
        Reading reading = new Reading();
        Writing writing = new Writing();
        writing.start();
        reading.start();
        System.out.println("Serialization");
    }
}
