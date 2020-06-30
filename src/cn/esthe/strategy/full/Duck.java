package cn.esthe.strategy.full;

import cn.esthe.strategy.part.FlyBehavior;
import cn.esthe.strategy.part.QuackBehavior;

/**
 * @author utopia
 * @date 20200630
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 以下的方法为鸭子共同的行为
     */
    public void swing() {
        System.out.println("swing");
    }
    public void display(){
        System.out.println("形象代言");
    }

    public void setFly(FlyBehavior fly){
        flyBehavior =fly;
    }

    public void setQuack(QuackBehavior quack){
        quackBehavior=quack;
    }
}
