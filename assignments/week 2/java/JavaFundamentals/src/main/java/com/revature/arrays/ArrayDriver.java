package com.revature.arrays;

import java.util.Arrays;

public class ArrayDriver {

    public static void main(String[] args) {

        int[] myNumArray = new int[10];
        System.out.println(Arrays.toString(myNumArray));

        double balance = 0;
        double[] transactions = {1000, -119.99, 40, -35.43, -150.65};

        for (int i = 0; i < transactions.length; i++) {
            balance += transactions[i];
        }

        System.out.println("Balance: " + balance);

        for (int i = 0; i < transactions.length; i++) {
            System.out.println(transactions[i]);
        }

        int[] sizesAsNumbers = {2, 3, 4, 2, 4, 5, 1};
        Arrays.sort(sizesAsNumbers);
        System.out.println(Arrays.toString(sizesAsNumbers));
    }

}
