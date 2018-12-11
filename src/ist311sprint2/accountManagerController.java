/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

/**
 *
 * @author bdb5328
 */
public class accountManagerController implements Initializable {

    //@FXML
    //private Label label;
    @FXML
    private Text outputText;

    /*
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        
        label.setText("Hello World!");
    }
     */
    @FXML
    public void handleLogOutButtonAction(ActionEvent event) throws IOException {
        PersistentDataCntl.getPersistentDataCntl().saveUserList();
        PersistentDataCntl.getPersistentDataCntl().setLoggedInUser(null);
        outputText.getScene().setRoot(FXMLLoader.load(getClass().getResource("fxml_login.fxml")));
        outputText.setText("Logout button pressed");
    }

    public void handleViewScheduleButtonAction(ActionEvent event) throws IOException {
        outputText.getScene().setRoot(FXMLLoader.load(getClass().getResource("GradePredictor.fxml")));
        outputText.setText("View Schedule button pressed");
    }

    public void handleManageAccountButtonAction(ActionEvent event) throws IOException {
        outputText.setText("Manage Account button pressed");

        outputText.getScene().setRoot(FXMLLoader.load(getClass().getResource("UserProfile.fxml")));

    }

    public void handleViewGradesButtonAction(ActionEvent event) throws IOException {
        outputText.setText("View Grades button pressed");

        outputText.getScene().setRoot(FXMLLoader.load(getClass().getResource("CaptureGrades.fxml")));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
