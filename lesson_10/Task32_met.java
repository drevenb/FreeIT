package lesson_10;

import java.util.*;

public class Task32_met {
    public static void main(String[] args) {
        String text = "In today’s world, reading is basic to everyday life. As children we learn to read," +
                        " and as adults, we read to learn. We read to learn about the news, to learn about rules, " +
                        "and to learn about how to do things. We also use reading to learn English." +
                        "If you want to learn English more quickly, lots of reading is important. The more you read, " +
                        "the more input your brain gets about how the language works. When you read in English," +
                        " you can improve your vocabulary, your grammar, and your writing skills at the same time." +
                        "Reading is the best way to improve your vocabulary! The context of articles, stories," +
                        " and conversations helps you figure out and understand the meaning of English words " +
                        "in the text that are new to you. Reading also provides repetition of vocabulary words " +
                        "you have already learned to help you remember them." +
                        "Reading comprehension is easier if you already know the keywords in the reading. " +
                        "This is one reason that new vocabulary is presented and practiced at the beginning of " +
                        "each USA Learns unit. You learn the meaning and practice the pronunciation of the most " +
                        "important words that you will later read in video scripts and reading lessons.";

        text = text.toLowerCase();

        List<String> list = Arrays.asList(text.split("[ ,.!?]+"));
        Map<String, Integer> map = new TreeMap<>();

        for(String word: list) {

            if(!map.containsKey(word)) {

                int count = 0;

                for(String otherWord: list) {
                    if (word.equals(otherWord)) {
                        count++;
                    }
                }
                map.put(word, count);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, Integer> set = iterator.next();
            System.out.print(set.getKey());
            System.out.println(": " + set.getValue());
        }
    }
}
