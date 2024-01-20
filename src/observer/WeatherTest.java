package observer;

import observer.display.CurrentConditionsDisplay;
import observer.display.ForecastDisplay;
import observer.display.HeatIndexDisplay;

public class WeatherTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new HeatIndexDisplay(weatherData);
        new ForecastDisplay(weatherData);

        weatherData.updateMeasurements(10.8F, 34.2F, 102.3F);
        weatherData.updateMeasurements(10.5F, 34.3F, 101.9F);
    }
}
