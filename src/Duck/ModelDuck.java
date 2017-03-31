package Duck;

/**
 * Created by leonardo on 07/02/17.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new NoFly();
        quackBehaviour = new MuteQuack();
    }
}
