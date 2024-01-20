package observer.display;

import observer.WeatherData;
import observer.observer.Observer;

public class HeatIndexDisplay implements Display, Observer {

    private WeatherData weatherData;

    private float temperature;
    private float humidity;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    private float computeHeatIndex(float temp, float rh) {
        return (float) ((16.923 + (0.185212 * temp) + (5.37941 * rh) - (0.100254 * temp * rh) +
                (0.00941695 * (temp * temp)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (temp * temp * rh)) - (0.000814971 * (temp * rh * rh)) +
                (0.0000102102 * (temp * temp * rh * rh)) - (0.000038646 * (temp * temp * temp)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (temp * temp * temp * rh)) +
                (0.000000197483 * (temp * rh * rh * rh)) - (0.0000000218429 * (temp * temp * temp * rh * rh)) +
                0.000000000843296 * (temp * temp * rh * rh * rh)) -
                (0.0000000000481975 * (temp * temp * temp * rh * rh * rh)));
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        float heatIndex = computeHeatIndex(temperature, humidity);
        System.out.println("heatIndex = " + heatIndex);
    }
}
