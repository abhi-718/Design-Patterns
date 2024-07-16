import java.util.ArrayList;
import java.util.List;
import java.util.Observer;


/**
 * This class is our Subject Once the method changed then Outsider will call this class only.
 */

public class WeatherData implements Subject{

    private List<Observer1> observers;
    private float temperature;
    private float humidity;
    private float pressure;



    public WeatherData() {
        observers = new ArrayList<>();
    }



    public void setMeasurements(float temperature, float humidity,  float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyObserver();
    }


    @Override
    public void registerObserver(Observer1 observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer1 observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer1 observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }



}
