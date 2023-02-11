package Interfaces;

public interface SecondInterface {
    default void shout() {
        System.out.println("Shout");
    };
}
