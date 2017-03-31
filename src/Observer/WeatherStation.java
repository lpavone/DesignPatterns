package Observer;

/**
 * Created by leonardo on 08/02/17.
 */
public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay =
                new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(24, 80, 40);
        weatherData.setMeasurements(26, 82, 42);
        weatherData.setMeasurements(28, 84, 44);


    }
}
