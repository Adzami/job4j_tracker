package ru.job4j.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static Map<String, Student> convertToMap(List<Student> students) {
        return new HashMap<>(students.stream()
                            .collect(Collectors.toMap(
                                    Student::getSurname,
                                    e -> e,
                                    (surname1, surname2) -> surname2)
                            ));
    }
}
