package ru.job4j.calculator;

public class MathFunc {
    public static void main(String[] args) {
        int func1 = MathFunc.func1(3);
        int result2 = MathFunc.func1(5);
        int result = MathFunc.func1(100);
        int total = func1 + result2;
        System.out.println(total);
    }

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = x * 10;
        return y;
    }
}
