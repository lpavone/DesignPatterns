package Factories.AbstractFactory;

/**
 * Created by leonardo on 29/03/17.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory, PizzaFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }


    @Override
    public Pizza createPizza() {
        return new ChicagoStylePizza(
                createDough(),
                createSauce(),
                createClam(),
                createCheese()
        );
    }
}
