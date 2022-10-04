package com.revature.exercises;

import java.util.*;

public class ArrayLists {

    /*
    Below is a list of exercises to help you get familiar with working with the ArrayList Collection
     */
    public static void main(String[] args) {

        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        List<String> colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        colors.add("green");
        colors.add("silver");
        colors.add("green");


        // 2. Write a Java program to iterate through all elements in an array list
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("+---------------------------------------+");

        // 3. Write a Java program to insert an element into the array list at the first position
        colors.add(0, "black");

        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("+---------------------------------------+");

        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list
        //should grab red (black 0, blue 1, yellow 2, red 3)
        String specificInd = colors.get(3);
        System.out.println(specificInd);
        System.out.println("+---------------------------------------+");

        // 5. Write a Java program to remove the third element from an array list.
        colors.remove(3);
        System.out.println(colors);
        System.out.println("+---------------------------------------+");

        // 6. Write a Java program to search an element in an array list.
        //should give idx 2 (black 0, blue 1, yellow 2,
        int yellowIdx = colors.indexOf("yellow");
        System.out.println(yellowIdx);
        System.out.println("+---------------------------------------+");

        // 7. Write a Java program to sort a given array list.
        Collections.sort(colors);
        System.out.println(colors);

        System.out.println("+---------------------------------------+");

    }
}
