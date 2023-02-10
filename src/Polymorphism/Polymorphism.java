package Polymorphism;

public class Polymorphism {
     public static void print() {
         System.out.println("Polymorphism");
         Vehicle vehicle1 = new Vehicle();
         Car car1 = new Car();

         // Polymorphism works 1 one way. so vehicle2 can only inherit
         // methods that also exists on the vehicle.
         // Any method specific to car sub-class will be unreachable on vehicle2
         Vehicle vehicle2 = car1;
         vehicle1.design();
         vehicle2.design();
         car1.design();
         car1.ride();
         // vehicle2.ride(); gives error because vehicle2 doesn't have ride method
         createDesign(car1);
         createDesign(vehicle2);
         createDesign(vehicle1);
     }
     public static void createDesign(Vehicle vehicle) {
         vehicle.design();
     }
}
