package tracker;

public class ExitActionAction implements UserAction {
    @Override
    public String name() {
        return "=== Exit the menu ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
