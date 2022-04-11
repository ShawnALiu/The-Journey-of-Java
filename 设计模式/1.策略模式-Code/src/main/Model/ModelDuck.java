package main.Model;

import main.Behavior.Fly.Impl.FlyNoWay;
import main.Behavior.Quack.Impl.MuteQuack;

/**
 * @author liu zhen
 * @create 2021/7/26
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

}
