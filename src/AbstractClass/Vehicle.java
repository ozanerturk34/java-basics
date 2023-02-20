package AbstractClass;

// Vehicle is the abstract class to build on top of
// It is generally not callable by itself
public abstract class Vehicle {
    private String engine;
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public abstract void drive();

}
