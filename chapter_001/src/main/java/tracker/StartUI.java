package tracker;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                tracker.findAll();

            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.print("Enter ID: ");
                String ID = scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(ID, item)) {
                    System.out.println("Successfully changed");// вывод об успешности операции
                } else {
                    System.out.println("Error");// вывод об ошибке
                }

            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.print("Enter ID: ");
                String ID = scanner.nextLine();
                if (tracker.delete(ID)) {
                    System.out.println("Successfully deleted!");// вывод об успешности операции
                } else {
                    System.out.println("Error!");// вывод об ошибке
                }

            } else if (select == 4){
                System.out.println("=== Find item by Id ===");
                System.out.print("Enter ID: ");
                String ID = scanner.nextLine();
                tracker.findById(ID);

            } else if (select == 5){
                System.out.println("=== Find items by name ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                tracker.findByName(name);

            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String LS = System.lineSeparator();
        System.out.println("Menu.");
        System.out.println("0. Add new Item" + LS +
        "1. Show all items" + LS +
        "2. Edit item" + LS +
        "3. Delete item" + LS +
        "4. Find item by Id" + LS +
        "5. Find items by name" + LS +
        "6. Exit Program");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
