package com.revature.arrays;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        //String[] copyTo = new String[7];
        //System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        System.out.println(java.util.Arrays.toString(copyTo));
        // Check if two arrays are equal
            //System.out.println(Arrays.equals(copyFrom, copyTo));
        // Below method will fill every index of the array with "space"
            //Arrays.fill(copyFrom, "space");
            //System.out.println(Arrays.toString(copyFrom));
        // Fills part of the array. input array, index start (will turn value), index stop (will not turn value), value
            //Arrays.fill(copyFrom, 1, 5, "space");
            //System.out.println(Arrays.toString(copyFrom));
        // Arrays using sort.
            //Arrays.sort(copyFrom);
    }
}
