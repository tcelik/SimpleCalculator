package org.csystem.simplecalculatorapp;


public interface IOperation {
    int doOperation(int a, int b);
    boolean isValid(char op);
}
