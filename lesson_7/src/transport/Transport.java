package transport;

public abstract class Transport {

    private Transport transport;
    private int horsePower;
    private int maxSpeed;
    private int mass;
    private String brand;

    public int getHorsePower() { return horsePower; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }

    public int getMass() { return mass; }
    public void setMass(int mass) { this.mass = mass; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public Transport() {

        transport = this;

        if(this instanceof PassengerCar) {

            this.brand = "BMW";
            this.mass = 1700;
            this.maxSpeed = 250;
            this.horsePower = 200;

        } else if(this instanceof Truck) {

            this.brand = "Volvo";
            this.mass = 5000;
            this.maxSpeed = 180;
            this.horsePower = 500;

        } else if(this instanceof CivilAircraft) {

            this.brand = "Boeing";
            this.mass = 183_500;
            this.maxSpeed = 988;
            this.horsePower = 45_000;

        } else if(this instanceof MilitaryAircraft) {

            this.brand = "SU-27";
            this.mass = 16_300;
            this.maxSpeed = 2500;
            this.horsePower = 9000;
        }
    }

    public double getKilowatts(Transport transport) {
        return transport.horsePower * 0.74;
    }
    
    public abstract void getCharacteristics();

    @Override
    public String toString() {
        return "Brand = " + getBrand() +
                "\nHorse Power = " + getHorsePower() +
                "\nPower in kilowatts = " + getKilowatts(transport) +
                "\nMax Speed = " + getMaxSpeed() +
                "\nMass = " + getMass();
    }
}