package transport;

public class Truck extends LandTransport {

    private double loadCapacity;

    public double getLoadCapacity() { return loadCapacity; }
    public void setLoadCapacity(double loadCapacity) { this.loadCapacity = loadCapacity; }

    public Truck() {

        this.loadCapacity = 5.5;
    }

    public void isFits(double mass) {

        if(mass > getLoadCapacity()) {
            System.out.println("Ooops! You need a bigger truck.");
        } else if(mass < getLoadCapacity()) {
            System.out.println("You still have empty space for " + (getLoadCapacity() - mass) + " tons.");
        } else if(mass == getLoadCapacity()) {
            System.out.println("The truck loaded.");
        }
    }

    public void getCharacteristics() {
        System.out.println(super.toString() + "\nLoad Capacity = " + getLoadCapacity());
        System.out.println();
    }
}