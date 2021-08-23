package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("test@test.ru", "Sergey Klopkov");
        for (String key : map.keySet()) {
            System.out.println("Email: " + key + System.lineSeparator() + "Name: " + map.get(key));
        }
    }
}
