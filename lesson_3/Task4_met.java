import java.io.*;

public class Task4_met {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter 4-digits number: ");

        int result = 0;
        int number = Integer.parseInt(reader.readLine());

        while(number > 0) {

            result = result * 10 + number % 10;

            number /= 10;
        }

        System.out.println("Result is " + result);

        reader.close();
    }
}