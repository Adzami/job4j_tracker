package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MatrixToListTest {
    @Test
    public void convert() {
        Integer[][] numbers = {
                {1, 2},
                {3, 4}
        };
        List<Integer> rsl = MatrixToList.convert(numbers);
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertThat(rsl, is(expected));
    }
}