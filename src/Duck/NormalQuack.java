package Duck;

/**
 * Created by leonardo on 07/02/17.
 */
public class NormalQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Normal Duck.Quack!");
    }
}
