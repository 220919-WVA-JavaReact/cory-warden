package com.revature.courses;

import com.revature.courses.models.Teachers;
import com.revature.courses.service.CourseService;
import com.revature.courses.service.TeacherService;

import java.util.Scanner;

public class App {
    //inside of app class is all information and logic used.

    public static TeacherService ts = new TeacherService();
    public static CourseService cs = new CourseService();

    public static void main(String[] args) {
        //In this app, this wil be the only main method used.
        //create user and test to make sure methods working
//        Teachers cory = new Teachers(1, "Cory", "Warden", "12cwarden", "test");
//        String first = cory.getFirstName();
//        String user = cory.getUsername();
//        System.out.println(user);

        /*
        Start the application with a menu and loop
         */

        System.out.println("Press 1 to login. Press 2 to register");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        scan.nextLine();

        //variable to store teacher
        Teachers loggedInTeacher = null;

        if (choice == 1) {

            loggedInTeacher = ts.login();
        } else if (choice == 2) {

            loggedInTeacher = ts.register();
        } else {
            System.out.println("Incorrect input");
        }

        if (loggedInTeacher != null) {
            System.out.println("1) to create a course");
            System.out.println("2) to enroll to teach a course");
            System.out.println("3) view all courses");
            System.out.println("4) view your courses");
            String subchoice = scan.nextLine();
            switch (subchoice) {
                case "1": cs.addCourse(loggedInTeacher.getId());
                break;
                case "2": cs.assignCourse(loggedInTeacher.getId());
                break;
                default:
                    System.out.println("Invalid input");
            }
        }

    }
}
