package cn.esthe.factory;

import cn.esthe.factory.kindsPizza.Pizza;
import cn.esthe.factory.kindsPizza.SaladPizza;

/**
 * 工厂模式
 * @author utopia
 * @date 20200630
 */
public class Product {
    public static void main(String[] args) {

        PizzaStore ps=new PizzaStore(new PizzaFactory() {
            @Override
            public Pizza createPizza(String type) {
                return super.createPizza(type);
            }
        });

        Pizza pizza = ps.orderPizza("salad");



    }
}
