package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] valueL = left.split("\\.");
        String[] valueR = right.split("\\.");
        Integer leftL = Integer.parseInt(valueL[0]);
        Integer rightR = Integer.parseInt(valueR[0]);
        return leftL - rightR;
    }
}
