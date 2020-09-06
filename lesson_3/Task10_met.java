public class Task10_met {

    public static void main(String[] args) {

        for(int i = 10; i <= 15; i++) {

            int num = i;
            long fact = 1;

            while(num > 1) {
                fact *= num--;
            }

            System.out.println("Factorial " + i + " = " + fact);
        }
    }
}