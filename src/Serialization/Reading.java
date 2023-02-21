package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reading {
    public void start() {
        System.out.println("Read");

        try(FileInputStream fileInput = new FileInputStream("src/Serialization/vehicle.data")){

            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            Vehicle vehicle1 = (Vehicle) objectInput.readObject();
            Vehicle vehicle2 = (Vehicle) objectInput.readObject();
            objectInput.close();

            System.out.println(vehicle1);
            System.out.println(vehicle2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
