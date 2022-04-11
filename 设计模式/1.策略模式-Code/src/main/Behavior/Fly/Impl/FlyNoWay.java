package main.Behavior.Fly.Impl;

import main.Behavior.Fly.FlyBehavior;

/**
 * @author liu zhen
 * @create 2021/7/26
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我不会飞行！");
    }
}
