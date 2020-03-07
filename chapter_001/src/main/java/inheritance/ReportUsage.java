package inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        JSONReport report1 = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        System.lineSeparator();
        System.out.println(report1.generate("Report's name (2)", "Report's body (2)"));
    }
}
