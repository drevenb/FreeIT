package clothes.jackets;

public class BlackJacket implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Putting on black jacket.");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off black jacket.");
    }
}