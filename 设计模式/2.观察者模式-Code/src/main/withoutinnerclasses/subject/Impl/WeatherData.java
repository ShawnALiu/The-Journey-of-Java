package main.withoutinnerclasses.subject.Impl;

import java.util.ArrayList;
import java.util.List;

import main.withoutinnerclasses.observer.Observer;
import main.withoutinnerclasses.subject.Subject;

/**
 * @author liu zhen
 * @create 2021/7/26
 */
public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observerList.indexOf(o);
        if (index >= 0) {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementschanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementschanged();
    }
}
