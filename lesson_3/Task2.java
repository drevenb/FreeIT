public class Task2 {

    public static void main(String[] args) {

        int amoebas = 1;

        for(int hours = 3; hours <= 24; hours += 3) {

            System.out.printf("After %d hours will be %d amoebas.\n", hours, amoebas = amoebas << 1);

        }
    }
}