package test;

import main.Behavior.Fly.Impl.FlyRocketPowered;
import main.Model.Duck;
import main.Model.MallardDuck;
import main.Model.ModelDuck;

/**
 * @author liu zhen
 * @create 2021/7/26
 */
public class DuckTest {

    public static void main(String[] args) {
        // 测试1
        Duck mallardDuck = new MallardDuck();
        mallardDuck.getDescription();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        // 测试2
        Duck modelDuck = new ModelDuck();
        modelDuck.getDescription();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
