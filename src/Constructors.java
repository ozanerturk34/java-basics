class Program {
    int value;
    String text;
    // this is a constructor. It needs to be the same name as the class itself
    public Program() {
        this(12);
        System.out.println("First Constructor");
    }
    public Program(int value) {
        System.out.println("Second Constructor");
        this.value = value;
    }
    public Program(int value,String text) {
        System.out.println("Third Constructor");
        this.value = value;
        this.text = text;
    }
}
public class Constructors {
    public static void print() {
        Program myProgram = new Program();
        int value = myProgram.value;
        System.out.println(value);
        Program secondProgram = new Program(10);
        int value2 = secondProgram.value;
        System.out.println(value2);
        String text2 = secondProgram.text;
        System.out.println(text2);
        Program thirdProgram = new Program(6,"yo");
        int value3 = thirdProgram.value;
        String text = thirdProgram.text;
        System.out.println(value3);
        System.out.println(text);

    }
}
