import java.io.*;

        /* This is the task number 25
            from the study book.*/

public class ATM {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ATM atm = new ATM(5, 5, 5);

        atm.addBill100(5);

        System.out.println("How much money do you want to get: ");

        atm.cashOut(Integer.parseInt(reader.readLine()));

        reader.close();
    }

    private int bill20;
    private int bill50;
    private int bill100;

    public ATM(int bill100, int bill50, int bill20) {

        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    public boolean cashOut(int money) {

        int count100 = 0, count50 = 0, count20 = 0;

        while(money > 0) {

            while(bill100 > 0 && money / 100 > 0) {
                bill100--;
                money -= 100;
                count100++;
            }

            while(bill50 > 0 && money / 50 > 0) {
                bill50--;
                money -= 50;
                count50++;
            }

            while(bill20 > 0 && money / 20 > 0) {
                bill20--;
                money -= 20;
                count20++;
            }

            if(money < 20 || (bill100 == 0 && bill50 == 0 && bill20 == 0)) {
                break;
            }
        }

        if(money == 0) {
            System.out.println("The operation was successful");

            if(count100 > 0) {
                System.out.println("You got " + count100 + " bills of 100$");
            }

            if(count50 > 0) {
                System.out.println("You got " + count50 + " bills of 50$");
            }

            if(count20 > 0) {
                System.out.println("You got " + count20 + " bills of 20$");
            }
        } else if(money > 0 || money < 0) {
            System.out.println("The operation was unsuccessful");
            return false;
        }

        return true;
    }

    public void addBill20(int bill20) {

        this.bill20 += bill20;
    }

    public void addBill50(int bill50) {

        this.bill50 += bill50;
    }

    public void addBill100(int bill100) {

        this.bill100 += bill100;
    }
}