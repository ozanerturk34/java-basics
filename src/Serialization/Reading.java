package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Reading {
    public void start() {
        System.out.println("Read");

        try(FileInputStream fileInput = new FileInputStream("src/Serialization/vehicle.data")){

            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            Vehicle[] vehicles = (Vehicle[]) objectInput.readObject();
            ArrayList<Vehicle> vehicleList = (ArrayList<Vehicle>) objectInput.readObject();

            int size = objectInput.readInt();
            System.out.println(size);

            objectInput.close();
            for(Vehicle vehicle : vehicles){
                System.out.println(vehicle);
            }

            for(Vehicle vehicle : vehicleList) {
                System.out.println(vehicle);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
