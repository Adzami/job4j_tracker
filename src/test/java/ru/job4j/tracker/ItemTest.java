package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void sortByNameAscending() {
        List<Item> items = Arrays.asList(
                new Item(3, "Z"),
                new Item(1, "X"),
                new Item(2, "Y")
        );
        items.sort(new SortItemsByNameAsc());
        List<Item> expected = Arrays.asList(
                new Item(1, "X"),
                new Item(2, "Y"),
                new Item(3, "Z")
        );
        assertEquals(items, expected);
    }

    @Test
    public void sortByNameDescending() {
        List<Item> items = Arrays.asList(
                new Item(3, "Z"),
                new Item(1, "X"),
                new Item(2, "Y")
        );
        items.sort(new SortItemsByNameDesc());
        List<Item> expected = Arrays.asList(
                new Item(3, "Z"),
                new Item(2, "Y"),
                new Item(1, "X")
        );
        assertEquals(items, expected);
    }
}