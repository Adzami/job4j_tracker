package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CalcFunction {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        while (start < end) {
            result.add(func.apply((double) start++));
        }
        return result;
    }
}
