import java.io.*;

public class Task4 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two numbers you want to multiply: ");

        int result = 0;
        int firstNum = Integer.parseInt(reader.readLine());
        int secondNum = Integer.parseInt(reader.readLine());

        for(int i = 0; i < secondNum; i++) {
            result += firstNum;
        }

        System.out.println("Result is " + result);

        reader.close();
    }
}