package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Writing {
    public void start() {
        System.out.println("Write");
        Vehicle car = new Vehicle(1,"BMW");
        Vehicle truck = new Vehicle(2,"MAN");
        System.out.println(car);
        System.out.println(truck);

        Vehicle[] vehicles = {new Vehicle(4,"Toyota"),new Vehicle(5,"Honda"),new Vehicle(6,"Mercedes")};
        System.out.println(vehicles);

        ArrayList<Vehicle> vehicleList = new ArrayList<>(Arrays.asList(vehicles));

        try (FileOutputStream fileOutput = new FileOutputStream("src/Serialization/vehicle.data")){
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(vehicles);
            objectOutput.writeObject(vehicleList);
            objectOutput.writeInt(vehicleList.size());
            objectOutput.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
