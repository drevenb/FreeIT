import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number where you want to count the digits: ");

        int number = Integer.parseInt(reader.readLine());
        int count = 0;

        if(number > 0) {
            System.out.println("Positive number.");
        } else if(number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Number is null");
        }

        while(number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println(count + " digits");

        reader.close();
    }
}