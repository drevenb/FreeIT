package spacecraft;

public class UFO implements IStart {

    public boolean preStartCheck() {

        int num = (int) (Math.random() * 10);

        if(num > 9) {
            return true;
        } else {
            return false;
        }
    }

    public void startEngine() {
        System.out.println("UFO engines are running. All systems are OK.");
    }

    public void start() {
        System.out.println("UFO is starting");
    }
}