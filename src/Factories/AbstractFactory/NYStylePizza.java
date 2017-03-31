package Factories.AbstractFactory;

/**
 * Created by leonardo on 29/03/17.
 */
public class NYStylePizza extends Pizza {

    public NYStylePizza(Dough dough, Sauce sauce, Clams clams, Cheese cheese) {
        super(dough, sauce, clams, cheese);
    }

    @Override
    void prepare() {
        System.out.println("Preparing NY Style pizza!!!");
    }
}
