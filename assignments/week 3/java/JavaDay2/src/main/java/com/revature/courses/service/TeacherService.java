package com.revature.courses.service;

import com.revature.courses.dao.TeacherDAO;
import com.revature.courses.dao.TeacherDAOImpl;
import com.revature.courses.models.Teachers;

import java.util.Scanner;

public class TeacherService {

    //role of this class is to provide logic for options and call upon DAO to persist the information we request.

    // We have logic for logging in and registering so we need methods
    //Whenever we want to call databse, we need to provide teacherDao implemenetation.. creating at class level
    TeacherDAO td = new TeacherDAOImpl();
    Scanner scan = new Scanner(System.in);
    public Teachers login() {
        System.out.println("Login------------");
        System.out.println("Please enter your username");
        String username = scan.nextLine();
        System.out.println("Please enter your password");
        String password = scan.nextLine();
        //Get the account associated with username and verify the password to log the user in.
        /*
        1) Call Database and find info based off submitted username
        2) Check returned pw of username in database against the input to verify they are equal
         */
        Teachers teach = td.getByUsermame(username.toLowerCase());
        if (teach.getPw().equals(password)) {
            System.out.println("You are an existing user.");
            System.out.println(teach);

            //Need to refactor and be able to store user in the main class
            return teach;
        } else {
            System.out.println("Your account could not be processed.");
            return null;
        }
    }

    public Teachers register() {
        System.out.println("Registration------------");
        System.out.println("Please enter your first name");
        String first = scan.nextLine();
        System.out.println("Please enter your last name");
        String last = scan.nextLine();
        System.out.println("Please enter your username");
        String username = scan.nextLine();
        System.out.println("Please enter your password");
        String password = scan.nextLine();

        System.out.println("Your account has been created!");
        //After DAO method created, call with provided info
        Teachers teach = td.addTeacher(first, last, username, password);
        return teach;
    }
}
