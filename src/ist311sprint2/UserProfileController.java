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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author rks5335
 */
public class UserProfileController implements Initializable {

    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField accessIDTextField;
    @FXML
    private Button submitButton;
    @FXML
    private Button backButton;
    
    @FXML
    private void handleSubmitButton(ActionEvent event) {
        
        UserProfile profile = new UserProfile(firstNameTextField.getText(), lastNameTextField.getText(), emailTextField.getText(), accessIDTextField.getText());
        
    }
    
    @FXML
    private void handleBackButton(ActionEvent event) throws IOException {
        
        backButton.getScene().setRoot(FXMLLoader.load(getClass().getResource("accountManager.fxml")));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //UserProfile profile = new UserProfile(firstNameTextField.getText(), lastNameTextField.getText(), emailTextField.getText(), accessIDTextField.getText());
    }
}