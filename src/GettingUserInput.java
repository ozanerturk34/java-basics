import java.util.Scanner;

public class GettingUserInput {
    public static void print() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an decimel number: ");
        double aDouble = input.nextDouble();
        System.out.println("You have entered " + aDouble);
    }
}
