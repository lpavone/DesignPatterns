package Factories.FactoryMethod;

/**
 * Created by leonardo on 08/03/17.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type){
            case "cheese": return new NYStyleCheesePizza();
            case "veggie": return new NYStyleVeggiePizza();
            case "clam": return new NYStyleClamPizza();
            case "pepperoni": return new NYStylePepperoniPizza();
            default: return null;
        }
    }


}
