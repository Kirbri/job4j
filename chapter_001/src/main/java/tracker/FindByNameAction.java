package tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> item = tracker.findByName(input.askStr("Enter name: "));
        for (int i = 0; i < item.size(); i++) {
            System.out.println(item.get(i).toString());
        }
        return true;
    }
}
