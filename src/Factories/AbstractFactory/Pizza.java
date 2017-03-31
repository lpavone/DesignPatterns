package Factories.AbstractFactory;

/**
 * Created by leonardo on 29/03/17.
 */
public abstract class Pizza {

    private Dough dough;
    private Sauce sauce;
    private Clams clams;
    private Cheese cheese;

    public Pizza(Dough dough, Sauce sauce, Clams clams, Cheese cheese) {
        this.dough = dough;
        this.sauce = sauce;
        this.clams = clams;
        this.cheese = cheese;
    }

    abstract void prepare();

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setClams(Clams clams) {
        this.clams = clams;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
}
