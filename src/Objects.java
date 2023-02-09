class Methods {
String animal;
int value;
int month;
void run(int speed) {
    System.out.println("Running");
    System.out.println("Running with a speed of "+speed);
}
int calculateMonthsToBirthday() {
    int monthsLeft = 12 - month;
    return monthsLeft;
}
    void talk(String words) {
        System.out.println(String.format("Says: %s",words));
    }
    void timer(int minutes,double seconds) {
    System.out.println(String.format("It took %sm and %ss",minutes,seconds));
    }
}
public class Objects {
    public static void print() {
        Methods name = new Methods();
        name.animal = "Dog";
        name.value = 5;
        name.month = 10;
        name.run(15);
        String text = "Hello";
        name.talk(text);
        name.timer(5,5.12);
        System.out.println(name.calculateMonthsToBirthday());
    }
}
