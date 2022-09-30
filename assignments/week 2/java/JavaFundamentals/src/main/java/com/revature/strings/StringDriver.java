package com.revature.strings;

public class StringDriver {
    public static void main(String[] args) {
        //Talking about how strings are stored, equality, and methods associated with.
        String text = "This is a string";

        //Can also use "new" functionality with strings as we did on Person
        String text2 = new String("This is also a string.");

        //Starting adding string together to see what happens
        String helloWorld = "Hello";
        helloWorld += " world";

        System.out.println(helloWorld);

        //Java is pass by value, not pass by reference. Cannot use something like this:
        addOn(helloWorld);
        System.out.println(helloWorld);

        //If value needs to be updated, you need to store it in the variable itself.
        helloWorld = addOn(helloWorld);
        System.out.println(helloWorld);

        String s1 = "Apple";
        String s2 = "Mango";
        String s3 = "Apple";

        //To test the equality of each variable, use == operator.
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        //If a String obj is created with new keyword, it will change the memory address.
        String s4 = new String("Mango");

        System.out.println(s2 == s4);

        //When working with objects, the == operator checks objects to see if they are the same obj in memory.
        //Use the .equals() to check for equality. It comes from obj class which will check based on value instead of memory
        System.out.println(s2.equals(s4));

        //.equals() will be discussed more when looking at Inheritance or Polymorphism.

        //Useful methods belonging to String class.
        //Find string length
        String newString = "This is a new string.";
        System.out.println(newString.length());
        System.out.println(isEven(newString));

        //repeat string multiple times
        System.out.println(newString.repeat(2));
        System.out.println(repeatSpace(newString, 3));


    }

    public static String addOn(String text) {
        return text + " This was added to the end.";
    }

    //Method to check if string length is even
    public static boolean isEven(String text) {
        if (text.length() % 2 == 0) {
            return true;
        }
        return false;
    }

    //Create quick method for repeating strings with space.
    public static String repeatSpace(String text, int count) {

        text += " ";
        String words = text.repeat(count);
        return words;
    }
}
