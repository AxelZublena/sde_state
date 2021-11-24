package com.hz;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine.getState().toString());

        gumballMachine.getState().insertQuarter();
        gumballMachine.getState().turnCrank();

        System.out.println(gumballMachine.getState().toString());

        gumballMachine.getState().insertQuarter();
        gumballMachine.getState().ejectQuarter();
        gumballMachine.getState().turnCrank();

        System.out.println(gumballMachine.getState().toString());

        gumballMachine.getState().insertQuarter();
        gumballMachine.getState().turnCrank();
        gumballMachine.getState().insertQuarter();
        gumballMachine.getState().turnCrank();
        gumballMachine.getState().ejectQuarter();

        System.out.println(gumballMachine.getState().toString());

        gumballMachine.getState().insertQuarter();
        gumballMachine.getState().insertQuarter();
        gumballMachine.getState().turnCrank();
        gumballMachine.getState().insertQuarter();
        gumballMachine.getState().turnCrank();
        gumballMachine.getState().insertQuarter();
        gumballMachine.getState().turnCrank();

        System.out.println(gumballMachine.getState().toString());
    }
}
