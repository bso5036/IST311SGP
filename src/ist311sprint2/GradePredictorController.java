/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author bso5036
 */
public class GradePredictorController implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private Label gpaLabel;
    @FXML
    private TableView predictedGradeTable = new TableView<PredictedGrade>();
    @FXML
    private TableColumn<PredictedGrade, String> predictedCourseColumn = new TableColumn("Course");
    @FXML
    private TableColumn<PredictedGrade, Double> predictedGradeColumn = new TableColumn("Grade");
    
    
    private ObservableList<PredictedGrade> gradeList;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        predictedCourseColumn.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        predictedGradeColumn.setCellValueFactory(new PropertyValueFactory<>("predictedGrade"));
        gradeList = GradePredictor.getGradePredictor().getPredictedGrades();
        predictedGradeTable.setItems(gradeList);
        //predictGrades();
    }
    
    @FXML
    private void predictGrades(){
        String predictedGPA = Double.toString(GradePredictor.getGradePredictor().predictGPA());
        gpaLabel.setText("Predicted GPA: " + predictedGPA);
    }
    
    @FXML
    private void back() throws IOException {
        backButton.getScene().setRoot(FXMLLoader.load(getClass().getResource("accountManager.fxml")));
    }
    
}
