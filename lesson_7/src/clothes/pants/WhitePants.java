package clothes.pants;

public class WhitePants implements Pants {

    @Override
    public void putOn() {
        System.out.println("Putting on white pants.");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off white pants.");
    }
}