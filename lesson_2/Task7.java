import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {

        String str = "программист";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите количество программистов: ");

        int programmers = Integer.parseInt(reader.readLine());

        if(programmers % 10 == 1 && programmers % 100 != 11) {

            System.out.println(programmers + " " + str);

        } else if((programmers % 10 >= 2 && programmers % 10 <= 4)
                    && !(programmers % 100 >= 12 && programmers % 100 <= 14)) {

            System.out.println(programmers + " " + str + "а");

        } else if((programmers % 10 >= 5 && programmers % 10 <= 9)
                    || (programmers % 100 >= 11 && programmers % 100 <= 19)
                    || programmers % 10 == 0) {

            System.out.println(programmers + " " + str + "ов");

        }

        reader.close();
    }
}
