/* This is the task number 28
    from the study book.*/

import java.util.Arrays;

public class GenericArray<T> {
    public static void main(String[] args) {
        GenericArray<String> box = new GenericArray<>();
        GenericArray<Integer> box2 = new GenericArray<>();

        box.array = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        box2.array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(box.get(2));
        System.out.println(box2.get(9));
        System.out.println(box);
    }

    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        return "Array: " + Arrays.toString(array);
    }
}
