package Duck;

/**
 * Created by leonardo on 07/02/17.
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("No sound!");
    }
}
