class Methods {
String animal;
int value;
void run() {
    System.out.println("Running");
    System.out.println("My "+animal+" is "+value+" years old.");
}
}
public class Objects {
    public static void print() {
        Methods name = new Methods();
        name.animal = "Dog";
        name.value = 5;
        name.run();
    }
}
