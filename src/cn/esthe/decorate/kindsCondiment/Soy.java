package cn.esthe.decorate.kindsCondiment;

import cn.esthe.decorate.Beverage;
import cn.esthe.decorate.CondimentDecorator;

/**
 * 装饰者模式
 *
 *  调料类，所有的Condiment都要继承超类
 * @author utopia
 * @date 20200823
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+"Soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+1.3;
    }
}
