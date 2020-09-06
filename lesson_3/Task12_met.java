import java.io.*;

public class Task12_met {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many numbers you want to add: ");

        int count = Integer.parseInt(reader.readLine());
        int result = 0;

        while(count > 0) {

            int number = (int) (Math.random() * 1000);

            if(number % 3 == 0) {
                result += number;
                count--;
            }
        }

        System.out.println(result);

        reader.close();
    }
}