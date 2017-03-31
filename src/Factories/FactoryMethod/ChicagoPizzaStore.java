package Factories.FactoryMethod;

/**
 * Created by leonardo on 08/03/17.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type){
            case "cheese": return new ChicagoStyleCheesePizza();
            case "veggie": return new ChicagoStyleVeggiePizza();
            case "clam": return new ChicagoStyleClamPizza();
            case "pepperoni": return new ChicagoStylePepperoniPizza();
            default: return null;
        }
    }
}
