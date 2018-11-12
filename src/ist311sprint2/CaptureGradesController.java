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
public class CaptureGradesController implements Initializable {

    @FXML
    private Button captureGradesButton;
    @FXML
    private Button backButton;
    @FXML
    private final TableView courseTable = new TableView<Course>();
    @FXML
    private final TableColumn<Course, String> courseColumn = new TableColumn("First Name");
    @FXML
    private final TableColumn<Course, String> instructorColumn = new TableColumn("Last Name");
    @FXML
    private final TableColumn<Course, String> gradeColumn = new TableColumn("Username");
    @FXML
    private Label errorLabel;

    private User user;
    private ObservableList<Course> courseList;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //courseList = PersistentDataCntl.getPersistentDataCntl().getLoggedInUser().getUserProfile().getCourseData();
        courseColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        instructorColumn.setCellValueFactory(new PropertyValueFactory<>("instructor"));
        gradeColumn.setCellValueFactory(new PropertyValueFactory<>("grade"));

        //courseTable.setItems(courseList);
    }

    @FXML
    private void captureGrades() {
        try {
            CanvasWrapper.getCanvasWrapper().captureGrades(PersistentDataCntl.getPersistentDataCntl().getLoggedInUser().getUserProfile());
            courseList = PersistentDataCntl.getPersistentDataCntl().getLoggedInUser().getUserProfile().getCourseData();
            courseTable.setItems(courseList);
        } catch (Exception ex) {
            errorLabel.setText("Error: " + ex.getMessage());
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    private void back() throws IOException {
        backButton.getScene().setRoot(FXMLLoader.load(getClass().getResource("accountManager.fxml")));
    }

}
