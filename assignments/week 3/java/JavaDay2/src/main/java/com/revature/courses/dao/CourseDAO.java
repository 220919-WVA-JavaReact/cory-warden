package com.revature.courses.dao;

import com.revature.courses.models.Course;

import java.util.List;

public interface CourseDAO {
    //create course method
    Course addCourse(String courseNum, String courseName, int authId);

    //read all course methods
    //Don't need to take any arguments in to perform this action
    List<Course> getAllCourses();

    //get tickets by teacher
    List<Course> getCoursesByAuthId(int id);

    //update course
    boolean assignCourse(Course course);
}
