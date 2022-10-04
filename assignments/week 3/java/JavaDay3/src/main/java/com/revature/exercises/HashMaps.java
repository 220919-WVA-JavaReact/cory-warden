package com.revature.exercises;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    /*
   Below is a list of exercises to help you get familiar with working with the HashMap Collection
    */
    public static void main(String[] args) {

        // 1. Create a HashMap with Integers for the Keys and Strings for the Entries. Insert 5 entries with numbers as
        // the key and colors as the value associated
        Map<Integer, String> menu = new HashMap<>();
        menu.put(1, "blue");
        menu.put(2, "red");
        menu.put(3, "green");
        menu.put(4, "yellow");
        menu.put(5, "brown");

        // 2. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("KV pairs = " + menu.size());
        System.out.println("+---------------------------------------+");

        // 3. Write a Java program to test if a map contains a mapping for the specified key
        if (menu.containsKey(5)) {
            System.out.println("5 is a valid key");
        } else {
            System.out.println("5 is not a valid key");
        }
        System.out.println("+---------------------------------------+");

        // 4. Write a Java program to get the value of a specified key in a map.
        if (menu.containsKey(3)) {
            System.out.println(menu.get(3));
        } else {
            System.out.println("no key found.");
        }
        System.out.println("+---------------------------------------+");

        // 5. Write a Java program to get a set view of the keys contained in this map.
        for (Map.Entry<Integer, String> pair : menu.entrySet()) {
            System.out.println("Key is: " + pair.getKey() + ", Value is: " + pair.getValue());
        }
        System.out.println("+---------------------------------------+");
    }
}
