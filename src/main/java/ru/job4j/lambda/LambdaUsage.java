package ru.job4j.lambda;

import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String st1 = "This line is longer";
        String st2 = "Short line";
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("Compare desc length of \"" + left + "\" and \"" + right + "\"");
            return Integer.compare(right.length(), left.length());
        };
        System.out.println(cmpDescSize.compare(st1, st2));
    }
}
