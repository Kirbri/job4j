package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int number =2; number<=finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new PrimeNumber().calc(5));
    }
}
