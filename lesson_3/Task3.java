public class Task3 {

    public static void main(String[] args) {

        int number = 1, sum =0;

        while(number != 512) {

            sum += number;

            number = number << 1;
        }

        System.out.println(sum);
    }
}