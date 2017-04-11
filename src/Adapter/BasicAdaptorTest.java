package Adapter;

import org.junit.Test;

/**
 * Created by leonardo on 09/04/17.
 */
public class BasicAdaptorTest {

    @Test
    public void test(){
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck says...");
        testDuck(duck);

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
        testDuck(turkeyAdapter);

    }

    private void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
