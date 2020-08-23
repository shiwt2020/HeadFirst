package cn.esthe.decorate.kindsBeverage;

import cn.esthe.decorate.Beverage;

/**
 * 装饰者模式
 *
 *  饮料抽象类，所有的beverage都要继承超类
 * @author utopia
 * @date 20200823
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
