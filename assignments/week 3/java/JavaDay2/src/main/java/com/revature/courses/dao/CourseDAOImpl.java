package com.revature.courses.dao;

import com.revature.courses.models.Course;

import java.util.List;

public class CourseDAOImpl implements CourseDAO {

    //Updated once we have JDBC to connect to database
    @Override
    public Course addCourse(String courseNum, String courseName, int authId) {
        System.out.println("Called out DAO method. Not implemented");
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        System.out.println("Called get all courses method");
        return null;
    }

    @Override
    public List<Course> getCoursesByAuthId(int id) {
        return null;
    }

    @Override
    public boolean assignCourse(Course course) {
        System.out.println("Called update course method");
        return false;
    }
}
