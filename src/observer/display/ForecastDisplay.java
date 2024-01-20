package observer.display;

import observer.WeatherData;
import observer.observer.Observer;

public class ForecastDisplay implements Display, Observer {

    private final WeatherData weatherData;

    private float currentPressure = 29.92F;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("currentPressure = " + currentPressure + ", lastPressure = " + lastPressure);
    }
}
