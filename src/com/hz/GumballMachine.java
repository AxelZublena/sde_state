package com.hz;

import state.GumballMachineState;
import state.NoQuarterState;

public class GumballMachine {


    private int count;
    private GumballMachineState state;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            this.state = new NoQuarterState(this);
        }
    }

    public void changeState(GumballMachineState state){
        this.state = state;
    }
    public GumballMachineState getState(){
        return this.state;
    }

    public int getCount(){
        return this.count;
    }
    public void setCount(int numGumBalls){
        this.count = numGumBalls;
    }
}
