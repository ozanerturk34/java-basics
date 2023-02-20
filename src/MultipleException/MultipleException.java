package MultipleException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleException {
    private static MultipleException obj;

    private MultipleException() {};
    public static MultipleException getMultipleException() {
        if(obj == null) {
            obj = new MultipleException();
        }
        return obj;
    }
    public void start() throws IOException, ParseException {
        // throw new IOException();
        throw new ParseException("Yo",2);
    };

    public void example() throws IOException, FileNotFoundException {
throw new FileNotFoundException();
    };
}
