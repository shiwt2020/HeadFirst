package cn.esthe.factory;

import cn.esthe.factory.kindsPizza.Pizza;

/**
 * 工厂模式
 * @author utopia
 * @date 20200630
 */
public class PizzaStore {
    PizzaFactory factory;
    public PizzaStore(PizzaFactory pizzaFactory){
        this.factory=pizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);

        /**
         * 对于对线的一些处理可以写到具体的类中
         */
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();

        return pizza;
    }
}
