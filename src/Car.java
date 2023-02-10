// Car is now a subclass of factory
// Factory is a super class of Car
// You can extend any class except final classes like String
public class Car extends Factory{

    public void brand() {
        System.out.println("Tesla");
    }

}
