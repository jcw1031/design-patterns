package observer.display;

import observer.WeatherData;
import observer.observer.Observer;

public class CurrentConditionsDisplay implements Display, Observer {

    private final WeatherData weatherData;

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("temperature = " + temperature + ", humidity = " + humidity);
    }
}
