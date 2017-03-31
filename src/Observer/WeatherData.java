package Observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by leonardo on 07/02/17.
 */
public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(o -> o.update( getTemperature(), getHumidity(), getPressure()));
    }

    private void measurementChange(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
