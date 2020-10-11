package lesson_10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task31_met {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            list.add(1 + (int) (Math.random() * 9));
        }

        System.out.println("Our grades list: ");
        for(Integer mark: list) {
            System.out.print(mark + " ");
        }

        ListIterator<Integer> iterator = list.listIterator();

        int maxGrade = iterator.next();

        while(iterator.hasNext()) {
            if(maxGrade < iterator.next()) {
                maxGrade = iterator.previous();
            }
        }

        System.out.println("\nOur best grade is " + maxGrade);
    }
}
