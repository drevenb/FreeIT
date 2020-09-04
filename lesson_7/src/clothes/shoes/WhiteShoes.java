package clothes.shoes;

public class WhiteShoes implements Shoes {

    @Override
    public void putOn() {
        System.out.println("Putting on white shoes.");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off white shoes.");
    }
}