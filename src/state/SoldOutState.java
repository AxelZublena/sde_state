package state;

import com.hz.GumballMachine;

public class SoldOutState extends GumballMachineState{

    public SoldOutState(GumballMachine gumballMachine){
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
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

        result.append("sold out");

        result.append("\n");
        return result.toString();
    }
}
