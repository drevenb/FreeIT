package transport;

public abstract class AirTransport extends Transport {

    private double wingspan;
    private int runwayLength;

    public double getWingspan() { return wingspan; }
    public void setWingspan(double wingspan) { this.wingspan = wingspan; }

    public int getRunwayLength() { return runwayLength; }
    public void setRunwayLength(int runwayLength) { this.runwayLength = runwayLength; }

    public AirTransport() {

        if(this instanceof CivilAircraft) {

            this.wingspan = 64.4;
            this.runwayLength = 3000;

        } else if(this instanceof MilitaryAircraft) {

            this.wingspan = 14.7;
            this.runwayLength = 650;
        }
    }

    public abstract void getCharacteristics();

    @Override
    public String toString() {
        return super.toString() +
                "\nWingspan = " + getWingspan() +
                "\nRunway Length = " + getRunwayLength();
    }
}