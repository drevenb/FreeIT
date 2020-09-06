import java.util.*;

public class Task15_met {

    public static void main(String[] args) {

        int[] array = new int[10];
        int temp = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length / 2; i++) {

            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}