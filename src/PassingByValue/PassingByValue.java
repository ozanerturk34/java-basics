package PassingByValue;

public class PassingByValue {
    public void print() {
        // Passing primitive type
        int num = 10;
        System.out.println("1. number: "+num);
        display(num);
        System.out.println("4. number: "+num);

        // Passing non-primitive
        Cat cat1 = new Cat("lulu");
        System.out.println("1. "+cat1);
        display(cat1);
        System.out.println("4. "+cat1);
    }
    public void display(int num) {
        System.out.println("2. number: "+num);
        num = 15; // this assignment won't change the original num value in the parent component
        System.out.println("3. number: "+num);
    }
    public void display(Cat cat) {
        System.out.println("2. "+cat);
        cat.setName("kuku"); // This will change the original cat value in the parent component
        System.out.println("3. "+cat);
    }
}
