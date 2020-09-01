import java.io.*;

public class Task3 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number: ");

        int number = Integer.parseInt(reader.readLine());

        if(number > 0) {
            number++;
        } else if(number < 0) {
            number -= 2;
        } else if(number == 0) {
            number = 10;
        }

        System.out.println(number);

        reader.close();
    }
}