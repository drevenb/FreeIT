package spacecraft;

public class Runner {
    public static void main(String[] args) {

        SpacePort spacePort = new SpacePort();

        spacePort.launch(new Shuttle());
        spacePort.launch(new SpaceX());
        spacePort.launch(new UFO());
    }
}