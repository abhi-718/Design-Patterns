package Beverages;

public abstract class Beverage {

    public String description = "Unknown Beverages.Beverage";



    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
