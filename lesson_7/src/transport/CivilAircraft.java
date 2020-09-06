package transport;

public class CivilAircraft extends AirTransport {

    private int numberOfPassengers;
    private boolean isBusinessClass;

    public int getNumberOfPassengers() { return numberOfPassengers; }
    public void setNumberOfPassengers(int numberOfPassengers) { this.numberOfPassengers = numberOfPassengers; }

    public boolean getIsBusinessClass() { return isBusinessClass; }
    public void setIsBusinessClass(boolean isBusinessClass) { this.isBusinessClass = isBusinessClass; }

    public CivilAircraft() {

        this.numberOfPassengers = 524;
        this.isBusinessClass = true;
    }

    public void isFreeSeats(int passengers) {

        if(passengers > getNumberOfPassengers()) {

            System.out.println("Ooops! You need a bigger airplane.");

        } else if(passengers < getNumberOfPassengers()) {

            System.out.println("You still have free " + (getNumberOfPassengers() - passengers) + " seats.");

        } else if(passengers == getNumberOfPassengers()) {

            System.out.println("The airplane loaded.");
        }
    }

    public void getCharacteristics() {
        System.out.println(super.toString() + "\nNumber of Passengers = " + getNumberOfPassengers() +
                                                "\nBusiness Class = " + getIsBusinessClass());
        System.out.println();
    }
}