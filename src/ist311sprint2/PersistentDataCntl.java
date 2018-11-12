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
public class PersistentDataCntl {

    private static PersistentDataCntl thePersistentDataCntl;
    private UserList userList;
    private User loggedInUser;

    private PersistentDataCntl() {
        userList = new UserList();
    }

    public static PersistentDataCntl getPersistentDataCntl() {
        if (thePersistentDataCntl == null) {
            thePersistentDataCntl = new PersistentDataCntl();
        }
        return thePersistentDataCntl;
    }

    public void setLoggedInUser(User userLoggingIn) {
        loggedInUser = userLoggingIn;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public UserList getUserList() {
        return userList;
    }
}
