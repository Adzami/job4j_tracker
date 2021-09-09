package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListToMapTest {
    @Test
    public void whenConvertToMap() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(10, "Surname1"),
                new Student(70, "Surname2"),
                new Student(80, "Surname2"),
                new Student(90, "Surname3")
        );
        Map<String, Student> rsl = ListToMap.convertToMap(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname1", new Student(10, "Surname1"));
        expected.put("Surname2", new Student(80, "Surname2"));
        expected.put("Surname3", new Student(90, "Surname3"));
        assertThat(rsl, is(expected));
    }
}