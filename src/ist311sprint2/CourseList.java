/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint2;

import java.util.ArrayList;

/**
 *
 * @author smg6192
 */
public class CourseList {

    private ArrayList<Course> courseList;

    public CourseList() {
        courseList = new ArrayList<>();
    }

    public void setCourses(ArrayList<Course> newCourses) {
        courseList = newCourses;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

}
