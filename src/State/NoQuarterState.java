package State;

/**
 * Created by leonardo on 11/06/17.
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You have inserted a quarter");
        gumballMachine.setState( gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter inserted");
    }

    @Override
    public void turnCrank() {
        System.out.println("There is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("Invalid action, you need to pay first");
    }

    @Override
    public String toString(){
        return "waiting for a quarter";
    }
}
