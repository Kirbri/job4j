package ru.job4j.array;

import org.w3c.dom.ls.LSOutput;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length - 1; i++) {
            for (int j = 0; j < table.length - 1; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
