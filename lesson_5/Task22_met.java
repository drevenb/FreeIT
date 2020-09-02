import java.util.regex.*;

public class Task22_met {

    public static void main(String[] args) {

        String str = " this is 0x5Fthe  string0xFFwith hexadecimal 0x2B numbers  ";
        String regexp = "0[Xx][\\da-fA-F][\\da-fA-F]";

        Pattern pattern = Pattern.compile(regexp);
        Matcher m = pattern.matcher(str);

        while(m.find()) {
            System.out.println(m.group());
        }
    }
}