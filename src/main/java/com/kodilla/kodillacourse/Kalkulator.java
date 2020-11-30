package com.kodilla.kodillacourse;

class Kalculator
{
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subtractAFromB(int a, int b) {
        return a - b;
    }
}

class Application
{
    public static void main(String[] args) {

        Kalculator simpleCalculator = new Kalculator();

        int result1 = simpleCalculator.addAToB(5, 5);
        int result2 = simpleCalculator.subtractAFromB(9, 6);

        System.out.println(result1);
        System.out.println(result2);

    }
}
