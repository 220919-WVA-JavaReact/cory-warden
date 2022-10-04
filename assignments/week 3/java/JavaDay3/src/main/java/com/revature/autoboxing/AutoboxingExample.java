package com.revature.autoboxing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class AutoboxingExample {

    public static void main(String[] args) {
        int n = 5;
        unbox(n); // autoboxing is done here!
        // 8

    }

    public static void autobox(Integer i) {
        System.out.println(i + 3);
    }

    public static void unbox(int i) {
        System.out.println(i + 3);
    }
}
