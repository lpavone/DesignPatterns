package TemplateMethod;

/**
 * Created by leonardo on 23/04/17.
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected boolean customerWantsCondiments(){
        //ask for user input in a real implementation
        return false;
    }
}
