public class Task3_met {

    public static void main(String[] args) {

        int s = 43500245;

        int seconds = s % 60;
        int minutes = (s - seconds) / 60;
        int min = (minutes % 60);
        int hours = (minutes - min) / 60;
        int h = hours % 24;
        int days = (hours - h) / 24;
        int d = days % 7;
        int weeks = (days - d) / 7;

        System.out.printf("%d minutes %d seconds\n", minutes, seconds);
        System.out.printf("%d hours %d minutes %d seconds\n", hours, min, seconds);
        System.out.printf("%d days %d hours %d minutes %d seconds\n", days, h, min, seconds);
        System.out.printf("%d weeks %d days %d hours %d minutes %d seconds\n", weeks, d, h, min, seconds);
    }
}