package Factories.AbstractFactory;

/**
 * Abstract factory.
 *
 * Created by leonardo on 28/03/17.
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClam();

}
