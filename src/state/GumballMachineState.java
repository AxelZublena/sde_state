package state;

import com.hz.GumballMachine;

public abstract class GumballMachineState {
    GumballMachine gumballMachine;

    public GumballMachineState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public abstract void insertQuarter();
    public abstract void ejectQuarter();
    public abstract void turnCrank();
    public abstract void dispense();
    public abstract void refill(int numGumBalls);
    public abstract String toString();
}
