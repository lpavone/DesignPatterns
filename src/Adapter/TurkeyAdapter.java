package Adapter;

/**
 * This adapter implements the interface of the type we are adapting to, this is the interface the client
 * expects to see.
 *
 * Created by leonardo on 09/04/17.
 */
public class TurkeyAdapter implements Duck {
    //the object we are adapting
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();//adaptation of the quack into gobble
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
