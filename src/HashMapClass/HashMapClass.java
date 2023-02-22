package HashMapClass;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public void print() {
        System.out.println("HashMapClass");
        HashMap<Integer,String> values = new HashMap<>();
        values.put(2,"yo");
        values.put(3,"ko");
        values.put(4,"zo");
        System.out.println(values);
        System.out.println(values.get(2));

        for(Map.Entry<Integer,String> myAnimal:values.entrySet()){
            int key = myAnimal.getKey();
            String animal = myAnimal.getValue();
            System.out.println("key = "+key+" animal = "+animal);
        }

    }
}
