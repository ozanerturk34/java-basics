package LinkedHashMapClass;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapClass {
    public void print(){
        // Difference with HashedMap is it keeps the order of values
        LinkedHashMap<Integer,String> hashMap = new LinkedHashMap<>();
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        sortedMaps(hashMap);
        sortedMaps(treeMap);
    }

    public void sortedMaps(Map<Integer,String> map) {

        map.put(4,"dog");
        map.put(5,"cat");
        map.put(6,"bird");
        map.put(7,"fish");
        map.put(8,"tiger");
        map.put(9,"lion");
        for(Integer number:map.keySet()){
            String food = map.get(number);
            System.out.println(number+": "+food);
        }
    }
}
