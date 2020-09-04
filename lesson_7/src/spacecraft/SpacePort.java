package spacecraft;

public class SpacePort {

    public void launch(IStart shuttle) {

        if(!shuttle.preStartCheck()) {
            System.out.println("Prelaunch check failed!");
        } else {

            shuttle.startEngine();

            for(int i = 10; i > 0; i--) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            shuttle.start();
        }
    }
}