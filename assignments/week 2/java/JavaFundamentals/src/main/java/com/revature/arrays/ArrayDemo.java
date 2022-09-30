package com.revature.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        /*
        Similarly, you can declare arrays of other types:
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;
        do NOT in the form of float anArrayofFlots[];
         */
        int[] anArray;

        // allocates memory for 10 integers
        // If this statement is missing, then the compiler prints an error like the following, and compilation fails:
        // ArrayDemo.java:4: Variable anArray may not have been initialized.
                anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        /*
        Alternatively, you can use the shortcut syntax to create and initialize an array:
        int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
         */

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);
        System.out.println("Element at index 9: "
                + anArray[9]);

        // Print array length size.
        System.out.println("Array size is: " + anArray.length);
    }
}
