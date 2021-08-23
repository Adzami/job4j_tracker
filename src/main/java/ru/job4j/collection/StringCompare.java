package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int size = Math.min(left.length(), right.length());
        for (int i = 0; i < size; i++) {
            if (left.charAt(i) - right.charAt(i) != 0) {
                return left.charAt(i) - right.charAt(i);
            }
        }
        if (left.length() - right.length() != 0) {
            return left.length() < right.length() ? -1 : 1;
        } else {
            return 0;
        }
    }
}