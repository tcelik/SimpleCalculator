package org.csystem.simplecalculatorapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class SimpleCalculator {

    private final Collection<IOperation> m_operations;

    //Spring bunu çağırcak.
    //Elemanları IOperation türünden bir arraylist yaratmalı.
    public SimpleCalculator(Collection<IOperation> operations)
    {
        //eğer yaratırsa artık elimde bir arraylist var.
        m_operations = operations;
    }

    public void calculate(int a, int b, char op)
    {
        for (IOperation operation : m_operations) {
            if (operation.isValid(op))
                System.out.println(operation.doOperation(a, b));
        }
    }
}
