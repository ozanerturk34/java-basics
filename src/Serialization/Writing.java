package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writing {
    public void start() {
        System.out.println("Write");
        Vehicle car = new Vehicle(1,"BMW");
        Vehicle truck = new Vehicle(2,"MAN");
        System.out.println(car);
        System.out.println(truck);

        try (FileOutputStream fileOutput = new FileOutputStream("src/Serialization/vehicle.data")){
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(car);
            objectOutput.writeObject(truck);
            objectOutput.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
