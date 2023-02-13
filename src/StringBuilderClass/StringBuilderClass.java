package StringBuilderClass;

public class StringBuilderClass {
    private static StringBuilderClass obj;

    private StringBuilderClass() {}

    public static StringBuilderClass getStringBuilderClass() {
        if(obj == null) {
            obj = new StringBuilderClass();
        }
        return obj;
    }

    public static void print() {
        // We are creating 3 different string here.
        // Whenever we change a string, it takes an extra memory
        String example1 = "Hello!";
        example1 += " my name";
        example1 += " is David";
        System.out.println(example1);

        // Thus we use StringBuilder, which will only use a single reference
        // It will reassign the value to that so no extra memory usage
        StringBuilder example2 = new StringBuilder();
        example2.append("Hello!");
        example2.append(" my name");
        example2.append(" is David");

        String example2Text = example2.toString();
        System.out.println(example2Text);

        StringBuilder example3 = new StringBuilder("Hello!");
        String name = "David";
        example3.append(" my name").append(" is ").append(name);
        String example3Text = example3.toString();
        System.out.println(example3Text);

    }
}
