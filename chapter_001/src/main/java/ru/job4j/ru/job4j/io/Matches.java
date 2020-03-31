package ru.job4j.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static int infoAboutGamer(int gamer) {
        Scanner input = new Scanner(System.in);
        System.out.print("Сколько игрок " + gamer + "  заберёт спичек? ");
        int value = Integer.valueOf(input.nextLine());
        int result = 0;
        if (value>=1 & value<=3) {
            result = value;
            System.out.println("Вы взяли корректное число спичек!");
        } else {
            System.out.println("Вы не можете взять столько спичек! Посмотрите условия игры!");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int gamerWin = 0;

        System.out.println("Играет два человека, вы можете взять от 1 до 3 спичек! Победит тот, кто возьмёт последние спички!");
        System.out.println();
        while (matches > 0) {
            matches -= infoAboutGamer(1);
            if (matches <= 0) {
                gamerWin = 1;
                break;
            }

            System.out.println("На столе " + matches + " спичек.");

            matches -= infoAboutGamer(2);
            if (matches <= 0) {
                gamerWin = 2;
                break;
            }

            System.out.println("На столе " + matches + " спичек.");
        }
        System.out.println("Победил игрок №" + gamerWin);
    }
}
