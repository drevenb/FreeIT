package additionaltask4;

import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 1;
    private String model;
    private int speed;
    private double price;

    public Car(String model, int speed, double price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Model is " + model +
                "\nMaxSpeed is " + speed + " km\\h" +
                "\nPrice is " + price + " $";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
