package lesson_10;

import java.util.ArrayList;
import java.util.List;

public class Task29_met {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            list.add(1 + (int) (Math.random() * 9));
        }

        System.out.println("Our grades list: ");
        for(Integer mark: list) {
            System.out.print(mark + " ");
        }

        System.out.println();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4) {
                list.remove(i);
            }
        }

        System.out.println("Our good grades list: ");
        for(Integer mark: list) {
            System.out.print(mark + " ");
        }
    }
}
