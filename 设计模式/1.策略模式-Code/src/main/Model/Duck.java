package main.Model;

import main.Behavior.Fly.FlyBehavior;
import main.Behavior.Quack.QuackBehavior;

/**
 * @author liu zhen
 * @create 2021/7/26
 */
public class Duck extends Animal {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {
    }

    public Duck(Integer id, String name, Integer categoryId, String categoryName) {
        super(id, name, categoryId, categoryName);
    }

    public Duck(Integer id, String name, Integer categoryId, String categoryName, FlyBehavior flyBehavior,
            QuackBehavior quackBehavior) {
        super(id, name, categoryId, categoryName);
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public void getDescription() {
        System.out.println("I'm " + getClass());
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
