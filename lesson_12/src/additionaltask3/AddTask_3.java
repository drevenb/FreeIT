package additionaltask3;

import java.io.*;
import java.util.*;

public class AddTask_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader readBadWords = new BufferedReader(new FileReader("src\\additionaltask3\\ForbiddenWords.txt"));
        BufferedReader readText = new BufferedReader(new FileReader("src\\additionaltask3\\text.txt"));

        String text = "";

        while(readText.ready()) {
            text += readText.readLine();
        }

        String[] arrayOfSentences = text.trim().split("\\.+");
        List<String> listOfBadWords = new ArrayList();
        List<String> listOfBadSentences = new ArrayList();

        while(readBadWords.ready()) {
            listOfBadWords.add(readBadWords.readLine());
        }

        for(String str: arrayOfSentences) {
            for(int i = 0; i < listOfBadWords.size(); i++) {
                if (str.contains(listOfBadWords.get(i))) {
                    listOfBadSentences.add(str);
                }
            }
        }

        if(listOfBadSentences.isEmpty()) {
            System.out.println("Text passed censorship check.");
        } else {
            System.out.println("Text didn't pass censorship check.");
            System.out.println("Bad sentences: " + listOfBadSentences.size());

            for(String str: listOfBadSentences) {
                System.out.println(str.trim() + ".");
            }
        }

        readBadWords.close();
        readText.close();
    }
}
