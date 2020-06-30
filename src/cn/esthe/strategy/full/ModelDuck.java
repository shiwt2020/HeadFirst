package cn.esthe.strategy.full;

import cn.esthe.strategy.part.FlyBehavior;
import cn.esthe.strategy.part.QuackBehavior;
import cn.esthe.strategy.part.impl.FlyNoWay;
import cn.esthe.strategy.part.impl.GuGuQuack;

/**
 * @author utopia
 * @date 20200630
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        FlyBehavior flyBehavior=new FlyNoWay();
        QuackBehavior quackBehavior=new GuGuQuack();
    }

}
