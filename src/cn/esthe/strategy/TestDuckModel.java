package cn.esthe.strategy;

import cn.esthe.strategy.part.impl.FlyNoWay;
import cn.esthe.strategy.part.impl.GuGuQuack;
import cn.esthe.strategy.full.Duck;
import cn.esthe.strategy.full.ModelDuck;

/**
 * 测试
 * @author utopia
 * @date 20200630
 */
public class TestDuckModel {
    public static void main(String[] args) {
        Duck model=new ModelDuck();
        model.setFly(new FlyNoWay());
        model.setQuack(new GuGuQuack());
        model.performQuack();
        model.performFly();
    }
}
