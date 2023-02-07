public class StringClass {
    public static void printString() {
        int aNumber = 5;
        double aDouble = 9.5;
        java.lang.String text = "Hi";
        java.lang.String blank = " ";
        java.lang.String moreText = "Bob";
        java.lang.String hiThere = text+blank+moreText; // can add strings to each other
        System.out.println(aNumber);
        System.out.println(text);
        System.out.println(text+blank+moreText);
        System.out.println("Hi"+" "+"Bob");
        System.out.println(hiThere);
        System.out.println("My Number: "+aNumber+" "+aDouble); // can add numbers to string
    }
}
