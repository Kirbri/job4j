package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int countLeft = 0;
        int countRight = 0;
        int countRsl = 0;
        while (countLeft < left.length && countRight < right.length) {
            if (left[countLeft] < right[countRight]) {
                rsl[countRsl] = left[countLeft];
                countRsl++;
                countLeft++;
            } else if (left[countLeft] > right[countRight]) {
                rsl[countRsl] = right[countRight];
                countRsl++;
                countRight++;
            } else {
                rsl[countRsl] = right[countRight];
                countRsl++;
                countRight++;
                rsl[countRsl] = left[countLeft];
                countRsl++;
                countLeft++;
            }
        }

        for (int i = countLeft; i < left.length; i++) {
            rsl[countRsl] = left[i];
            countRsl++;
        }

        for (int i = countRight; i < right.length; i++) {
            rsl[countRsl] = right[i];
            countRsl++;

        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
