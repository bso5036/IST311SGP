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
    private Double maxGrade;

    public Assignment(String inName, Double inMaxGrade) {
        name = inName;
        maxGrade = inMaxGrade;
        graded = false;
    }

    public Assignment(String inName, Double inMaxGrade, Double inGrade) {
        name = inName;
        maxGrade = inMaxGrade;
        grade = inGrade;
        graded = true;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the graded
     */
    public Boolean getGraded() {
        return graded;
    }

    /**
     * @return the grade
     */
    public Double getGrade() {
        return grade;
    }

    /**
     * @return the maxGrade
     */
    public Double getMaxGrade() {
        return maxGrade;
    }
}
