package spacecraft;

public class SpaceX implements IStart {

    public boolean preStartCheck() {

        int num = (int) (Math.random() * 10);

        if(num > 1) {
            return true;
        } else {
            return false;
        }
    }

    public void startEngine() {
        System.out.println("SpaceX engines are running. All systems are OK.");
    }

    public void start() {
        System.out.println("SpaceX is starting");
    }
}