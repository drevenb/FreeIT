import java.io.*;

public class Task11_met {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number: ");

        int number = Integer.parseInt(reader.readLine());

        for(int i = number - 1; i > 1; i--) {

            if(number % i == 0) {

                System.out.println("This is NOT the prime number.");
                break;

            } else if(i == 2) {
                System.out.println("This is the prime number.");
            }
        }

        reader.close();
    }
}