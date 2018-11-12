package ist311sprint2;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author rks5335
 */
public class UserProfile {

    private String firstName = new String();
    private String lastName = new String();
    private String email = new String();
    private String accessID = new String();
    private ArrayList<Course> courses;
    

    public UserProfile(String newFirstName, String newLastName, String newEmail, String newAccessID) {
        firstName = newFirstName;
        lastName = newLastName;
        email = newEmail;
        accessID = newAccessID;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the accessID
     */
    public String getAccessID() {
        return accessID;
    }
    
    public ArrayList<Course> getCourses(){
        if(courses.isEmpty()){
            CanvasWrapper.getCanvasWrapper().captureGrades(this);
        }
        return courses;
    }
    
    public void setCourses(ArrayList<Course> newCourses){
        courses = newCourses;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param accessID the accessID to set
     */
    public void setAccessID(String accessID) {
        this.accessID = accessID;
    }
    
}
