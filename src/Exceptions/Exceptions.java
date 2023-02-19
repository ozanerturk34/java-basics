package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    private static Exceptions obj;

    private Exceptions(){};

    public static Exceptions getExceptions() {
        if(obj == null) {
            obj = new Exceptions();
        }
        return obj;
    }

    public void print() throws FileNotFoundException {
        File file = new File("src/Exceptions/example.text");
        // try {
            Scanner readFile = new Scanner(file);
            String nextLine = readFile.nextLine();
            System.out.println("nextLine " +nextLine);
        // }  catch(FileNotFoundException e) {
        //     System.out.println("File not found in: " + file);
        // }
    };
}
