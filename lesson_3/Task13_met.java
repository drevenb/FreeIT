import java.util.*;

public class Task13_met {

    public static void main(String[] args) {

        int[] array = new int[10];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        Arrays.sort(array);

        System.out.println(array[9]);
    }
}