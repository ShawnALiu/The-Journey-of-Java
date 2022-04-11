package main.Behavior.Quack.Impl;

import main.Behavior.Quack.QuackBehavior;

/**
 * 实现鸭子呱呱叫
 * 
 * @author liu zhen
 * @create 2021/7/26
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("呱呱呱...");
    }
}
