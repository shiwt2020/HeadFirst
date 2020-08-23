package cn.esthe.decorate;

import cn.esthe.decorate.kindsBeverage.Espresso;
import cn.esthe.decorate.kindsCondiment.Mocha;
import cn.esthe.decorate.kindsCondiment.Soy;

/**
 * 装饰者模式
 *
 *  饮料抽象类，所有的beverage都要继承超类
 * @author utopia
 * @date 20200823
 */
public class OrderBeverage {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"--"+beverage.cost());

        Beverage mocha=new Mocha(beverage);
        Beverage MochaSoy=new Soy(beverage);
        System.out.println(mocha.getDescription()+"--"+mocha.cost());

        System.out.println(MochaSoy.getDescription()+"--"+MochaSoy.cost());
    }
}