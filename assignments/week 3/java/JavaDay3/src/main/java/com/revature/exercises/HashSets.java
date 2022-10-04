package com.revature.exercises;

import java.nio.file.DirectoryIteratorException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

    /*
   Below is a list of exercises to help you get familiar with working with the HashSet Collection
    */
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a hash set
        HashSet<String> hashes = new HashSet<String>();
        hashes.add("blue");
        hashes.add("red");
        hashes.add("green");
        hashes.add("black");
        System.out.println(hashes);
        System.out.println("+---------------------------------------+");

        // 2. Write a Java program to iterate through all elements in a hash list.
        Iterator<String> iter = hashes.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("+---------------------------------------+");

        // 3. Write a Java program to get the number of elements in a hash set
        System.out.println("Number of elements: " + hashes.size());
        System.out.println("+---------------------------------------+");

        // 4. Write a Java program to test a hash set is empty or not
        System.out.println("Is the set empty? " + hashes.isEmpty());
//        hashes.clear();
//        System.out.println("Is the set empty? " + hashes.isEmpty());
        System.out.println("+---------------------------------------+");

        // 5. Write a Java program to convert a hash set to an array.
        String arr[] = new String[hashes.size()];
        int i = 0;
        for (String hashVal : hashes) {
            arr[i++] = hashVal;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("+---------------------------------------+");

    }
}
