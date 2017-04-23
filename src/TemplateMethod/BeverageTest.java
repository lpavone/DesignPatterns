package TemplateMethod;

import org.junit.Test;

/**
 * Created by leonardo on 23/04/17.
 */
public class BeverageTest {

    @Test
    public void test(){
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making a tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking a coffee");
        coffee.prepareRecipe();
    }
}
