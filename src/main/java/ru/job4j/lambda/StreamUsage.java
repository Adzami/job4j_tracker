package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, -2, 3, -4));
        List<Integer> positive = numbers.stream()
                                    .filter(number -> number > 0)
                                    .collect(Collectors.toList());
    }
}
