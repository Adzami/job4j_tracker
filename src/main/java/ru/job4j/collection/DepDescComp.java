package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] depts1 = o1.split("/");
        String[] depts2 = o2.split("/");
        int indexes = Math.min(depts1.length, depts2.length);
        if (depts1[0].equals(depts2[0])) {
            for (int i = 1; i < indexes; i++) {
                if (!depts1[i].equals(depts2[i])) {
                    return depts1[i].compareTo(depts2[i]);
                }
            }
        } else {
            return depts2[0].compareTo(depts1[0]);
        }
        return Integer.compare(depts1.length, depts2.length);
    }
}