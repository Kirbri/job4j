package tracker;

import java.util.List;

public class ShowItem implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> item = tracker.findAll();
        for (int i = 0; i < item.size(); i++) {
            System.out.println(item.get(i).toString());
        }
        return true;
    }
}
