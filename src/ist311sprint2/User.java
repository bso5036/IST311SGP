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
public class User {

    private String username;
    private String password;
    private UserProfile userProfile;

    public User(String inUsername, String inPassword) {
        username = inUsername;
        password = inPassword;
        userProfile = new UserProfile("","","","");
    }

    @Override
    public String toString() {
        return "Username: " + username + " Password: " + password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void createUserProfile(String newFirstName, String newLastName, String newEmail, String newAccessID) {
        //userProfile = new UserProfile(newFirstName, newLastName, newEmail, newAccessID);
        userProfile.setFirstName(newFirstName);
        userProfile.setLastName(newLastName);
        userProfile.setEmail(newEmail);
        userProfile.setAccessID(newAccessID);
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }
}
