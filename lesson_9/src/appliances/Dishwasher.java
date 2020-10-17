package appliances;

public class Dishwasher extends KitchenAppls {
    private int capacity;

    @Override
    public void switchOn() {
        System.out.println("Washing up your dishes...");
    }

    public Dishwasher(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
