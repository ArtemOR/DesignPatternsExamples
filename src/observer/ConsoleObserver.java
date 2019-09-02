package observer;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println("The weather has been changed: temperature = "+temp + ", pressure = "+pressure);
    }
}
