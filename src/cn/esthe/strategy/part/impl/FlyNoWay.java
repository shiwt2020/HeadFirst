package cn.esthe.strategy.part.impl;

import cn.esthe.strategy.part.FlyBehavior;

/**
 * @author utopia
 * @date 20200630
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
