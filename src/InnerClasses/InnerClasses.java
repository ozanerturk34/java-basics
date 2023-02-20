package InnerClasses;

public class InnerClasses {
    private static InnerClasses obj;
    private InnerClasses() {};
    public static InnerClasses getInnerClasses() {
        if(obj == null) {
            obj = new InnerClasses();
        }
        return obj;
    }
    public void start(){
        Machine machine1 = new Machine(1);
        machine1.run();
        Machine.Tire tire = new Machine.Tire();
        tire.repair();
        System.out.println("Start");
    };

}
