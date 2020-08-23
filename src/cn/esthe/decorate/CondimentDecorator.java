package cn.esthe.decorate;
/**
 * 装饰者模式
 *
 *  饮料抽象类，所有的beverage都要继承超类
 * @author utopia
 * @date 20200823
 */
public abstract class CondimentDecorator extends Beverage{
    /**
     * 重写Beverage getDescription()方法
     * @param
     * @return
     */
    @Override
    public abstract String getDescription();
}
