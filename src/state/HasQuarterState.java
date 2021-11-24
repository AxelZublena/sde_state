package state;

import com.hz.GumballMachine;

public class HasQuarterState extends GumballMachineState {

    public HasQuarterState(GumballMachine gumballMachine){
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        this.gumballMachine.changeState(new NoQuarterState(this.gumballMachine));
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        this.gumballMachine.changeState(new SoldState(this.gumballMachine));
        System.out.println("You turned...");
        this.gumballMachine.getState().dispense();
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill(int numGumBalls) {
        this.gumballMachine.setCount(numGumBalls);
        this.gumballMachine.changeState(new NoQuarterState(this.gumballMachine));
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + this.gumballMachine.getCount() + " gumball");
        if (this.gumballMachine.getCount() != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");

        result.append("waiting for turn of crank");

        result.append("\n");
        return result.toString();
    }
}
