package Factories.AbstractFactory;

/**
 * Created by leonardo on 29/03/17.
 */
public class ChicagoStylePizza extends Pizza {

    public ChicagoStylePizza(Dough dough, Sauce sauce, Clams clams, Cheese cheese) {
        super(dough, sauce, clams, cheese);
    }

    @Override
    void prepare() {
        System.out.println("Preparing Chicago style pizza!!!");
    }
}
