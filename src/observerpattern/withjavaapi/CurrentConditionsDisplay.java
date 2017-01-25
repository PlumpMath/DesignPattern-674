package observerpattern.withjavaapi;

import java.util.Observable;

public class CurrentConditionsDisplay extends MyObserver implements DisplayElement {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        super(observable);
    }

    public CurrentConditionsDisplay() {

    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
