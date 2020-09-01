import java.io.*;

public class Task7_met {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter sides of the rectangle: ");

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Enter radius of the circle: ");

        int r = Integer.parseInt(reader.readLine());

        if(Math.sqrt(a * a + b * b) <= (2 * r)) {

            System.out.println("The circle can hide the rectangle.");

        } else {

            System.out.println("The circle can NOT hide the rectangle.");

        }

        reader.close();
    }
}