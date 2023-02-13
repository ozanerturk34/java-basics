package ToStringClass;

public class ToStringClass {
    private static ToStringClass obj;

    private ToStringClass(){};

    public static ToStringClass getToStringClass() {
        if(obj == null) {
            obj = new ToStringClass();
        }
        return obj;
    };

    public static void print() {
        Employee employee1 = new Employee(1,"Ozan");
        Employee employee2 = new Employee(2,"Ahmet");

        // Creates a string representation of the class.
        // Uses toString method. If there is no override toString method in the class
        // it returns unique class id: ToStringClass.Employee@5305068a
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
