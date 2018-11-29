/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint2;

import java.util.ArrayList;

/**
 *
 * @author bso5036
 */
public class Course {

    private String name;
    private String instructor;
    private Double grade;
    private ArrayList<Assignment> assignments;

    public Course(String inName, String inInstructor, Double inGrade) {
        name = inName;
        instructor = inInstructor;
        grade = inGrade;
    }

    public Double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }
}
