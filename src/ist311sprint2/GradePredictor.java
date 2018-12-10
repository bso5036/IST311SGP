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
    
    public Double predictGrade(){
        Double predictedGrade = 0.0;
        
        return predictedGrade;
    }
    
    public Double predictGPA(){
        Double predictedGPA = 0.0;
        
        return predictedGPA;
    }    
    
}
