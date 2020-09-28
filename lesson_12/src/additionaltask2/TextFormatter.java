package additionaltask2;

import java.io.*;

public class TextFormatter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src\\additionaltask2\\text.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\additionaltask2\\newText.txt"));
        String text = "";

        while(reader.ready()) {
            text += reader.readLine();
        }

        String[] arrayOfSentences = text.trim().split("[.!?]+");

        for(String str: arrayOfSentences) {
            if((TextFormatter.getNumberOfWords(str) >= 3 && TextFormatter.getNumberOfWords(str) <= 5) ||
                    TextFormatter.isContainsPalindrome(str)) {

                writer.write(str.trim() + ".\n");
            }
        }
        reader.close();
        writer.close();
    }

    public static int getNumberOfWords(String str) {
        String[] words = str.trim().split("[\\s,:-;\"']+");
        return words.length;
    }

    public static boolean isContainsPalindrome(String str) {
        String[] words = str.trim().split("[\\s,:-;\"']+");

        for(int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);

            if(words[i].equals(word.reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
