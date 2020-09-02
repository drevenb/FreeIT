public class Task23_met {

    public static void main(String[] args) {

        String str = "<!DOCTYPE HTML>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>“Â„ P</title>\n" +
                        "</head>\n" +
                        "<body\n\n" +

                            "<p style=\"text-align:right\">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diem\n" +
                            "nonummy nibh euismod tincidunt ut lacreet dolore magna aliguam erat volutpat.</p>\n" +
                            "<p id=îp1î>Ut wisis enim ad minim veniam, quis nostrud exerci tution ullamcorper\n" +
                            "suscipit lobortis nisl ut aliquip ex ea commodo consequat.</p>\n\n" +

                        "</body>\n" +
                        "</html>\n";

        String regex = "<p.*>";

        System.out.println(str.replaceAll(regex, "<p>"));
    }
}