package state;

import com.hz.GumballMachine;

public class SoldState extends GumballMachineState{

    public SoldState(GumballMachine gumballMachine){
        super(gumballMachine);
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
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        String returnStr = "A gumball comes rolling out the slot";
        this.gumballMachine.setCount(this.gumballMachine.getCount() - 1);
        if (this.gumballMachine.getCount() == 0) {
            this.gumballMachine.changeState(new SoldOutState(this.gumballMachine));
            returnStr = returnStr + "\n" + "Oops, out of gumballs!";
        }
        else {
            this.gumballMachine.changeState(new NoQuarterState(this.gumballMachine));
        }
        System.out.println(returnStr);
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

        result.append("delivering a gumball");

        result.append("\n");
        return result.toString();
    }
}
