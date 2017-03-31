package Decorator;

/**
 * Created by leonardo on 07/03/17.
 */
public abstract class Beverage {

    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
