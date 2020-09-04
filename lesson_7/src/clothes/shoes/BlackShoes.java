package clothes.shoes;

public class BlackShoes implements Shoes {

    @Override
    public void putOn() {
        System.out.println("Putting on black shoes.");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off black shoes.");
    }
}