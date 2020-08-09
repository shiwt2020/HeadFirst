package cn.esthe.factory;

import cn.esthe.factory.kindsPizza.Pizza;
import cn.esthe.factory.kindsPizza.SaladPizza;
import cn.esthe.factory.kindsPizza.TomatoPizza;

/**
 * 工厂模式
 * @author utopia
 * @date 20200630
 */
public abstract class PizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("tomato")){
            pizza=new TomatoPizza();
        }else if(type.equals("salad")){
            pizza=new SaladPizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        return pizza;
    }




}
