package HashSetClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetClass {
    public void print(){
        HashSet<String> hashSet = new HashSet<>();
        if(hashSet.isEmpty()) { // true
            System.out.println("is Empty");
        }
        hashSet.add("green");
        if(hashSet.isEmpty()) { // false
            System.out.println("is still Empty");
        }
        hashSet.add("red");
        hashSet.add("red");
        hashSet.add("yellow");
        System.out.println(hashSet);

        // Keeps the order unlike HashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("green");
        linkedHashSet.add("red");
        linkedHashSet.add("red");
        linkedHashSet.add("yellow");
        System.out.println(linkedHashSet);
        if(linkedHashSet.contains("green")) {
            System.out.println("has the color green");
        }

        // Keeps the order unlike HashSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("green");
        treeSet.add("red");
        treeSet.add("red");
        treeSet.add("yellow");
        System.out.println(treeSet);
        if(treeSet.contains("green")) {
            System.out.println("has the color green");
        }
    }
}
