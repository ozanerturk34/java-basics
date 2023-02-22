package ArrayListClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListClass {
    public void print() {
        ArrayList<Integer> values1 = new ArrayList<>();
        // [0][1][2][3][4]
        LinkedList<Integer> value2 = new LinkedList<>();
        // [0]->[1]->[2]->[3]->[4]
        // ArrayList is really efficient to get certain element with index
        // LinkedList is really efficient to add elements to the middle of the list
        values1.add(20);
        values1.add(60);
        System.out.println(values1);
        System.out.println(values1.get(1));

        for(int i = 0; i <values1.size();i++) {
            System.out.println(i);
            System.out.println(values1.get(i));
        }
    }
}
