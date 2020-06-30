package cn.esthe.strategy.part.impl;

import cn.esthe.strategy.part.QuackBehavior;

/**
 * @author utopia
 * @date 20200630
 */
public class GuGuQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
