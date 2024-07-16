
public class CurrentConditionDisplay implements Observer1, DisplayElement {

    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(WeatherData weatherData) {
        System.out.println("hello");
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this); //dependency Injection
    }
    @Override
    public void display() {
        System.out.println("Current Conditions::  "+temperature+ "F degrees and "+humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
            this.temperature = temp;
            this.humidity = humidity;
    }
}
