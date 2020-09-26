package appliances;

public class Microwave extends KitchenAppls {
    private int maxTemperature;

    @Override
    public void switchOn() {
        System.out.println("Heating your food up to " + getMaxTemperature() + " celsius.");
    }

    public Microwave(int capacity) {
        this.maxTemperature = capacity;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}
