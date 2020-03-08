package inheritance;

public class JSONReport extends TextReport {

    private static final String LS = System.lineSeparator();

    @Override
    public String generate(String name, String body) {
        return "{"+ LS + LS +
                "  name: " + name + LS +
                "  body: " + body + LS + LS +
                "}";
    }
}
