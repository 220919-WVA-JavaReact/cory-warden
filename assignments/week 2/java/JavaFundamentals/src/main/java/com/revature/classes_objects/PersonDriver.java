package com.revature.classes_objects;

public class PersonDriver {

    /*
    Use the main method in PersonDriver class to call the Person class and create objects person Objects.
     */
    public static void main(String[] args) {
        //Any logic written here will be done when running the program (has green run button on icon to show Runnable)

        //Declaring object is different from variable.
        Person cory = new Person("Cory Warden", 72.01, 194.8, 27);

        System.out.println(cory.fullName);

        Person steve = new Person("Steve Williams", 70.5, 171.1, 25);

        System.out.println(steve.fullName);

        cory.walk(5);

        System.out.println(steve.talk());

        Person jimmy = new Person();
        Person alex = new Person("alex");

        System.out.println(jimmy.fullName);
        System.out.println(alex.fullName);

        jimmy.fullName = "Jimmy";
        System.out.println(jimmy.fullName);
    }

}
