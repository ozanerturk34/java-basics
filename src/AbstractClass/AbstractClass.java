package AbstractClass;

class Computer {
    public void shutdown() {
        System.out.println("Shuttind down the computer");
    }
}

interface Phone {
    default void call() {
        System.out.println("Calling");
    }
}

public class AbstractClass {
    public void print(){
        // creates an anonymous class on top of Computer
        Computer computer1 = new Computer() {
            @Override
            public void shutdown() {
                System.out.println("Shuttind X'' down the computer");
            }
        };
        computer1.shutdown();
        // Makes an anonymous class by utilising Interface Phone
        Phone phone1 = new Phone() {};
        phone1.call();
    };
}
