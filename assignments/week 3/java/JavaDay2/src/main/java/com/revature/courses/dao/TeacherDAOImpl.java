package com.revature.courses.dao;

import com.revature.courses.models.Teachers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TeacherDAOImpl implements TeacherDAO {

    String line = "";
    String splitBy = ",";
    @Override
    public Teachers getByUsermame(String username) {
        //In this method is where we do the talking to the database.
        //Create a buffered reader to talk to database.
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/revature/resources/teachers.csv"));

            //allowing us to read through file until ended
            while ((line = br.readLine()) != null) {

                //This is where we'll do our logic to split it. Check each line to see if user matches input user
                //Should be able to send user back to client side.
                String[] info = line.split(splitBy);
                if (info[3].equals(username)) {
                    //parse info[0] into integer with method below
                    return new Teachers(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Teachers addTeacher(String first, String last, String username, String password) {
        System.out.println("Called out DAO method. Not implemented");
        return null;
    }
}

