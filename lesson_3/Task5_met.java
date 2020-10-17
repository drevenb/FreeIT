import java.io.*;

public class Task5_met {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter 4-digits number: ");

        int number = Integer.parseInt(reader.readLine());

        int first = number / 1000;
        int second = (number / 100) % 10;
        int third = (number / 10) % 10;
        int forth = number % 10;

        if((first != second && first != third && first != forth)
            && (second != third && second != forth) && (third != forth)) {

            System.out.println("All digits are different.");

        } else {

            System.out.println("You have the same digits in the number.");

        }

        reader.close();
    }
}