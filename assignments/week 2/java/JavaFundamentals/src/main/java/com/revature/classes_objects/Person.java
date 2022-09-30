package com.revature.classes_objects;

/*
First uncommented line of the files should be the package name
Packages provide useful namespaces to declare similar classes with correct name.
 */

public class Person {
    /*
    Classes are blueprints for objects. Can create classes as blueprints with all necessary info that every object gets.

    First, create fields-- similar to props of object. Create these like regular variables, just don't need a value.
    Declare these variables outside any method.
     */
    String fullName;
    double height;
    double weight;
    int age;
    /*
    Whenever person object is created, they should have these properties. if variable is accessible should be able to
    use personObject.field
     */

    //create constructor for this class. Constructors are methods w/ same name as class and allows to set object state
    //on creation (instantiation)
    public Person(String fullName, double height, double weight, int age) {
        this.fullName = fullName;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    //No-args Constructor
    public Person() {
        this.fullName = "John Doe";
        this.height = 68;
        this.weight = 185;
        this.age = 29;
    }

    //1-arg Constructor
    public Person(String fullName) {
        this.fullName = fullName;
        this.height = 68;
        this.weight = 185;
        this.age = 29;
    }

    /*
    Adding in methods. Reusable chunks in code to represent what an object can do. Also helps with DRY coding.
     */
    //void will return nothing, could use int if wanted integer return, or String if want string return, etc.
    public void walk(int distance) {
        System.out.println(this.fullName + " walked a distance of " + distance + " feet.");
    }

    //create method for talking that will return string
    public String talk() {
        return "Hi, my name is " + this.fullName + "!";
    }

}
