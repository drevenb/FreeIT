public class Task1 {

    public static void main(String[] args) {

        double distance = 10;

        for(int i = 0; i < 7; i++) {
            distance *= 1.1;
        }

        System.out.printf("%.3f meters \n", distance);
    }
}