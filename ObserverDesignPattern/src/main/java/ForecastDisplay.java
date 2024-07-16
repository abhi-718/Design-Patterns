public class ForecastDisplay implements Observer1, DisplayElement{

    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this); //dependency Injection
    }

    @Override
    public void display() {
        System.out.println("Forecast Display Statistics::  "+temperature+ "F degrees and "+humidity + "% humidity" +pressure+ " pascal");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
