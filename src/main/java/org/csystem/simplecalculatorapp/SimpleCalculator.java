package org.csystem.simplecalculatorapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Collection;


@Component
public class SimpleCalculator {

    @Autowired
    private Collection<IOperation> m_operations;

    public void calculate(int a, int b, char op)
    {
        for (IOperation operation : m_operations) {
            if (operation.isValid(op))
                System.out.println(operation.doOperation(a, b));
        }
    }
}
