package com.revature.calculator;

import java.util.Scanner;

public class SimpleCalculator {
    //create main for run functionality
    public static void main(String[] args) {

        //store two numbers with decimal potential and operator sign for user to input as well as initialize scanner
        Scanner input = new Scanner(System.in);
        boolean active = true;
        float num1;
        float num2;
        char oper;
;
        while (active) {
            //intake all input values below
            System.out.println("Simple Calculator");
            System.out.println("---------------------------------------------");
            System.out.println("Please enter the first number you would like to add");
            num1 = input.nextFloat();

            System.out.println("Please enter the operator you would like to use (+ - / *)");
            oper = input.next().charAt(0);

            System.out.println("Please enter the second number you would like to add");
            num2 = input.nextFloat();
            input.nextLine();

            //create result variable, start switch case based upon operator choice
            float res = 0;
            switch (oper) {

                //Addition
                case '+':
                    res = num1 + num2;
                    break;

                //Subtraction
                case '-':
                    res = num1 - num2;
                    break;

                //Division
                case '/':
                    res = num1 / num2;
                    break;

                //Multiplication
                case '*':
                    res = num1 * num2;
                    break;

                //Catchall
                default:
                    System.out.println("There was an error with your operator input.");
                    break;
            }
            System.out.println("Your answer is: " + String.format("%.2f", res));
            System.out.println("---------------------------------------------");
            System.out.println("Would you like to run again? (y/n)");
            String resp = input.nextLine();

            if (resp.equals("y")) {
                active = true;
            } else {
                System.out.println("Thank you for using the calculator!");
            }
        }
    }
}
