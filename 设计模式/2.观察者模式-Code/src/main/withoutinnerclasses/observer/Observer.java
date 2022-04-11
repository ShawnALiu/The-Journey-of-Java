package main.withoutinnerclasses.observer;

/**
 * @author liu zhen
 * @create 2021/7/26
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
