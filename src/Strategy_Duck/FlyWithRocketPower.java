package Strategy_Duck;

/**
 * Created by leonardo on 07/02/17.
 */
public class FlyWithRocketPower implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying rocket powered!");
    }
}
