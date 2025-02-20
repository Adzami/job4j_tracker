package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item[size];
        int currSize = 0;
        for (int index = 0; index < size; index++) {
            if (items[index] != null) {
                result[currSize] = items[index];
                currSize++;
            }
        }
        result = Arrays.copyOf(result, currSize);
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int currSize = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                result[currSize] = items[index];
                currSize++;
            }
        }
        result = Arrays.copyOf(result, currSize);
        return result;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}