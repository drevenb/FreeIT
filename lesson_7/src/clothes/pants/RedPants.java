package clothes.pants;

public class RedPants implements Pants {

    @Override
    public void putOn() {
        System.out.println("Putting on red pants.");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off red pants.");
    }
}