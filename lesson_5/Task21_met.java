import java.util.*;

public class Task21_met {
    public static void main(String[] args) {

        stringTest("hello");
        stringBuilderTest(new StringBuilder("hello"));
        stringBufferTest(new StringBuffer("hello"));
    }

    public static void stringTest(String str) {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 25; i++) {
            str += str;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("String concatenation = " + (endTime - startTime));
    }

    public static void stringBuilderTest(StringBuilder str) {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 25; i++) {
            str.append(str);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("StringBuilder = " + (endTime - startTime));
    }

     public static void stringBufferTest(StringBuffer str) {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 25; i++) {
            str.append(str);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("StringBuffer = " + (endTime - startTime));
    }
}