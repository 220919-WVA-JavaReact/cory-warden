package com.revature.exercises;

import java.util.*;

public class LinkedLists {
    /*
    Below is a list of exercises to help you get familiar with working with the ArrayList Collection
     */
    public static void main(String[] args) {
        List<String> foods = new LinkedList<String>();
        // 1. Write a Java program to append the specified element to the end of a linked list. Add several values.
        String str1 = "steak", str2 = "hamburger", str3 = "hotdog", str4 = "fries";
        foods.add(str1);
        foods.add(str2);
        foods.add(str3);
        System.out.println(foods);
        foods.add(str4);
        System.out.println(foods);

        // 2. Write a Java program to iterate through all elements in a linked list.
        for (String food : foods) {
            System.out.println(food);
        }
        System.out.println("+---------------------------------------+");
        // 3. Write a Java program to iterate a linked list in reverse order
        Iterator<String> rev = ((LinkedList<String>) foods).descendingIterator();
        while(rev.hasNext()) {
            System.out.println(rev.next());
        }
        System.out.println("+---------------------------------------+");

        // 4.  Write a Java program to insert the specified element at the front of a linked list
        foods.add(0, "potato");
        System.out.println(foods);
        System.out.println("+---------------------------------------+");

        // 5. Write a Java program to insert some elements at the specified position into a linked list.
        foods.add(2, "chips");
        System.out.println(foods);
        System.out.println("+---------------------------------------+");

        // 6. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        String first = ((LinkedList<String>) foods).getFirst();
        String last = ((LinkedList<String>) foods).getLast();
        System.out.println("First ele = " + first);
        System.out.println("Last ele = " + last);
        System.out.println("+---------------------------------------+");

        // 7. Write a Java program to check if a particular element exists in a linked list.
        boolean chips = foods.contains("chips");
        boolean icecream = foods.contains("ice cream");
        System.out.println("Chips? " + chips);
        System.out.println("Ice Cream? " + icecream);
        System.out.println("+---------------------------------------+");

        // 8. Write a Java program to convert a linked list to array list.
        List<String> aList = new ArrayList<>(foods);
        System.out.println(aList);

    }
}
