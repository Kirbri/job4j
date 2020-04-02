package ru.job4j.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    static String nameGamer;

    public static int infoAboutGamer(int gamer) {
        if (gamer % 2 == 0){
            nameGamer = "второй";
        } else {
            nameGamer = "первый";
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Сколько спичек заберёт "+ nameGamer + " игрок?");
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
        int numberOfGamer = 1;

        System.out.println("Играет два человека, вы можете взять от 1 до 3 спичек! Победит тот, кто возьмёт последние спички!");
        System.out.println();
        while (matches > 0) {
            matches -= infoAboutGamer(numberOfGamer);
            if (matches <= 0) {
                break;
            }
            System.out.println("На столе " + matches + " спичек.");
            numberOfGamer++;
        }
        System.out.println("Победил " + nameGamer + " игрок!");
    }
}
