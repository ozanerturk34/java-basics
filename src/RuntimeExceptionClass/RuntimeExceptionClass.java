package RuntimeExceptionClass;

public class RuntimeExceptionClass {
    private static RuntimeExceptionClass obj;
    private RuntimeExceptionClass() {};
    public static RuntimeExceptionClass getRuntimeExceptionClass() {
        if(obj == null) {
            obj = new RuntimeExceptionClass();
        }
        return obj;
    }
    public void start() {
        String[] numbers = {"one","two","three"};
        System.out.println(numbers[3]);
    }
}
