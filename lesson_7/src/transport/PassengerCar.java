package transport;

public class PassengerCar extends LandTransport {

    private String typeOfbody;
    private int numberOfPassengers;

    public String getTypeOfBody() { return typeOfbody; }
    public void setTypeOfBody(String typeOfbody) { this.typeOfbody = typeOfbody; }

    public int getNumberOfPassengers() { return numberOfPassengers; }
    public void setNumberOfPassengers(int numberOfPassengers) { this.numberOfPassengers = numberOfPassengers; }

    public PassengerCar() {

        this.typeOfbody = "Sedan";
        this.numberOfPassengers = 5;
    }

    public void getMaxDistance(double time) {

        double distance = time * getMaxSpeed();

        System.out.println("For the time " + time + " h, car " + getBrand() + " driving at maximum speed " + getMaxSpeed() + " km/h" +
                            " \nwill travel " + distance + " km and consume " + getConsumption(distance) + " liters of fuel.");
    }

    private double getConsumption(double distance) {
        return getFuelConsumption() * (distance / 100);
    }

    public void getCharacteristics() {
        System.out.println(super.toString() + "\nType of Body = " + getTypeOfBody() +
                                                "\nNumber of Passengers = " + getNumberOfPassengers());
        System.out.println();
    }
}