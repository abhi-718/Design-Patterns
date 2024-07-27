package Beverages;

public class HouseBlend extends Beverage{


    public HouseBlend() {
        description = "HouseBlend Coffe";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
