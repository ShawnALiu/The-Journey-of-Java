package main.withoutinnerclasses.observer.Impl;

import main.withoutinnerclasses.displayElement.DisplayElement;
import main.withoutinnerclasses.observer.Observer;
import main.withoutinnerclasses.subject.Impl.WeatherData;

/**
 * 目前状况布告板
 * @author liu zhen
 * @create 2021/7/26
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    /**
     * 创建观察者，传入主题，直接将该观察者加入到主题的订阅队列
     * @param weatherData 主题
     */
    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Condition:" + temperature + "F degree, "
                + humidity + "% humidity");
    }
}
