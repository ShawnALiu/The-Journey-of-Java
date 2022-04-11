package main.Behavior.Fly.Impl;

import main.Behavior.Fly.FlyBehavior;

/**
 * @author liu zhen
 * @create 2021/7/26
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我用翅膀飞行！");
    }
}
