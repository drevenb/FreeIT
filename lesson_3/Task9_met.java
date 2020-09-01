public class Task9_met {

    public static void main(String[] args) {

        long fact = 1;
        int number = (int) (Math.random() * 20);

        while(number == 0) {
            number = (int) (Math.random() * 20);
        }

        System.out.print("factorial " + number + " = ");

        while(number != 1) {
            fact *= number;
            number--;
        }

        System.out.println(fact);
    }
}