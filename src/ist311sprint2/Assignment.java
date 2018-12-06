/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint2;

/**
 *
 * @author bso5036
 */
public class Assignment {

    private String name;
    private Boolean graded;
    private Double grade;

    public Assignment(String inName) {
        name = inName;
        graded = false;
    }

    public Assignment(String inName, Double inGrade) {
        name = inName;
        grade = inGrade;
        graded = true;
    }
}
