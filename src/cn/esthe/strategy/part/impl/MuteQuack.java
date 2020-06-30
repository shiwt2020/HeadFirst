package cn.esthe.strategy.part.impl;

import cn.esthe.strategy.part.QuackBehavior;

/**
 * @author utopia
 * @date 20200630
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("哑巴鸭子");
    }
}
