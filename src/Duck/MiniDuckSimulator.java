package Duck;

/**
 * Created by leonardo on 07/02/17.
 */
public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck duck = new MallardDuck(new FlyWithWings(), new NormalQuack());
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehaviour(new FlyWithRocketPower());
        duck.performFly();
    }

}
