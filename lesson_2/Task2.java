import java.io.*;

public class Task2 {

    public static void main(String[] args) throws IOException {

        int a,b,c;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 3 sides of the triangle:");

        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());

        if(a+b > c && a+c > b && b+c > a) {
            System.out.println("Triangle exists.");
        } else {
            System.out.println("Triangle doesn't exist.");
        }

        reader.close();
    }
}