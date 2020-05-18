package tracker;

import java.util.ArrayList;
import java.util.List;

public class StartUI {
//    реализация в CreateAction
//    public static void createItem(Input input, Tracker tracker) {
//        System.out.println("=== Create a new Item ====");
//        String name = input.askStr("Enter name: ");
//        Item item = new Item(name);
//        tracker.add(item);
//    }

//    реализация в ShowItem
//    public static void showItem(Tracker tracker) {
//        System.out.println("=== Show all items ===");
//        Item[] item = tracker.findAll();
//        for (int i = 0; i < item.length; i++) {
//            System.out.println(item[i].toString());
//        }
//    }

//    реализация в EditItem
//    public static void editItem(Input input, Tracker tracker) {
//        System.out.println("=== Edit item ===");
//        String id = input.askStr("Enter ID: ");
//        String name = input.askStr("Enter name: ");
//        Item item = new Item(name);
//        if (tracker.replace(id, item)) {
//            System.out.println("Successfully changed");
//        } else {
//            System.out.println("Error");
//        }
//    }

//    реализация в DeleteItem
//    public static void deleteItem(Input input, Tracker tracker) {
//        System.out.println("=== Delete item ===");
//        String id = input.askStr("Enter ID: ");
//        if (tracker.delete(id)) {
//            System.out.println("Successfully deleted!");
//        } else {
//            System.out.println("Error!");
//        }
//    }

//    реализация в FindById
//    public static void findById(Input input, Tracker tracker) {
//        System.out.println("=== Find item by Id ===");
//        String id = input.askStr("Enter ID: ");
//        if (tracker.findById(id) == null) {
//            System.out.println("Заявка не найдена");
//        } else {
//            System.out.println(tracker.findById(id));
//        }
//    }

//    реализация в FindByName
//    public static void findByName(Input input, Tracker tracker) {
//        System.out.println("=== Find items by name ===");
//        Item[] item = tracker.findByName(input.askStr("Enter name: "));
//        for (int i = 0; i < item.length; i++) {
//            System.out.println(item[i].toString());
//        }
//    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new CreateAction());
        actions.add(new ShowItem());
        actions.add(new EditItemAction());
        actions.add(new DeleteItemAction());
        actions.add(new FindByIdAction());
        actions.add(new FindByNameAction());
        actions.add(new ExitActionAction());
        new StartUI().init(validate, tracker, actions);
    }
}
