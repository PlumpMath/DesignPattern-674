package observerpattern.run;

import observerpattern.withjavaapi.CurrentConditionsDisplay;
import observerpattern.withjavaapi.ForecastDisplay;
import observerpattern.withjavaapi.StatisticsDisplay;
import observerpattern.withjavaapi.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
		currentConditionsDisplay.register(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);

		currentConditionsDisplay.remove(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
