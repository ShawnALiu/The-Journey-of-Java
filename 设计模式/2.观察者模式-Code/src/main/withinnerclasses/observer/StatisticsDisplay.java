package main.withinnerclasses.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import main.withinnerclasses.subject.WeatherData;
import main.withoutinnerclasses.displayElement.DisplayElement;


/**
 * @author liu zhen
 * @create 2021/7/26
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float aveTemperature;
    private float maxTemperature;
    private float minTemperature;
    private List<Float> temperatureList;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        temperatureList = new ArrayList<>();
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object args) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            temperature= weatherData.getTemperature();
            temperatureList.add(temperature);
            aveTemperature = (float) temperatureList.stream().mapToDouble(Float::doubleValue).average().getAsDouble();
            maxTemperature = (float) temperatureList.stream().mapToDouble(Float::doubleValue).max().getAsDouble();
            minTemperature = (float) temperatureList.stream().mapToDouble(Float::doubleValue).min().getAsDouble();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Statistics: aveTemperature " + aveTemperature + "F degree, "
                + "maxTemperature " + maxTemperature + "F degree, "
                + "minTemperature " + minTemperature + "F degree");
    }

    public float getTemperature() {
        return temperature;
    }
}
