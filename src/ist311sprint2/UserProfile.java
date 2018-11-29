package ist311sprint2;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author rks5335
 */
public class UserProfile {

    private String firstName = new String();
    private String lastName = new String();
    private String email = new String();
    private String accessID = new String();
    private CourseList courses;

    public UserProfile(String newFirstName, String newLastName, String newEmail, String newAccessID) {
        firstName = newFirstName;
        lastName = newLastName;
        email = newEmail;
        accessID = newAccessID;
        courses = new CourseList();
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

    public ArrayList<Course> getCourses() {
        if (courses.getCourseList().isEmpty()) {
            CanvasWrapper.getCanvasWrapper().captureGrades(this);
        }
        return courses.getCourseList();
    }

    public ObservableList<Course> getCourseData() {
        ObservableList<Course> theListOfUsers;
        List<Course> courseList = (List<Course>) courses;
        theListOfUsers = FXCollections.observableList(courseList);
        return theListOfUsers;
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
    
    public CourseList getCourseList(){
        return courses;
    }
    
}
