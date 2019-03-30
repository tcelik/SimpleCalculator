package org.csystem.simplecalculatorapp;

public class Substraction implements IOperation { // Addition is a IOperation.

    @Override
    public int doOperation(int a, int b)
    {
        return a - b;
    }

    @Override
    public boolean isValid(char op) {
        return op == '-';
    }
}
