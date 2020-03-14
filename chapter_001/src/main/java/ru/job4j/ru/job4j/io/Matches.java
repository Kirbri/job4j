package ru.job4j.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;

        System.out.println("Играет два человека, вы можете взять от 1 до 3 спичек!");
        System.out.println();
        do {
            System.out.println("Спичек на столе - " + matches);
            System.out.print("Сколько первый игрок заберёт спичек? ");
            matches = matches - Integer.valueOf(input.nextLine());
            System.out.println("Спичек на столе - " + matches);
            if (matches == 0){
                System.out.println("Первый игрок выиграл, УРА!");
                break;
            }
            System.out.print("Сколько второй игрок заберёт спичек? ");
            matches = matches - Integer.valueOf(input.nextLine());
            if (matches == 0){
                System.out.println("Второй игрок выиграл, УРА!");
                break;
            }
        } while (matches > 0);
    }
}
