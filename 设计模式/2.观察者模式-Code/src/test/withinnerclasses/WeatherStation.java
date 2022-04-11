package test.withinnerclasses;


import main.withinnerclasses.observer.CurrentConditionDisplay;
import main.withinnerclasses.observer.StatisticsDisplay;
import main.withinnerclasses.subject.WeatherData;

/**
 * 使用内部类，完成观察者模式
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
