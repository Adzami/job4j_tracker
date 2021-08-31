package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] depts1 = o1.split("/");
        String[] depts2 = o2.split("/");
        if (depts1[0].equals(depts2[0])) {
            return o1.compareTo(o2);
        }
        return depts2[0].compareTo(depts1[0]);
    }
}