package tracker;

public class Item {

    public Item() {
        super();
        System.out.println("load item");
    }

    public Item(String name) {
    }

    public static void main(String[] args) {
        Item item = new Item();
    }
}
