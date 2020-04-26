package sort;


import java.util.Arrays;

public class Machine {
    private static final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int surrender = money - price;
        for (int index : COINS) {
            while (surrender >= index) {
                surrender -= index;
                rsl[size++] = index;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
