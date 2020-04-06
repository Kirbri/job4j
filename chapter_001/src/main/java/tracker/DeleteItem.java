package tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        if (tracker.delete(id)) {
            System.out.println("Successfully deleted!");
        } else {
            System.out.println("Error!");
        }
        return true;
    }
}
