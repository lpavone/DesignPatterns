package State;

/**
 * This state has been created to reflect a business case of winning two balls
 * 10% of the times that a quarter is inserted.
 *
 * Created by leonardo on 11/06/17.
 */
public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't give you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0){
            gumballMachine.releaseBall();
            System.out.println("You're a winner, you've got two balls for a quarter!");
            if (gumballMachine.getCount() > 0){
                gumballMachine.setState( gumballMachine.getNoQuarterState());
            } else {
                gumballMachine.setState( gumballMachine.getSoldOutState());
            }
        } else {
            gumballMachine.setState( gumballMachine.getSoldOutState());
        }

    }

    @Override
    public String toString(){
        return "in a winner! you'll get two balls!";
    }
}
