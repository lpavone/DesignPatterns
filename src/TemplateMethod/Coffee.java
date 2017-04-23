package TemplateMethod;

/**
 * Created by leonardo on 23/04/17.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }
}
