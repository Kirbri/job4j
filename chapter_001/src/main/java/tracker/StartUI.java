package tracker;

import org.w3c.dom.ls.LSOutput;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItem(Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] item = tracker.findAll();
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i].toString());
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Enter ID: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Successfully changed");
        } else {
            System.out.println("Error");
        }

    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Enter ID: ");
        if (tracker.delete(id)) {
            System.out.println("Successfully deleted!");
        } else {
            System.out.println("Error!");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        String id = input.askStr("Enter ID: ");
        if (tracker.findById(id) == null) {
            System.out.println("Заявка не найдена");
        } else {
            System.out.println(tracker.findById(id));
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        Item[] item = tracker.findByName(input.askStr("Enter name: "));
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i].toString());
        }

    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItem(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findById(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String ls = System.lineSeparator();
        System.out.println("Menu.");
        System.out.println("0. Add new Item" + ls
                +
        "1. Show all items" + ls
                +
        "2. Edit item" + ls
                +
        "3. Delete item" + ls
                +
        "4. Find item by Id" + ls
                +
        "5. Find items by name" + ls
                +
        "6. Exit Program");

    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
