package ru.job4j.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        String player = "Победил первый игрок!";

        System.out.println("Играет два человека, вы можете взять от 1 до 3 спичек!");
        System.out.println();
        do {
            System.out.println("Спичек на столе - " + matches);
            System.out.print("Сколько первый игрок заберёт спичек? ");

            int value = Integer.valueOf(input.nextLine());
            if (value>=1 & value<=3) {
                matches = matches - value;
            } else {
                System.out.println("Вы ввели некорректное число!");
            }
            if (matches <= 0) {
                break;
            }
            System.out.println("Спичек на столе - " + matches);

            System.out.print("Сколько второй игрок заберёт спичек? ");

            value = Integer.valueOf(input.nextLine());
            if (value>=1 & value<=3) {
                matches = matches - value;
            } else {
                System.out.println("Вы ввели некорректное число!");
            }
            if (matches <= 0) {
                player = "Победил второй игрок!";
                break;
            }

        } while (matches > 0);
        System.out.println(player);
    }
}
