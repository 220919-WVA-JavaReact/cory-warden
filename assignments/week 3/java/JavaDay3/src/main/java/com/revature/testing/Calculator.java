package com.revature.testing;

public class Calculator {


    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int subNumbers(int a, int b) {
        return a - b;
    }

    public double multiplyNumbers(double a, double b) {
        return a * b;
    }

    public double divideNumbers(double a, double b) throws DivideByZeroException {

        if (b == 0) {
            throw new DivideByZeroException("You cannot divide by zero.");
        } else {
            return a / b;
        }
    }
    //This method above did not throw an Arithmetic exception because datatype is double, not int.

    public int division(int a, int b) {
        return a / b;
    }



}
