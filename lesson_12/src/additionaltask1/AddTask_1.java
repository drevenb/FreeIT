package additionaltask1;

import java.io.*;

public class AddTask_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src\\additionaltask1\\file.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\additionaltask1\\palindromes.txt"));

        while(reader.ready()) {
            String word = reader.readLine();

            StringBuilder str = new StringBuilder(word);

            if(word.equals(str.reverse().toString())) {
                writer.write(word);
                writer.newLine();
            }
        }

        reader.close();
        writer.close();
    }
}
