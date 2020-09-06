package spacecraft;

public class SpacePort {

    public void launch(IStart spaceCraft) {

        if(!spaceCraft.preStartCheck()) {
            System.out.println("Prelaunch check failed!");
        } else {

            spaceCraft.startEngine();

            for(int i = 10; i > 0; i--) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            spaceCraft.start();
        }
    }
}