package main.withoutinnerclasses.subject;

import main.withoutinnerclasses.observer.Observer;

/**
 * @author liu zhen
 * @create 2021/7/26
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
