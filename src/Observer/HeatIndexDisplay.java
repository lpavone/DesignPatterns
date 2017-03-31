package Observer;

/**
 * Created by leonardo on 08/02/17.
 */
public class HeatIndexDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("HEAT_INDEX: Temperature: %f C and Humidity %f, it feels like really warm !", temperature, humidity));
    }
}
