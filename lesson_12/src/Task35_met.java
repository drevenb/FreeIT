package freeit.lesson_12;

import java.io.*;

public class Task35_met {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("file.dat")));

        for(int i = 0; i < 20; i++) {
            dos.writeInt((int) (Math.random() * 1000));
        }

        dos.close();

        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("file.dat")));
        int count = 0, sum = 0, num;
        double result;

        System.out.println("Our numbers: ");
        while(true) {
            try {

                num = dis.readInt();
                System.out.print(num + " ");
                sum+= num;
                count++;

            } catch(EOFException e) {
                break;
            }
        }

        result = (double) sum / count;
        System.out.println("\nAverage = " + result);
        dis.close();
    }
}
