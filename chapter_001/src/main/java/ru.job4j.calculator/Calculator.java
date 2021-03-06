package ru.job4j.calculator;

/**
 * Class Класс для вычисления сложения двух чисел
 * @author KornilovaAnn
 * @since 22.02.2020
 * @version 1
 */

public class Calculator {

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(
                first,
                add(second, third)
        );
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        int size = 10;
        size = 100;
        size = size - 5;
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }

    /**
     *Сложение
     * @param first первый аргумент
     * @param second второй аргумент
     * сразу выводится результат
     */

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
}
