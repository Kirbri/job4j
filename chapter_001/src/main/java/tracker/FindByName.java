package tracker;

public class FindByName implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findByName(input.askStr("Enter name: "));
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i].toString());
        }
        return true;
    }
}
