package main.Behavior.Quack.Impl;

import main.Behavior.Quack.QuackBehavior;

/**
 * @author liu zhen
 * @create 2021/7/26
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("吱吱吱...");
    }
}
