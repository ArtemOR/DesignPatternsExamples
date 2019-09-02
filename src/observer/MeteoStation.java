package observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {
    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int temperature, int pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.handleEvent(temperature, pressure));
    }
}
