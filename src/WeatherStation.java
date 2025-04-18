public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // Create displays and register them as observers
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        // Simulate new weather measurements
        weatherData.setMeasurements(25, 65, 1012);
        weatherData.setMeasurements(27, 70, 1013);
        weatherData.setMeasurements(23, 90, 1010);
    }
}