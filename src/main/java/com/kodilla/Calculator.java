package com.kodilla;

public class Calculator {
    double a = 17;
    double b = 3.2;

    public double add() {
        return a + b;
    }
    public double substract() {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add();
        calc.substract();
        System.out.println(calc.add());
        System.out.println(calc.substract());
    }
}
