package TemplateMethod;

/**
 * High level component that control the algorithm and call the subclasses when only
 * when they are needed for an implementation of a method.
 *
 * Created by leonardo on 23/04/17.
 */
public abstract class CaffeineBeverage {

    //final as it shouldn't be overwritten
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCoup();
        //hook to control the condiments on subclass
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void pourInCoup() {
        System.out.println("Pour in coup");
    }

    private void boilWater() {
        System.out.println("Boil the water");
    }

    /**
     * Hook, by default is true but subclasses can overwrite to implement own behaviour.
     * @return
     */
    protected boolean customerWantsCondiments() {
        return true;
    }

}
