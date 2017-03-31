package Duck;

/**
 * Created by leonardo on 07/02/17.
 */
public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't fly !");
    }
}
