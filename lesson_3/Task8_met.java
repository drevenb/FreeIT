import java.io.*;
import java.util.*;

public class Task8_met {

    public static void main(String[] args) throws IOException {

        Random rand = new Random();

        int x = rand.nextInt();

        if(x < 0) {
            x *= -1;
        }

        if(x % 10 == 1 && x % 100 != 11) {

            System.out.println(x + " рубль");

        } else if((x % 10 >= 2 && x % 10 <= 4)
                    && !(x % 100 >= 12 && x % 100 <= 14)) {

            System.out.println(x + " рубля");

        } else if((x % 10 >= 5 && x % 10 <= 9)
                    || (x % 100 >= 11 && x % 100 <= 19)
                    || x % 10 == 0) {

            System.out.println(x + " рублей");
        }
    }
}
