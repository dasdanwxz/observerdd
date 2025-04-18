public class CurrentConditionsDisplay implements WeatherObserver {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherSubject weatherSubject) {
        weatherSubject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "°C and " + humidity + "% humidity");
    }
}
