public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Weather Station Observer Pattern Demo!");

        // Create the WeatherData subject
        WeatherData weatherData = new WeatherData();

        // Create and register displays (observers)
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        // Simulate weather changes
        System.out.println("\nFirst weather update:");
        weatherData.setMeasurements(25, 65, 1012);

        System.out.println("\nSecond weather update:");
        weatherData.setMeasurements(27, 70, 1013);

        System.out.println("\nThird weather update:");
        weatherData.setMeasurements(23, 90, 1010);

        System.out.println("\nDemo complete!");
    }
}