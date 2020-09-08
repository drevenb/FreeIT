public class Task23_met {
    public static void main(String[] args) {
        String str = "<p id=\"p1\"> Some text here... </p>\n" +
                        "<p name = \"tag\"> Some text here...\n" +
                        "and here... </p>\n";

        String regex = "<p[^>]*>";

        System.out.println(str.replaceAll(regex, "<p>"));
    }
}
