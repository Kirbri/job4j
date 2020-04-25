package sort;


import java.util.Arrays;

public class Machine {
    private static final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int surrender = money - price;


        for (int i = 0; i < COINS.length; i++) { //третий вариант
            while (surrender >= COINS[i]) {
                surrender -= COINS[i];
                rsl[size++] = COINS[i];
            }
        }

//        for (int index : COINS) {// Второй вариант реализации
//            while (surrender >= index) {
//                surrender -= index;
//                rsl[size++] = index;
//            }
//        }

//        int surrender = money - price; //Первый вариант, мой, который никому не понравился :D
//        while (surrender > 0) {
//            for (int i = 0; i < COINS.length;) {
//                if (surrender - COINS[i] >= 0) {
//                    surrender -= COINS[i];
//                    rsl[size++] = COINS[i];
//                } else {
//                    i++;
//                }
//            }
//        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Machine().change(40, 10)));
    }
}
