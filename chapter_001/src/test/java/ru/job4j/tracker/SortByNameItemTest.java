package ru.job4j.tracker;

import org.junit.Test;
import tracker.Item;
import tracker.SortByNameItemDecrease;
import tracker.SortByNameItemIncrease;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class SortByNameItemTest {
    @Test
    public void sortIncrease() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("1", "One"));
        items.add(new Item("2", "Two"));
        items.add(new Item("3", "Three"));
        items.add(new Item("4", "Four"));
        items.sort(new SortByNameItemIncrease());
        assertThat(items.get(0).getName(), is("Four"));
    }

    @Test
    public void sortDecrease() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("1", "One"));
        items.add(new Item("2", "Two"));
        items.add(new Item("3", "Three"));
        items.add(new Item("4", "Four"));
        items.sort(new SortByNameItemDecrease());
        assertThat(items.get(0).getName(), is("Two"));
    }

    @Test
    public void sortTwoList() {
        List<Item> items1 = new ArrayList<Item>();
        items1.add(new Item("A", "A_One"));
        items1.add(new Item("B", "B_Two"));
        items1.add(new Item("C", "C_Three"));
        items1.add(new Item("D", "D_Four"));
        items1.sort(new SortByNameItemIncrease());
        List<Item> items2 = new ArrayList<Item>();
        items2.add(new Item("A", "A_One"));
        items2.add(new Item("B", "B_Two"));
        items2.add(new Item("C", "C_Three"));
        items2.add(new Item("D", "D_Four"));
        items2.sort(new SortByNameItemDecrease());
        Collections.reverse(items2);
        assertThat(items1, is(items2));
    }
}
