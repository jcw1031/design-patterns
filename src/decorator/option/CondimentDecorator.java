package decorator.option;

import decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();
}
