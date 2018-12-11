/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint2;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author bso5036
 */
public class GradePredictor {
    private static GradePredictor gradePredictor;
    public GradePredictor(){
        
    }
    
    public static GradePredictor getGradePredictor() {
        if (gradePredictor == null) {
            gradePredictor = new GradePredictor();
        }
        return gradePredictor;
    }
    
    private Double predictGrade(Course course){
        Double predictedGrade = 0.0;
        Double maxPoints = 0.0;
        Double points = 0.0;
        Double pointsLeft = 0.0;
        for(Assignment assignment : course.getAssignments()){
            maxPoints += assignment.getMaxGrade();
            if(!assignment.getGraded()){
                pointsLeft += assignment.getMaxGrade();
            } else {
                points += assignment.getGrade();
            }
        }
        return predictedGrade;
    }
    
    public Double predictGPA(){
        Double predictedGPA = 0.0;
        
        return predictedGPA;
    }
    
    public ObservableList<PredictedGrade> getPredictedGrades() {
        ObservableList<PredictedGrade> theListOfGrades;
        ArrayList<PredictedGrade> grades = new ArrayList<>();
        for(Course course : PersistentDataCntl.getPersistentDataCntl().getLoggedInUser().getUserProfile().getCourses()){
            grades.add(new PredictedGrade(course.getName(), predictGrade(course)));
        }
        List<PredictedGrade> gradeList = (List<PredictedGrade>) grades;
        theListOfGrades = FXCollections.observableList(gradeList);
        return theListOfGrades;
    }
    
}
