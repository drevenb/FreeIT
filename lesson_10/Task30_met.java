package lesson_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task30_met {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            list.add(1 + (int) (Math.random() * 9));
        }

        System.out.println("Our list: ");
        for(Integer num: list) {
            System.out.print(num + " ");
        }

        Set<Integer> set = new HashSet<>(list);

        System.out.println("\nOur list without repeats: ");
        for(Integer num: set) {
            System.out.print(num + " ");
        }
    }
}
