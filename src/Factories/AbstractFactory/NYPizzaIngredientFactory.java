package Factories.AbstractFactory;

/**
 * Concrete factory.
 *
 * Created by leonardo on 28/03/17.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory, PizzaFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

    @Override
    public Pizza createPizza() {
        return new NYStylePizza(
                createDough(),
                createSauce(),
                createClam(),
                createCheese()
        );
    }
}
