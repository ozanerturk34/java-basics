package ScannerClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClass {
    // Singleton Class
    public static ScannerClass obj;

    private ScannerClass(){};

    public static ScannerClass getScannerClass() {
        if(obj == null) {
            obj = new ScannerClass();
        }
        return obj;
    }
    public void print()  throws FileNotFoundException {
        // String url = "/Users/ozanerturk/IdeaProjects/Java_course/text.txt"; absolute path
        String url = "text.txt"; // relative path per project root
        File file = new File(url);
        Scanner text = new Scanner(file);

        while(text.hasNextLine()){
            String line = text.nextLine();
            System.out.println(line);
        }

        text.close();
    }
}
