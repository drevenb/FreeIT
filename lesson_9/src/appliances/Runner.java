package appliances;

        /* This is the task number 26
            from the study book.*/

public class Runner {
    public static void main(String[] args) {
        Microwave microWave = new Microwave(150);
        Freezer freezer = new Freezer(-10);
        Dishwasher dishwasher = new Dishwasher(30);

        microWave.setPower(700);
        microWave.setBrand("LG");
        microWave.setPrice(300);

        freezer.switchOn();
        dishwasher.switchOn();
    }
}
