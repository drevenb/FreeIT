/* This is the task number 28
    from the study book.*/

import java.util.Arrays;

public class GenericArray<T> {
    public static void main(String[] args) {
        GenericArray<String> boxOfString = new GenericArray<>();
        GenericArray<Integer> boxOfIntegers = new GenericArray<>();

        boxOfString.array = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        boxOfIntegers.array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(boxOfString.get(2));
        System.out.println(boxOfIntegers.get(9));
        System.out.println(boxOfString);
    }

    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        try {
            return array[index];
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Array: " + Arrays.toString(array);
    }
}
