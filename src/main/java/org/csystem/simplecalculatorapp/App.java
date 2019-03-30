package org.csystem.simplecalculatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args)
    {
        //context alınır IoC için.
        var context = SpringApplication.run(App.class, args);

        //SimpleCalculator calculator = new SimpleCalculator();
        var calculator = context.getBean(SimpleCalculator.class);
        var calculator1 = context.getBean(SimpleCalculator.class);

        calculator.calculate(2, 3 , '+');
        calculator.calculate(2, 3 , '-');
        //calculator.calculate(2, 3, '*');
        //calculator.calculate(2, 3, '/');
    }
}
