package org.csystem.simplecalculatorapp;

import org.springframework.stereotype.Component;

@Component
public class Addition implements IOperation { // Addition is a IOperation.

    @Override
    public int doOperation(int a, int b)
    {
        return a + b;
    }

    @Override
    public boolean isValid(char op) {
        return op == '+';
    }
}
