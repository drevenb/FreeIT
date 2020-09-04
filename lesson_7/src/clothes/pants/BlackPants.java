package clothes.pants;

public class BlackPants implements Pants {

    @Override
    public void putOn() {
        System.out.println("Putting on black pants.");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off black pants.");
    }
}