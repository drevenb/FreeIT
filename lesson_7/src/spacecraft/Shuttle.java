package spacecraft;

public class Shuttle implements IStart {

    public boolean preStartCheck() {

        int num = (int) (Math.random() * 10);

        if(num > 3) {
            return true;
        } else {
            return false;
        }
    }

    public void startEngine() {
        System.out.println("Shuttle engines are running. All systems are OK.");
    }

    public void start() {
        System.out.println("Shuttle is starting");
    }
}