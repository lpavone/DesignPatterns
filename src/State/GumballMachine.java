package State;

/**
 * Created by leonardo on 11/06/17.
 */
public class GumballMachine {
    //number of gumballs
    private int count = 0;
    private State state;

    private State soldOutState;
    private State soldState;
    private State noQuarterState;
    private State hasQuarterState;
    private State winnerState;

    public GumballMachine(int numberOfGumballs) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);

        this.count = numberOfGumballs;
        if (numberOfGumballs > 0){
            state = noQuarterState;
        } else{
            state = soldOutState;
        }
    }

    public int getCount() {
        return count;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    //states
    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0){
            count--;
        }
    }

    @Override
    public String toString(){
        return String.format("Gumball Machine inventory: %d balls.\nMachine is %s",
                count, state.toString());
    }
}
