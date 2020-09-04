package clothes.jackets;

public class WhiteJacket implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Putting on white jacket.");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off white jacket.");
    }
}