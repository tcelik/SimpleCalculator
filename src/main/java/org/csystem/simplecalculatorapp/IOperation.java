package org.csystem.simplecalculatorapp;


import org.springframework.stereotype.Component;

@Component
public interface IOperation {
    int doOperation(int a, int b);
    boolean isValid(char op);
}
