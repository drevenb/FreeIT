package freeit.lesson_12;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Task33_met {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(new File("\\src\\file.txt"));
        StringBuilder text = new StringBuilder();
        int countMarks = 0;

        while(reader.ready()) {
            int symbol = reader.read();

            if(symbol == ',' || symbol == '.' || symbol == '?' ||
                    symbol == '!' || symbol == ':' || symbol == ';' ||
                    symbol == '"' || symbol == '(' || symbol == ')') {
                countMarks++;
            }
            text.append((char) symbol);
        }

        List<String> list = Arrays.asList(text.toString().split("[ ,.:;()!?]+"));

        System.out.print("There are " + countMarks + " punctuation marks in the file");
        System.out.println(" and " + list.size() + " words.");
    }
}
