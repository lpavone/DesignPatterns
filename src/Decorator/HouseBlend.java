package Decorator;

/**
 * Created by leonardo on 07/03/17.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
