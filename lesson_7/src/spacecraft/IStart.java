package spacecraft;

public interface IStart {

    boolean preStartCheck();

    void startEngine();

    void start();
}