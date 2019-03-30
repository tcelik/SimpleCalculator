package org.csystem.simplecalculatorapp;

import java.util.ArrayList;

public class SimpleCalculator {

    private static ArrayList<IOperation> ms_operations = new ArrayList<>();

    static {
        ms_operations.add(new Addition());
        ms_operations.add(new Substraction());
        ms_operations.add(new Multiplication());
        ms_operations.add(new Division());
    }

    public void calculate(int a, int b, char op)
    {
        for (IOperation operation : ms_operations) {
            if (operation.isValid(op))
                System.out.println(operation.doOperation(a, b));
        }
    }
}
