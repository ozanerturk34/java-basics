package SortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortStringLength implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        System.out.println(s1);
        System.out.println(s2);
        return s1.length()-s2.length();
    }
}

class SortInAlphabeticalOrder implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class SortInAlphabeticalReverseOrder implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

public class SortingLists {
    public void print() {
        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("white");
        System.out.println(colors);
        SortStringLength ssl = new SortStringLength();
        Collections.sort(colors,ssl);
        System.out.println(colors);
        SortInAlphabeticalOrder sao = new SortInAlphabeticalOrder();
        Collections.sort(colors,sao);
        System.out.println(colors);
        SortInAlphabeticalReverseOrder saro = new SortInAlphabeticalReverseOrder();
        Collections.sort(colors,saro);
        System.out.println(colors);


        List<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(22);
        values.add(21);
        values.add(25);
        values.add(26);
        System.out.println(values);
        Collections.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(values);

    }
}
