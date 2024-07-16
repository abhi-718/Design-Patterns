public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        currentConditionDisplay.display();
        forecastDisplay.display();
        statisticsDisplay.display();

        weatherData.setMeasurements(82, 70, 29.2f);
        currentConditionDisplay.display();
        forecastDisplay.display();
        statisticsDisplay.display();

        weatherData.setMeasurements(78, 90, 29.2f);
        currentConditionDisplay.display();
        forecastDisplay.display();
        statisticsDisplay.display();
    }
}
