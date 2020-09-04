package clothes.shoes;

public class RedShoes implements Shoes {

    @Override
    public void putOn() {
        System.out.println("Putting on red shoes.");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off red shoes.");
    }
}