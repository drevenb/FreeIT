import java.util.*;

public class Task14_met {

    public static void main(String[] args) {

        int[] array = new int[10];

        for(int i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * 9);
        }

        int min = array[0], max = array[0];

        for(int i = 0; i < array.length - 1; i++) {

            if(min > array[i+1]) {
                min = array[i+1];
            }

            if(max < array[i+1]) {
                max = array[i+1];
            }
        }

        System.out.println(Arrays.toString(array));

        System.out.println("MIN mark is " + min);
        System.out.print("MIN positions are ");

        for(int i = 0; i < array.length; i++) {

            if(min == array[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nMAX mark is " + max);
        System.out.print("MAX positions are ");

        for(int i = 0; i < array.length; i++) {

            if(max == array[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}