package ist311sprint2;

/**
 *
 * @author rks5335
 */
public class UserProfile {

    private String firstName = new String();
    private String lastName = new String();
    private String email = new String();
    private String accessID = new String();
    

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
}
