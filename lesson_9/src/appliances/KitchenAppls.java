package appliances;

public abstract class KitchenAppls extends Appliances {
    private int power;

    public abstract void switchOn();

    public int getPower() {
        return power;
    }

    public void setPower(int capacity) {
        this.power = capacity;
    }
}
