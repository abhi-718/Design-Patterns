import Beverages.Beverage;
import Beverages.Espresso;
import Beverages.HouseBlend;
import Decorators.Mocha;
import Decorators.Soy;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("Beverage :" + beverage.getDescription() +" Cost: "+beverage.cost());
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        System.out.println("Beverage :" + beverage.getDescription() +" Cost: "+beverage.cost());

        Beverage beverage1 = new HouseBlend();
        System.out.println("Beverage :" + beverage1.getDescription() +" Cost: "+beverage1.cost());
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println("Beverage :" + beverage1.getDescription() +" Cost: "+beverage1.cost());


    }
}
