package main.withinnerclasses.observer;

import java.util.Observable;
import java.util.Observer;

import main.withinnerclasses.subject.WeatherData;
import main.withoutinnerclasses.displayElement.DisplayElement;

/**
 * @author liu zhen
 * @create 2021/7/26
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Condition:" + temperature + "F degree, " + humidity + "% humidity");
    }

}
