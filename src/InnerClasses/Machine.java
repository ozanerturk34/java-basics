package InnerClasses;

public class Machine {
    private int id;
    class AI {
        public void activate() {
            System.out.println("Activate AI with id: "+id);
        }
    }
    // static sub-classes is used to group static class with the related class but it still acts like regular static class
    static class Tire {
        public void repair() {
            // System.out.println("Tires are repaired for id: "+id);
            // This doesn't work because class is static and it can only reach to static fields of outer class
            System.out.println("Repair tires");
        }
    }
    public Machine(int id) {
        this.id = id;
    }
    public void run() {
        System.out.println("Running machine with id: " + id);
        AI ai = new AI();
        ai.activate();
        final String type = "Electric";
        // this class is only reachable within the scope of run
        class Test {
            public void example() {
                System.out.println("example with id: " + id);
                System.out.println("Type of the machine is "+type);
            }
        }
        Test test1 = new Test();
        test1.example();
    }
    // This won't work because Test class only exists within the run method
    // public void noAccessToTestClass() {
    //    Test test2 = new Test();
    // }
}
