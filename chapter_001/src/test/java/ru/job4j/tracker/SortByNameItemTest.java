package ru.job4j.tracker;

import org.junit.Test;
import tracker.Item;
import tracker.SortByNameItemDecrease;
import tracker.SortByNameItemIncrease;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class SortByNameItemTest {
    @Test
    public void sortortIncrease() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("1", "One"));
        items.add(new Item("2", "Two"));
        items.add(new Item("3", "Three"));
        items.add(new Item("4", "Four"));
        items.sort(new SortByNameItemIncrease());
        assertThat(items.get(0).getName(), is("Four"));
    }

    @Test
    public void sortortDecrease() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("1", "One"));
        items.add(new Item("2", "Two"));
        items.add(new Item("3", "Three"));
        items.add(new Item("4", "Four"));
        items.sort(new SortByNameItemDecrease());
        assertThat(items.get(0).getName(), is("Two"));
    }
}
