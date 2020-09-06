import java.util.*;

public class Task16_met {

    public static void main(String[] args) {

        int[] array = new int[10];
        int minIndex = 0, maxIndex = 0, sum = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for(int i = 0; i < array.length - 1; i++) {

            if(array[minIndex] > array[i+1]) {
                minIndex = i + 1;
            }

            if(array[maxIndex] < array[i+1]) {
                maxIndex = i + 1;
            }
        }

        if(minIndex > maxIndex) {

            for(int i = maxIndex; i <= minIndex; i++) {

                sum += array[i];
            }
        } else if(minIndex < maxIndex) {

            for(int i = minIndex; i <= maxIndex; i++) {

                sum += array[i];
            }
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Sum elements between the smallest(" + array[minIndex] +
                            ") and the greatest(" + array[maxIndex] + ") numbers = " + sum);
    }
}