import java.util.Scanner;

public class Switch {
    public static void print() {
        Scanner input = new Scanner(System.in);

        // Variable types support by switch:
        // char, byte, short, int and String
        System.out.println("enter instructions:  ");
        String text = input.nextLine();
        switch(text) {
            case "run":
                System.out.println("Forest "+text);
                break;
            case "walk":
                System.out.println("Moon"+text);
                break;
            default:
                System.out.println("Nothing");

        }
        System.out.println("switch "+text);
    }
 }