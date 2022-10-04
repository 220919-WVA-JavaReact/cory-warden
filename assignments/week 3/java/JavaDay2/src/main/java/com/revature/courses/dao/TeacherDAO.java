package com.revature.courses.dao;

import com.revature.courses.models.Teachers;

public interface TeacherDAO {
    //Providing basic requirements we want our DAO to have. This will be a list of methods to use for specific database

    //Have these implemented with files or SQL database.

    Teachers getByUsermame(String username);

    //Method for teacher creation
    Teachers addTeacher(String first, String last, String username, String password);
}
