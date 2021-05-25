package se.lexicon.laurita;

import java.util.*;

class Calculator {

    public static void main(String[] args) {


    }
    public int add(int a, int b) {
        System.out.println("Addition of " + a + ", " + b + " is: " + (a + b));
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println("Subtraction of " + a + ", " + b + " is: " + (a - b));
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.println("Multiplication of " + a + ", " + b + " is: " + (a * b));
        return a * b;
    }

    public int divide(int a, int b) {
        System.out.println("Division of " + a + ", " + b + " is: " + (a / b));
        return a / b;
    }

    public double divide(double a, double b) {
        if (a != 0) {
            System.out.println("Division of " + a + ", " + b + " is: " + (a / b));
            return a / b;
        } else {
            System.out.println("Division with 0 is not allowed");
            return 0;
        }

    }
}