/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
    public void handleLogOutButtonAction(ActionEvent event){
        outputText.setText("Logout button pressed");
    }
    public void handleViewScheduleButtonAction(ActionEvent event){
        outputText.setText("View Schedule button pressed");
    }
    public void handleManageAccountButtonAction(ActionEvent event){
        outputText.setText("Manage Account button pressed");
    }
    public void handleViewGradesButtonAction(ActionEvent event){
        outputText.setText("View Grades button pressed");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
