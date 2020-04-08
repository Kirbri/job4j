package tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        Item itemSearch = tracker.findById(id);
        if (itemSearch == null) {
            System.out.println("Заявка не найдена");
        } else {
            System.out.println(itemSearch);
        }
        return true;
    }
}
