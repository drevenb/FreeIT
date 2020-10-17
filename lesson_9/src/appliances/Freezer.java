package appliances;

public class Freezer extends KitchenAppls {
    private int minTemperature;

    @Override
    public void switchOn() {
        System.out.println("Freezing your food down to " + getMinTemperature() + " celsius.");
    }

    public Freezer(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }
}
