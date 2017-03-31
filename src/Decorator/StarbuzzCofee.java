package Decorator;

/**
 * Created by leonardo on 07/03/17.
 */
public class StarbuzzCofee {

    public static void main(String[] args){
        Beverage beverage = new Expresso();
        System.out.println( beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
