package cn.esthe.decorate;
/**
 * 装饰者模式
 *
 *  饮料抽象类，所有的beverage都要继承超类
 * @author utopia
 * @date 20200823
 */
public abstract class Beverage {
    public  String description = "Unknown Beverage ";
    public String getDescription(){
        return description;
    }

    /**
     * 价格
     * @param
     * @return
     */
    public abstract double cost();
}
