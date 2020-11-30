package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

    static class Calculator
    {
        public int addAToB(int a, int b) {
            return a + b;
        }

        public int subtractAFromB(int a, int b) {
            return a - b;
        }
    }

    public static void main(String[] args) {

        SpringApplication.run(KodillaCourseApplication.class, args);

        Calculator simpleCalculator = new Calculator();

        int result1 = simpleCalculator.addAToB(5, 5);
        int result2 = simpleCalculator.subtractAFromB(9, 6);


        System.out.println(result1);
        System.out.println(result2);


    }

}
