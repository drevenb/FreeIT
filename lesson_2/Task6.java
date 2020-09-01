import java.io.*;

public class Task6 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two numbers you want to compare: ");

        int firstNum = Integer.parseInt(reader.readLine());
        int secondNum = Integer.parseInt(reader.readLine());

        if(firstNum > secondNum) {
            System.out.println(firstNum);
        } else if(firstNum < secondNum) {
            System.out.println(secondNum);
        }

        reader.close();
    }
}