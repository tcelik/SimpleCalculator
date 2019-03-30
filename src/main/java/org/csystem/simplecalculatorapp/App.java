package org.csystem.simplecalculatorapp;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public ApplicationRunner run(SimpleCalculator calculator)
    {
        return args -> {
            calculator.calculate(2, 3 , '+');
            calculator.calculate(2, 3 , '-');
            calculator.calculate(2, 3, '*');
            calculator.calculate(2, 3, '/');
        };
    }
}
