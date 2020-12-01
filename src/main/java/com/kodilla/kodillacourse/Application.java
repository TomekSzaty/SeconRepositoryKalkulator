package com.kodilla.kodillacourse;

public class Application {

    public static void main(String[] args) {
        Kalkulator simpleCalculator = new Kalkulator();

        int result1 = simpleCalculator.add(5, 5);
        int result2 = simpleCalculator.subtract(9, 6);

        System.out.println(result1);
        System.out.println(result2);
    }

}
