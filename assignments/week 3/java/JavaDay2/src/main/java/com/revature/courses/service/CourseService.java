package com.revature.courses.service;

import com.revature.courses.dao.CourseDAO;
import com.revature.courses.dao.CourseDAOImpl;
import com.revature.courses.models.Course;
import com.revature.courses.models.Teachers;

import java.util.Scanner;

public class CourseService {
    //create menu logic for the course interactions. Call on DAO to persist data.

    Scanner scan = new Scanner(System.in);
    //DAO instance
    CourseDAO cd = new CourseDAOImpl();

    public void addCourse(int authId) {
        //Menu Logic
        System.out.println("Enter Course Num (i.e. MTH101): ");
        String courseNum = scan.nextLine();
        System.out.println("Enter Course Title: ");
        String courseName = scan.nextLine();
//        System.out.println("Enter Teacher Id: ");
//        int authId = scan.nextInt();
//        scan.nextLine();
        //int authId = Teachers.getId();

        //Call on DAO to make sure it is persisted to the db.
        cd.addCourse(courseNum, courseName, authId);
        System.out.println(authId);
    }

    //Stored log in info, we ca use it to assign a course to ourselves.
    public void assignCourse(int authId) {
        //Take in course number and use logged in info to assign to ourselves.
        System.out.println("Enter Course Num (i.e. ALG101): ");
        String courseNum = scan.nextLine();

        Course enroll = new Course(courseNum, authId);

        //Now we have the course object that has primary key and teacher id to update. Call DAO and update.
        cd.assignCourse(enroll);
    }
}
