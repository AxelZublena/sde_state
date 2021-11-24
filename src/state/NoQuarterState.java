package state;

import com.hz.GumballMachine;

public class NoQuarterState extends GumballMachineState{

    public NoQuarterState(GumballMachine gumballMachine){
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        this.gumballMachine.changeState(new HasQuarterState(this.gumballMachine));
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill(int numGumBalls) {
        this.gumballMachine.setCount(numGumBalls);
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

        result.append("waiting for quarter");

        result.append("\n");
        return result.toString();
    }

}
