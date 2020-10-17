import java.io.*;

public class Task4 {

    public static void main(String[] args) throws IOException {

        int count = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter three numbers: ");

        for(int i = 0; i < 3; i++) {
            if(Integer.parseInt(reader.readLine()) > 0) {
                count++;
            }
        }

        System.out.println("Positive numbers = " + count);

        reader.close();
    }
}