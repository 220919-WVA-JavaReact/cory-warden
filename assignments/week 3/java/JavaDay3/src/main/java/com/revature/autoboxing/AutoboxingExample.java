package com.revature.autoboxing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class AutoboxingExample {

    public static void main(String[] args) {
        int n = 5;
        someMethod(n); // autoboxing is done here!
        // 8

    }

    public static void someMethod(Integer i) {
        System.out.println(i + 3);
    }
}
