package sort;


import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int surrender = money - price;
        while (surrender > 0) {
            for (int i = 0; i < COINS.length;) {
                if (surrender - COINS[i] >= 0) {
                    surrender -= COINS[i];
                    rsl[size++] = COINS[i];
                } else {
                    i++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
