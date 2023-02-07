import java.util.Scanner;

public class GettingUserInput {
    public static void print() {

        // Following code belongs to a previous lecture

        /**
        System.out.println("Enter an decimel number: ");
        double aDouble = input.nextDouble();
        System.out.println("You have entered " + aDouble);
         */

        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a number: ");
            num = input.nextInt();
        } while(num < 9);
        System.out.println("Your number is "+num+" which is bigger than 8");

    }
}
