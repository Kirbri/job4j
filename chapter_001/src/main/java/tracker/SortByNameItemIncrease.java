package tracker;

import java.util.Comparator;

public class SortByNameItemIncrease implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}
