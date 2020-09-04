package clothes;

import clothes.jackets.Jacket;
import clothes.pants.Pants;
import clothes.shoes.Shoes;

public class Human {
    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public Human(String name) {
        this.name = name;
    }

    public Human() { }

    public void getDressed(Jacket jacket, Pants pants, Shoes shoes) {

        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;

        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void undress() {

        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();

        jacket = null;
        pants = null;
        shoes = null;
    }
}