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
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"Mocha";
    }

    @Override
    public double cost() {
        return 1.1;
    }
}
