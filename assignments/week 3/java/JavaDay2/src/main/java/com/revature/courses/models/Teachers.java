package com.revature.courses.models;

import java.util.Objects;

public class Teachers {
    //fields should match database info with similar datatype
    private static int id;
    private String firstName;
    private String lastName;
    private String username;
    private String pw;

    //Set all our fields with this.


    public Teachers(int id, String firstName, String lastName, String username, String pw) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.pw = pw;
    }

    //Used with no id as using serial
    public Teachers(String firstName, String lastName, String username, String pw) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.pw = pw;
    }

    //No args constructor
    public Teachers() {
    }

    //Generate setter and getter methods, can be used by right click and generate
    public static int getId() {return id;}

    public void setId(int i) {
        this.id = id;
    }

    public String getFirstName() {return firstName;}

    public void setFirstName(String i) {
        this.firstName = firstName;
    }

    public String getLastName() {return lastName;}

    public void setLastName(String i) {
        this.lastName = lastName;
    }

    public String getUsername() {return username;}

    public void setUsername(String i) {
        this.username = username;
    }

    public String getPw() {return pw;}

    public void setPw(String i) {
        this.pw = pw;
    }

    //can also generate methods that override existing methods from object

    @Override
    public String toString() {
        return "Teachers{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //explicit type casting
        Teachers teachers = (Teachers) o;
        return id == teachers.id && firstName.equals(teachers.firstName) && lastName.equals(teachers.lastName) && username.equals(teachers.username) && pw.equals(teachers.pw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, username, pw);
    }
}
