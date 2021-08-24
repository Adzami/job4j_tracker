package ru.job4j.pojo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Vasiliy Ivanovoch Pupkin");
        student.setGroup("AM15");
        student.setDate(LocalDateTime.now());
        // Мда, не надо было создавать дату типа LocalDateTime, наверное. Длинновато получилось.
        System.out.println("Student " + student.getFio()
                + " is in group " + student.getGroup()
                + " since "
                + student.getDate().format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)));
    }
}
