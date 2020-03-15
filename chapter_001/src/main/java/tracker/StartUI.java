package tracker;

import org.w3c.dom.ls.LSOutput;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] item = tracker.findAll();
                for ( int i = 0; i < item.length; i++)
                    System.out.println(item[i].toString());

            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                String ID = input.askStr("Enter ID: ");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                if (tracker.replace(ID, item)) {
                    System.out.println("Successfully changed");// вывод об успешности операции
                } else {
                    System.out.println("Error");// вывод об ошибке
                }

            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                String ID = input.askStr("Enter ID: ");
                if (tracker.delete(ID)) {
                    System.out.println("Successfully deleted!");// вывод об успешности операции
                } else {
                    System.out.println("Error!");// вывод об ошибке
                }

            } else if (select == 4){
                System.out.println("=== Find item by Id ===");
                String ID = input.askStr("Enter ID: ");
                System.out.println(tracker.findById(ID));

            } else if (select == 5){
                System.out.println("=== Find items by name ===");
                Item[] item = tracker.findByName(input.askStr("Enter name: "));
                for ( int i = 0; i < item.length; i++)
                    System.out.println(item[i].toString());

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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
