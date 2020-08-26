import java.io.*;

public class Task6_met {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number: ");

        int number = Integer.parseInt(reader.readLine());

        if(number >= 100 && number <= 999) {
            System.out.println("The number is three-digits.");
        } else {
            System.out.println("The number is NOT three-digits.");
        }

        if(number % 10 == 7) {
            System.out.println("The last digit is seven.");
        } else {
            System.out.println("The last digit is NOT seven.");
        }

        if(number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is NOT even.");
        }

        reader.close();
    }
}