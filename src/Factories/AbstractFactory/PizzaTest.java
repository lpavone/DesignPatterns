package Factories.AbstractFactory;

/**
 * Created by leonardo on 29/03/17.
 */
public class PizzaTest {

        public static void main(String[] args){
            PizzaFactory pizzaFactory = new NYPizzaIngredientFactory();
            Pizza pizza = pizzaFactory.createPizza();
            pizza.prepare();
            pizzaFactory = new ChicagoPizzaIngredientFactory();
            pizza = pizzaFactory.createPizza();
            pizza.prepare();
        }
}
