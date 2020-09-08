public class Task21_met {
    public static void main(String[] args) {

        String str = "hello";
        StringBuilder strBuilder = new StringBuilder("hello");
        StringBuffer strBuffer = new StringBuffer("hello");

        long startTime = System.nanoTime();
        for(int i = 0; i < 20; i++) {
            str += str;
        }
        long endTime = System.nanoTime();
        long stringTime = endTime - startTime;
        System.out.println("String concatenation = " + stringTime + " nanoseconds.");

        startTime = System.nanoTime();
        for(int i = 0; i < 20; i++) {
            strBuilder.append(strBuilder);
        }
        endTime = System.nanoTime();
        long builderTime = endTime - startTime;
        System.out.println("StringBuilder = " + builderTime + " nanoseconds.");

        startTime = System.nanoTime();
        for(int i = 0; i < 20; i++) {
            strBuffer.append(strBuffer);
        }
        endTime = System.nanoTime();
        long bufferTime = endTime - startTime;
        System.out.println("StringBuffer = " + bufferTime + " nanoseconds.");

        long mostEfficient = stringTime > builderTime ? builderTime : stringTime;
        mostEfficient = mostEfficient > bufferTime ? bufferTime : mostEfficient;

        if(mostEfficient == stringTime) {
            System.out.println("String is the most efficient.");
        } else if(mostEfficient == builderTime) {
            System.out.println("StringBuilder is the most efficient.");
        } else if(mostEfficient == bufferTime) {
            System.out.println("StringBuffer is the most efficient.");
        }
    }
}