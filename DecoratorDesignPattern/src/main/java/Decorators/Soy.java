package Decorators;

import Beverages.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " Soy ";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1.80;
    }
}
