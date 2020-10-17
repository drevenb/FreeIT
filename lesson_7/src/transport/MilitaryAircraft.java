package transport;

public class MilitaryAircraft extends AirTransport {

    private boolean isEjectionSystem;
    private int numberOfRockets;

    public boolean getIsEjectionSystem() { return isEjectionSystem; }
    public void setIsEjectionSystem(boolean isEjectionSystem) { this.isEjectionSystem = isEjectionSystem; }

    public int getNumberOfRockets() { return numberOfRockets; }
    public void setNumberOfRockets(int numberOfRockets) { this.numberOfRockets = numberOfRockets; }

    public MilitaryAircraft() {

        this.isEjectionSystem = true;
        this.numberOfRockets = 6;
    }

    public void eject() {

        if(isEjectionSystem) {
            System.out.println("Woohoo! Let's fly!");
        } else if(!isEjectionSystem) {
            System.out.println("Damn! Let's pray!");
        }
    }

    public void takeShot() {

        if(getNumberOfRockets() > 0) {

            System.out.println("Rocket is on the way...");
            setNumberOfRockets(getNumberOfRockets() - 1);

        } else if(getNumberOfRockets() == 0) {

            System.out.println("There are no ammo anymore. Go back to base!");
        }
    }

    public void getCharacteristics() {
        System.out.println(super.toString() + "\nEjection System = " + getIsEjectionSystem() +
                                                "\nNumber of Rockets = " + getNumberOfRockets());
        System.out.println();
    }
}