package main.Model;

import main.Behavior.Fly.Impl.FlyWithWings;
import main.Behavior.Quack.Impl.Quack;

/**
 * 绿头鸭
 * 
 * @author liu zhen
 * @create 2021/7/26
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public MallardDuck(Integer id, String name, Integer categoryId, String categoryName) {
        super(id, name, categoryId, categoryName, new FlyWithWings(), new Quack());
    }

}
