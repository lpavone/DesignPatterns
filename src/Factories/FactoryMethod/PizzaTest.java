package Factories.FactoryMethod;

import java.io.IOException;

/**
 * Created by leonardo on 08/03/17.
 */
public class PizzaTest {

    public static void main(String[] args) throws IOException{
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
