package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean flag = data[0];
        for (int i = 0; i < data.length - 1; i++) {
            if (flag != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
