package State;

import java.util.Random;

/**
 * Created by leonardo on 11/06/17.
 */
public class HasQuarterState implements State {

    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Eject quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        //define if winner or not
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 0){
            gumballMachine.setState( gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState( gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("Invalid action: No gumball dispensed");
    }

    @Override
    public String toString(){
        return "ready to be turned";
    }
}
