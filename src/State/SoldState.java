package State;

/**
 * Created by leonardo on 11/06/17.
 */
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
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
            gumballMachine.setState( gumballMachine.getNoQuarterState());
        } else{
            System.out.println("Ops, out of gumballs!");
            gumballMachine.setState( gumballMachine.getSoldOutState());
        }
    }

    @Override
    public String toString(){
        return "sold, ready to dispense a gumball";
    }
}
