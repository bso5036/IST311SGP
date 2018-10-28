/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author bso5036
 */
public class FXMLDocumentController implements Initializable {
    private UserList userList;
    @FXML private Text actiontarget;
    @FXML private TextField usernameTextField;
    @FXML private PasswordField passwordField;
    
    @FXML 
    protected void handleSubmitButtonAction(ActionEvent event) {
        Boolean usernameMatch = false;
        Boolean passwordMatch = false;
        for(User user : userList.getUserList()){
            if(user.getUsername().equals(usernameTextField.getText())){
                usernameMatch = true;
                if(user.getPassword().equals(passwordField.getText())){
                    passwordMatch = true;
                }
            }
        }
        if(usernameMatch && passwordMatch){
            actiontarget.setText("Logged In");
        } else {
            actiontarget.setText("Wrong Username/Password");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         userList = new UserList();
    }    
    
}
