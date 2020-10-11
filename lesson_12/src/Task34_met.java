package freeit.lesson_12;

import java.io.*;
import java.util.*;

public class Task34_met {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("\\src\\file2.txt"));

        List<Integer> list = new ArrayList<>();
        StringBuilder text = new StringBuilder();
        String regex = "\\D+";

        while(reader.ready()) {
            text.append(reader.readLine());
        }

        String[] arrayOfStrings = text.toString().trim().split(regex);

        for(int i = 0; i < arrayOfStrings.length; i++) {
            if(isNumber(arrayOfStrings[i])) {
                list.add(Integer.parseInt(arrayOfStrings[i]));
            }
        }

        int sum = 0;
        System.out.print("List of numbers: ");
        for(int num: list) {
            sum += num;
            System.out.print(num + " ");
        }

        System.out.println("\nSum of numbers: " + sum);

        Set<Integer> set = new HashSet<>(list);

        sum = 0;
        System.out.print("\nNumbers without repeats: ");
        for(int num: set) {
            sum += num;
            System.out.print(num + " ");
        }

        System.out.println("\nSum of numbers: " + sum);
    }

    public static boolean isNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}
