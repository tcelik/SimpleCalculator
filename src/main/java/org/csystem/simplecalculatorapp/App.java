package org.csystem.simplecalculatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args)
    {
        //SpringApplication.run(App.class, args);


        SimpleCalculator calculator = new SimpleCalculator();

        calculator.calculate(2, 3 , '+');
        calculator.calculate(2, 3 , '-');
        calculator.calculate(2, 3, '*');
        calculator.calculate(2, 3, '/');
    }
}
