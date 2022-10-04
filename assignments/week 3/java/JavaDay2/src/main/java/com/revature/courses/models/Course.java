package com.revature.courses.models;

import java.util.Objects;

public class Course {

    private String courseNum;
    private String title;
    private int authId;

    public Course(String courseNum, String title, int authId) {
        this.courseNum = courseNum;
        this.title = title;
        this.authId = authId;
    }

    public Course(String courseNum, int authId) {
        this.courseNum = courseNum;
        this.authId = authId;
    }

    public Course() {
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthId() {
        return authId;
    }

    public void setAuthId(int authId) {
        this.authId = authId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseNum='" + courseNum + '\'' +
                ", title='" + title + '\'' +
                ", authId=" + authId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return authId == course.authId && courseNum.equals(course.courseNum) && title.equals(course.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseNum, title, authId);
    }
}
