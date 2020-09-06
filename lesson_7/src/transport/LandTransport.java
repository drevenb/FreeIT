package transport;

public abstract class LandTransport extends Transport {

    private int numberOfWheels;
    private double fuelConsumption;

    public int getNumberOfWheels() { return numberOfWheels; }
    public void setNumberOfWheels(int numberOfWheels) { this.numberOfWheels = numberOfWheels; }

    public double getFuelConsumption() { return fuelConsumption; }
    public void setFuelConsumption(double fuelConsumption) { this.fuelConsumption = fuelConsumption; }

    public LandTransport() {

        if(this instanceof PassengerCar) {

            this.numberOfWheels = 4;
            this.fuelConsumption = 15.2;

        } else if(this instanceof Truck) {

            this.numberOfWheels = 8;
            this.fuelConsumption = 20.5;
        }
    }

    public abstract void getCharacteristics();

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Wheels = " + getNumberOfWheels() +
                "\nFuel Consumption = " + getFuelConsumption();
    }
}