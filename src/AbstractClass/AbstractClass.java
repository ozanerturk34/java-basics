package AbstractClass;

public class AbstractClass {
    private static AbstractClass obj;
    private AbstractClass() {};
    public static AbstractClass getAbstractClass(){
        if(obj == null) {
            obj = new AbstractClass();
        }
        return obj;
    };
    public void start(){
        Car car1 = new Car();
        car1.setEngine("1.6");
        String carEngine = car1.getEngine();
        System.out.println(carEngine);
        car1.drive();

        Truck truck1 = new Truck();
        truck1.setEngine("2.2");
        String truckEngine = truck1.getEngine();
        System.out.println(truckEngine);
        truck1.drive();

    };
}
