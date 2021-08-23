package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void sortAscending() {
        List<Item> items = Arrays.asList(
                new Item(3, "C"),
                new Item(1, "A"),
                new Item(2, "B")
        );
        items.sort(new SortItemsAsc());
        List<Item> expected = Arrays.asList(
                new Item(1, "A"),
                new Item(2, "B"),
                new Item(3, "C")
        );
        assertEquals(items.toString(), expected.toString());
    }

    @Test
    public void sortDescending() {
        List<Item> items = Arrays.asList(
                new Item(3, "C"),
                new Item(1, "A"),
                new Item(2, "B")
        );
        items.sort(new SortItemsDesc());
        List<Item> expected = Arrays.asList(
                new Item(3, "C"),
                new Item(2, "B"),
                new Item(1, "A")
        );
        assertEquals(items.toString(), expected.toString());
    }


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
        assertEquals(items.toString(), expected.toString());
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
        assertEquals(items.toString(), expected.toString());
    }
}