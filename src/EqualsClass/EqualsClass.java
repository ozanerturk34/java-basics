package EqualsClass;

public class EqualsClass {
    private static EqualsClass obj;

    private EqualsClass() {};

    public static EqualsClass getEqualsClass() {
        if(obj == null) {
            obj = new EqualsClass();
        }
        return obj;
    }

    public static void print() {
        Laptop laptop1 = new Laptop(1,"mac");
        Laptop laptop2 = new Laptop(1,"mac");

        // this returns false because these are 2 different objects
        System.out.println(laptop1==laptop2);

        // Since we override equals method, this will return true if if and brand is the same for 2 objects
        System.out.println(laptop1.equals(laptop2));

        int value1 = 8;
        int value2 = 5+3;
        System.out.println(value1 == value2);

        // although string is a class rather than primitive, this still works so no need to use .equals
        String a1 = "yes";
        String b1 = "yes";
        System.out.println(a1 == b1);

        // but here despite b2 is "yes" which is same with a2, it return false
        // so we need to use .equals for this
        String a2 = "yes";
        String b2 = "yesasd".substring(0,3);
        System.out.println(b2);
        System.out.println(a2==b2); // returns false
        System.out.println(a2.equals(b2)); // returns true


    }

}
