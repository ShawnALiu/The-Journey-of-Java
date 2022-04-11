package test.withoutinnerclasses;

import main.withoutinnerclasses.observer.Impl.CurrentConditionDisplay;
import main.withoutinnerclasses.observer.Impl.StatisticsDisplay;
import main.withoutinnerclasses.subject.Impl.WeatherData;

/**
 * 不使用内部类，完成观察者模式
 * @author liu zhen
 * @create 2021/7/26
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65,30.4f);
        weatherData.setMeasurements(82, 70,29.2f);
        weatherData.setMeasurements(78, 90,29.2f);
    }
}
