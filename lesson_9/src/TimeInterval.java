        /* This is the task number 24
            from the study book.*/

public class TimeInterval {
    public static void main(String[] args) {

        TimeInterval intervalOne = new TimeInterval(459562013);
        TimeInterval intervalTwo = new TimeInterval(2, 54, 30);

        System.out.println("The first time interval contains " + intervalOne.getAllSeconds() + " seconds");
        System.out.println("The second time interval contains " + intervalTwo.getAllSeconds() + " seconds");

        if(intervalOne.compare(intervalTwo) == 1) {
            System.out.println("The first interval is bigger than the second");
        } else if(intervalOne.compare(intervalTwo) == -1) {
            System.out.println("The second interval is bigger than the first");
        } else if(intervalOne.compare(intervalTwo) == 0) {
            System.out.println("The intervals are equal");
        }
    }

    private long seconds;
    private int minutes;
    private int hours;

    public TimeInterval(long seconds) {
        this.seconds = seconds;
    }

    public TimeInterval(int hours, int minutes, long seconds) {

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public long getAllSeconds() {
        return seconds + (minutes * 60) + (hours * 3600);
    }

    public int compare(TimeInterval interval) {

        if(this.getAllSeconds() > interval.getAllSeconds()) {
            return 1;
        } else if(this.getAllSeconds() < interval.getAllSeconds()) {
            return -1;
        } else {
            return 0;
        }
    }

    public long getSeconds() { return seconds; }
    public void setSeconds(long seconds) { this.seconds = seconds; }

    public int getMinutes() { return minutes; }
    public void setMinutes(int minutes) { this.minutes = minutes; }

    public int getHours() { return hours; }
    public void setHours(int hours) { this.hours = hours; }
}