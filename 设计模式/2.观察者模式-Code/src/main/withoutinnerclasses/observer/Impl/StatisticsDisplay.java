package main.withoutinnerclasses.observer.Impl;

import java.util.ArrayList;
import java.util.List;

import main.withoutinnerclasses.displayElement.DisplayElement;
import main.withoutinnerclasses.observer.Observer;
import main.withoutinnerclasses.subject.Impl.WeatherData;

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
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        temperatureList.add(temperature);
        aveTemperature = (float) temperatureList.stream().mapToDouble(Float::doubleValue).average().getAsDouble();
        maxTemperature = (float) temperatureList.stream().mapToDouble(Float::doubleValue).max().getAsDouble();
        minTemperature = (float) temperatureList.stream().mapToDouble(Float::doubleValue).min().getAsDouble();
        display();
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
