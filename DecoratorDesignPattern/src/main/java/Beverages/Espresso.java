package Beverages;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Beverages.Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
