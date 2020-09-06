package clothes.jackets;

public class RedJacket implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Putting on red jacket.");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off red jacket.");
    }
}